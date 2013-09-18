package org.landa.wiidget;

import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.engine.WiidgetFactory;
import org.landa.wiidget.io.BufferedPrintStream;

public abstract class WiidgetView extends Wiidget {

	private final BufferedPrintStream printStream;

	protected WiidgetFactory widgetFactory;

	public WiidgetView(final WiidgetFactory wiidgetFactory) {
		this.widgetFactory = wiidgetFactory;
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
