package org.landa.wiidget.engine;

import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.WiidgetView;
import org.landa.wiidget.context.DefaultWiidgetContext;
import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.reflect.Reflection;
import org.landa.wiidget.util.DataMap;
import org.landa.wiidget.util.DefaultWiidgetProperties;
import org.landa.wiidget.util.WiidgetProperties;
import org.landa.wiidget.validation.DefaultWiidgetValidator;
import org.landa.wiidget.validation.ValidationError;
import org.landa.wiidget.validation.ValidationException;
import org.landa.wiidget.validation.WiidgetValidator;

/**
 * Creates wiidgets.
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class DefaultWiidgetFactory implements WiidgetFactory {

	/**
	 * Wiidget ID prefixum.
	 */
	public static final String ID_PREFIX = "wiidget-";

	/**
	 * Stack.
	 */
	private final Stack<Wiidget> wiidgetStack = new Stack<Wiidget>();

	private final ResultTransformerRegistrator resultTransformerRegistrator;

	/**
	 * For generate unique IDs.
	 */
	private int idCounter = 1;

	/**
	 * 
	 */
	private final WiidgetValidator wiidgetValidator;

	private final WiidgetProperties wiidgetProperties;

	private final WiidgetContext wiidgetContext;

	/**
	 * Resource links.
	 */
	private final Set<ResourceLink> resourceLinks = new HashSet<ResourceLink>();

	/**
	 * Creates components instances.
	 */
	private final ObjectFactory objectFactory;

	/**
	 * @param objectFactory
	 * @param wiidgetValidator
	 */
	public DefaultWiidgetFactory() {

		this(new ReflectionObjectFactory(), new DefaultWiidgetValidator(new ReflectionObjectFactory()), new DefaultWiidgetProperties(), new DefaultWiidgetContext(), new ResultTransformerRegistrator());
	}

	public DefaultWiidgetFactory(final ObjectFactory objectFactory, final WiidgetValidator validator, final WiidgetProperties wiidgetProperties, final WiidgetContext context,
	        final ResultTransformerRegistrator resultTransformerRegistrator) {

		this.objectFactory = objectFactory;
		this.wiidgetValidator = validator;
		this.wiidgetProperties = wiidgetProperties;
		this.wiidgetContext = context;
		this.resultTransformerRegistrator = resultTransformerRegistrator;

	}

	public DefaultWiidgetFactory(final WiidgetContext wiidgetContext) {
		this(new ReflectionObjectFactory(), new DefaultWiidgetValidator(new ReflectionObjectFactory()), new DefaultWiidgetProperties(), wiidgetContext, new ResultTransformerRegistrator());
	}

	@Override
	public <W extends Wiidget> W createWiidget(final WiidgetView owner, final Class<W> widgetClass, final DataMap attributes, final boolean putToStack) {

		final W widget = createComponent(widgetClass, attributes);

		// widget.setPrintStream(this.printStream);

		addWiidget(widget, owner, putToStack);

		widget.setOwner(owner);

		return widget;

	}

	@Override
	public Stack<Wiidget> getWiidgetStack() {
		return wiidgetStack;
	}

	@Override
	public <C extends Wiidget> C createComponent(final Class<C> componentClass) {
		return createComponent(componentClass, new DataMap());
	}

	/**
	 * @param componentClass
	 * @param data
	 * @return
	 */
	@Override
	public <C extends Wiidget> C createComponent(final Class<C> componentClass, final DataMap data) {

		final C component = objectFactory.getInstance(componentClass);

		for (final Entry<String, Object> attribute : data.entrySet()) {

			final String field = attribute.getKey();
			final Object value = attribute.getValue();

			Reflection.setField(component, field, value);

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

	@Override
	public void addWiidget(final Wiidget wiidget, final WiidgetView owner, final boolean putToStack) {

		if (!getWiidgetStack().isEmpty()) {
			getWiidgetStack().peek().getChildren().add(wiidget);
		}

		if (putToStack) {
			wiidgetStack.push(wiidget);
		}

		wiidget.setOwner(owner);

	}

	@Override
	public ResultTransformerRegistrator getResutlTransformerRegistrator() {
		return resultTransformerRegistrator;
	}

	@Override
	public WiidgetProperties getWiidgetProperties() {
		return wiidgetProperties;
	}

	@Override
	public WiidgetContext getWiidgetContext() {
		return wiidgetContext;
	}

	@Override
	public Set<ResourceLink> getResourceLinks() {
		return resourceLinks;
	}

	@Override
	public void addResourceLink(final ResourceLink resourceLink) {
		for (final ResourceLink link : getResourceLinks()) {

			if (link.getSource().equals(resourceLink.getSource())) {
				return; // this resource already exists
			}
		}

		getResourceLinks().add(resourceLink);
	}
}
