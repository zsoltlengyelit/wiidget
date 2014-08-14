/**
 *
 */
package org.landa.wiidget.parser.exception;

import org.landa.wiidget.antlr.WiidgetParser.ImportDeclarationContext;

/**
 * @author lzsolt
 *
 */
public class DuplicateAliasException extends ImportException {

    private static final long serialVersionUID = 7744916019210002833L;

    private final String alias;
    private final ImportDeclarationContext existingImport;
    private final ImportDeclarationContext newImport;

    /**
     * @param alias
     *            duplicated alias
     * @param existingImport
     *            overrided import
     * @param importDeclaration
     *            new import
     */
    public DuplicateAliasException(final String alias, final ImportDeclarationContext existingImport, final ImportDeclarationContext newImport) {
        super();
        this.alias = alias;
        this.existingImport = existingImport;
        this.newImport = newImport;
    }

    public String getAlias() {
        return alias;
    }

    public ImportDeclarationContext getExistingImport() {
        return existingImport;
    }

    public ImportDeclarationContext getNewImport() {
        return newImport;
    }

    @Override
    public String getMessage() {

        return String.format("Alias: %s for %s and %s", alias, existingImport.getText(), newImport.getText());
    }

}
