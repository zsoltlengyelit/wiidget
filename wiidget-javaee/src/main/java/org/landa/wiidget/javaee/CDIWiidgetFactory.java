package org.landa.wiidget.javaee;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.engine.DefaultWiidgetFactory;
import org.landa.wiidget.engine.ObjectFactory;
import org.landa.wiidget.engine.ResultTransformerRegistrator;
import org.landa.wiidget.url.URLResolver;
import org.landa.wiidget.util.DefaultWiidgetProperties;
import org.landa.wiidget.validation.DefaultWiidgetValidator;

/**
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 * 
 */
public class CDIWiidgetFactory extends DefaultWiidgetFactory implements Serializable{

	@Inject
	private ObjectFactory cdiObjectFactory;

	@Inject
	private WiidgetContext cdiWiidgetContext;

	@Inject
	private URLResolver servletUrlResolver;

	/**
	 * No super call.
	 */
	public CDIWiidgetFactory() {

	}

	@PostConstruct
	private void init() {
		this.objectFactory = cdiObjectFactory;
		this.wiidgetValidator = new DefaultWiidgetValidator(objectFactory);
		this.wiidgetProperties = new DefaultWiidgetProperties();
		this.wiidgetContext = cdiWiidgetContext;
		this.resultTransformerRegistrator = new ResultTransformerRegistrator();
		this.urlResolver = servletUrlResolver;
	}

}
