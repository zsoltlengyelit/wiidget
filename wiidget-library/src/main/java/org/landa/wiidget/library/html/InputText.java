package org.landa.wiidget.library.html;

import org.landa.wiidget.annotation.Attribute;

/**
 * Input text HTML field.
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class InputText extends HtmlTagWiidget {

	@Attribute
	private String name;

	@Attribute
	private String value;

	@Attribute
	private String type = "text";

	@Override
	public String getTagName() {
		return "input";
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
