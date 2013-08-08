package org.landa.wiidget.library.html;

import ninja.Context;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.annotation.DefaultField;
import org.landa.wiidget.engine.ResultTransformer;
import org.landa.wiidget.engine.ResultTransformerRegistrator;

import com.google.inject.Inject;

public class CssFile extends Wiidget {

	@DefaultField
	private String url;

	private final ResultTransformerRegistrator resultTransformerRegistrator;

	@Inject
	public CssFile(final ResultTransformerRegistrator resultTransformerRegistrator, final Context context) {
		this.resultTransformerRegistrator = resultTransformerRegistrator;

	}

	@Override
	public void run() {

		resultTransformerRegistrator.register(new CssResultTransformer(this.url));
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	private class CssResultTransformer implements ResultTransformer {

		private final String url;

		public CssResultTransformer(final String url) {
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

}
