package org.landa.wiidget.url;

/**
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 * 
 */
public interface URLResolver {

	String createURL(String path);

	String createAbsoluteURL(String path);

	String getContextPath();

}
