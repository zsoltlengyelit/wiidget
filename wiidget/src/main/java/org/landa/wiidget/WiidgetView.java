package org.landa.wiidget;

import org.landa.wiidget.engine.WiidgetFactory;
import org.landa.wiidget.io.BufferedPrintStream;

import ninja.Context;

import com.google.inject.Inject;

public abstract class WiidgetView extends Wiidget {

	private final BufferedPrintStream printStream;

	@Inject
	WiidgetFactory widgetFactory;

	@Inject
	Context context;

	public WiidgetView() {
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
	protected WiidgetFactory getWidgetFactory() {
		return widgetFactory;
	}

	@Override
	public Context getContext() {
		return context;
	}

}
