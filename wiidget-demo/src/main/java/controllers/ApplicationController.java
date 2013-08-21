/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Contact;
import models.Person;
import ninja.Context;
import ninja.Result;
import ninja.Results;
import ninja.i18n.Lang;
import ninja.params.Param;
import ninja.params.PathParam;
import ninja.validation.Required;
import ninja.validation.Validation;

import org.landa.wiidget.library.format.Formatter;
import org.landa.wiidget.util.DataMap;
import org.slf4j.Logger;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ApplicationController {

	/**
	 * This is the system wide logger. You can still use any config you like. Or
	 * create your own custom logger.
	 * But often this is just a simple solution:
	 */
	@Inject
	public Logger logger;

	@Inject
	Lang lang;

	public Result examples(final Context context) {
		logger.info("In example ");
		// Default rendering is simple by convention
		// This renders the page in views/ApplicationController/index.ftl.html
		return Results.html();

	}

	public Result testPage() {
		return Results.html();

	}

	public Result index(final Context context) {
		// Default rendering is simple by convention
		// This renders the page in views/ApplicationController/index.ftl.html

		final List<Person> persons = new ArrayList<>();
		persons.add(new Person("John", "+36 20 539 5847"));
		persons.add(new Person("Smith", "+36 30 533 3327"));

		final Formatter<String> formatter = new StringFormatter();

		final Formatter<Integer> integerFormatter = new IntegerFormatter();

		final Formatter<Person> personFormatter = new PersonFormatter();

		final DataMap data = new DataMap();
		data.set("title", "Anett oldala");
		data.set("persons", persons);
		data.set("formatter", formatter);
		data.set("integerFormatter", integerFormatter);

		data.set("personFormatter", personFormatter);

		return Results.html().render(data);

	}

	public Result userDashboard(@PathParam("email") final String email, @PathParam("id") final Integer id, final Context context) {

		final Map<String, Object> map = new HashMap<String, Object>();
		// generate tuples, convert integer to string here because Freemarker
		// does it in locale
		// dependent way with commas etc
		map.put("id", Integer.toString(id));
		map.put("email", email);

		// and render page with both parameters:
		return Results.html().render(map);
	}

	public Result validation(final Validation validation, @Param("email") @Required final String email) {

		if (validation.hasViolations()) {
			return Results.json().render(validation.getFieldViolations("email"));
		} else {
			return Results.json().render(email);
		}
	}

	public Result redirect(final Context context) {
		// Redirects back to the main page simply call redirect
		return Results.redirect("/");

	}

	public Result session(final Context context) {
		context.getSessionCookie().put("username", "kevin");

		return Results.html().render(context.getSessionCookie().getData());

	}

	public Result contactForm(final Context context) {

		return Results.html();

	}

	public Result postContactForm(final Context context, final Contact contact) {
		// contact is parsed into the method
		// and automatically gets rendered via the html
		// templating engine.
		return Results.html().render(contact);
	}

	public Result htmlEscaping(final Context context) {

		// just an example of html escaping in action.
		// just visit /htmlEscaping and check out the source
		// all problematic characters will be escaped
		final String maliciousJavascript = "<script>alert('Hello');</script>";

		final Map<String, String> renderMap = Maps.newHashMap();
		renderMap.put("maliciousJavascript", maliciousJavascript);

		return Results.html().render(renderMap);

	}

}
