package org.landa.wiidget.ninja;

import ninja.utils.NinjaProperties;

import org.landa.wiidget.util.DefaultWiidgetProperties;

import com.google.inject.Inject;

public class NinjaWiidgetProperties extends DefaultWiidgetProperties {

	private final NinjaProperties ninjaProperties;

	@Inject
	public NinjaWiidgetProperties(final NinjaProperties ninjaProperties) {
		this.ninjaProperties = ninjaProperties;
	}

	@Override
	public Object get(final String key) {

		final String ninjaValue = ninjaProperties.get(key);

		if (ninjaValue == null) {
			return super.get(key);
		}

		return ninjaValue;
	}

}
