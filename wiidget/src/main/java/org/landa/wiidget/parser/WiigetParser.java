package org.landa.wiidget.parser;

import org.landa.wiidget.antlr.WiidgetParser.CompilationUnitContext;

import com.google.inject.ImplementedBy;


@ImplementedBy(WiigetParserImpl.class)
public interface WiigetParser {

	public String render(CompilationUnitContext compilationUnitContext) throws WiidgetParserException;

}
