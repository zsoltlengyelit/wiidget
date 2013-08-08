package filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.google.inject.Singleton;

@Singleton
public class ExceptionHandlerFilter implements javax.servlet.Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		try {

			chain.doFilter(request, response);

		} catch (Throwable throwable) {

			response.getWriter().write(throwable.getLocalizedMessage());

		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
