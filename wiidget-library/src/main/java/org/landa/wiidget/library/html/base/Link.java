package org.landa.wiidget.library.html.base;

import org.landa.wiidget.library.html.HtmlTagWiidget;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class Link extends HtmlTagWiidget {

	/**
	 * 
	 */
	private String value;

	@Override
	public void run() {

		write(getValue());

		super.run();
	}

	@Override
	public String getTagName() {
		return "a";
	}

	public String getValue() {
		return value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

}
