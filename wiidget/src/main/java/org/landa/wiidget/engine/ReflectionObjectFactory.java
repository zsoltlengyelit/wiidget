package org.landa.wiidget.engine;

import org.landa.wiidget.reflect.Reflection;

public class ReflectionObjectFactory implements ObjectFactory {

	@Override
	public <T> T getInstance(final Class<T> clazz) {

		return Reflection.newInstance(clazz);
	}
}
