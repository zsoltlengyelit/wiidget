package org.landa.wiidget.util;

import java.util.HashMap;
import java.util.Map;

import ninja.utils.NinjaProperties;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;

public class WiidgetProperties {

	public static final String FORMAT_OUTPUT = "wiidget.format_output";

	public static final String FORMAT_INDENTATION = "wiidget.format_indentation";

	public static final String WIIDGET_FILE_EXTENSION = "wiidget.file_extension";

	private static Map<String, Object> DEFAULTS;

	static {

		final Map<String, Object> defaultConfig = new HashMap<String, Object>();

		defaultConfig.put(FORMAT_OUTPUT, false);
		defaultConfig.put(FORMAT_INDENTATION, 4);
		defaultConfig.put(WIIDGET_FILE_EXTENSION, ".wdgt");

		DEFAULTS = ImmutableMap.copyOf(defaultConfig);

	}

	private final NinjaProperties ninjaProperties;

	@Inject
	public WiidgetProperties(final NinjaProperties ninjaProperties) {
		super();
		this.ninjaProperties = ninjaProperties;
	}

	public boolean getBoolean(final String key) {

		return Boolean.parseBoolean(get(key).toString());
	}

	public Object get(final String key) {

		final String ninjaValue = ninjaProperties.get(key);

		if (ninjaValue == null) {
			return DEFAULTS.get(key);
		}

		return ninjaValue;
	}

	public Integer getInteger(final String key) {
		return Integer.parseInt(get(key).toString());
	}

	public String getString(final String key) {
		return String.valueOf(get(key));
	}
}
