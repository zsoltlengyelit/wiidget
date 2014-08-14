package org.landa.wiidget.engine.configuration;

import org.landa.wiidget.basewiidgets.Raw;
import org.landa.wiidget.engine.ObjectFactory;
import org.landa.wiidget.engine.RawWiidget;
import org.landa.wiidget.engine.ReflectionObjectFactory;
import org.landa.wiidget.url.TransparentURLResolver;
import org.landa.wiidget.url.URLResolver;
import org.landa.wiidget.validation.DefaultWiidgetValidator;
import org.landa.wiidget.validation.WiidgetValidator;

/**
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 *
 */
public class DefaultConfiguration implements Configuration {

	@Override
	public Class<? extends RawWiidget> getRawType() {
		return Raw.class;
	}

	@Override
	public URLResolver getUrlResolver() {
		return new TransparentURLResolver();
	}

	@Override
	public WiidgetValidator getWiidgetValidator() {

		return new DefaultWiidgetValidator(getObjectFactory());
	}

	@Override
	public ObjectFactory getObjectFactory() {
		return new ReflectionObjectFactory();
	}

}
