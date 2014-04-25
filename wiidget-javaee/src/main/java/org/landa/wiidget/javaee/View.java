package org.landa.wiidget.javaee;

import java.io.Serializable;
import java.util.List;
import java.util.Map.Entry;

import javax.inject.Inject;
import javax.inject.Provider;

import org.landa.wiidget.WiidgetException;
import org.landa.wiidget.WiidgetView;
import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.engine.WiidgetFactory;
import org.landa.wiidget.library.annotation.ContextVariable;
import org.landa.wiidget.library.template.WiidgetLangCompiler;
import org.landa.wiidget.parser.WiidgetLangProcessor;
import org.landa.wiidget.parser.WiidgetParserException;
import org.landa.wiidget.reflect.AnnotatedAccessor;
import org.landa.wiidget.reflect.Reflection;
import org.landa.wiidget.util.DataMap;
import org.landa.wiidget.util.Strings;


/**
 * 
 * @author Zsolt Lengyel
 * 
 */
public class View extends WiidgetView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7227838179220223284L;

	@Inject
	private Provider<WiidgetFactory> mywiidgetFactory;

	@Override
	protected WiidgetFactory getWiidgetFactory() {
		return mywiidgetFactory.get();
	}

	@Override
	public String render() {
		this.init();
		return super.render();
	}

	@Override
	public void init() {

		super.init();

		clearPrintStream();
		
		final WiidgetContext wiidgetContext = getWiidgetFactory()
				.getWiidgetContext();

		final DataMap contextVariables = data();
		
		// TODO 
//		contextVariables.putAll(getAttributeMap());
		contextVariables.putAll(getContextVariables());

		// set variables
		for (final Entry<String, Object> attribute : contextVariables
				.entrySet()) {
			final String attributeName = attribute.getKey();
			final Object attributeValue = attribute.getValue();

			final Object previousValue = wiidgetContext.get(attributeName);
		
			wiidgetContext.set(attributeName, attributeValue);
		}
	}

	
	/**
	 * Returns the field values annotated with {@link ContextVariable}.
	 * 
	 * @return map with field names and values.
	 */
	private DataMap getContextVariables() {
		final DataMap dataMap = data();

		final Class<?> ownClass = getClass();

		// fields
		final List<AnnotatedAccessor<ContextVariable>> fieldAccessors = Reflection
				.getFieldAccessors(ownClass, ContextVariable.class);
		final List<AnnotatedAccessor<ContextVariable>> methodAccessors = Reflection
				.getMethodAccessors(ownClass, ContextVariable.class);

		fieldAccessors.addAll(methodAccessors);

		for (final AnnotatedAccessor<ContextVariable> accessor : fieldAccessors) {

			final ContextVariable attribute = accessor.getAnnotation();
			final String variableName = attribute.name();

			final String name = Strings.isEmpty(variableName) ? accessor
					.getFieldName() : variableName;
			final Object value = accessor.getValue(this);

			if (null != value) {
				dataMap.put(name, value);
			}
		}

		dataMap.set("this", this);

		return dataMap;
	}
	protected void renderAndWrite(String viewFile) {
		
		try {
			String result = new WiidgetLangProcessor(getWiidgetFactory(), this).render(getClass().getClassLoader().getResourceAsStream(viewFile));
			
			write(result);
		} catch (WiidgetParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}