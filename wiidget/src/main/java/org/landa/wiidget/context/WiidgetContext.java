package org.landa.wiidget.context;

import java.util.Map;
import java.util.Set;

/**
 * The context provides environmental variables in the rendering process.
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public interface WiidgetContext {

	/**
	 * Get variable value.
	 * 
	 * @param variable
	 *            variable name
	 * @return variable value
	 */
	public Object get(String variable);

	public void set(String variable, Object value);

	public void remove(String variable);

	public boolean isSet(String variable);

	public void setAll(Map<String, Object> data);

	public Map<String, Object> getAll();

	public Set<String> getKeys();
}
