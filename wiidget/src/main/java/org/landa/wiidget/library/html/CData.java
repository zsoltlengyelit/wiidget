package org.landa.wiidget.library.html;

import org.landa.wiidget.Wiidget;

public class CData extends Wiidget {

	private String value;

	@Override
	public void run() {
		write(getValue());
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
