package org.landa.wiidget.library.html.base;

import org.landa.wiidget.annotation.DefaultField;
import org.landa.wiidget.library.html.HtmlTagWiidget;

/**
 * HTML Heading.
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 * 
 */
public class Heading extends HtmlTagWiidget {

	@DefaultField
	private String content;

	private Integer level = 1;

	@Override
	public String getTagName() {
		return "h" + getLevel();
	}

	public String getContent() {
		return content;
	}

	public void setContent(final String content) {
		this.content = content;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(final Integer level) {
		this.level = level;
	}

}
