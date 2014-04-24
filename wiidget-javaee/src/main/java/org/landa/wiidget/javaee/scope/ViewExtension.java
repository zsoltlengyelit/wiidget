package org.landa.wiidget.javaee.scope;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.Extension;

public class ViewExtension implements Extension {

	public void afterBeanDiscovery(@Observes AfterBeanDiscovery event,
			BeanManager manager) {
		event.addContext(new ViewContext());
	}

	public void cleanup() {
	}
}
