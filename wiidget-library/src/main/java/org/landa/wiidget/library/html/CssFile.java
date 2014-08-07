package org.landa.wiidget.library.html;

import org.landa.wiidget.Tag;
import org.landa.wiidget.library.format.AbstractResourceLinkWiidget;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class CssFile extends AbstractResourceLinkWiidget {

	/**
	 * Media.
	 */
	private String media = "all";

	@Override
	public String getTemplate() {

		final String path = getWiidgetFactory().getUrlResolver().createURL(
				getUrl());

		return new Tag("link").a("rel", "stylesheet").a("href", path)
				.a("media", getMedia()).toString();
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(final String media) {
		this.media = media;
	}

}
