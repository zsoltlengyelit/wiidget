package org.landa.wiidget.javaee;

<<<<<<< HEAD
=======
import java.io.Serializable;
>>>>>>> 612cb241b590b46a7445cfe51be64ae1d527fe6d
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.servlet.http.HttpServletRequest;

import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.landa.wiidget.context.DefaultWiidgetContext;

/**
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 * 
 */
@Default
@RequestScoped
<<<<<<< HEAD
public class RequestWiidgetContext extends DefaultWiidgetContext {
=======
public class RequestWiidgetContext extends DefaultWiidgetContext implements Serializable {
>>>>>>> 612cb241b590b46a7445cfe51be64ae1d527fe6d

	@PostConstruct
	private void init() {

		final HttpServletRequest request = ResteasyProviderFactory
				.getContextData(HttpServletRequest.class);

		final Set<Entry> requestParams = request.getParameterMap().entrySet();
		for (final Entry entry : requestParams) {

			Object value = entry.getValue();
			if (null != value) {
				if (value.getClass().isArray()
						&& ((Object[]) value).length == 1) {
					value = ((Object[]) value)[0];
				}
			}

			this.set(entry.getKey().toString(), value);
		}
	}
}
