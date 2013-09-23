package org.landa.wiidget.io;

import java.util.EmptyStackException;
import java.util.Stack;

import org.landa.wiidget.util.Strings;

/**
 * Simple stream supporting interval buffering, while write in the stream.
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class BufferedPrintStream {

	/**
	 * 
	 */
	private final Stack<StringBuilder> outputStreams = new Stack<StringBuilder>();

	/**
	 * @param out
	 */
	public BufferedPrintStream() {
		final StringBuilder stringBuilder = new StringBuilder();
		outputStreams.push(stringBuilder);
	}

	public void startBuffer() {

		final StringBuilder stringBuilder = new StringBuilder();
		outputStreams.push(stringBuilder);
	}

	public String endBuffer() {

		try {

			final StringBuilder stringBuilder = outputStreams.pop();

			return stringBuilder.toString();

		} catch (final EmptyStackException emptyStackException) {
			throw new RuntimeException("No item in buffer.", emptyStackException);
		}

	}

	public String flush() {
		final String buffer = endBuffer();

		if (!outputStreams.isEmpty()) {
			throw new RuntimeException("Buffer is not empty");
		}

		return buffer;
	}

	public void write(final String string) {

		if (outputStreams.isEmpty()) {
			throw new RuntimeException("No buffered item.");
		}

		outputStreams.peek().append(Strings.emptyIfNull(string));
	}

}
