package controllers;

import org.landa.wiidget.library.format.Formatter;

public class StringFormatter implements Formatter<String> {

	@Override
	public String format(final String object) {
		return object + "+" + object;
	}
}
