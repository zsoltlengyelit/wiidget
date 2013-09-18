package org.landa.wiidget.validation;

import java.util.List;

import org.landa.wiidget.Wiidget;

public interface WiidgetValidator {

	public List<ValidationError> validate(Wiidget wiidget);
}
