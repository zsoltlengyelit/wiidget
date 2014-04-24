package wiidget;

import org.landa.wiidget.annotation.Attribute;
import org.landa.wiidget.library.html.HtmlTagWiidget;

/**
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 * 
 */
public class Accordion extends HtmlTagWiidget {

	@Attribute(name = "class")
	private String cssClass = "ui fluid accordion";

	@Override
	public void init() {
		super.init();
	}

	@Override
	public void run() {
		super.run();
	}

	@Override
	public String getTagName() {
		return "div";
	}

	/**
	 * @return the cssClass
	 */
	@Override
	public String getCssClass() {
		return cssClass;
	}

	/**
	 * @param cssClass
	 *            the cssClass to set
	 */
	@Override
	public void setCssClass(final String cssClass) {
		this.cssClass = cssClass;
	}

}
