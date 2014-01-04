package org.landa.wiidget.javaee.demo;

import java.util.Arrays;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.landa.wiidget.Renderer;
import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.library.html.datatable.ArrayListPageable;
import org.landa.wiidget.util.DataMap;

@Path("/")
@RequestScoped
public class IndexController {

	public IndexController() {
		super();
	}

	@Inject
	private LoginView loginView;

	@GET
	@Path("/login")
	public Response index2() {

		return Response.ok(loginView.render()).build();
	}

	@GET
	public Response index() {

		return Response.ok(loginView.render()).build();
	}

	public static class Animal {
		public String name;
		public int age;

		public Animal(final String name, final int age) {
			super();
			this.name = name;
			this.age = age;
		}

	}

}
