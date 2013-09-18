package org.landa.wiidget.context;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class DefaultWiidgetContext implements WiidgetContext {

	private final Map<String, Object> data = new HashMap<String, Object>();

	public DefaultWiidgetContext(final Map<String, Object> data) {
		this();
		this.data.putAll(data);
	}

	public DefaultWiidgetContext() {

	}

	@Override
	public Object get(final String variable) {
		return data.get(variable);
	}

	@Override
	public void set(final String variable, final Object value) {
		data.put(variable, value);
	}

	@Override
	public void remove(final String variable) {
		data.remove(variable);

	}

	@Override
	public boolean isSet(final String variable) {
		return data.containsKey(variable);
	}

	@Override
	public void setAll(final Map<String, Object> data) {
		this.data.putAll(data);
	}

	@Override
	public Map<String, Object> getAll() {
		return Collections.unmodifiableMap(data);
	}

	@Override
	public Set<String> getKeys() {
		return data.keySet();
	}

}
