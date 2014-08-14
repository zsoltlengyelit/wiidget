package org.landa.wiidget.parser.resource;

import org.landa.wiidget.Wiidget;

public class ClassWiidgetResource implements WiidgetResource {

    private final Class<? extends Wiidget> wiidgetClass;

    public ClassWiidgetResource(final Class<? extends Wiidget> wiidgetClass) {
        this.wiidgetClass = wiidgetClass;
    }

    public Class<? extends Wiidget> getWiidgetClass() {
        return wiidgetClass;
    }

}
