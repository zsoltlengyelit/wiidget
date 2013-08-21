package org.landa.wiidget.library.html;

import org.landa.wiidget.annotation.Attribute;
import org.landa.wiidget.library.TagWiidget;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public abstract class BaseTagWiidget extends TagWiidget {

	@Attribute(name = "class")
	public String cssClass;

	@Attribute
	public String style;

	@Attribute
	public String id;

	@Override
	public String getTagName() {
		final String tagName = getClass().getSimpleName().toLowerCase();

		return tagName;
	}

}
