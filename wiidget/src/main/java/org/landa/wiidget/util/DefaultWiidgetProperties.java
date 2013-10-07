package org.landa.wiidget.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DefaultWiidgetProperties implements WiidgetProperties {

	private static Map<String, Object> DEFAULTS;

	static {

		final Map<String, Object> defaultConfig = new HashMap<String, Object>();

		defaultConfig.put(WIIDGET_FILE_EXTENSION, ".wdgt");
		defaultConfig.put(WIIDGET_DEBUG_MODE, false);

		DEFAULTS = Collections.unmodifiableMap(defaultConfig);

	}

	public DefaultWiidgetProperties() {
		super();

	}

	@Override
	public boolean getBoolean(final String key) {

		return Boolean.parseBoolean(get(key).toString());
	}

	@Override
	public Object get(final String key) {

		return DEFAULTS.get(key);
	}

	@Override
	public Integer getInteger(final String key) {
		return Integer.parseInt(get(key).toString());
	}

	@Override
	public String getString(final String key) {
		return String.valueOf(get(key));
	}

	@Override
	public String getDefault(final String key, final String defaultValue) {
		final Object value = get(key);

		return null == value ? defaultValue : String.valueOf(value);
	}
}
