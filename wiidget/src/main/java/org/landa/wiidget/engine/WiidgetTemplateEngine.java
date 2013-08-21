package org.landa.wiidget.engine;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Map.Entry;

import ninja.Context;
import ninja.Result;
import ninja.i18n.Lang;
import ninja.i18n.Messages;
import ninja.template.TemplateEngine;
import ninja.template.TemplateEngineFreemarkerExceptionHandler;
import ninja.template.TemplateEngineFreemarkerI18nMethod;
import ninja.template.TemplateEngineManager;
import ninja.utils.ResponseStreams;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.landa.wiidget.WiidgetException;
import org.landa.wiidget.antlr.WiidgetLexer;
import org.landa.wiidget.antlr.WiidgetParser;
import org.landa.wiidget.antlr.WiidgetParser.CompilationUnitContext;
import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.io.FormatterTransformer;
import org.landa.wiidget.parser.WiidgetLangProcessor;
import org.landa.wiidget.util.DataMap;
import org.landa.wiidget.util.WiidgetProperties;

import com.google.common.base.CaseFormat;
import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class WiidgetTemplateEngine implements TemplateEngine {

	private final Messages messages;

	private final Lang lang;

	private final WiidgetTemplateEngineHelper templateEngineHelper;

	private final org.slf4j.Logger logger;

	private final WiidgetProperties properties;

	private final Injector injector;

	@Inject
	public WiidgetTemplateEngine(final Messages messages, final Lang lang, final org.slf4j.Logger logger, final TemplateEngineFreemarkerExceptionHandler templateEngineFreemarkerExceptionHandler,
	        final WiidgetTemplateEngineHelper templateEngineHelper, final TemplateEngineManager templateEngineManager, final WiidgetProperties properties, final Injector injector) {

		this.messages = messages;
		this.lang = lang;
		this.logger = logger;
		this.templateEngineHelper = templateEngineHelper;
		this.properties = properties;
		this.injector = injector;

	}

	@SuppressWarnings("unchecked")
	@Override
	public void invoke(final Context context, final Result result) {

		final Object object = result.getRenderable();

		final ResponseStreams responseStreams = context.finalizeHeaders(result);

		DataMap map;
		// if the object is null we simply render an empty map...
		if (object == null) {
			map = new DataMap();

		} else if (object instanceof Map) {
			map = new DataMap((Map<String, Object>) object);

		} else {
			// We are getting an arbitrary Object and put that into
			// the root of freemarker

			// If you are rendering something like Results.ok().render(new
			// MyObject())
			// Assume MyObject has a public String name field.
			// You can then access the fields in the template like that:
			// ${myObject.publicField}

			final String realClassNameLowerCamelCase = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, object.getClass().getSimpleName());

			map = new DataMap();
			map.put(realClassNameLowerCamelCase, object);

		}

		// set language from framework. You can access
		// it in the templates as ${lang}
		final Optional<String> language = lang.getLanguage(context, Optional.of(result));
		if (language.isPresent()) {
			map.put("lang", language.get());
		}

		// put all entries of the session cookie to the map.
		// You can access the values by their key in the cookie
		if (!context.getSessionCookie().isEmpty()) {
			map.put("session", context.getSessionCookie().getData());
		}

		map.put("contextPath", context.getContextPath());

		// /////////////////////////////////////////////////////////////////////
		// this will be deprecated soon. Please use ${i18n("mykey")}
		// to render i18n messages
		// ////////////////////////////////////////////////////////////////////
		// merge messages with this template...
		final Map<Object, Object> i18nMap = messages.getAll(context, Optional.of(result));

		for (final Entry<Object, Object> entry : i18nMap.entrySet()) {

			map.put(entry.getKey().toString(), entry.getValue());
		}

		// ////////////////////////////////////////////////////////////////////
		// A method that renders i18n messages and can also render messages with
		// placeholders directly in your template:
		// E.g.: ${i18n("mykey", myPlaceholderVariable)}
		// ////////////////////////////////////////////////////////////////////
		map.put("i18n", new TemplateEngineFreemarkerI18nMethod(messages, context, result));

		// /////////////////////////////////////////////////////////////////////
		// Convenience method to translate possible flash scope keys.
		// !!! If you want to set messages with placeholders please do that
		// !!! in your controller. We only can set simple messages.
		// Eg. A message like "errorMessage=my name is: {0}" => translate in
		// controller and pass directly.
		// A message like " errorMessage=An error occurred" => use that as
		// errorMessage.
		//
		// prefix keys with "flash_"
		// ////////////////////////////////////////////////////////////////////
		for (final Entry<String, String> entry : context.getFlashCookie().getCurrentFlashCookieData().entrySet()) {

			String messageValue = null;

			final Optional<String> messageValueOptional = messages.get(entry.getValue(), context, Optional.of(result));

			if (!messageValueOptional.isPresent()) {
				messageValue = entry.getValue();
			} else {
				messageValue = messageValueOptional.get();
			}

			map.put("flash_" + entry.getKey(), messageValue);
		}

		// end of collect data
		this.getWiidgetContext().setAll(map); // set to context

		// Specify the data source where the template files come from.
		// Here I set a file directory for it:
		String processedTemplate = null;

		// code formatting
		registerFormatter();

		try {

			// Class<AView> viewClass =
			// templateEngineHelper.getViewClass(context.getRoute(), result);
			// AView view = injector.getInstance(viewClass);
			//
			// view.setAttributes(map);
			//
			// view.init();
			// view.run();
			//
			// String viewResult = view.render();
			//
			// responseStreams.getWriter().append(viewResult);
			//
			// responseStreams.getWriter().flush();
			// responseStreams.getWriter().close();

			final String view = templateEngineHelper.getResource(context.getRoute(), result);

			processedTemplate = view; // TODO better error handling

			final java.io.InputStream inputStream = getClass().getResourceAsStream(view);

			final WiidgetLangProcessor processor = injector.getInstance(WiidgetLangProcessor.class);

			final CompilationUnitContext compilationUnit = getCompilationUnitContext(inputStream);

			final String viewResult = processor.render(compilationUnit);

			final String transformedResult = getResultTransformerRegistrator().transform(viewResult);

			responseStreams.getWriter().append(transformedResult);

			responseStreams.getWriter().flush();
			responseStreams.getWriter().close();

		} catch (final Exception e) {
			logger.error("Error processing template ", e);

			throw new WiidgetException("Error while process template: " + processedTemplate, e);

		}

	}

	private WiidgetContext getWiidgetContext() {
		// this is maybe not singleton class
		return injector.getInstance(WiidgetContext.class);
	}

	private void registerFormatter() {

		final Boolean formatOutput = properties.getBoolean(WiidgetProperties.FORMAT_OUTPUT);

		if (formatOutput) {

			final Integer formatIndent = properties.getInteger(WiidgetProperties.FORMAT_INDENTATION);
			getResultTransformerRegistrator().register(new FormatterTransformer(formatIndent));
		}
	}

	/**
	 * @return
	 */
	private ResultTransformerRegistrator getResultTransformerRegistrator() {
		return injector.getInstance(ResultTransformerRegistrator.class);
	}

	public static CompilationUnitContext getCompilationUnitContext(final InputStream inputStream) throws IOException {

		final ANTLRInputStream input = new ANTLRInputStream(inputStream);

		final WiidgetLexer aWidgetLexer = new WiidgetLexer(input);

		final BufferedTokenStream tokenStream = new BufferedTokenStream(aWidgetLexer);

		final WiidgetParser aWidgetParser = new WiidgetParser(tokenStream);

		final CompilationUnitContext compilationUnit = aWidgetParser.compilationUnit();

		return compilationUnit;

	}

	@Override
	public String getContentType() {
		return "text/html";
	}

	@Override
	public String getSuffixOfTemplatingEngine() {
		return properties.getString(WiidgetProperties.WIIDGET_FILE_EXTENSION);
	}

}
