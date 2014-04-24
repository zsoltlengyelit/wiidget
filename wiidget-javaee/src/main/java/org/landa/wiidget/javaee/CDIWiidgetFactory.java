package org.landa.wiidget.javaee;

<<<<<<< HEAD
=======
import java.io.Serializable;

>>>>>>> 612cb241b590b46a7445cfe51be64ae1d527fe6d
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
<<<<<<< HEAD
public class CDIWiidgetFactory extends DefaultWiidgetFactory {
=======
public class CDIWiidgetFactory extends DefaultWiidgetFactory implements Serializable{
>>>>>>> 612cb241b590b46a7445cfe51be64ae1d527fe6d

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
