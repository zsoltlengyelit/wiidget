package org.landa.wiidget.io;

import org.landa.wiidget.engine.ResultTransformer;

/**
 * @author
 */
public class FormatterTransformer implements ResultTransformer {

	private final Integer formatIndent;

	public FormatterTransformer(final Integer formatIndent) {
		this.formatIndent = formatIndent;
	}

	@Override
	public String transform(final String result) {

		return XMLFormatter.format(result, formatIndent);

	}

}
