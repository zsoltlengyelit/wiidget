package org.landa.wiidget.library.html.datatable;

import org.landa.wiidget.WiidgetException;
import org.landa.wiidget.library.html.Table;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class PageableDataTable extends Table {

	private Paginator paginator;

	private Pageable<?> pageable;

	@Override
	public void init() {
		super.init();

		if (getValue() instanceof Pageable == false) {
			throw new WiidgetException("Value must be pageable");
		}

		this.pageable = (Pageable<?>) super.getValue();
	}

	@Override
	public void run() {

		setValue(pageable.getItems(getCurrentPage(), getItemsPerPage()));

		super.run();
	}

	public int getDataSize() {
		return pageable.size();
	}

	private int getItemsPerPage() {
		this.paginator = getChild(Paginator.class);

		if (null == paginator) {
			return super.getValue().size();
		}
		return paginator.getItemsPerPage();
	}

	protected int getCurrentPage() {

		this.paginator = getChild(Paginator.class);

		if (null == paginator) {
			return 1;
		}
		return paginator.getCurrentPage();
	}
}
