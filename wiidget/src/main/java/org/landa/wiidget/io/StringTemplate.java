package org.landa.wiidget.io;

import java.util.Map;
import java.util.Map.Entry;

public class StringTemplate {

	private final String template;
	private final Boolean removePlaceholders;

	public StringTemplate(final String template) {
		this(template, true);
	}

	public StringTemplate(final String template, final Boolean removePlaceholders) {
		this.template = template;
		this.removePlaceholders = removePlaceholders;
	}

	public String render(final Map<String, Object> data) {

		String base = template;

		for (final Entry<String, Object> entry : data.entrySet()) {

			final String key = entry.getKey();
			final String value = entry.getValue().toString();

			final String pattern = "\\{" + key + "}";

			try {
				base = base.replaceAll(pattern, value);
			} catch (final IllegalArgumentException argumentException) {
				throw argumentException;
			}
		}

		if (removePlaceholders) {
			base = base.replaceAll("\\{[^\\{}]*}", "");
		}

		return base;
	}
}
