package org.landa.wiidget;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import org.landa.wiidget.context.DefaultWiidgetContext;
import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.engine.DefaultWiidgetFactory;
import org.landa.wiidget.engine.Position;
import org.landa.wiidget.engine.ResourceLink;
import org.landa.wiidget.engine.WiidgetFactory;
import org.landa.wiidget.parser.WiidgetLangProcessor;
import org.landa.wiidget.parser.WiidgetParserException;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public final class Renderer {

	/**
	 * The factory for createing / validating wiidgets.
	 */
	private final WiidgetFactory wiidgetFactory;

	/**
	 * @param wiidgetFactory
	 *            factory
	 */
	private Renderer(final WiidgetFactory wiidgetFactory) {
		this.wiidgetFactory = wiidgetFactory;
	}

	/**
	 * @param data
	 * @return
	 */
	public static Renderer create(final Map<String, Object> data) {

		final WiidgetContext wiidgetContext = new DefaultWiidgetContext(data);
		final WiidgetFactory wiidgetFactory = new DefaultWiidgetFactory(wiidgetContext);

		return create(wiidgetFactory);
	}

	/**
	 * 
	 */
	public static Renderer create() {
		return create(new DefaultWiidgetFactory());
	}

	/**
	 * @param wiidgetFactory
	 * @return
	 */
	public static Renderer create(final WiidgetFactory wiidgetFactory) {
		return new Renderer(wiidgetFactory);
	}

	public WiidgetFactory getWiidgetFactory() {
		return wiidgetFactory;
	}

	/**
	 * Renders file.
	 * 
	 * @param path
	 * @return
	 */
	public String renderFile(final String path) {

		try {
			final FileInputStream inputStream = new FileInputStream(path);

			return render(inputStream);

		} catch (final FileNotFoundException e) {
			throw new WiidgetException("Cannot found file: " + path, e);
		}

	}

	/**
	 * @param template
	 * @return
	 */
	public String render(final String template) {

		final String result = renderWithoutResources(template);

		return transform(result);

	}

	/**
	 * @param inputStream
	 * @return
	 */
	public String render(final InputStream inputStream) {

		final WiidgetLangProcessor langProcessor = new WiidgetLangProcessor(wiidgetFactory);

		try {

			final String result = langProcessor.render(inputStream);

			return transform(result);

		} catch (final WiidgetParserException exception) {
			throw new WiidgetException("Template render failed.", exception);
		}

	}

	/**
	 * @param wiidgetView
	 * @return
	 */
	public String render(final WiidgetView wiidgetView) {

		wiidgetView.init();
		wiidgetView.run();

		final String result = wiidgetView.render();

		return transform(result);
	}

	/**
	 * @param result
	 * @return
	 */
	private String transform(final String result) {

		final String resourcePlace = placeResources(result);

		final String transformed = getWiidgetFactory().getResutlTransformerRegistrator().transform(resourcePlace);

		return transformed;
	}

	/**
	 * Without placing resources.
	 * 
	 * @param template
	 * @return
	 */
	public String renderWithoutResources(final String template) {
		final WiidgetLangProcessor langProcessor = new WiidgetLangProcessor(wiidgetFactory);

		try {

			final String result = langProcessor.render(template);

			return result;

		} catch (final WiidgetParserException e) {
			throw new WiidgetException("Template render failed.", e);
		}

	}

	/**
	 * @param result
	 * @return
	 */
	private String placeResources(final String result) {

		String resourcePlace = result;

		for (final ResourceLink resourceLink : getWiidgetFactory().getResourceLinks()) {

			final Position position = resourceLink.getPosition();
			if (null == position) {
				throw new WiidgetException("Resource (" + resourceLink.getSource() + ") has null position.");
			}

			final String link = resourceLink.getTemplate();

			resourcePlace = position.place(resourcePlace, link);
		}
		return resourcePlace;
	}
}
