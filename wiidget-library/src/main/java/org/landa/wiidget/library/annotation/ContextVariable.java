package org.landa.wiidget.library.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ContextVariable {

	/**
	 * Variable name with set to context.
	 */
	String name() default "";

}
