package org.landa.wiidget.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Common map for wiidgets.
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class DataMap extends java.util.HashMap<String, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7960438109428770543L;

	public DataMap() {
		super();
	}

	public DataMap(final Map<String, Object> value) {
		this();
		putAll(value);
	}

	public DataMap set(final String key, final Object value) {
		put(key, value);

		return this;
	}

	/**
	 * @return
	 */
	public Map<String, String> toStringMap() {

		final Map<String, String> map = new HashMap<String, String>();

		for (final Map.Entry<String, Object> entry : this.entrySet()) {

			map.put(entry.getKey(), entry.getValue().toString());
		}

		return map;
	}

}
