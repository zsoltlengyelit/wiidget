package org.landa.wiidget.antlr;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;

public class WiidgetErrorStrategy extends DefaultErrorStrategy {

	@Override
	public void beginErrorCondition(@NotNull final Parser recognizer) {
		throw new WiidgetLexerException("Bad begin of file.");
	}

	@Override
	public boolean inErrorRecoveryMode(@NotNull final Parser recognizer) {
		return true;
	}

	@Override
	public void endErrorCondition(@NotNull final Parser recognizer) {
	}

	@Override
	public void reportError(@NotNull final Parser recognizer, @Nullable final RecognitionException recognitionException) throws RecognitionException {

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
			int line = -1;
			int charPositionInLine = -1;
			line = offendingToken.getLine();
			charPositionInLine = offendingToken.getCharPositionInLine();

			throw new WiidgetLexerException(msg + " at " + line + ":" + charPositionInLine, noViableAltException);

		} else {

			super.reportError(recognizer, recognitionException);
		}

	}

}
