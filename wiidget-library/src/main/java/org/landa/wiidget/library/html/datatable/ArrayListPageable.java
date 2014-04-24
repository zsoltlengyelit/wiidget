package org.landa.wiidget.library.html.datatable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListPageable<E> extends ArrayList<E> implements Pageable<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9131442573060608098L;

	public ArrayListPageable(final List<E> list) {
		super(list);
	}

	@Override
	public Collection<E> getItems(final int currentPage, final int itemsPerPage) {

		final int fromItem = itemsPerPage * (currentPage - 1);
		final int toItem = itemsPerPage * currentPage;

		if (this.size() < toItem) {
			return this;
		}
		return this.subList(fromItem, toItem);
	}

}
