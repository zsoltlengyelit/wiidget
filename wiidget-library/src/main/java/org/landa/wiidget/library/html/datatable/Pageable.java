package org.landa.wiidget.library.html.datatable;

import java.util.Collection;

public interface Pageable<E> extends Collection<E> {

	public Collection<E> getItems(int currentPage, int itemsPerPage);
}
