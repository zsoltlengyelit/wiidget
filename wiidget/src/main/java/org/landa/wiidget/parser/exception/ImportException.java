package org.landa.wiidget.parser.exception;

/**
 *
 * @author lzsolt
 *
 */
public class ImportException extends Exception {

    public ImportException() {
        super();

    }

    public ImportException(final String message, final Throwable cause) {
        super(message, cause);

    }

    public ImportException(final Throwable cause) {
        super(cause);

    }

    public ImportException(final String string) {
        super(string);
    }

    private static final long serialVersionUID = -4383680665788678329L;

}
