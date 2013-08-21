/**
 * 
 */
package org.landa.wiidget.library.html;

import org.landa.wiidget.annotation.Attribute;

/**
 * @author Zsolti
 */
public class Form extends BaseTagWiidget {

	@Attribute
	private String method = "GET";

	@Attribute
	private String action = "?";

	public void label(final String value) {

		this.widget(Label.class, dataMap().set("value", value));
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(final String method) {
		this.method = method;
	}

	public String getAction() {
		return action;
	}

	public void setAction(final String action) {
		this.action = action;
	}

}
