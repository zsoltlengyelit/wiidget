package org.landa.wiidget.validation;

import org.landa.wiidget.Wiidget;

public class ValidationError {

	private final Wiidget wiidget;

	private final String field;

	private final String message;

	public ValidationError(final Wiidget wiidget, final String field, final String message) {
		super();
		this.wiidget = wiidget;
		this.field = field;
		this.message = message;
	}

	public Wiidget getWiidget() {
		return wiidget;
	}

	public String getField() {
		return field;
	}

	public String getMessage() {
		return message;
	}

}
