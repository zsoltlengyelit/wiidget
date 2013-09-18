package org.landa.wiidget.test;

import java.util.Map;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.landa.wiidget.Renderer;
import org.landa.wiidget.util.DataMap;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class AbstractRendererTest extends TestCase {

	protected Renderer renderer;

	@Override
	protected void setUp() throws Exception {

		super.setUp();
		this.init();
	}

	@Test
	public void testTrue() {
		assertEquals(true, true);
	}

	@Before
	public void init() {

		final Map<String, Object> data = getTestData();

		renderer = Renderer.create(data);
	}

	/**
	 * Generates test data.
	 * 
	 * @return test data in context
	 */
	protected DataMap getTestData() {

		final DataMap map = new DataMap();

		map.put("var", "data");

		return map;
	}
}
