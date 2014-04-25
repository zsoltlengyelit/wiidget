package org.landa.wiidget.library.html.datatable;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class PageSlicer<O> {

	private final Collection<O> data;
	private final int itemsPerPage;

	public PageSlicer(final Collection<O> data, final int page, final int itemsPerPage) {
		this.data = data;
		this.itemsPerPage = itemsPerPage;
	}

	public Collection<O> getPage(final int page) {

		final Collection<O> pageList = new LinkedList<O>();

		final int fromItem = itemsPerPage * (page - 1);
		int itemNum = 0;
		final Iterator<O> iterator = data.iterator();

		while (iterator.hasNext()) {
			itemNum++;

			if (itemNum < fromItem) {
				iterator.next();
				continue;
			}

			pageList.add(iterator.next());
		}

		return pageList;
	}
}
