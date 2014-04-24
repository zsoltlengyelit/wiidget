package org.landa.wiidget.javaee.demo;

import java.net.URI;
import java.net.URISyntaxException;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
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

	@Inject
	private AnimalRepo animalRepo;

	@GET
	public Response index() {

		wiidgetContext.set("m", new DataMap().set("title", "Title"));

		wiidgetContext
				.set("animals", new ArrayListPageable<Animal>(animalRepo));

		final String rendered = renderer.render(getClass().getResourceAsStream(
				"/index/index.wdgt"));

		return Response.ok(rendered).build();
	}

	@Path("add")
	@GET
	public Response add(@QueryParam("name") final String name,
			@QueryParam("age") final int age) {

		if (null != name) {
			animalRepo.add(new Animal(name, age));

			try {
				return Response.temporaryRedirect(new URI("/")).build();
			} catch (final URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		wiidgetContext.set("m", new DataMap().set("title", "Title"));

		wiidgetContext.set("animal", new Animal());

		final String rendered = renderer.render(getClass().getResourceAsStream(
				"/index/form.wdgt"));

		return Response.ok(rendered).build();
	}

	public static class Animal {
		public String name;
		public int age;

		public Animal() {

		}

		public Animal(final String name, final int age) {
			super();
			this.name = name;
			this.age = age;
		}

	}

}
