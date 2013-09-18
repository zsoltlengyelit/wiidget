package org.landa.wiidget.library.format.position;

import org.landa.wiidget.engine.Position;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public enum HtmlPositions {

	HEAD_BEGIN(new HeadBeginHtmlPosition()),

	HEAD_END(new HeadEndHtmlPosition()),

	BODY_BEGIN(new BodyBeginHtmlPosition()),

	BODY_END(new BodyEndHtmlPosition());

	/**
	 * Position.
	 */
	private Position position;

	/**
	 * @param position
	 *            position
	 */
	private HtmlPositions(final Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return this.position;
	}

}
