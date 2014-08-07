/**
 * 
 */
package org.landa.wiidget.library.html;

import org.landa.wiidget.Tag;
import org.landa.wiidget.Wiidget;

/**
 * @author Zsolti
 * 
 */
public class Label extends Wiidget {

	public String value;

	@Override
	public void run() {

		write(Tag.tag("label", value));

	}

	@Override
	public void init() {
	}
}
