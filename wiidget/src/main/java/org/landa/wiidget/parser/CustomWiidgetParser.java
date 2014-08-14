package org.landa.wiidget.parser;

import org.antlr.v4.runtime.TokenStream;
import org.landa.wiidget.antlr.WiidgetErrorStrategy;
import org.landa.wiidget.antlr.WiidgetParser;

/**
 * This class stays here because the {@link WiidgetParser} is generated. Here we can override properties.
 *
 * @author lzsolt
 *
 */
public class CustomWiidgetParser extends WiidgetParser {

    public CustomWiidgetParser(final TokenStream input) {
        super(input);
        _errHandler = new WiidgetErrorStrategy();
    }

}
