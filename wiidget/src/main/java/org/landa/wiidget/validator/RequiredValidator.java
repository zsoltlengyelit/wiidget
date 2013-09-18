package org.landa.wiidget.validator;

import org.landa.wiidget.validation.Validator;

public class RequiredValidator implements Validator {

	@Override
	public boolean isValid(final Object object) {
		return object != null;
	}

}
