package org.landa.wiidget.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.landa.wiidget.validation.ValidatedBy;

/**
 * @author Zsolti
 */
@Inherited
@Target(ElementType.FIELD)
@ValidatedBy(RequiredValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Required {

	String message() default "Value is required";

}
