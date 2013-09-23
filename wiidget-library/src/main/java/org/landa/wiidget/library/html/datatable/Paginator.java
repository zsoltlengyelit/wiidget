package org.landa.wiidget.library.html.datatable;

/**
 * Data paginator.
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public interface Paginator {

	public int getCurrentPage();

	public int getPageCount();

	public int getItemsPerPage();

}
