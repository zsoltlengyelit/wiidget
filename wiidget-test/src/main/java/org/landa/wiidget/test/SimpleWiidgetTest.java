package org.landa.wiidget.test;

import org.junit.Test;

public class SimpleWiidgetTest extends AbstractRendererTest {

	@Test
	public void testCdata() {

		final String result = renderer.render("import org.landa.wiidget.library.html.*; CData(\"Hello Wiidget!\")");

		assertEquals("Hello Wiidget!", result);

	}
}
