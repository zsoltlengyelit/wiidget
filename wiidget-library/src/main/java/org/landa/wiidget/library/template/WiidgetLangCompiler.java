package org.landa.wiidget.library.template;

import org.landa.wiidget.Renderer;
import org.landa.wiidget.Wiidget;

/**
 * Compiles the specified template by value / or children
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class WiidgetLangCompiler extends Wiidget {

	private String value;

	@Override
	public void init() {
		super.init();

		if (null == getValue()) {
			startBuffer();
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
	}

	public String getValue() {
		return value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

}
