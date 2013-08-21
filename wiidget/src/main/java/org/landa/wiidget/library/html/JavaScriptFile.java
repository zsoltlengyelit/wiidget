package org.landa.wiidget.library.html;

import org.landa.wiidget.annotation.DefaultField;
import org.landa.wiidget.library.html.transformer.AbstractResultTransformerWiidget;

public class JavaScriptFile extends AbstractResultTransformerWiidget {

	@DefaultField
	private String url;

	private final String type = "text/javascript";

	public String getUrl() {
		return url;
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	@Override
	public String transform(final String result) {

		String replacement = "<script type=\"" + getType() + "\" src=\"" + getUrl() + "\" ></script>";
		replacement += "\n</head>";

		final String transformed = result.replaceFirst("</head>", replacement);

		return transformed;

	}

}
