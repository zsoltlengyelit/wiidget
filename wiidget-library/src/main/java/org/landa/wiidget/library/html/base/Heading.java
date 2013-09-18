package org.landa.wiidget.library.html.base;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.annotation.DefaultField;
import org.landa.wiidget.library.Tag;

public class Heading extends Wiidget {

	@DefaultField
	private String content;

	private Integer level = 1;

	@Override
	public void init() {
		super.init();

		startBuffer();
	}

	@Override
	public void run() {

		write(Tag.open("h" + getLevel()));

		write(getContent());
		write(endBuffer());

		write(Tag.close("h" + getLevel()));

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
