package org.landa.wiidget.reflect;

import java.lang.reflect.Field;


public class PublicFieldAccessor implements FieldAccessor {

	private final Field field;

	/**
	 * 
	 * @param field
	 */
	public PublicFieldAccessor(final Field field) {
		this.field = field;
	}

	@Override
	public Object getValue(final Object object) {

		try {
			return field.get(object);
		} catch (final IllegalArgumentException e) {
			e.printStackTrace();
		} catch (final IllegalAccessException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public String getFieldName() {
		return field.getName();
	}
}
