package org.landa.wiidget;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import org.landa.wiidget.engine.WiidgetFactory;
import org.landa.wiidget.io.BufferedPrintStream;
import org.landa.wiidget.util.DataMap;

/**
 * @author Zsolti
 */
public abstract class Wiidget {

	/**
	 * Unique ID of wiidget.
	 */
	private String id;

	/**
	 * Rendered property. By default every widget is rendered.
	 */
	private boolean rendered = true;

	private WiidgetView owner;

	private final java.util.List<Wiidget> children = new LinkedList<Wiidget>();

	public void run() {
	}

	protected <W extends Wiidget> W beginWiidget(final W wiidget) {
		getWiidgetFactory().addWiidget(wiidget, getOwner(), true);

		if (wiidget.isRendered()) {
			wiidget.init();

			return wiidget;
		}
		// the wiidget is not rendered
		return null;
	}

	protected <W extends Wiidget> W wiidget(final Class<W> widgetClass) {
		return wiidget(widgetClass, new DataMap());
	}

	protected <W extends Wiidget> W wiidget(final Class<W> widgetClass, final DataMap dataMap) {
		final W widget = getWiidgetFactory().createWiidget(getOwner(), widgetClass, dataMap, false);

		if (widget.isRendered()) {
			widget.init();
			widget.run();

			return widget;

		}

		// the wiidget is not rendered
		return null;
	}

	protected <W extends Wiidget> W beginWiidget(final Class<W> widgetClass) {
		return beginWiidget(widgetClass, new DataMap());
	}

	protected <W extends Wiidget> W beginWiidget(final Class<W> widgetClass, final DataMap dataMap) {
		final W widget = getWiidgetFactory().createWiidget(getOwner(), widgetClass, dataMap, true);

		if (widget.isRendered()) {
			widget.init();

			return widget;
		}
		// the wiidget is not rendered
		return null;
	}

	@SuppressWarnings("unchecked")
	protected <W extends Wiidget> W endWiidget() {
		final Wiidget wiidget = getWiidgetFactory().getWiidgetStack().pop();

		if (wiidget.isRendered()) {
			wiidget.run();
		}

		return (W) wiidget;
	}

	@SuppressWarnings("unchecked")
	protected <W extends Wiidget> W endWiidget(final W widget) {

		final Wiidget popedWidget = getWiidgetFactory().getWiidgetStack().pop();

		if (!popedWidget.isRendered()) { // this wiidget is not rendered
			return (W) popedWidget;
		}

		if (widget != popedWidget) {
			throw new WiidgetException("Run specified widget failed. Maybe there is another unclosed widget.");
		}

		if (widget.isRendered()) {
			widget.run();
		}

		return widget;
	}

	@SuppressWarnings("unchecked")
	protected <W extends Wiidget> W endWidget(final Class<W> widgetClass) {
		final Wiidget widget = getWiidgetFactory().getWiidgetStack().pop();

		if (!widgetClass.isAssignableFrom(widget.getClass())) {
			throw new WiidgetException("Run specified widget failed. Maybe there is another unclosed widget.");
		}

		if (widget.isRendered()) {
			widget.run();
		}

		return (W) widget;
	}

	/**
	 * @return
	 */
	public WiidgetView getOwner() {
		return this.owner;
	}

	public void setOwner(final WiidgetView owner) {
		this.owner = owner;
	}

	public List<Wiidget> getChildren() {
		return children;
	}

	@Override
	public String toString() {

		return super.toString();
	}

	@SuppressWarnings("unchecked")
	public <W extends Wiidget> List<W> getChildren(final Class<W> widgetClass) {

		final List<W> childrenWithType = new LinkedList<W>();

		for (final Wiidget child : getChildren()) {

			if (widgetClass.isAssignableFrom(child.getClass())) {

				childrenWithType.add((W) child);
			}
		}

		return childrenWithType;

	}

	public void init() {
	}

	protected void startBuffer() {
		getPrintStream().startBuffer();
	}

	protected String endBuffer() {
		return getPrintStream().endBuffer();
	}

	protected String getFileContent(final String path) {
		if (null == path) {
			throw new WiidgetException("File path cannot be null.");
		}

		String content = "";

		try {
			final InputStream file = getClass().getClassLoader().getResourceAsStream(path);

			if (file == null) {
				throw new WiidgetException("Cannot found file: " + path);
			}

			content = readFile(file);

		} catch (final IOException exception) {

			throw new WiidgetException("Cannot read file: " + path, exception);
		}

		return content;
	}

	private static String readFile(final InputStream inputStream) throws IOException {
		@SuppressWarnings("resource")
		final java.util.Scanner s = new java.util.Scanner(inputStream).useDelimiter("\\A");
		return s.hasNext() ? s.next() : "";
	}

	protected void write(final String string) {
		getPrintStream().write(string);
	}

	protected BufferedPrintStream getPrintStream() {
		return getOwner().getPrintStream();
	}

	protected WiidgetFactory getWiidgetFactory() {
		return getOwner().getWiidgetFactory();
	}

	protected DataMap data() {
		return new DataMap();
	}

	public String getId() {

		if (null == this.id) {
			final String uniqueId = getWiidgetFactory().getUniqueId();
			this.setId(uniqueId);
		}

		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public boolean isRendered() {
		return rendered;
	}

	public void setRendered(final boolean rendered) {
		this.rendered = rendered;
	}

}
