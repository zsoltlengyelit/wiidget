package org.landa.wiidget.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is use for annotate the validator annotations. The {@link #value()} tells the type of validator class.
 * 
 * @see WiidgetValidator
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidatedBy {

	/**
	 * The validator class what will validate the annotated value.
	 * 
	 * @return
	 */
	Class<? extends Validator> value();

}
