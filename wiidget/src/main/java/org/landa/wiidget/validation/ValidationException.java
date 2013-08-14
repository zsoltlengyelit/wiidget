package org.landa.wiidget.validation;

import java.util.List;

public class ValidationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8276791883604877081L;

	private final List<ValidationError> errors;

	public ValidationException(final List<ValidationError> errors) {
		this.errors = errors;
	}

	public List<ValidationError> getErrors() {
		return errors;
	}

}
