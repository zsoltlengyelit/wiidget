package org.landa.wiidget.library.html;

import org.landa.wiidget.annotation.Attribute;
import org.landa.wiidget.library.TagWiidget;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public abstract class BaseTagWiidget extends TagWiidget {

	@Attribute(name = "class")
	private String cssClass;

	@Attribute
	private String style;

	@Attribute
	private String id;

	@Override
	public String getTagName() {
		final String tagName = getClass().getSimpleName().toLowerCase();

		return tagName;
	}

	public String getCssClass() {
		return cssClass;
	}

	public void setCssClass(final String cssClass) {
		this.cssClass = cssClass;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(final String style) {
		this.style = style;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(final String id) {
		this.id = id;
	}

}
