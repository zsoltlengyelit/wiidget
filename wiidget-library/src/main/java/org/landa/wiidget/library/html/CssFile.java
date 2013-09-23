package org.landa.wiidget.library.html;

import org.landa.wiidget.library.Tag;
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

		return new Tag("link").a("rel", "stylesheet").a("href", getUrl()).a("media", getMedia()).toString();
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(final String media) {
		this.media = media;
	}

}
