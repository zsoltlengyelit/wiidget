package org.landa.wiidget.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.landa.wiidget.parser.GetterFieldAccessor;
import org.landa.wiidget.parser.PublicFieldAccessor;

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

	public static List<FieldAccessor> getFieldAccessors(final Class<?> baseClass, final Class<? extends Annotation> annotation) {

		final List<FieldAccessor> accessors = new ArrayList<FieldAccessor>();

		for (final Field field : getFields(baseClass, annotation)) {
			final FieldAccessor accessor = getFieldAccessor(field);

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
}
