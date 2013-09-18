package org.landa.wiidget.ninja;

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

import org.landa.wiidget.Renderer;
import org.landa.wiidget.WiidgetException;
import org.landa.wiidget.WiidgetView;
import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.engine.DefaultWiidgetFactory;
import org.landa.wiidget.engine.ObjectFactory;
import org.landa.wiidget.engine.ResultTransformerRegistrator;
import org.landa.wiidget.engine.WiidgetFactory;
import org.landa.wiidget.util.DataMap;
import org.landa.wiidget.util.WiidgetProperties;
import org.landa.wiidget.validation.WiidgetValidator;

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

	@Override
	@SuppressWarnings("unchecked")
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

		map.put("messages", messages);
		map.put("m", new WiidgetMessages(messages, context));
		map.put("wiidgetContext", this.getWiidgetContext());

		// end of collect data
		this.getWiidgetContext().setAll(map); // set to context

		// Specify the data source where the template files come from.
		// Here I set a file directory for it:
		final String processedTemplate = null;

		try {

			String viewResult = null;

			final WiidgetFactory wiidgetFactory = createWiidgetFactory();
			final Renderer renderer = Renderer.create(wiidgetFactory);

			try {
				final Class<WiidgetView> wiidgetViewClass = templateEngineHelper.getViewClass(context.getRoute(), result);

				final WiidgetView wiidgetView = injector.getInstance(wiidgetViewClass);

				viewResult = renderer.render(wiidgetView);

			} catch (final ClassNotFoundException notFoundException) {

				final InputStream stream = templateEngineHelper.getResource(context.getRoute(), result);

				viewResult = renderer.render(stream);

			}

			responseStreams.getWriter().append(viewResult);

			responseStreams.getWriter().flush();
			responseStreams.getWriter().close();

		} catch (final Exception e) {
			logger.error("Error processing template ", e);

			throw new WiidgetException("Error while process template: " + processedTemplate, e);

		}

	}

	private WiidgetFactory createWiidgetFactory() {

		final ObjectFactory objectFactory = injector.getInstance(ObjectFactory.class);
		final WiidgetValidator validator = injector.getInstance(WiidgetValidator.class);
		final WiidgetProperties wiidgetProperties = injector.getInstance(WiidgetProperties.class);
		final WiidgetContext context = injector.getInstance(WiidgetContext.class);

		return new DefaultWiidgetFactory(objectFactory, validator, wiidgetProperties, context, new ResultTransformerRegistrator());
	}

	private WiidgetContext getWiidgetContext() {
		// this is maybe not singleton class
		return injector.getInstance(WiidgetContext.class);
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
