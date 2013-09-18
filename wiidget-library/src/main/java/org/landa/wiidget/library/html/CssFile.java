package org.landa.wiidget.library.html;

import org.landa.wiidget.annotation.DefaultField;
import org.landa.wiidget.library.Tag;
import org.landa.wiidget.library.format.AbstractResourceLinkWiidget;
import org.landa.wiidget.validator.Required;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class CssFile extends AbstractResourceLinkWiidget {

	@Required
	@DefaultField
	private String url;

	/**
	 * 
	 */
	private String media = "all";

	public String getUrl() {
		return url;
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	@Override
	public String getSource() {
		return url;
	}

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
