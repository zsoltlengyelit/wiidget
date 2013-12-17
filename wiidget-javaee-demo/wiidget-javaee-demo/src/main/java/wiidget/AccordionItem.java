package wiidget;

import org.landa.wiidget.library.html.TemplatedHtmlWiidget;

/**
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 * 
 */
public class AccordionItem extends TemplatedHtmlWiidget {

	private String cssClass = "";

	private Boolean active = false;

	/**
	 * @return the cssClass
	 */
	public String getCssClass() {
		return cssClass;
	}

	/**
	 * @param cssClass
	 *            the cssClass to set
	 */
	public void setCssClass(final String cssClass) {
		this.cssClass = cssClass;
	}

	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(final Boolean active) {
		this.active = active;
	}

}
