package org.landa.wiidget.library.html.table;

import java.util.Collection;
import java.util.List;

import org.landa.wiidget.Tag;
import org.landa.wiidget.library.html.HtmlTagWiidget;
import org.landa.wiidget.validator.Required;

public class Table extends HtmlTagWiidget {

	@Required
	private Collection<?> value;

	@Override
	public void init() {

		startBuffer();
	}

	@Override
	public void run() {

		write(endBuffer());

		write(Tag.open("table", getAttributeMap()));

		// table header
		wirteHeader();

		writeBody();

		writeFooter();

		write(Tag.close("table"));

	}

	private void writeFooter() {
		write(Tag.open("tfoot"));

		final List<Column> columns = getChildren(Column.class);

		// write main footer
		final List<Footer> footers = getChildren(Footer.class);
		if (!footers.isEmpty()) {

			write("<tr>");
			for (final Footer footer : footers) {

				Integer colspan = footer.getColspan();
				if (colspan == null) {
					colspan = columns.size();
				}

				write(new Tag("td").a("colspan", colspan).c(footer.render()));
			}

			write("</tr>");
		}

		for (final Column column : columns) {
			final String footer = column.renderFooter();
			write(footer);
		}

		write(Tag.close("tfoot"));
	}

	private void writeBody() {

		final List<Column> columns = getChildren(Column.class);

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

	}

	private void wirteHeader() {

		final List<Column> columns = getChildren(Column.class);

		// header
		write(Tag.open("thead"));

		// write main header
		final List<Header> headers = getChildren(Header.class);
		if (!headers.isEmpty()) {

			write("<tr>");
			for (final Header header : headers) {

				Integer colspan = header.getColspan();
				if (colspan == null) {
					colspan = columns.size();
				}

				write(new Tag("td").a("colspan", colspan).c(header.render()));
			}

			write("</tr>");
		}

		for (final Column column : columns) {

			write(column.renderHeader());
		}
		write(Tag.close("thead"));
	}

	@Override
	public String getTagName() {
		return "table";
	}

	public Collection<?> getValue() {
		return value;
	}

	public void setValue(final Collection<?> value) {
		this.value = value;
	}

}
