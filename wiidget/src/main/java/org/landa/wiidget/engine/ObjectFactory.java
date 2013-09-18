package org.landa.wiidget.engine;

/**
 * Creates objects for the specified class.
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public interface ObjectFactory {

	public <T> T getInstance(Class<T> clazz);

}
