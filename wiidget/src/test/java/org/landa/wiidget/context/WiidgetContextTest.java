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

}
