package org.landa.wiidget.javaee;

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
public class RestEasyURLResolver implements URLResolver {

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
