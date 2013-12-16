package org.landa.wiidget.library.html.table;

import org.landa.wiidget.library.html.ChildrenOrValueWiidget;

/**
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 * 
 */
public class TableMainPartWiidget extends ChildrenOrValueWiidget {
	/**
	 * If the value is negative, the holder wiidget will set the value.
	 */
	private Integer colspan;

	public Integer getColspan() {
		return colspan;
	}

	public void setColspan(final Integer colspan) {
		this.colspan = colspan;
	}
}
