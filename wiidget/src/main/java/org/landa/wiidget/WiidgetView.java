package org.landa.wiidget;

import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.engine.WiidgetFactory;
import org.landa.wiidget.io.BufferedPrintStream;

/**
 * The view is the main entry point of document.
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 *
 */
public abstract class WiidgetView extends Wiidget {

	private BufferedPrintStream printStream;

	private WiidgetFactory widgetFactory;

	protected WiidgetView() {
		this.printStream = new BufferedPrintStream();
	}

	public WiidgetView(final WiidgetFactory wiidgetFactory) {
		this();
		this.widgetFactory = wiidgetFactory;
	}

	public void clearPrintStream() {
		this.printStream = new BufferedPrintStream();
	}

	public String render() {
		return getPrintStream().flush();
	}

	@Override
	protected BufferedPrintStream getPrintStream() {
		return printStream;
	}

	@Override
	public WiidgetView getOwner() {
		return this;
	}

	@Override
	protected WiidgetFactory getWiidgetFactory() {
		return widgetFactory;
	}

	protected WiidgetContext getWiidgetContext() {
		return getWiidgetFactory().getWiidgetContext();
	}

}
