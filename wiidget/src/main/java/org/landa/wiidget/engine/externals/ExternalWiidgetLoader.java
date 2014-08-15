package org.landa.wiidget.engine.externals;

import java.net.URI;

/**
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 *
 */
public interface ExternalWiidgetLoader {

	boolean canHandle(URI uri);

	String load(URI uri);
}
