package org.landa.wiidget.reflect;

public class ReflectionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3215514609654788628L;

	public ReflectionException(final String message) {
		super(message);
	}

	public ReflectionException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
