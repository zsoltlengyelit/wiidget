package org.landa.wiidget.util;

import java.util.HashMap;
import java.util.Map;

import ninja.utils.NinjaProperties;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;

public class WiidgetProperties {

	public static final String FORMAT_OUTPUT = "wiidget.format_output";

	public static final String FORMAT_INDENTATION = "wiidget.format_indentation";

	private static Map<String, Object> DEFAULTS;

	static {

		Map<String, Object> defaultConfig = new HashMap<String, Object>();

		defaultConfig.put(FORMAT_OUTPUT, false);
		defaultConfig.put(FORMAT_INDENTATION, 4);

		DEFAULTS = ImmutableMap.copyOf(defaultConfig);

	}

	private final NinjaProperties ninjaProperties;

	@Inject
	public WiidgetProperties(NinjaProperties ninjaProperties) {
		super();
		this.ninjaProperties = ninjaProperties;
	}

	public boolean getBoolean(String key) {

		return Boolean.parseBoolean(get(key).toString());
	}

	public Object get(String key) {

		String ninjaValue = ninjaProperties.get(key);

		if (ninjaValue == null) {
			return DEFAULTS.get(key);
		}

		return ninjaValue;
	}

	public Integer getInteger(String key) {
		return Integer.parseInt(get(key).toString());
	}

}
