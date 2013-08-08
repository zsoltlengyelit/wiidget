package org.landa.wiidget.io;

import java.util.EmptyStackException;
import java.util.Stack;

public class BufferedPrintStream {

	/**
	 * 
	 */
	private final Stack<StringBuilder> outputStreams = new Stack<StringBuilder>();

	/**
	 * 
	 * @param out
	 */
	public BufferedPrintStream() {
		StringBuilder stringBuilder = new StringBuilder();
		outputStreams.push(stringBuilder);
	}

	public void startBuffer() {

		StringBuilder stringBuilder = new StringBuilder();
		outputStreams.push(stringBuilder);
	}

	public String endBuffer() {

		try {

			StringBuilder stringBuilder = outputStreams.pop();

			return stringBuilder.toString();

		} catch (EmptyStackException emptyStackException) {
			throw new RuntimeException("No item in buffer.", emptyStackException);
		}

	}

	public String flush() {
		String buffer = endBuffer();

		if (!outputStreams.isEmpty()) {
			throw new RuntimeException("Buffer is not empty");
		}

		return buffer;
	}

	public void write(String string) {

		if (outputStreams.isEmpty()) {
			throw new RuntimeException("No buffered item.");
		}

		outputStreams.peek().append(string);
	}

}
