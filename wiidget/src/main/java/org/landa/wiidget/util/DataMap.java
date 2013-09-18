package org.landa.wiidget.util;

import java.util.Map;

public class DataMap extends java.util.HashMap<String, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7960438109428770543L;

	public DataMap() {
		super();
	}

	public DataMap(Map<String, Object> value) {
		this();
		putAll(value);
	}

	public DataMap set(String key, Object value) {
		put(key, value);

		return this;
	}

}
