package org.landa.wiidget.validation;

import java.util.List;

import org.landa.wiidget.Wiidget;

import com.google.inject.ImplementedBy;

@ImplementedBy(DefaultWiidgetValidator.class)
public interface WiidgetValidator {

	public List<ValidationError> validate(Wiidget wiidget);
}
