package org.landa.wiidget.engine;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public interface ResourceLink {

	/**
	 * URL or something similar to that.
	 * 
	 * @return path to resource
	 */
	public String getSource();

	/**
	 * Position of resource in the document.
	 * 
	 * @return position
	 */
	public Position getPosition();

	/**
	 * Template of resource in the document.
	 * 
	 * @return template of resource
	 */
	public String getTemplate();

}
