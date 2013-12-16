package org.landa.wiidget.library.html.datatable;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListPageable<E> extends ArrayList<E> implements Pageable<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9131442573060608098L;

	private int pageSize;

	public ArrayListPageable(final Collection<E> list) {
		this(list, 10);
	}

	public ArrayListPageable(final Collection<E> list, final int pageSize) {
		super(list);
		this.pageSize = pageSize;
	}

	@Override
	public Collection<E> getPage(final int currentPage) {

		final int pageSize = getPageSize();

		final int fromItem = pageSize * (currentPage - 1);
		final int toItem = pageSize * currentPage;

		return this.subList(fromItem, toItem);
	}

	@Override
	public int getPageSize() {
		return pageSize;
	}

}
