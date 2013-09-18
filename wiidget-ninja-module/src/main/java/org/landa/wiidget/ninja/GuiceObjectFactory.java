package org.landa.wiidget.ninja;

import org.landa.wiidget.engine.ObjectFactory;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;

@Singleton
public class GuiceObjectFactory implements ObjectFactory {

	private final Injector injector;

	@Inject
	public GuiceObjectFactory(final Injector injector) {
		this.injector = injector;
	}

	@Override
	public <T> T getInstance(final Class<T> clazz) {
		return injector.getInstance(clazz);
	}

}
