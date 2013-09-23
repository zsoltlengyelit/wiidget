package org.landa.wiidget.util;

public class Strings {

	public static String emptyIfNull(final String string) {
		return null == string ? "" : string;
	}

	public static boolean isEmpty(final String string) {
		return null == string || string.isEmpty();
	}

}
