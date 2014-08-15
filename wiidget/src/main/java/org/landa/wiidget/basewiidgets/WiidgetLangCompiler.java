package org.landa.wiidget.basewiidgets;

import java.util.Map.Entry;

import org.landa.wiidget.Renderer;
import org.landa.wiidget.Wiidget;
import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.util.DataMap;

/**
 * Compiles the specified template by value / or children
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class WiidgetLangCompiler extends Wiidget {

	private String value;

	private DataMap context = new DataMap();

	private final DataMap previousContext = new DataMap();

	@Override
	public void init() {
		super.init();
		exportContext();

		if (null == getValue()) {
			startBuffer();
		}
	}

	private void exportContext() {
		final WiidgetContext wiidgetContext = getWiidgetFactory().getWiidgetContext();
		for (final String key : context.keySet()) {
			if (wiidgetContext.isSet(key)) {
				// set to backup
				previousContext.set(key, wiidgetContext.get(key));
			}
			// set to context
			wiidgetContext.set(key, context.get(key));
		}
	}

	@Override
	public void run() {

		String template = null;
		if (null == getValue()) {
			template = endBuffer();
		} else {
			template = getValue();
		}

		final Renderer renderer = Renderer.create(getWiidgetFactory());
		final String viewResult = renderer.renderWithoutResources(template);

		write(viewResult);

		restoreContext();
	}

	/**
	 * Restores the previous context.
	 */
	private void restoreContext() {
		final WiidgetContext wiidgetContext = getWiidgetFactory().getWiidgetContext();
		for (final Entry<String, Object> entry : previousContext.entrySet()) {

			wiidgetContext.set(entry.getKey(), entry.getValue());
		}
	}

	public String getValue() {
		return value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

	public DataMap getContext() {
		return context;
	}

	public void setContext(final DataMap context) {
		this.context = context;
	}

}
