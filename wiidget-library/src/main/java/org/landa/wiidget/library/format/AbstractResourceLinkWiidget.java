package org.landa.wiidget.library.format;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.engine.Position;
import org.landa.wiidget.engine.ResourceLink;
import org.landa.wiidget.library.format.position.HtmlPositions;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public abstract class AbstractResourceLinkWiidget extends Wiidget implements ResourceLink {

	/**
	 * Position of resource.
	 */
	private Position position = HtmlPositions.HEAD_END.getPosition();

	@Override
	public Position getPosition() {
		return position;
	}

	@Override
	public void run() {
		super.run();

		getWiidgetFactory().addResourceLink(this);
	}

	/**
	 * @param positionName
	 */
	public void setPosition(final String positionName) {

		this.position = Enum.valueOf(HtmlPositions.class, positionName).getPosition();
	}

}
