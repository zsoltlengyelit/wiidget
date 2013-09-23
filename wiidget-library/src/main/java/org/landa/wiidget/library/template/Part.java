package org.landa.wiidget.library.template;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.annotation.DefaultField;

/**
 * Represents a part of the whole page. Can use for store named content.
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class Part extends Wiidget {

	/**
	 * Name of the part.
	 */
	@DefaultField
	private String name;

	private String content;

	@Override
	public void init() {
		super.init();

		startBuffer();
	}

	@Override
	public void run() {
		content = endBuffer();
	}

	public String getContent() {
		return this.content;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
