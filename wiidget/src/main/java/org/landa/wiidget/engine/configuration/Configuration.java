package org.landa.wiidget.engine.configuration;

import java.util.Map;
import java.util.Set;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.engine.ObjectFactory;
import org.landa.wiidget.engine.externals.ExternalWiidgetLoader;
import org.landa.wiidget.parser.evaluation.ExpressionEvaluatorFactory;
import org.landa.wiidget.url.URLResolver;
import org.landa.wiidget.validation.WiidgetValidator;

/**
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 *
 */
public interface Configuration {

	public Class<? extends Wiidget> getRawType();

	public URLResolver getUrlResolver();

	public WiidgetValidator getWiidgetValidator();

	public ObjectFactory getObjectFactory();

	public ExpressionEvaluatorFactory getExpressionEvaluatorFactory(WiidgetContext wiidgetContext, Map<String, Wiidget> wiidgetMap);

	public Set<ExternalWiidgetLoader> getExternalWiidgetLoaders();
}
