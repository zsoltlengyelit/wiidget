package org.landa.wiidget.parser.evaluation;

import org.landa.wiidget.parser.WiidgetParserException;

/**
 * Thrown when evaluation is failed.
 *
 * @author lzsolt
 *
 */
public class EvaluationException extends WiidgetParserException {

    private static final long serialVersionUID = -6942914294591027572L;

    public EvaluationException(final String message) {
        super(message);
    }

    public EvaluationException(final String string, final Throwable cause) {
        super(string, cause);
    }

}
