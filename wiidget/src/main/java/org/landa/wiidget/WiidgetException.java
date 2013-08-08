package org.landa.wiidget;


public class WiidgetException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4452312804398414666L;

	public WiidgetException(String message) {
		super(message);
	}

	public WiidgetException(String message, Throwable cause) {
		super(message, cause);
	}
}
