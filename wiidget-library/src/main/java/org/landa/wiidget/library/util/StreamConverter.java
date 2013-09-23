package org.landa.wiidget.library.util;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class StreamConverter {

	public static String toString(final InputStream inputStream) {

		final String inputStreamString = new Scanner(inputStream, "UTF-8").useDelimiter("\\A").next();

		return inputStreamString;
	}

}
