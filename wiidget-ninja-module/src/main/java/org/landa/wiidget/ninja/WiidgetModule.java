package org.landa.wiidget.ninja;

import ninja.template.TemplateEngine;

import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.engine.ObjectFactory;
import org.landa.wiidget.url.TransparentURLResolver;
import org.landa.wiidget.url.URLResolver;
import org.landa.wiidget.util.WiidgetProperties;
import org.landa.wiidget.validation.WiidgetValidator;

import com.google.inject.AbstractModule;

public class WiidgetModule extends AbstractModule {

    @Override
    protected void configure() {

        bind(TemplateEngine.class).to(WiidgetTemplateEngine.class);

        bind(ObjectFactory.class).to(GuiceObjectFactory.class);
        bind(WiidgetValidator.class).to(NinjaWiidgetValidator.class);
        bind(WiidgetProperties.class).to(NinjaWiidgetProperties.class);
        bind(WiidgetContext.class).to(NinjaWiidgetContext.class);
        bind(URLResolver.class).to(TransparentURLResolver.class);

    }
}
