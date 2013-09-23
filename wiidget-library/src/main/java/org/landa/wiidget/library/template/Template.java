package org.landa.wiidget.library.template;

import org.landa.wiidget.io.StringTemplate;
import org.landa.wiidget.library.html.TemplatedHtmlWiidget;
import org.landa.wiidget.util.DataMap;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class Template extends TemplatedHtmlWiidget {

	/**
	 * Name of the template. This is a file path.
	 */
	private String value;

	private Boolean removePlaceholders = true;

	@Override
	protected String getTemplateName() {

		return getValue();
	}

	@Override
	protected String replacePlaceholders(final String content, final DataMap data) {

		final StringTemplate stringTemplate = new StringTemplate(content, this.isRemovePlaceholders());
		return stringTemplate.render(data);
	}

	public String getValue() {
		return value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

	public Boolean isRemovePlaceholders() {
		return removePlaceholders;
	}

	public void setRemovePlaceholders(final Boolean removePlaceholders) {
		this.removePlaceholders = removePlaceholders;
	}

}
