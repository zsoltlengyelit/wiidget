package org.landa.wiidget.reflect;

import java.lang.annotation.Annotation;

public interface AnnotatedFiledAccessor<T extends Annotation> extends FieldAccessor {

	public T getAnnotation();

}
