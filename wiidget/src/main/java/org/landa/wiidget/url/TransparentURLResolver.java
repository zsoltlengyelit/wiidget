/**
 * 
 */
package org.landa.wiidget.url;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 * 
 */
public class TransparentURLResolver implements URLResolver {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.landa.wiidget.url.URLResolver#createURL(java.lang.String)
	 */
	@Override
	public String createURL(final String path) {
		return path;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.landa.wiidget.url.URLResolver#createAbsoluteURL(java.lang.String)
	 */
	@Override
	public String createAbsoluteURL(final String path) {
		return path;
	}

	@Override
	public String getContextPath() {
		return "";
	}

}
