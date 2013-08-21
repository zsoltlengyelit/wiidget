// Generated from D:\projects\wiidget\wiidget\src\main\java\org\landa\wiidget\antlr\Wiidget.g4 by ANTLR 4.0
package org.landa.wiidget.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WiidgetLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, DEFAULT_OPERATOR=2, IntegerLiteral=3, FloatingPointLiteral=4, 
		BooleanLiteral=5, CharacterLiteral=6, StringLiteral=7, NullLiteral=8, 
		IF=9, FOREACH=10, LPAREN=11, RPAREN=12, LBRACE=13, RBRACE=14, LBRACK=15, 
		RBRACK=16, SEMI=17, COMMA=18, DOT=19, ASSIGN=20, GT=21, LT=22, BANG=23, 
		TILDE=24, QUESTION=25, COLON=26, EQUAL=27, LE=28, GE=29, NOTEQUAL=30, 
		AND=31, OR=32, INC=33, DEC=34, ADD=35, SUB=36, MUL=37, DIV=38, BITAND=39, 
		BITOR=40, CARET=41, MOD=42, ADD_ASSIGN=43, SUB_ASSIGN=44, MUL_ASSIGN=45, 
		DIV_ASSIGN=46, AND_ASSIGN=47, OR_ASSIGN=48, XOR_ASSIGN=49, MOD_ASSIGN=50, 
		LSHIFT_ASSIGN=51, RSHIFT_ASSIGN=52, URSHIFT_ASSIGN=53, Identifier=54, 
		AT=55, ELLIPSIS=56, WS=57, COMMENT=58, LINE_COMMENT=59;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'import'", "DEFAULT_OPERATOR", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "'null'", "'if'", 
		"'foreach'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "TILDE", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'", "WS", 
		"COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"IMPORT", "DEFAULT_OPERATOR", "IntegerLiteral", "DecimalIntegerLiteral", 
		"HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", 
		"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", 
		"DigitOrUnderscore", "Underscores", "HexNumeral", "HexDigits", "HexDigit", 
		"HexDigitsAndUnderscores", "HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", 
		"OctalDigit", "OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "BinaryNumeral", 
		"BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", 
		"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
		"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
		"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", 
		"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
		"StringCharacter", "EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", 
		"NullLiteral", "IF", "FOREACH", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
		"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
		"URSHIFT_ASSIGN", "Identifier", "JavaLetter", "JavaLetterOrDigit", "AT", 
		"ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};


	public WiidgetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Wiidget.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 98: JavaLetter_action((RuleContext)_localctx, actionIndex); break;

		case 99: JavaLetterOrDigit_action((RuleContext)_localctx, actionIndex); break;

		case 102: WS_action((RuleContext)_localctx, actionIndex); break;

		case 103: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 104: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void JavaLetterOrDigit_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void JavaLetter_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 98: return JavaLetter_sempred((RuleContext)_localctx, predIndex);

		case 99: return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return Character.isJavaIdentifierPart(_input.LA(-1));

		case 3: return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return Character.isJavaIdentifierStart(_input.LA(-1));

		case 1: return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\4=\u02a3\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4"+
		"Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t"+
		"\\\4]\t]\4^\t^\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4"+
		"h\th\4i\ti\4j\tj\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5"+
		"\4\u00e3\n\4\3\5\3\5\5\5\u00e7\n\5\3\6\3\6\5\6\u00eb\n\6\3\7\3\7\5\7\u00ef"+
		"\n\7\3\b\3\b\5\b\u00f3\n\b\3\t\3\t\3\n\3\n\3\n\5\n\u00fa\n\n\3\n\3\n\3"+
		"\n\5\n\u00ff\n\n\5\n\u0101\n\n\3\13\3\13\5\13\u0105\n\13\3\13\5\13\u0108"+
		"\n\13\3\f\3\f\5\f\u010c\n\f\3\r\3\r\3\16\6\16\u0111\n\16\r\16\16\16\u0112"+
		"\3\17\3\17\5\17\u0117\n\17\3\20\6\20\u011a\n\20\r\20\16\20\u011b\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\5\22\u0124\n\22\3\22\5\22\u0127\n\22\3\23\3"+
		"\23\3\24\6\24\u012c\n\24\r\24\16\24\u012d\3\25\3\25\5\25\u0132\n\25\3"+
		"\26\3\26\5\26\u0136\n\26\3\26\3\26\3\27\3\27\5\27\u013c\n\27\3\27\5\27"+
		"\u013f\n\27\3\30\3\30\3\31\6\31\u0144\n\31\r\31\16\31\u0145\3\32\3\32"+
		"\5\32\u014a\n\32\3\33\3\33\3\33\3\33\3\34\3\34\5\34\u0152\n\34\3\34\5"+
		"\34\u0155\n\34\3\35\3\35\3\36\6\36\u015a\n\36\r\36\16\36\u015b\3\37\3"+
		"\37\5\37\u0160\n\37\3 \3 \5 \u0164\n \3!\3!\3!\5!\u0169\n!\3!\5!\u016c"+
		"\n!\3!\5!\u016f\n!\3!\3!\3!\5!\u0174\n!\3!\5!\u0177\n!\3!\3!\3!\5!\u017c"+
		"\n!\3!\3!\3!\5!\u0181\n!\3\"\3\"\3\"\3#\3#\3$\5$\u0189\n$\3$\3$\3%\3%"+
		"\3&\3&\3\'\3\'\3\'\5\'\u0194\n\'\3(\3(\5(\u0198\n(\3(\3(\3(\5(\u019d\n"+
		"(\3(\3(\5(\u01a1\n(\3)\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01b1"+
		"\n+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01bb\n,\3-\3-\3.\3.\5.\u01c1\n.\3.\3."+
		"\3/\6/\u01c6\n/\r/\16/\u01c7\3\60\3\60\5\60\u01cc\n\60\3\61\3\61\3\61"+
		"\3\61\5\61\u01d2\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u01df\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3"+
		"B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3"+
		"L\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3"+
		"U\3V\3V\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\3]\3]\3"+
		"]\3^\3^\3^\3_\3_\3_\3`\3`\3`\3`\3a\3a\3a\3a\3b\3b\3b\3b\3b\3c\3c\7c\u0269"+
		"\nc\fc\16c\u026c\13c\3d\3d\3d\3d\3d\3d\5d\u0274\nd\3e\3e\3e\3e\3e\3e\5"+
		"e\u027c\ne\3f\3f\3g\3g\3g\3g\3h\6h\u0285\nh\rh\16h\u0286\3h\3h\3i\3i\3"+
		"i\3i\7i\u028f\ni\fi\16i\u0292\13i\3i\3i\3i\3i\3i\3j\3j\3j\3j\7j\u029d"+
		"\nj\fj\16j\u02a0\13j\3j\3j\3\u0290k\3\3\1\5\4\1\7\5\1\t\2\1\13\2\1\r\2"+
		"\1\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\2\1\37\2\1!\2\1"+
		"#\2\1%\2\1\'\2\1)\2\1+\2\1-\2\1/\2\1\61\2\1\63\2\1\65\2\1\67\2\19\2\1"+
		";\2\1=\2\1?\6\1A\2\1C\2\1E\2\1G\2\1I\2\1K\2\1M\2\1O\2\1Q\2\1S\2\1U\7\1"+
		"W\b\1Y\2\1[\t\1]\2\1_\2\1a\2\1c\2\1e\2\1g\2\1i\n\1k\13\1m\f\1o\r\1q\16"+
		"\1s\17\1u\20\1w\21\1y\22\1{\23\1}\24\1\177\25\1\u0081\26\1\u0083\27\1"+
		"\u0085\30\1\u0087\31\1\u0089\32\1\u008b\33\1\u008d\34\1\u008f\35\1\u0091"+
		"\36\1\u0093\37\1\u0095 \1\u0097!\1\u0099\"\1\u009b#\1\u009d$\1\u009f%"+
		"\1\u00a1&\1\u00a3\'\1\u00a5(\1\u00a7)\1\u00a9*\1\u00ab+\1\u00ad,\1\u00af"+
		"-\1\u00b1.\1\u00b3/\1\u00b5\60\1\u00b7\61\1\u00b9\62\1\u00bb\63\1\u00bd"+
		"\64\1\u00bf\65\1\u00c1\66\1\u00c3\67\1\u00c58\1\u00c7\2\1\u00c9\2\1\u00cb"+
		"9\1\u00cd:\1\u00cf;\2\u00d1<\3\u00d3=\4\3\2\34\4NNnn\3\63;\4ZZzz\5\62"+
		";CHch\3\629\4DDdd\3\62\63\4GGgg\4--//\6FFHHffhh\4ZZzz\4RRrr\4))^^\4$$"+
		"^^\n$$))^^ddhhppttvv\3\62\65\6&&C\\aac|\4\2\u0101\ud802\udc01\3\ud802"+
		"\udc01\3\udc02\ue001\7&&\62;C\\aac|\4\2\u0101\ud802\udc01\3\ud802\udc01"+
		"\3\udc02\ue001\5\13\f\16\17\"\"\4\f\f\17\17\u02b1\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2?\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2[\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af"+
		"\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2"+
		"\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1"+
		"\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2"+
		"\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\3\u00d5\3\2\2\2\5\u00dc"+
		"\3\2\2\2\7\u00e2\3\2\2\2\t\u00e4\3\2\2\2\13\u00e8\3\2\2\2\r\u00ec\3\2"+
		"\2\2\17\u00f0\3\2\2\2\21\u00f4\3\2\2\2\23\u0100\3\2\2\2\25\u0102\3\2\2"+
		"\2\27\u010b\3\2\2\2\31\u010d\3\2\2\2\33\u0110\3\2\2\2\35\u0116\3\2\2\2"+
		"\37\u0119\3\2\2\2!\u011d\3\2\2\2#\u0121\3\2\2\2%\u0128\3\2\2\2\'\u012b"+
		"\3\2\2\2)\u0131\3\2\2\2+\u0133\3\2\2\2-\u0139\3\2\2\2/\u0140\3\2\2\2\61"+
		"\u0143\3\2\2\2\63\u0149\3\2\2\2\65\u014b\3\2\2\2\67\u014f\3\2\2\29\u0156"+
		"\3\2\2\2;\u0159\3\2\2\2=\u015f\3\2\2\2?\u0163\3\2\2\2A\u0180\3\2\2\2C"+
		"\u0182\3\2\2\2E\u0185\3\2\2\2G\u0188\3\2\2\2I\u018c\3\2\2\2K\u018e\3\2"+
		"\2\2M\u0190\3\2\2\2O\u01a0\3\2\2\2Q\u01a2\3\2\2\2S\u01a5\3\2\2\2U\u01b0"+
		"\3\2\2\2W\u01ba\3\2\2\2Y\u01bc\3\2\2\2[\u01be\3\2\2\2]\u01c5\3\2\2\2_"+
		"\u01cb\3\2\2\2a\u01d1\3\2\2\2c\u01de\3\2\2\2e\u01e0\3\2\2\2g\u01e7\3\2"+
		"\2\2i\u01e9\3\2\2\2k\u01ee\3\2\2\2m\u01f1\3\2\2\2o\u01f9\3\2\2\2q\u01fb"+
		"\3\2\2\2s\u01fd\3\2\2\2u\u01ff\3\2\2\2w\u0201\3\2\2\2y\u0203\3\2\2\2{"+
		"\u0205\3\2\2\2}\u0207\3\2\2\2\177\u0209\3\2\2\2\u0081\u020b\3\2\2\2\u0083"+
		"\u020d\3\2\2\2\u0085\u020f\3\2\2\2\u0087\u0211\3\2\2\2\u0089\u0213\3\2"+
		"\2\2\u008b\u0215\3\2\2\2\u008d\u0217\3\2\2\2\u008f\u0219\3\2\2\2\u0091"+
		"\u021c\3\2\2\2\u0093\u021f\3\2\2\2\u0095\u0222\3\2\2\2\u0097\u0225\3\2"+
		"\2\2\u0099\u0228\3\2\2\2\u009b\u022b\3\2\2\2\u009d\u022e\3\2\2\2\u009f"+
		"\u0231\3\2\2\2\u00a1\u0233\3\2\2\2\u00a3\u0235\3\2\2\2\u00a5\u0237\3\2"+
		"\2\2\u00a7\u0239\3\2\2\2\u00a9\u023b\3\2\2\2\u00ab\u023d\3\2\2\2\u00ad"+
		"\u023f\3\2\2\2\u00af\u0241\3\2\2\2\u00b1\u0244\3\2\2\2\u00b3\u0247\3\2"+
		"\2\2\u00b5\u024a\3\2\2\2\u00b7\u024d\3\2\2\2\u00b9\u0250\3\2\2\2\u00bb"+
		"\u0253\3\2\2\2\u00bd\u0256\3\2\2\2\u00bf\u0259\3\2\2\2\u00c1\u025d\3\2"+
		"\2\2\u00c3\u0261\3\2\2\2\u00c5\u0266\3\2\2\2\u00c7\u0273\3\2\2\2\u00c9"+
		"\u027b\3\2\2\2\u00cb\u027d\3\2\2\2\u00cd\u027f\3\2\2\2\u00cf\u0284\3\2"+
		"\2\2\u00d1\u028a\3\2\2\2\u00d3\u0298\3\2\2\2\u00d5\u00d6\7k\2\2\u00d6"+
		"\u00d7\7o\2\2\u00d7\u00d8\7r\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7t\2\2"+
		"\u00da\u00db\7v\2\2\u00db\4\3\2\2\2\u00dc\u00dd\7\u0080\2\2\u00dd\6\3"+
		"\2\2\2\u00de\u00e3\5\t\5\2\u00df\u00e3\5\13\6\2\u00e0\u00e3\5\r\7\2\u00e1"+
		"\u00e3\5\17\b\2\u00e2\u00de\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3"+
		"\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\b\3\2\2\2\u00e4\u00e6\5\23\n\2\u00e5"+
		"\u00e7\5\21\t\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\n\3\2\2"+
		"\2\u00e8\u00ea\5!\21\2\u00e9\u00eb\5\21\t\2\u00ea\u00e9\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\f\3\2\2\2\u00ec\u00ee\5+\26\2\u00ed\u00ef\5\21\t"+
		"\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\16\3\2\2\2\u00f0\u00f2"+
		"\5\65\33\2\u00f1\u00f3\5\21\t\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2"+
		"\2\u00f3\20\3\2\2\2\u00f4\u00f5\t\2\2\2\u00f5\22\3\2\2\2\u00f6\u0101\7"+
		"\62\2\2\u00f7\u00fe\5\31\r\2\u00f8\u00fa\5\25\13\2\u00f9\u00f8\3\2\2\2"+
		"\u00f9\u00fa\3\2\2\2\u00fa\u00ff\3\2\2\2\u00fb\u00fc\5\37\20\2\u00fc\u00fd"+
		"\5\25\13\2\u00fd\u00ff\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fb\3\2\2\2"+
		"\u00ff\u0101\3\2\2\2\u0100\u00f6\3\2\2\2\u0100\u00f7\3\2\2\2\u0101\24"+
		"\3\2\2\2\u0102\u0107\5\27\f\2\u0103\u0105\5\33\16\2\u0104\u0103\3\2\2"+
		"\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\5\27\f\2\u0107"+
		"\u0104\3\2\2\2\u0107\u0108\3\2\2\2\u0108\26\3\2\2\2\u0109\u010c\7\62\2"+
		"\2\u010a\u010c\5\31\r\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c"+
		"\30\3\2\2\2\u010d\u010e\t\3\2\2\u010e\32\3\2\2\2\u010f\u0111\5\35\17\2"+
		"\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\34\3\2\2\2\u0114\u0117\5\27\f\2\u0115\u0117\7a\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\36\3\2\2\2\u0118\u011a\7a\2\2"+
		"\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c \3\2\2\2\u011d\u011e\7\62\2\2\u011e\u011f\t\4\2\2\u011f"+
		"\u0120\5#\22\2\u0120\"\3\2\2\2\u0121\u0126\5%\23\2\u0122\u0124\5\'\24"+
		"\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127"+
		"\5%\23\2\u0126\u0123\3\2\2\2\u0126\u0127\3\2\2\2\u0127$\3\2\2\2\u0128"+
		"\u0129\t\5\2\2\u0129&\3\2\2\2\u012a\u012c\5)\25\2\u012b\u012a\3\2\2\2"+
		"\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e(\3"+
		"\2\2\2\u012f\u0132\5%\23\2\u0130\u0132\7a\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132*\3\2\2\2\u0133\u0135\7\62\2\2\u0134\u0136\5\37\20"+
		"\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138"+
		"\5-\27\2\u0138,\3\2\2\2\u0139\u013e\5/\30\2\u013a\u013c\5\61\31\2\u013b"+
		"\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\5/"+
		"\30\2\u013e\u013b\3\2\2\2\u013e\u013f\3\2\2\2\u013f.\3\2\2\2\u0140\u0141"+
		"\t\6\2\2\u0141\60\3\2\2\2\u0142\u0144\5\63\32\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\62\3\2\2"+
		"\2\u0147\u014a\5/\30\2\u0148\u014a\7a\2\2\u0149\u0147\3\2\2\2\u0149\u0148"+
		"\3\2\2\2\u014a\64\3\2\2\2\u014b\u014c\7\62\2\2\u014c\u014d\t\7\2\2\u014d"+
		"\u014e\5\67\34\2\u014e\66\3\2\2\2\u014f\u0154\59\35\2\u0150\u0152\5;\36"+
		"\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155"+
		"\59\35\2\u0154\u0151\3\2\2\2\u0154\u0155\3\2\2\2\u01558\3\2\2\2\u0156"+
		"\u0157\t\b\2\2\u0157:\3\2\2\2\u0158\u015a\5=\37\2\u0159\u0158\3\2\2\2"+
		"\u015a\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c<\3"+
		"\2\2\2\u015d\u0160\59\35\2\u015e\u0160\7a\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u015e\3\2\2\2\u0160>\3\2\2\2\u0161\u0164\5A!\2\u0162\u0164\5M\'\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164@\3\2\2\2\u0165\u0166\5\25\13"+
		"\2\u0166\u0168\7\60\2\2\u0167\u0169\5\25\13\2\u0168\u0167\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u016c\5C\"\2\u016b\u016a\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016f\5K&\2\u016e\u016d"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0181\3\2\2\2\u0170\u0171\7\60\2\2"+
		"\u0171\u0173\5\25\13\2\u0172\u0174\5C\"\2\u0173\u0172\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0177\5K&\2\u0176\u0175\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0181\3\2\2\2\u0178\u0179\5\25\13\2\u0179\u017b\5"+
		"C\"\2\u017a\u017c\5K&\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u0181\3\2\2\2\u017d\u017e\5\25\13\2\u017e\u017f\5K&\2\u017f\u0181\3\2"+
		"\2\2\u0180\u0165\3\2\2\2\u0180\u0170\3\2\2\2\u0180\u0178\3\2\2\2\u0180"+
		"\u017d\3\2\2\2\u0181B\3\2\2\2\u0182\u0183\5E#\2\u0183\u0184\5G$\2\u0184"+
		"D\3\2\2\2\u0185\u0186\t\t\2\2\u0186F\3\2\2\2\u0187\u0189\5I%\2\u0188\u0187"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5\25\13\2"+
		"\u018bH\3\2\2\2\u018c\u018d\t\n\2\2\u018dJ\3\2\2\2\u018e\u018f\t\13\2"+
		"\2\u018fL\3\2\2\2\u0190\u0191\5O(\2\u0191\u0193\5Q)\2\u0192\u0194\5K&"+
		"\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194N\3\2\2\2\u0195\u0197"+
		"\5!\21\2\u0196\u0198\7\60\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2"+
		"\u0198\u01a1\3\2\2\2\u0199\u019a\7\62\2\2\u019a\u019c\t\f\2\2\u019b\u019d"+
		"\5#\22\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019f\7\60\2\2\u019f\u01a1\5#\22\2\u01a0\u0195\3\2\2\2\u01a0\u0199\3"+
		"\2\2\2\u01a1P\3\2\2\2\u01a2\u01a3\5S*\2\u01a3\u01a4\5G$\2\u01a4R\3\2\2"+
		"\2\u01a5\u01a6\t\r\2\2\u01a6T\3\2\2\2\u01a7\u01a8\7v\2\2\u01a8\u01a9\7"+
		"t\2\2\u01a9\u01aa\7w\2\2\u01aa\u01b1\7g\2\2\u01ab\u01ac\7h\2\2\u01ac\u01ad"+
		"\7c\2\2\u01ad\u01ae\7n\2\2\u01ae\u01af\7u\2\2\u01af\u01b1\7g\2\2\u01b0"+
		"\u01a7\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b1V\3\2\2\2\u01b2\u01b3\7)\2\2\u01b3"+
		"\u01b4\5Y-\2\u01b4\u01b5\7)\2\2\u01b5\u01bb\3\2\2\2\u01b6\u01b7\7)\2\2"+
		"\u01b7\u01b8\5a\61\2\u01b8\u01b9\7)\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b2"+
		"\3\2\2\2\u01ba\u01b6\3\2\2\2\u01bbX\3\2\2\2\u01bc\u01bd\n\16\2\2\u01bd"+
		"Z\3\2\2\2\u01be\u01c0\7$\2\2\u01bf\u01c1\5]/\2\u01c0\u01bf\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\7$\2\2\u01c3\\\3\2\2\2"+
		"\u01c4\u01c6\5_\60\2\u01c5\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5"+
		"\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8^\3\2\2\2\u01c9\u01cc\n\17\2\2\u01ca"+
		"\u01cc\5a\61\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc`\3\2\2\2"+
		"\u01cd\u01ce\7^\2\2\u01ce\u01d2\t\20\2\2\u01cf\u01d2\5c\62\2\u01d0\u01d2"+
		"\5e\63\2\u01d1\u01cd\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2"+
		"b\3\2\2\2\u01d3\u01d4\7^\2\2\u01d4\u01df\5/\30\2\u01d5\u01d6\7^\2\2\u01d6"+
		"\u01d7\5/\30\2\u01d7\u01d8\5/\30\2\u01d8\u01df\3\2\2\2\u01d9\u01da\7^"+
		"\2\2\u01da\u01db\5g\64\2\u01db\u01dc\5/\30\2\u01dc\u01dd\5/\30\2\u01dd"+
		"\u01df\3\2\2\2\u01de\u01d3\3\2\2\2\u01de\u01d5\3\2\2\2\u01de\u01d9\3\2"+
		"\2\2\u01dfd\3\2\2\2\u01e0\u01e1\7^\2\2\u01e1\u01e2\7w\2\2\u01e2\u01e3"+
		"\5%\23\2\u01e3\u01e4\5%\23\2\u01e4\u01e5\5%\23\2\u01e5\u01e6\5%\23\2\u01e6"+
		"f\3\2\2\2\u01e7\u01e8\t\21\2\2\u01e8h\3\2\2\2\u01e9\u01ea\7p\2\2\u01ea"+
		"\u01eb\7w\2\2\u01eb\u01ec\7n\2\2\u01ec\u01ed\7n\2\2\u01edj\3\2\2\2\u01ee"+
		"\u01ef\7k\2\2\u01ef\u01f0\7h\2\2\u01f0l\3\2\2\2\u01f1\u01f2\7h\2\2\u01f2"+
		"\u01f3\7q\2\2\u01f3\u01f4\7t\2\2\u01f4\u01f5\7g\2\2\u01f5\u01f6\7c\2\2"+
		"\u01f6\u01f7\7e\2\2\u01f7\u01f8\7j\2\2\u01f8n\3\2\2\2\u01f9\u01fa\7*\2"+
		"\2\u01fap\3\2\2\2\u01fb\u01fc\7+\2\2\u01fcr\3\2\2\2\u01fd\u01fe\7}\2\2"+
		"\u01fet\3\2\2\2\u01ff\u0200\7\177\2\2\u0200v\3\2\2\2\u0201\u0202\7]\2"+
		"\2\u0202x\3\2\2\2\u0203\u0204\7_\2\2\u0204z\3\2\2\2\u0205\u0206\7=\2\2"+
		"\u0206|\3\2\2\2\u0207\u0208\7.\2\2\u0208~\3\2\2\2\u0209\u020a\7\60\2\2"+
		"\u020a\u0080\3\2\2\2\u020b\u020c\7?\2\2\u020c\u0082\3\2\2\2\u020d\u020e"+
		"\7@\2\2\u020e\u0084\3\2\2\2\u020f\u0210\7>\2\2\u0210\u0086\3\2\2\2\u0211"+
		"\u0212\7#\2\2\u0212\u0088\3\2\2\2\u0213\u0214\7\u0080\2\2\u0214\u008a"+
		"\3\2\2\2\u0215\u0216\7A\2\2\u0216\u008c\3\2\2\2\u0217\u0218\7<\2\2\u0218"+
		"\u008e\3\2\2\2\u0219\u021a\7?\2\2\u021a\u021b\7?\2\2\u021b\u0090\3\2\2"+
		"\2\u021c\u021d\7>\2\2\u021d\u021e\7?\2\2\u021e\u0092\3\2\2\2\u021f\u0220"+
		"\7@\2\2\u0220\u0221\7?\2\2\u0221\u0094\3\2\2\2\u0222\u0223\7#\2\2\u0223"+
		"\u0224\7?\2\2\u0224\u0096\3\2\2\2\u0225\u0226\7(\2\2\u0226\u0227\7(\2"+
		"\2\u0227\u0098\3\2\2\2\u0228\u0229\7~\2\2\u0229\u022a\7~\2\2\u022a\u009a"+
		"\3\2\2\2\u022b\u022c\7-\2\2\u022c\u022d\7-\2\2\u022d\u009c\3\2\2\2\u022e"+
		"\u022f\7/\2\2\u022f\u0230\7/\2\2\u0230\u009e\3\2\2\2\u0231\u0232\7-\2"+
		"\2\u0232\u00a0\3\2\2\2\u0233\u0234\7/\2\2\u0234\u00a2\3\2\2\2\u0235\u0236"+
		"\7,\2\2\u0236\u00a4\3\2\2\2\u0237\u0238\7\61\2\2\u0238\u00a6\3\2\2\2\u0239"+
		"\u023a\7(\2\2\u023a\u00a8\3\2\2\2\u023b\u023c\7~\2\2\u023c\u00aa\3\2\2"+
		"\2\u023d\u023e\7`\2\2\u023e\u00ac\3\2\2\2\u023f\u0240\7\'\2\2\u0240\u00ae"+
		"\3\2\2\2\u0241\u0242\7-\2\2\u0242\u0243\7?\2\2\u0243\u00b0\3\2\2\2\u0244"+
		"\u0245\7/\2\2\u0245\u0246\7?\2\2\u0246\u00b2\3\2\2\2\u0247\u0248\7,\2"+
		"\2\u0248\u0249\7?\2\2\u0249\u00b4\3\2\2\2\u024a\u024b\7\61\2\2\u024b\u024c"+
		"\7?\2\2\u024c\u00b6\3\2\2\2\u024d\u024e\7(\2\2\u024e\u024f\7?\2\2\u024f"+
		"\u00b8\3\2\2\2\u0250\u0251\7~\2\2\u0251\u0252\7?\2\2\u0252\u00ba\3\2\2"+
		"\2\u0253\u0254\7`\2\2\u0254\u0255\7?\2\2\u0255\u00bc\3\2\2\2\u0256\u0257"+
		"\7\'\2\2\u0257\u0258\7?\2\2\u0258\u00be\3\2\2\2\u0259\u025a\7>\2\2\u025a"+
		"\u025b\7>\2\2\u025b\u025c\7?\2\2\u025c\u00c0\3\2\2\2\u025d\u025e\7@\2"+
		"\2\u025e\u025f\7@\2\2\u025f\u0260\7?\2\2\u0260\u00c2\3\2\2\2\u0261\u0262"+
		"\7@\2\2\u0262\u0263\7@\2\2\u0263\u0264\7@\2\2\u0264\u0265\7?\2\2\u0265"+
		"\u00c4\3\2\2\2\u0266\u026a\5\u00c7d\2\u0267\u0269\5\u00c9e\2\u0268\u0267"+
		"\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u00c6\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u0274\t\22\2\2\u026e\u026f\n"+
		"\23\2\2\u026f\u0274\6d\2\2\u0270\u0271\t\24\2\2\u0271\u0272\t\25\2\2\u0272"+
		"\u0274\6d\3\2\u0273\u026d\3\2\2\2\u0273\u026e\3\2\2\2\u0273\u0270\3\2"+
		"\2\2\u0274\u00c8\3\2\2\2\u0275\u027c\t\26\2\2\u0276\u0277\n\27\2\2\u0277"+
		"\u027c\6e\4\2\u0278\u0279\t\30\2\2\u0279\u027a\t\31\2\2\u027a\u027c\6"+
		"e\5\2\u027b\u0275\3\2\2\2\u027b\u0276\3\2\2\2\u027b\u0278\3\2\2\2\u027c"+
		"\u00ca\3\2\2\2\u027d\u027e\7B\2\2\u027e\u00cc\3\2\2\2\u027f\u0280\7\60"+
		"\2\2\u0280\u0281\7\60\2\2\u0281\u0282\7\60\2\2\u0282\u00ce\3\2\2\2\u0283"+
		"\u0285\t\32\2\2\u0284\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0284\3"+
		"\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\bh\2\2\u0289"+
		"\u00d0\3\2\2\2\u028a\u028b\7\61\2\2\u028b\u028c\7,\2\2\u028c\u0290\3\2"+
		"\2\2\u028d\u028f\13\2\2\2\u028e\u028d\3\2\2\2\u028f\u0292\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u0293\3\2\2\2\u0292\u0290\3\2"+
		"\2\2\u0293\u0294\7,\2\2\u0294\u0295\7\61\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u0297\bi\3\2\u0297\u00d2\3\2\2\2\u0298\u0299\7\61\2\2\u0299\u029a\7\61"+
		"\2\2\u029a\u029e\3\2\2\2\u029b\u029d\n\33\2\2\u029c\u029b\3\2\2\2\u029d"+
		"\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\3\2"+
		"\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a2\bj\4\2\u02a2\u00d4\3\2\2\28\2\u00e2"+
		"\u00e6\u00ea\u00ee\u00f2\u00f9\u00fe\u0100\u0104\u0107\u010b\u0112\u0116"+
		"\u011b\u0123\u0126\u012d\u0131\u0135\u013b\u013e\u0145\u0149\u0151\u0154"+
		"\u015b\u015f\u0163\u0168\u016b\u016e\u0173\u0176\u017b\u0180\u0188\u0193"+
		"\u0197\u019c\u01a0\u01b0\u01ba\u01c0\u01c7\u01cb\u01d1\u01de\u026a\u0273"+
		"\u027b\u0286\u0290\u029e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}