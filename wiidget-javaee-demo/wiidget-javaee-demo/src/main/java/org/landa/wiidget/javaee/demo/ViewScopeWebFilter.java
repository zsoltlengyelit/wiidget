package org.landa.wiidget.javaee.demo;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.annotations.interception.ServerInterceptor;
import org.jboss.resteasy.core.ResourceMethod;
import org.jboss.resteasy.core.ServerResponse;
import org.jboss.resteasy.spi.Failure;
import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.interception.AcceptedByMethod;
import org.jboss.resteasy.spi.interception.PreProcessInterceptor;
import org.landa.wiidget.javaee.scope.ViewContext;
import org.landa.wiidget.javaee.scope.ViewScoped;

@Provider
@ServerInterceptor
public class ViewScopeWebFilter implements PreProcessInterceptor, ExceptionMapper<Throwable> {

	private String previousContextPath = null;

	public ViewScopeWebFilter() {
		super();
	}

	@Context
	private HttpServletRequest servletRequest;

	@Override
	public ServerResponse preProcess(HttpRequest httpRequest,
			ResourceMethod resourceMethod) throws Failure,
			WebApplicationException {

		String contextPath = httpRequest.getUri().getAbsolutePath().getPath();

		if (!contextPath.equals(previousContextPath)) {
			ViewContext.instance().clean();

			previousContextPath = contextPath;
		}

		return null;
	}

	@Override
	public Response toResponse(Throwable exception) {
		ViewContext.instance().clean();
		
		return Response.serverError().build();
	}

}