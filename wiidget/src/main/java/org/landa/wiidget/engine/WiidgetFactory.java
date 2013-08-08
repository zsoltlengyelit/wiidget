package org.landa.wiidget.engine;

import java.util.Stack;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.WiidgetView;
import org.landa.wiidget.util.DataMap;

import com.google.inject.ImplementedBy;

@ImplementedBy(WidgetFactoryImpl.class)
public interface WiidgetFactory {

	/**
	 * 
	 * @param widgetClass
	 * @param printStream
	 * @param owner
	 * @param putToStack
	 * @param attributes
	 * @return
	 */
	public <W extends Wiidget> W createWidget(WiidgetView owner, Class<W> widgetClass, DataMap attributes, boolean putToStack);

	/**
	 * 
	 * @return
	 */
	public Stack<Wiidget> getWidgetStack();

	/**
	 * Generates unique id.
	 * 
	 * @return id
	 */
	public String getUniqueId();

}
