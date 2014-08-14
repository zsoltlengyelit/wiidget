package org.landa.wiidget.engine;

import java.util.Set;
import java.util.Stack;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.WiidgetView;
import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.engine.configuration.Configuration;
import org.landa.wiidget.util.DataMap;
import org.landa.wiidget.util.WiidgetProperties;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public interface WiidgetFactory {

	/**
	 * @param widgetClass
	 * @param printStream
	 * @param owner
	 * @param putToStack
	 * @param attributes
	 * @return
	 */
	public <W extends Wiidget> W createWiidget(WiidgetView owner, Class<W> widgetClass, DataMap attributes, boolean putToStack);

	/**
	 * @return
	 */
	public Stack<Wiidget> getWiidgetStack();

	/**
	 * @param componentClass
	 * @return
	 */
	public <C extends Wiidget> C createComponent(final Class<C> componentClass);

	/**
	 * Creates new instance.
	 *
	 * @param componentClass
	 *            class of wiidget
	 * @param data
	 *            data to set
	 * @return instance
	 */
	public <C extends Wiidget> C createComponent(final Class<C> componentClass, final DataMap data);

	/**
	 * Generates unique id.
	 *
	 * @return id
	 */
	public String getUniqueId();

	public void addWiidget(final Wiidget wiidget, final WiidgetView owner, final boolean putToStack);

	/**
	 * Returns the underlying registrator.
	 *
	 * @return
	 */
	public ResultTransformerRegistrator getResutlTransformerRegistrator();

	/**
	 * Properties getter.
	 *
	 * @return
	 */
	public WiidgetProperties getWiidgetProperties();

	/**
	 * Holds the context variables.
	 *
	 * @return
	 */
	public WiidgetContext getWiidgetContext();

	/**
	 * @return
	 */
	public Set<ResourceLink> getResourceLinks();

	public void addResourceLink(ResourceLink resourceLink);

	public Configuration getConfiguration();

}
