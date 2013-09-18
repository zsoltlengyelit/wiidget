package org.landa.wiidget.test;

import java.io.InputStream;

import org.junit.Test;

/**
 * Hello world!
 */

public class ExpressionTest extends AbstractRendererTest {

	@Test
	public void testTemplate() {

		final InputStream inputStream = getClass().getResourceAsStream("/org/landa/wiidget/test/index.wdgt");

		final String result = renderer.render(inputStream);

		assertEquals("<label>data</label>", result);

	}

	@Test
	public void testBoolean() {
		assertEquals("true", evalExpression("true == true"));
		assertEquals("false", evalExpression("1 == 1 - 2"));
		assertEquals("true", evalExpression("-1 == 1 - 2"));

	}

	@Test
	public void testAddition() {
		assertEquals("-2", evalExpression("1 - 3"));

		assertEquals("2.0", evalExpression("1 + 1.0"));
	}

	@Test
	public void testSubstraction() {
		assertEquals("9", evalExpression("10 - 1"));
	}

	private String evalExpression(final String expression) {

		final String result = renderer.render("import org.landa.wiidget.library.html.*; Out(" + expression + ")");
		return result;

	}
}
