package org.landa.wiidget.io;

import java.util.Map;
import java.util.Map.Entry;

public class StringTemplate {

	private final String template;
	private final Boolean removePlaceholders;

	public StringTemplate(String template) {
		this(template, false);
	}

	public StringTemplate(String template, Boolean removePlaceholders) {
		this.template = template;
		this.removePlaceholders = removePlaceholders;
	}

	public String render(Map<String, Object> data) {

		String base = template;

		for (Entry<String, Object> entry : data.entrySet()) {

			String key = entry.getKey();
			String value = entry.getValue().toString();

			String pattern = "\\{" + key + "}";

			base = base.replaceAll(pattern, value);

		}

		if (removePlaceholders) {
			base = base.replaceAll("\\{[^\\{}]*}", "");
		}

		return base;
	}
}
