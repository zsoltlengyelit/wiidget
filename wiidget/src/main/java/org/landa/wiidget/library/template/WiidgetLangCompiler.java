package org.landa.wiidget.library.template;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.antlr.WiidgetParser.CompilationUnitContext;
import org.landa.wiidget.engine.WiidgetTemplateEngine;
import org.landa.wiidget.parser.WiidgetParserException;
import org.landa.wiidget.parser.WiidgetLangProcessor;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class WiidgetLangCompiler extends Wiidget {

	private String value;

	private final Injector injector;

	@Inject
	public WiidgetLangCompiler(final Injector injector) {
		this.injector = injector;
	}

	@Override
	public void run() {

		try {
			final java.io.InputStream inputStream = new ByteArrayInputStream(value.getBytes("UTF-8"));

			final WiidgetLangProcessor wiigetParser = injector.getInstance(WiidgetLangProcessor.class);

			final CompilationUnitContext compilationUnit = WiidgetTemplateEngine.getCompilationUnitContext(inputStream);
			final String viewResult = wiigetParser.render(compilationUnit);

			write(viewResult);

		} catch (final WiidgetParserException e) {
			e.printStackTrace();
		} catch (final UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (final IOException e) {
			e.printStackTrace();

		}

	}

	public String getValue() {
		return value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

}
