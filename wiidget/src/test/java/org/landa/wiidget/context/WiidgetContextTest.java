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

	@Test(expected = IllegalArgumentException.class)
	public void testReservedWords1() {
		wiidgetContext.set("true", false);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testReservedWords2() {
		wiidgetContext.set("false", false);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testReservedWords3() {
		wiidgetContext.set("context", false);
	}
}
