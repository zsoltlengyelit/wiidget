package org.landa.wiidget.basewiidgets;

import org.landa.wiidget.Wiidget;

/**
 * Simple value output.
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class Out extends Wiidget {


	/**
	 * Value to write to output.
	 */
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
