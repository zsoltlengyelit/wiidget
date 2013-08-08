package org.landa.wiidget.library.html;

import java.util.Collection;
import java.util.List;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.library.Tag;

public class Table extends Wiidget {

	public Collection<?> value;

	@Override
	public void init() {
		super.init();

		getAttributes().set("border", 1);

		startBuffer();
	}

	@Override
	public void run() {
		endBuffer();

		List<Column> columns = getChildren(Column.class);

		write(Tag.open("table", getAttributes()));

		// header
		write(Tag.open("thead"));
		write(Tag.open("tr"));

		for (Column column : columns) {
			String header = column.renderHeader();
			write(header);
		}
		write(Tag.close("tr"));
		write(Tag.close("thead"));

		// footer
		write(Tag.open("tfoot"));
		write(Tag.open("tr"));

		for (Column column : columns) {
			String header = column.renderFooter();
			write(header);
		}
		write(Tag.close("tr"));
		write(Tag.close("tfoot"));

		write(Tag.open("tbody"));

		// rows
		for (Object object : value) {

			write(Tag.open("tr"));

			for (Column column : columns) {
				String col = column.renderRow(object);
				write(col);
			}
			write(Tag.close("tr"));

		}
		write(Tag.close("tbody"));

		write(Tag.close("table"));

	}
}
