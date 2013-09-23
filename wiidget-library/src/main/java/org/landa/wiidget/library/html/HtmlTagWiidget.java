package org.landa.wiidget.library.html;

import java.util.Map.Entry;

import org.landa.wiidget.annotation.Attribute;
import org.landa.wiidget.library.BaseTagWiidget;
import org.landa.wiidget.library.Tag;
import org.landa.wiidget.util.DataMap;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public abstract class HtmlTagWiidget extends BaseTagWiidget {

	@Attribute(name = "class")
	private String cssClass;

	@Attribute
	private String style;

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
	protected DataMap getAttributeMap() {
		final DataMap attributeMap = super.getAttributeMap();

		attributeMap.putAll(getByPassAttributes());

		return attributeMap;
	}

	/**
	 * Creates the tag from this wiidget.
	 * 
	 * @return tag representant of wiidget.
	 */
	public Tag createTag() {

		final Tag tag = new Tag(getTagName());

		for (final Entry<String, Object> attributePair : getAttributeMap().entrySet()) {
			tag.setAttribute(attributePair.getKey(), attributePair.getValue().toString());
		}

		return tag;
	}

	@Override
	public String toString() {

		return createTag().toString();
	}

}
