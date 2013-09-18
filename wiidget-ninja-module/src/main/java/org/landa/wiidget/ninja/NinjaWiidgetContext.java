/**
 * 
 */
package org.landa.wiidget.ninja;

import java.util.Map;
import java.util.Set;

import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.util.DataMap;

import com.google.common.collect.ImmutableMap;
import com.google.inject.servlet.RequestScoped;

/**
 * @author Zsolti
 */
@RequestScoped
public class NinjaWiidgetContext implements WiidgetContext {

	private final DataMap dataMap;

	public NinjaWiidgetContext() {
		this.dataMap = new DataMap();
	}

	public Object get(final String variable) {

		return dataMap.get(variable);
	}

	public void set(final String variable, final Object value) {
		dataMap.put(variable, value);
	}

	public void remove(final String variable) {
		dataMap.remove(variable);
	}

	public boolean isSet(final String variable) {
		return dataMap.containsKey(variable);
	}

	public void setAll(final Map<String, Object> data) {
		dataMap.putAll(data);
	}

	public Map<String, Object> getAll() {
		return ImmutableMap.copyOf(dataMap);
	}

	public Set<String> getKeys() {
		return dataMap.keySet();
	}

}
