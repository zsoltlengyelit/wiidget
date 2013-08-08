package org.landa.wiidget.library.template;

public class SimplePart extends Part {

	private String value;

	@Override
	public String getContent() {
		return value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

}
