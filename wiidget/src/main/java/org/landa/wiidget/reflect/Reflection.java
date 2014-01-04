package org.landa.wiidget.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.reflect.MethodUtils;
import org.mvel2.MVEL;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public final class Reflection {

	public static <T> T newInstance(final Class<T> clazz) {

		try {
			return clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			throw new ReflectionException("Cannot create class instance: " + clazz.getCanonicalName(), e);
		}

	}

	public static void setField(final Object target, final String field, final Object value) {

		MVEL.setProperty(target, field, value);

	}

	@SuppressWarnings("unchecked")
	public static <T> T getFieldValue(final Object target, final String field) {

		return (T) MVEL.getProperty(field, target);

	}

	/**
	 * @param clazz
	 * @return
	 */
	public static List<FieldAccessor> getFieldAccessor(final Class<?> clazz) {

		final List<FieldAccessor> fields = new LinkedList<FieldAccessor>();

		for (final Field field : getDeclaredFields(clazz)) {

			final FieldAccessor accessor = getFieldAccessor(field);
			if (null != accessor) {
				fields.add(accessor);
			}

		}
		return fields;

	}

	/**
	 * @param field
	 * @return
	 */
	public static FieldAccessor getFieldAccessor(final Field field) {
		final int modifiers = field.getModifiers();

		if (!Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers)) {
			return new PublicFieldAccessor(field);

		}

		final String getterName = "get" + Character.toUpperCase(field.getName().charAt(0)) + field.getName().substring(1);

		Method getterMethod = null;
		try {
			final Class<?> clazz = field.getDeclaringClass();
			getterMethod = clazz.getMethod(getterName);
		} catch (final NoSuchMethodException e) {
		} catch (final SecurityException e) {
		}

		if (null != getterMethod && getterMethod.getReturnType() == field.getType()) {

			return new GetterFieldAccessor(getterMethod, field.getName());
		}

		throw new IllegalArgumentException("Cannot access the field: " + field.toString());
	}

	public static <T extends Annotation> List<AnnotatedAccessor<T>> getFieldAccessors(final Class<?> baseClass, final Class<T> annotation) {

		final List<AnnotatedAccessor<T>> accessors = new ArrayList<AnnotatedAccessor<T>>();

		for (final Field field : getFields(baseClass, annotation)) {

			final AnnotatedAccessor<T> accessor = getAnnotatedFieldAccessor(field, annotation);

			if (null != accessor) {
				accessors.add(accessor);
			}
		}
		return accessors;
	}

	/**
	 * @param baseClass
	 * @param annotation
	 * @return
	 */
	public static <T extends Annotation> List<AnnotatedAccessor<T>> getMethodAccessors(final Class<?> baseClass, final Class<T> annotation) {

		final List<AnnotatedAccessor<T>> accessors = new ArrayList<AnnotatedAccessor<T>>();

		for (final Method method : getMethods(baseClass, annotation)) {

			final FieldAccessor fieldAccessor = new GetterFieldAccessor(method, method.getName());

			final AnnotatedAccessor<T> accessor = new AnnotatedFieldAccessor<T>(fieldAccessor, method.getAnnotation(annotation)); // //getAnnotatedFieldAccessor(field, annotation);

			if (null != accessor) {
				accessors.add(accessor);
			}
		}
		return accessors;
	}

	public static <T extends Annotation> AnnotatedAccessor<T> getAnnotatedFieldAccessor(final Field field, final Class<T> annotationClass) {

		final T annotation = field.getAnnotation(annotationClass);
		if (null != annotation) {
			final FieldAccessor fieldAccessor = getFieldAccessor(field);

			return new AnnotatedFieldAccessor<T>(fieldAccessor, annotation);
		}

		return null;
	}

	/**
	 * @param baseClass
	 * @param annotation
	 * @return
	 */
	public static Field getField(final Class<?> baseClass, final Class<? extends Annotation> annotation) {

		for (final Field field : getDeclaredFields(baseClass)) {
			if (field.isAnnotationPresent(annotation)) {

				return field;
			}
		}

		return null;
	}

	/**
	 * @param baseClass
	 * @param annotation
	 * @return
	 */
	public static List<Field> getFields(final Class<?> baseClass, final Class<? extends Annotation> annotation) {

		final List<Field> fields = new ArrayList<Field>();

		for (final Field field : getDeclaredFields(baseClass)) {
			if (field.isAnnotationPresent(annotation)) {

				fields.add(field);
			}
		}

		return fields;
	}

	/**
	 * @param baseClass
	 * @param annotation
	 * @return
	 */
	public static List<Method> getMethods(final Class<?> baseClass, final Class<? extends Annotation> annotation) {

		final List<Method> methods = new ArrayList<Method>();

		for (final Method method : getDeclaredMethods(baseClass)) {
			if (method.isAnnotationPresent(annotation)) {

				methods.add(method);
			}
		}

		return methods;
	}

	private static Method[] getDeclaredMethods(final Class<?> baseClass) {
		final List<Method> methods = new ArrayList<Method>();

		Class<?> parent = baseClass;

		while (!Object.class.equals(parent)) {

			methods.addAll(Arrays.asList(parent.getDeclaredMethods()));

			parent = parent.getSuperclass();
		}

		return methods.toArray(new Method[0]);
	}

	/**
	 * Returns the declared field of class hierarchy.
	 * 
	 * @param baseClass
	 *            class to inspect
	 * @return the array of all declared fields
	 */
	public static Field[] getDeclaredFields(final Class<?> baseClass) {

		final List<Field> fields = new ArrayList<Field>();

		Class<?> parent = baseClass;

		while (!Object.class.equals(parent)) {

			fields.addAll(Arrays.asList(parent.getDeclaredFields()));

			parent = parent.getSuperclass();
		}

		return fields.toArray(new Field[0]);

	}

	public static Object callMethod(final Object base, final String methodName, final Object[] parameters) {

		try {

			return MethodUtils.invokeMethod(base, methodName, parameters);

		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			throw new org.landa.wiidget.reflect.ReflectionException("Cannot invoke method:" + methodName + " on class: " + base.getClass().getCanonicalName(), e);
		}

	}

}
