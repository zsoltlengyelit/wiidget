package org.landa.wiidget.antlr;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;

public class WiidgetErrorStrategy extends DefaultErrorStrategy {

    @Override
    public void beginErrorCondition(@NotNull final Parser recognizer) {
        super.beginErrorCondition(recognizer);
    }

    @Override
    public boolean inErrorRecoveryMode(@NotNull final Parser recognizer) {
        return false;
    }

    @Override
    public void endErrorCondition(@NotNull final Parser recognizer) {
        super.endErrorCondition(recognizer);
    }

    @Override
    public void reportError(@NotNull final Parser recognizer, @Nullable final RecognitionException recognitionException) throws RecognitionException {

        if (recognitionException instanceof InputMismatchException) {

            final InputMismatchException inputMismatchException = (InputMismatchException) recognitionException;
            final Token offendingToken = inputMismatchException.getOffendingToken();
            final int line = offendingToken.getLine();
            final int charPositionInLine = offendingToken.getCharPositionInLine();

            final IntervalSet expectedTokens = inputMismatchException.getExpectedTokens();

            throw new WiidgetLexerException(String.format("Input mismatch at %d:%d. Expected: %s", line, charPositionInLine, expectedTokens), recognitionException);

        } else

        if (recognitionException instanceof NoViableAltException) {

            final NoViableAltException noViableAltException = (NoViableAltException) recognitionException;

            final TokenStream tokens = recognizer.getInputStream();
            String input;
            if (tokens instanceof TokenStream) {
                if (noViableAltException.getStartToken().getType() == Token.EOF) {
                    input = "<EOF>";
                } else {
                    input = tokens.getText(noViableAltException.getStartToken(), noViableAltException.getOffendingToken());
                }
            } else {
                input = "<unknown input>";
            }
            final String msg = "no viable alternative at input " + escapeWSAndQuote(input);

            final Token offendingToken = noViableAltException.getOffendingToken();
            final int line = offendingToken.getLine();
            final int charPositionInLine = offendingToken.getCharPositionInLine();

            throw new WiidgetLexerException(msg + " at " + line + ":" + charPositionInLine, noViableAltException);

        } else {

            final Token offendingToken = recognitionException.getOffendingToken();
            int line = -1;
            int charPositionInLine = -1;
            line = offendingToken.getLine();
            charPositionInLine = offendingToken.getCharPositionInLine();

            throw new WiidgetLexerException("Error at " + line + ":" + charPositionInLine, recognitionException);
        }

    }
}
