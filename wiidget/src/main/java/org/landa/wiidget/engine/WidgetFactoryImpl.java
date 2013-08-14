package org.landa.wiidget.engine;

import java.util.List;
import java.util.Map.Entry;
import java.util.Stack;

import ninja.Context;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.WiidgetView;
import org.landa.wiidget.util.DataMap;
import org.landa.wiidget.validation.ValidationError;
import org.landa.wiidget.validation.ValidationException;
import org.landa.wiidget.validation.WiidgetValidator;
import org.mvel2.MVEL;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class WidgetFactoryImpl implements WiidgetFactory {

	/**
	 * Wiidget ID prefixum.
	 */
	public static final String ID_PREFIX = "wiidget-";

	/**
	 * Stack.
	 */
	private final Stack<Wiidget> widgetStack = new Stack<Wiidget>();

	private final Injector injector;

	/**
	 * For generate unique IDs.
	 */
	private int idCounter = 1;

	/**
	 * 
	 */
	private final WiidgetValidator wiidgetValidator;

	@Inject
	public WidgetFactoryImpl(final Context context, final WiidgetValidator wiidgetValidator, final Injector injector) {

		this.injector = injector;
		this.wiidgetValidator = wiidgetValidator;
	}

	@Override
	public <W extends Wiidget> W createWidget(final WiidgetView owner, final Class<W> widgetClass, final DataMap attributes, final boolean putToStack) {

		final W widget = createComponent(widgetClass, attributes);

		// widget.setPrintStream(this.printStream);

		if (!getWidgetStack().isEmpty()) {
			getWidgetStack().peek().getChildren().add(widget);
		}

		if (putToStack) {
			widgetStack.push(widget);
		}

		widget.setOwner(owner);

		return widget;

	}

	@Override
	public Stack<Wiidget> getWidgetStack() {
		return widgetStack;
	}

	public <C extends Wiidget> C createComponent(final Class<C> componentClass) {
		return createComponent(componentClass, new DataMap());
	}

	/**
	 * @param componentClass
	 * @param data
	 * @return
	 */
	private <C extends Wiidget> C createComponent(final Class<C> componentClass, final DataMap data) {

		final C component = injector.getInstance(componentClass);

		for (final Entry<String, Object> attribute : data.entrySet()) {

			final String field = attribute.getKey();
			final Object value = attribute.getValue();

			MVEL.setProperty(component, field, value);

		}

		validate(component);

		return component;
	}

	private void validate(final Wiidget wiidget) {
		final List<ValidationError> errors = wiidgetValidator.validate(wiidget);

		if (!errors.isEmpty()) {

			throw new ValidationException(errors);
		}
	}

	@Override
	public String getUniqueId() {

		return ID_PREFIX + (this.idCounter++);
	}

}
