package org.landa.wiidget.javaee;

import java.io.Serializable;
import java.util.Iterator;
import java.util.logging.Logger;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;

import org.landa.wiidget.WiidgetException;
import org.landa.wiidget.engine.ObjectFactory;

/**
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 * 
 */
@Default
public class CDIObjectFactory implements ObjectFactory , Serializable{


	@Inject
	private BeanManager beanManager;
	


	@Override
	public <T> T getInstance(final Class<T> clazz) {

		final Iterator<Bean<?>> iter = beanManager.getBeans(clazz).iterator();
		if (!iter.hasNext()) {
			// throw new IllegalStateException(
			// "CDI BeanManager cannot find an instance of requested type "
			// + clazz.getName());

			try {
				return clazz.newInstance();
			} catch (final InstantiationException e) {
				throw new WiidgetException("Cannot instantiate class.", e);
			} catch (final IllegalAccessException e) {
				throw new WiidgetException("Cannot instantiate class.", e);
			}
		}
		final Bean<T> bean = (Bean<T>) iter.next();
		final CreationalContext<T> ctx = beanManager
				.createCreationalContext(bean);
		final T instance = (T) beanManager.getReference(bean, clazz, ctx);

		return instance;

	}

}
