package org.landa.wiidget.engine.externals;

import org.landa.wiidget.WiidgetException;

/**
 *When cannot load wiidget resource.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 *
 */
public class LoadingException extends WiidgetException {

	private static final long serialVersionUID = -8555424513318101384L;

	public LoadingException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
