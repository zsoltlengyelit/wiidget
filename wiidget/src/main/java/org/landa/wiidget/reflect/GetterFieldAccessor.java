package org.landa.wiidget.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class GetterFieldAccessor implements FieldAccessor {

	private final Method method;
	private final String field;

	public GetterFieldAccessor(Method method, String field) {
		this.method = method;
		this.field = field;
	}

	public Object getValue(Object object) {

		try {
			return method.invoke(object);

		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public String getFieldName() {
		return field;
	}

}
