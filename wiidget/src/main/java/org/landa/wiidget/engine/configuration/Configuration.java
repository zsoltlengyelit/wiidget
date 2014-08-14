package org.landa.wiidget.engine.configuration;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.engine.ObjectFactory;
import org.landa.wiidget.url.URLResolver;
import org.landa.wiidget.validation.WiidgetValidator;

/**
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 *
 */
public interface Configuration {

	public Class<? extends Wiidget> getRawType();

	public URLResolver getUrlResolver();

	public WiidgetValidator getWiidgetValidator();

	public ObjectFactory getObjectFactory();
}
