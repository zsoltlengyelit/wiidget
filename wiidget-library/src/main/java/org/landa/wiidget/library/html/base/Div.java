package org.landa.wiidget.library.html.base;

import org.landa.wiidget.annotation.Attribute;
import org.landa.wiidget.library.html.HtmlTagWiidget;

public class Div extends HtmlTagWiidget {

	@Attribute(name = "class")
	public String cssClass;

	@Attribute
	public String style;

}
