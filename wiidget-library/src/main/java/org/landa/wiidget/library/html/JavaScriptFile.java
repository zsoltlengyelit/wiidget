package org.landa.wiidget.library.html;

import org.landa.wiidget.annotation.DefaultField;
import org.landa.wiidget.library.Tag;
import org.landa.wiidget.library.format.AbstractResourceLinkWiidget;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class JavaScriptFile extends AbstractResourceLinkWiidget {

	@DefaultField
	private String url;

	private String type = "text/javascript";

	public String getUrl() {
		return url;
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	@Override
	public String getSource() {
		return url;
	}

	@Override
	public String getTemplate() {

		return new Tag("script").a("type", getType()).a("src", getUrl()).toString();
	}

}
