package org.landa.wiidget.ninja;

import java.util.ArrayList;
import java.util.List;

import ninja.validation.Validation;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.validation.ValidationError;
import org.landa.wiidget.validation.WiidgetValidator;

import com.google.inject.Inject;

public class NinjaWiidgetValidator implements WiidgetValidator {

	private final Validation validation;

	@Inject
	public NinjaWiidgetValidator(final Validation validation) {
		this.validation = validation;
	}

	@Override
	public List<ValidationError> validate(final Wiidget wiidget) {
		// TODO
		return new ArrayList<ValidationError>();

	}

}
