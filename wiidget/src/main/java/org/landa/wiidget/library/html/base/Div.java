package org.landa.wiidget.library.html.base;

import org.landa.wiidget.annotation.Attribute;
import org.landa.wiidget.library.html.BaseTagWiidget;

public class Div extends BaseTagWiidget {

	@Attribute(name = "class")
	public String cssClass;

	@Attribute
	public String style;

	@Attribute
	public String id;

}
