package org.landa.wiidget.javaee;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.landa.wiidget.Renderer;
import org.landa.wiidget.engine.WiidgetFactory;

/**
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 * 
 */
public class RendererProducer {

	@Inject
	private WiidgetFactory wiidgetFactory;

	@Produces
	public Renderer createRenderer() {

		return Renderer.create(wiidgetFactory);
	}

}
