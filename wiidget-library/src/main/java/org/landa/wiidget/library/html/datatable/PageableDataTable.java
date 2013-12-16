package org.landa.wiidget.library.html.datatable;

import org.landa.wiidget.WiidgetException;
import org.landa.wiidget.library.html.table.Table;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class PageableDataTable extends Table {

	private Paginator paginator;

	private Pageable pageable;

	@Override
	public void init() {
		super.init();

		if (getValue() instanceof Pageable == false) {
			throw new WiidgetException("Value must be pageable");
		}

		this.pageable = (Pageable) super.getValue();
	}

	@Override
	public void run() {

		setValue(pageable.getPage(getCurrentPage()));

		super.run();
	}

	public int getDataSize() {
		return pageable.size();
	}

	protected int getCurrentPage() {

		this.paginator = getChild(Paginator.class);

		if (null == paginator) {
			return 1;
		}
		return paginator.getCurrentPage();
	}

	public Pageable getPageable() {
		return pageable;
	}

}
