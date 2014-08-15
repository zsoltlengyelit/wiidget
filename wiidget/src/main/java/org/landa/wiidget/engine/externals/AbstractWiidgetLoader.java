package org.landa.wiidget.engine.externals;

import java.net.URI;
import java.util.Set;

/**
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 *
 */
public abstract class AbstractWiidgetLoader implements ExternalWiidgetLoader {

	@Override
	public boolean canHandle(final URI uri) {

		final String scheme = uri.getScheme();
		for (final String supportedScheme : getSupportedSchemes()) {
			if (scheme.equalsIgnoreCase(supportedScheme)) {
				return true;
			}
		}

		return false;
	}

	protected abstract Set<String> getSupportedSchemes();

}
