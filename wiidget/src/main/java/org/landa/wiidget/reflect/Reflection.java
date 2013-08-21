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

/**
 * @author Zsolti
 */
public final class Reflection {

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

		return null;
	}

	public static <T extends Annotation> List<AnnotatedFiledAccessor<T>> getFieldAccessors(final Class<?> baseClass, final Class<T> annotation) {

		final List<AnnotatedFiledAccessor<T>> accessors = new ArrayList<AnnotatedFiledAccessor<T>>();

		for (final Field field : getFields(baseClass, annotation)) {

			final AnnotatedFiledAccessor<T> accessor = getAnnotatedFieldAccessor(field, annotation);

			if (null != accessor) {
				accessors.add(accessor);
			}
		}
		return accessors;
	}

	public static <T extends Annotation> AnnotatedFiledAccessor<T> getAnnotatedFieldAccessor(final Field field, final Class<T> annotationClass) {

		final T annotation = field.getAnnotation(annotationClass);
		if (null != annotation) {
			final FieldAccessor fieldAccessor = getFieldAccessor(field);

			return new ExtendedAnnotatedFieldAccessor<T>(fieldAccessor, annotation);
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

		final Class[] parameterTypes = getTypes(parameters);

		Method method;
		try {
			method = base.getClass().getMethod(methodName, parameterTypes);
			return method.invoke(base, parameters);

		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			throw new org.landa.wiidget.reflect.ReflectionException("Cannot invoke method:" + methodName + " on class: " + base.getClass().getCanonicalName());
		}

	}

	private static Class[] getTypes(final Object[] parameters) {

		final Class[] types = new Class[parameters.length];

		for (int i = 0; i < parameters.length; i++) {
			final Object param = parameters[i];

			types[i] = param.getClass();
		}

		return types;
	}
}
