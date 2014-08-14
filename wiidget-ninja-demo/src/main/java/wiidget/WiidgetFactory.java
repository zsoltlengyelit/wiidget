package wiidget;

import java.util.ArrayList;
import java.util.List;

import models.Person;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.library.html.table.Table;

public class WiidgetFactory extends Wiidget {

    public Table table(final List<?> list, final String header) {

        final Table table = this.getWiidgetFactory().createComponent(Table.class, data().set("value", list).set("header", header));

        table.setCssClass("table table-striped table-hover");

        return table;
    }

    public Object object() {
        return new Object();
    }

    public List<Person> persons() {
        final List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", "+36 20 539 5847"));
        persons.add(new Person("Smith", "+36 30 533 3327"));
        persons.add(new Person("Jane", "+36 30 533 3327"));
        persons.add(new Person("Bull", "+36 30 533 3327"));
        persons.add(new Person("Ken", "+36 30 533 3327"));
        persons.add(new Person("Mule", "+36 30 533 3327"));

        return persons;
    }
}
