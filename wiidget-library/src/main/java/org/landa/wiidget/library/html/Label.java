/**
 * 
 */
package org.landa.wiidget.library.html;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.library.Tag;

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
