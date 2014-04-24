package org.landa.wiidget.javaee;

<<<<<<< HEAD
=======
import java.io.Serializable;

>>>>>>> 612cb241b590b46a7445cfe51be64ae1d527fe6d
import javax.enterprise.inject.Default;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.UriBuilder;

import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.landa.wiidget.url.URLResolver;

/**
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 * 
 */
@Default
<<<<<<< HEAD
public class RestEasyURLResolver implements URLResolver {
=======
public class RestEasyURLResolver implements URLResolver, Serializable {
>>>>>>> 612cb241b590b46a7445cfe51be64ae1d527fe6d

	@Override
	public String createAbsoluteURL(final String path) {
		return UriBuilder.fromPath(path).build().toString();
	}

	@Override
	public String createURL(final String path) {
		return UriBuilder.fromPath(path).build().toString();
	}

	@Override
	public String getContextPath() {
		return getRequest().getContextPath();
	}

	public HttpServletRequest getRequest() {
		return ResteasyProviderFactory.getInstance().getContextData(
				HttpServletRequest.class);
	}

}
