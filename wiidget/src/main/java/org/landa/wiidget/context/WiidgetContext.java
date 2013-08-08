package org.landa.wiidget.context;

import java.util.Map;

import com.google.inject.ImplementedBy;

@ImplementedBy(WiidgetContextImpl.class)
public interface WiidgetContext {

	public Object get(String variable);

	public void set(String variable, Object value);

	public void remove(String variable);

	public boolean isSet(String variable);

	public void setAll(Map<String, Object> data);

	public Map<String, Object> getAll();

}
