package org.landa.wiidget.validation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.engine.ObjectFactory;
import org.landa.wiidget.reflect.Reflection;
import org.landa.wiidget.util.Pair;

public class DefaultWiidgetValidator implements WiidgetValidator {

	private final ObjectFactory objectFactory;

	public DefaultWiidgetValidator(final ObjectFactory objectFactory) {
		this.objectFactory = objectFactory;
	}

	@Override
	public List<ValidationError> validate(final Wiidget wiidget) {

		final List<ValidationError> errors = new ArrayList<ValidationError>();

		final Field[] fields = Reflection.getDeclaredFields(wiidget.getClass());

		for (final Field field : fields) {

			final List<Pair<Validator, Annotation>> validators = getValidators(field);

			validateField(wiidget, field, validators, errors);
		}

		return errors;
	}

	private void validateField(final Wiidget wiidget, final Field field, final List<Pair<Validator, Annotation>> validators, final List<ValidationError> errors) {

		for (final Pair<Validator, Annotation> validatorPair : validators) {

			final Validator validator = validatorPair.getLeft();
			final Annotation annotation = validatorPair.getRight();

			final Object value = Reflection.getFieldValue(wiidget, field.getName());

			if (!validator.isValid(value)) {
				final String message = getErrorMessage(annotation);

				final ValidationError error = new ValidationError(wiidget, field.getName(), message);

				errors.add(error);
			}

		}

	}

	private String getErrorMessage(final Annotation annotation) {
		try {
			final Method messageMethod = annotation.getClass().getMethod("message");

			final Object objectMessage = messageMethod.invoke(annotation);

			return String.valueOf(objectMessage);

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "";
	}

	/**
	 * @param field
	 * @return
	 */
	private List<Pair<Validator, Annotation>> getValidators(final Field field) {

		final List<Pair<Validator, Annotation>> validators = new ArrayList<Pair<Validator, Annotation>>();

		for (final Annotation annotation : field.getAnnotations()) {

			final ValidatedBy validatedBy = annotation.annotationType().getAnnotation(ValidatedBy.class);
			if (validatedBy != null) {
				final Class<? extends Validator> validatorClass = validatedBy.value();

				final Validator validator = objectFactory.getInstance(validatorClass);

				validators.add(new Pair<Validator, Annotation>(validator, annotation));
			}
		}

		return validators;
	}

}
