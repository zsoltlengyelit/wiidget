package org.landa.wiidget.library.html;

import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.landa.wiidget.library.Tag;
import org.landa.wiidget.validator.Required;

public class Table extends BaseTagWiidget {

	@Required
	private Collection<?> value;

	private String header;

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

		// table header
		wirteHeader();

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

	private void wirteHeader() {

		final String header = getHeader();

		if (StringUtils.isEmpty(header)) {
			return;
		}

		write("<tr>");

		final int colspan = getChildren(Column.class).size();

		write(Tag.open("th", data().set("colspan", colspan)));

		write(getHeader());
		write(Tag.close("th"));

		write("</tr>");

	}

	@Override
	public String getTagName() {
		return "table";
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(final String header) {
		this.header = header;
	}

	public Collection<?> getValue() {
		return value;
	}

	public void setValue(final Collection<?> value) {
		this.value = value;
	}

}
