package org.landa.wiidget.reflect;

import java.lang.annotation.Annotation;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 * @param <T>
 */
public interface AnnotatedAccessor<T extends Annotation> extends FieldAccessor {

	public T getAnnotation();

}
