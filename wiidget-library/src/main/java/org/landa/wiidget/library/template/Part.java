package org.landa.wiidget.library.template;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.annotation.DefaultField;

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

	public void setName(String name) {
		this.name = name;
	}

}
