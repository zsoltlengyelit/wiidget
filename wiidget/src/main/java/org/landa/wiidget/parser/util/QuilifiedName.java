package org.landa.wiidget.parser.util;

import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.landa.wiidget.antlr.WiidgetParser.QualifiedNameContext;

/**
 *
 * @author lzsolt
 *
 */
public class QuilifiedName {

    private final QualifiedNameContext nameContext;

    public QuilifiedName(final QualifiedNameContext nameContext) {
        super();
        this.nameContext = nameContext;
    }

    public String getLastIdentifier() {
        final List<TerminalNode> identifiers = nameContext.Identifier();
        return identifiers.get(identifiers.size() - 1).getText();
    }

}
