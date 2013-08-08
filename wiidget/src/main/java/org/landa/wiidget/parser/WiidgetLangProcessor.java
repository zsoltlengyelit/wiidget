package org.landa.wiidget.parser;

import org.landa.wiidget.antlr.WiidgetParser.CompilationUnitContext;

import com.google.inject.ImplementedBy;


@ImplementedBy(WiidgetLangProcessorImpl.class)
public interface WiidgetLangProcessor {

	public String render(CompilationUnitContext compilationUnitContext) throws WiidgetParserException;

}
