package org.landa.wiidget.library.html;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.library.base.RenderableWiidget;
import org.landa.wiidget.util.Strings;

/**
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 * 
 */
public class ChildrenOrValueWiidget extends Wiidget implements
		RenderableWiidget {

	/**
	 * Rendered value
	 */
	private String value;

	private String renderedValue;

	@Override
	public void init() {
		super.init();

		startBuffer();
	}

	@Override
	public void run() {
		super.run();

		String children = endBuffer();
		if (Strings.isEmpty(children)) {
			renderedValue = getValue();
		} else {
			renderedValue = children;
		}
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String render() {
		return renderedValue;
	}

}
