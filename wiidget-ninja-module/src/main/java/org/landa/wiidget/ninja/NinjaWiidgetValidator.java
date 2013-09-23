package org.landa.wiidget.ninja;

import java.util.List;

import ninja.validation.Validation;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.engine.ObjectFactory;
import org.landa.wiidget.validation.DefaultWiidgetValidator;
import org.landa.wiidget.validation.ValidationError;

import com.google.inject.Inject;

public class NinjaWiidgetValidator extends DefaultWiidgetValidator {

	private final Validation validation;

	@Inject
	public NinjaWiidgetValidator(final Validation validation, final ObjectFactory objectFactory) {
		super(objectFactory);
		this.validation = validation;
	}

	@Override
	public List<ValidationError> validate(final Wiidget wiidget) {
		// TODO

		return super.validate(wiidget);

	}

}
