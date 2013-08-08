/**
 * 
 */
package org.landa.wiidget.context;

import java.util.Map;

import org.landa.wiidget.util.DataMap;

import com.google.common.collect.ImmutableMap;
import com.google.inject.servlet.RequestScoped;

/**
 * @author Zsolti
 * 
 */
@RequestScoped
public class WiidgetContextImpl implements WiidgetContext {

	private final DataMap dataMap;

	public WiidgetContextImpl() {
		this.dataMap = new DataMap();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see landa.wiidget.context.WiidgetContext#get(java.lang.String)
	 */
	public Object get(String variable) {

		return dataMap.get(variable);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see landa.wiidget.context.WiidgetContext#set(java.lang.String,
	 * java.lang.Object)
	 */
	public void set(String variable, Object value) {
		dataMap.put(variable, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see landa.wiidget.context.WiidgetContext#remove(java.lang.String)
	 */

	public void remove(String variable) {
		dataMap.remove(variable);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see landa.wiidget.context.WiidgetContext#isSet(java.lang.String)
	 */

	public boolean isSet(String variable) {
		return dataMap.containsKey(variable);
	}

	public void setAll(Map<String, Object> data) {
		dataMap.putAll(data);
	}

	public Map<String, Object> getAll() {
		return ImmutableMap.copyOf(dataMap);
	}

}
