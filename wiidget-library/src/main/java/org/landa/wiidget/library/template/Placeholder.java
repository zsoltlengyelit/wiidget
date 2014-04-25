package org.landa.wiidget.library.template;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.annotation.DefaultField;
import org.landa.wiidget.validator.Required;

public class Placeholder extends Wiidget {

	@DefaultField
	@Required(message = "kell")
	private String name;

	@Override
	public void run() {
		write("{" + getName() + "}");
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
