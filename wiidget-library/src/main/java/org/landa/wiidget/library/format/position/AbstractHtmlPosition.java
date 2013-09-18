package org.landa.wiidget.library.format.position;

import org.landa.wiidget.engine.Position;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public abstract class AbstractHtmlPosition extends Position {

	/**
	 * Name of position.
	 */
	private final String name;

	/**
	 * Text to find in template and replace than place.
	 */
	private final String textToFind;

	/**
	 * Before {@link #textToFind} of after?
	 */
	private final boolean before;

	/**
	 * @param name
	 * @param tagToFind
	 * @param before
	 */
	public AbstractHtmlPosition(final String name, final String textToFind, final boolean before) {
		super();
		this.name = name;
		this.textToFind = textToFind;
		this.before = before;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public String place(final String template, final String positionedElem) {

		String replacement = textToFind;
		if (before) {
			replacement = positionedElem + textToFind;
		} else {
			replacement = textToFind + positionedElem;
		}

		// igonre case replace
		return template.replaceFirst("(?i)" + textToFind, replacement);
	}

}
