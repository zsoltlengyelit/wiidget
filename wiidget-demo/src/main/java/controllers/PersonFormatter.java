package controllers;

import models.Person;

import org.landa.wiidget.library.format.Formatter;

public class PersonFormatter implements Formatter<Person> {

	@Override
	public String format(final Person object) {
		return object.name + "+ph:" + object.phone;
	}
}
