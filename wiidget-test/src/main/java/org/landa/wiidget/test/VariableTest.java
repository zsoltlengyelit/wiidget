package org.landa.wiidget.test;

import org.junit.Test;
import org.landa.wiidget.util.DataMap;

public class VariableTest extends AbstractRendererTest {

	@Test
	public void testVariableParam() {

		final String result = renderer.render("import org.landa.wiidget.library.html.*; Label(var); ");

		assertEquals("<label>Hello Wiidget!</label>", result);
	}

	@Override
	protected DataMap getTestData() {

		final DataMap dataMap = super.getTestData();

		dataMap.set("var", "Hello Wiidget!");

		return dataMap;
	}
}
