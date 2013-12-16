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

	@Inject
	private Renderer renderer;

	@Inject
	private WiidgetContext wiidgetContext;

	@GET
	public Response index() {

		wiidgetContext.set("m", new DataMap().set("title", "Title"));

		wiidgetContext.set(
				"animals",
				new ArrayListPageable<Animal>(Arrays.asList(
						new Animal("Ló", 1), new Animal("Ló", 1), new Animal(
								"Cica", 2), new Animal("Ló", 1), new Animal(
								"Cica", 2), new Animal("Ló", 1), new Animal(
								"Cica", 2), new Animal("Ló", 1), new Animal(
								"Cica", 2), new Animal("Ló", 1), new Animal(
								"Cica", 2), new Animal("Cica", 2), new Animal(
								"Ló", 1), new Animal("Cica", 2), new Animal(
								"Ló", 1), new Animal("Cica", 2), new Animal(
								"Ló", 1), new Animal("Cica", 2), new Animal(
								"Ló", 1), new Animal("Cica", 2))));

		final String rendered = renderer.render(getClass().getResourceAsStream(
				"/index/index.wdgt"));

		return Response.ok(rendered).build();
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
