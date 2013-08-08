package org.landa.wiidget.library.html;

import org.landa.wiidget.annotation.Attribute;
import org.landa.wiidget.library.TagWiidget;

public class InputText extends TagWiidget {

	@Attribute
	private String name;

	@Attribute
	private String value;

	@Attribute
	private String type;

	public InputText() {

		super("input", true);
		this.type = "text";
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

}
