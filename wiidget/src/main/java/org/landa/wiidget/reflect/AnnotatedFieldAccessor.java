package org.landa.wiidget.reflect;

import java.lang.annotation.Annotation;

public class AnnotatedFieldAccessor<T extends Annotation> implements AnnotatedAccessor<T> {

	private final FieldAccessor fieldAccessor;

	private final T annotation;

	public AnnotatedFieldAccessor(final FieldAccessor fieldAccessor, final T annotation) {
		super();
		this.fieldAccessor = fieldAccessor;
		this.annotation = annotation;
	}

	@Override
	public Object getValue(final Object object) {
		return fieldAccessor.getValue(object);
	}

	@Override
	public String getFieldName() {
		return fieldAccessor.getFieldName();
	}

	@Override
	public T getAnnotation() {
		return annotation;
	}

}
