package org.landa.wiidget.library.html;

import java.util.Collection;
import java.util.List;

import org.landa.wiidget.library.Tag;

public class Table extends BaseTagWiidget {

	public Collection<?> value;

	@Override
	public void init() {

		startBuffer();
	}

	@Override
	public void run() {
		endBuffer();

		final List<Column> columns = getChildren(Column.class);

		write(Tag.open("table", getAttributeMap()));

		// header
		write(Tag.open("thead"));
		write(Tag.open("tr"));

		for (final Column column : columns) {
			final String header = column.renderHeader();
			write(header);
		}
		write(Tag.close("tr"));
		write(Tag.close("thead"));

		// footer
		write(Tag.open("tfoot"));
		write(Tag.open("tr"));

		for (final Column column : columns) {
			final String header = column.renderFooter();
			write(header);
		}
		write(Tag.close("tr"));
		write(Tag.close("tfoot"));

		write(Tag.open("tbody"));

		// rows
		for (final Object object : value) {

			write(Tag.open("tr"));

			for (final Column column : columns) {
				final String col = column.renderRow(object);
				write(col);
			}
			write(Tag.close("tr"));

		}
		write(Tag.close("tbody"));

		write(Tag.close("table"));

	}

	@Override
	public String getTagName() {
		return "table";
	}
}
