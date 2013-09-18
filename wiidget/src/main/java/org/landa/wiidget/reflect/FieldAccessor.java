package org.landa.wiidget.reflect;

public interface FieldAccessor {

	public Object getValue(Object object);

	public String getFieldName();

}
