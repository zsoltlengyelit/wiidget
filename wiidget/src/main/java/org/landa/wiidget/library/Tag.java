package org.landa.wiidget.library;

import java.util.Map;
import java.util.Map.Entry;

import org.landa.wiidget.util.DataMap;

public class Tag {

	public static String open(final String name) {
		return open(name, new DataMap());
	}

	public static String tag(final String name, final String content) {
		return open(name) + content + close(name);
	}

	public static String open(final String name, final Map<String, Object> data) {

		return "<" + name + renderAttributes(data) + ">";

	}

	public static String close(final String name) {
		return "</" + name + ">";
	}

	/**
	 * @param data
	 * @return
	 */
	private static String renderAttributes(final Map<String, Object> data) {
		if (data.isEmpty()) {
			return "";
		}

		String attributes = "";

		for (final Entry<String, Object> attribute : data.entrySet()) {

			attributes += " " + attribute.getKey() + "=\"" + attribute.getValue() + "\"";

		}

		return attributes;
	}

	/**
	 * Renders empty tag.
	 * 
	 * @param tagName
	 * @param attributeMap
	 * @return
	 */
	public static String tag(final String tagName, final DataMap attributeMap) {
		return "<" + tagName + renderAttributes(attributeMap) + " />";
	}
}
