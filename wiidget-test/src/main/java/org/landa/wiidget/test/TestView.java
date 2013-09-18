package org.landa.wiidget.test;

import java.util.Arrays;

import org.landa.wiidget.WiidgetView;
import org.landa.wiidget.engine.DefaultWiidgetFactory;
import org.landa.wiidget.library.html.Table;

public class TestView extends WiidgetView {

	public TestView() {
		super(new DefaultWiidgetFactory());
	}

	@Override
	public void run() {

		final Table table = beginWiidget(Table.class, data().set("value", Arrays.asList("John", "Smith")));
		endWiidget();
	}
}
