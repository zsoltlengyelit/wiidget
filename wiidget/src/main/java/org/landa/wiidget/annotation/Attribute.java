package org.landa.wiidget.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Wiidget field with this annotation behaves like an XML attribute.
 * 
 * @author Zsolt Lengyel
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Attribute {

	/**
	 * Attribute name to output. By default the name of the field.
	 */
	String name() default "";

	/**
	 * If true, the processor will put this attribute too either if the value is null-
	 */
	boolean showNull() default false;
}
