package org.landa.wiidget.parser.util;

import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author lzsolt
 *
 */
public class StringDeclaration {

    private final TerminalNode string;

    public StringDeclaration(final TerminalNode string) {
        this.string = string;
    }

    public String getContent() {
        if (null != string) {
            final String stringText = string.getText();
            return stringText.substring(1, stringText.length() - 1);
        }
        return null;
    }

}
