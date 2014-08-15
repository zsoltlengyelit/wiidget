package org.landa.wiidget.context;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WiidgetContextTest {

	private WiidgetContext wiidgetContext;

	@Before
	public void initContext() {
		wiidgetContext = new DefaultWiidgetContext();
	}

	@Test
	public void testLoopReference() {
		Assert.assertSame(wiidgetContext, wiidgetContext.get(WiidgetContext.CONTEXT_VARIABLE));
	}

	@Test
	public void testReservedWords() {

		try {
			wiidgetContext.set("true", false);
			Assert.fail("should throw exception");
		} catch (final IllegalArgumentException e) {
		}

		try {
			wiidgetContext.set("false", false);
			Assert.fail("should throw exception");
		} catch (final IllegalArgumentException e) {
		}

		try {
			wiidgetContext.set("context", false);
			Assert.fail("should throw exception");
		} catch (final IllegalArgumentException e) {
		}

	}
}
