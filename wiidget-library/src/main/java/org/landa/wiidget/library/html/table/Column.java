package org.landa.wiidget.library.html.table;

import org.landa.wiidget.Tag;
import org.landa.wiidget.Wiidget;
import org.landa.wiidget.WiidgetException;
import org.landa.wiidget.annotation.DefaultField;
import org.landa.wiidget.library.format.Formatter;
import org.landa.wiidget.reflect.Reflection;

public class Column extends Wiidget {

	@DefaultField
	public String field;

	public String header;

	public String footer;

	public Formatter formatter;

	@Override
	public void run() {
	}

	public String renderRow(final Object object) {
		final StringBuilder builder = new StringBuilder();

		builder.append(Tag.tag("td", getValue(object)));

		return builder.toString();
	}

	private String getValue(final Object object) {

		Object value;
		try {
			value = Reflection.getFieldValue(object, field);

		} catch (final IllegalArgumentException accessException) {
			throw new WiidgetException("Cannot read field value: " + field + " of" + object.getClass().toString(), accessException);
		}

		if (null == formatter) {
			return value.toString();
		}

		return formatter.format(value);

	}

	@Override
	public String toString() {
		return "Column [field=" + field + ", formatter=" + formatter + "]";
	}

	public String renderHeader() {

		if (header == null) {
			return "";
		}

		return Tag.tag("th", header);
	}

	public String renderFooter() {
		if (footer == null) {
			return "";
		}

		return Tag.tag("td", footer);
	}

}
