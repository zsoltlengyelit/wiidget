package org.landa.wiidget.library.html;

import org.landa.wiidget.annotation.DefaultField;
import org.landa.wiidget.library.html.transformer.AbstractResultTransformerWiidget;

public class CssFile extends AbstractResultTransformerWiidget {

	@DefaultField
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	@Override
	public String transform(final String result) {

		String replacement = "<link rel=\"stylesheet\" href=\"" + url + "\" media=\"all\">";
		replacement += "\n</head>";

		final String transformed = result.replaceFirst("</head>", replacement);

		return transformed;

	}

}
