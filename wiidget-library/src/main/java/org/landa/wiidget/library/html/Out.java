package org.landa.wiidget.library.html;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.validator.Required;

/**
 * Simple value output.
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class Out extends Wiidget {

	@Required
	private String value;

	@Override
	public void run() {
		write(getValue());
	}

	public String getValue() {
		return value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

}