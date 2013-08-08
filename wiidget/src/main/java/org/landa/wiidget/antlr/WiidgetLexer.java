// Generated from D:\projects\wiidget\src\main\java\landa\wiidget\antlr\Wiidget.g4 by ANTLR 4.0
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
		IMPORT=1, IntegerLiteral=2, FloatingPointLiteral=3, BooleanLiteral=4, 
		CharacterLiteral=5, StringLiteral=6, NullLiteral=7, IF=8, FOREACH=9, LPAREN=10, 
		RPAREN=11, LBRACE=12, RBRACE=13, LBRACK=14, RBRACK=15, SEMI=16, COMMA=17, 
		DOT=18, ASSIGN=19, GT=20, LT=21, BANG=22, TILDE=23, QUESTION=24, COLON=25, 
		EQUAL=26, LE=27, GE=28, NOTEQUAL=29, AND=30, OR=31, INC=32, DEC=33, ADD=34, 
		SUB=35, MUL=36, DIV=37, BITAND=38, BITOR=39, CARET=40, MOD=41, ADD_ASSIGN=42, 
		SUB_ASSIGN=43, MUL_ASSIGN=44, DIV_ASSIGN=45, AND_ASSIGN=46, OR_ASSIGN=47, 
		XOR_ASSIGN=48, MOD_ASSIGN=49, LSHIFT_ASSIGN=50, RSHIFT_ASSIGN=51, URSHIFT_ASSIGN=52, 
		Identifier=53, AT=54, ELLIPSIS=55, WS=56, COMMENT=57, LINE_COMMENT=58;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'import'", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "'null'", "'if'", "'foreach'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
		"'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
		"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
		"'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"IMPORT", "IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", 
		"Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
		"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
		"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitsAndUnderscores", 
		"OctalDigitOrUnderscore", "BinaryNumeral", "BinaryDigits", "BinaryDigit", 
		"BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", "FloatingPointLiteral", 
		"DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", "HexSignificand", 
		"BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", "CharacterLiteral", 
		"SingleCharacter", "StringLiteral", "StringCharacters", "StringCharacter", 
		"EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", "NullLiteral", 
		"IF", "FOREACH", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", 
		"JavaLetter", "JavaLetterOrDigit", "AT", "ELLIPSIS", "WS", "COMMENT", 
		"LINE_COMMENT"
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
		case 97: JavaLetter_action((RuleContext)_localctx, actionIndex); break;

		case 98: JavaLetterOrDigit_action((RuleContext)_localctx, actionIndex); break;

		case 101: WS_action((RuleContext)_localctx, actionIndex); break;

		case 102: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 103: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		case 97: return JavaLetter_sempred((RuleContext)_localctx, predIndex);

		case 98: return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
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
		"\2\4<\u029f\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
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
		"h\th\4i\ti\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u00df\n\3\3"+
		"\4\3\4\5\4\u00e3\n\4\3\5\3\5\5\5\u00e7\n\5\3\6\3\6\5\6\u00eb\n\6\3\7\3"+
		"\7\5\7\u00ef\n\7\3\b\3\b\3\t\3\t\3\t\5\t\u00f6\n\t\3\t\3\t\3\t\5\t\u00fb"+
		"\n\t\5\t\u00fd\n\t\3\n\3\n\5\n\u0101\n\n\3\n\5\n\u0104\n\n\3\13\3\13\5"+
		"\13\u0108\n\13\3\f\3\f\3\r\6\r\u010d\n\r\r\r\16\r\u010e\3\16\3\16\5\16"+
		"\u0113\n\16\3\17\6\17\u0116\n\17\r\17\16\17\u0117\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\5\21\u0120\n\21\3\21\5\21\u0123\n\21\3\22\3\22\3\23\6\23\u0128"+
		"\n\23\r\23\16\23\u0129\3\24\3\24\5\24\u012e\n\24\3\25\3\25\5\25\u0132"+
		"\n\25\3\25\3\25\3\26\3\26\5\26\u0138\n\26\3\26\5\26\u013b\n\26\3\27\3"+
		"\27\3\30\6\30\u0140\n\30\r\30\16\30\u0141\3\31\3\31\5\31\u0146\n\31\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\5\33\u014e\n\33\3\33\5\33\u0151\n\33\3\34"+
		"\3\34\3\35\6\35\u0156\n\35\r\35\16\35\u0157\3\36\3\36\5\36\u015c\n\36"+
		"\3\37\3\37\5\37\u0160\n\37\3 \3 \3 \5 \u0165\n \3 \5 \u0168\n \3 \5 \u016b"+
		"\n \3 \3 \3 \5 \u0170\n \3 \5 \u0173\n \3 \3 \3 \5 \u0178\n \3 \3 \3 "+
		"\5 \u017d\n \3!\3!\3!\3\"\3\"\3#\5#\u0185\n#\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"&\5&\u0190\n&\3\'\3\'\5\'\u0194\n\'\3\'\3\'\3\'\5\'\u0199\n\'\3\'\3\'"+
		"\5\'\u019d\n\'\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01ad\n*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\5+\u01b7\n+\3,\3,\3-\3-\5-\u01bd\n-\3-\3-\3.\6"+
		".\u01c2\n.\r.\16.\u01c3\3/\3/\5/\u01c8\n/\3\60\3\60\3\60\3\60\5\60\u01ce"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01db"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C"+
		"\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L"+
		"\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V"+
		"\3V\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\3]\3]\3]"+
		"\3^\3^\3^\3_\3_\3_\3_\3`\3`\3`\3`\3a\3a\3a\3a\3a\3b\3b\7b\u0265\nb\fb"+
		"\16b\u0268\13b\3c\3c\3c\3c\3c\3c\5c\u0270\nc\3d\3d\3d\3d\3d\3d\5d\u0278"+
		"\nd\3e\3e\3f\3f\3f\3f\3g\6g\u0281\ng\rg\16g\u0282\3g\3g\3h\3h\3h\3h\7"+
		"h\u028b\nh\fh\16h\u028e\13h\3h\3h\3h\3h\3h\3i\3i\3i\3i\7i\u0299\ni\fi"+
		"\16i\u029c\13i\3i\3i\3\u028cj\3\3\1\5\4\1\7\2\1\t\2\1\13\2\1\r\2\1\17"+
		"\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\2\1\37\2\1!\2\1#\2\1"+
		"%\2\1\'\2\1)\2\1+\2\1-\2\1/\2\1\61\2\1\63\2\1\65\2\1\67\2\19\2\1;\2\1"+
		"=\5\1?\2\1A\2\1C\2\1E\2\1G\2\1I\2\1K\2\1M\2\1O\2\1Q\2\1S\6\1U\7\1W\2\1"+
		"Y\b\1[\2\1]\2\1_\2\1a\2\1c\2\1e\2\1g\t\1i\n\1k\13\1m\f\1o\r\1q\16\1s\17"+
		"\1u\20\1w\21\1y\22\1{\23\1}\24\1\177\25\1\u0081\26\1\u0083\27\1\u0085"+
		"\30\1\u0087\31\1\u0089\32\1\u008b\33\1\u008d\34\1\u008f\35\1\u0091\36"+
		"\1\u0093\37\1\u0095 \1\u0097!\1\u0099\"\1\u009b#\1\u009d$\1\u009f%\1\u00a1"+
		"&\1\u00a3\'\1\u00a5(\1\u00a7)\1\u00a9*\1\u00ab+\1\u00ad,\1\u00af-\1\u00b1"+
		".\1\u00b3/\1\u00b5\60\1\u00b7\61\1\u00b9\62\1\u00bb\63\1\u00bd\64\1\u00bf"+
		"\65\1\u00c1\66\1\u00c3\67\1\u00c5\2\1\u00c7\2\1\u00c98\1\u00cb9\1\u00cd"+
		":\2\u00cf;\3\u00d1<\4\3\2\34\4NNnn\3\63;\4ZZzz\5\62;CHch\3\629\4DDdd\3"+
		"\62\63\4GGgg\4--//\6FFHHffhh\4ZZzz\4RRrr\4))^^\4$$^^\n$$))^^ddhhppttv"+
		"v\3\62\65\6&&C\\aac|\4\2\u0101\ud802\udc01\3\ud802\udc01\3\udc02\ue001"+
		"\7&&\62;C\\aac|\4\2\u0101\ud802\udc01\3\ud802\udc01\3\udc02\ue001\5\13"+
		"\f\16\17\"\"\4\f\f\17\17\u02ad\2\3\3\2\2\2\2\5\3\2\2\2\2=\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2Y\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1"+
		"\3\2\2\2\3\u00d3\3\2\2\2\5\u00de\3\2\2\2\7\u00e0\3\2\2\2\t\u00e4\3\2\2"+
		"\2\13\u00e8\3\2\2\2\r\u00ec\3\2\2\2\17\u00f0\3\2\2\2\21\u00fc\3\2\2\2"+
		"\23\u00fe\3\2\2\2\25\u0107\3\2\2\2\27\u0109\3\2\2\2\31\u010c\3\2\2\2\33"+
		"\u0112\3\2\2\2\35\u0115\3\2\2\2\37\u0119\3\2\2\2!\u011d\3\2\2\2#\u0124"+
		"\3\2\2\2%\u0127\3\2\2\2\'\u012d\3\2\2\2)\u012f\3\2\2\2+\u0135\3\2\2\2"+
		"-\u013c\3\2\2\2/\u013f\3\2\2\2\61\u0145\3\2\2\2\63\u0147\3\2\2\2\65\u014b"+
		"\3\2\2\2\67\u0152\3\2\2\29\u0155\3\2\2\2;\u015b\3\2\2\2=\u015f\3\2\2\2"+
		"?\u017c\3\2\2\2A\u017e\3\2\2\2C\u0181\3\2\2\2E\u0184\3\2\2\2G\u0188\3"+
		"\2\2\2I\u018a\3\2\2\2K\u018c\3\2\2\2M\u019c\3\2\2\2O\u019e\3\2\2\2Q\u01a1"+
		"\3\2\2\2S\u01ac\3\2\2\2U\u01b6\3\2\2\2W\u01b8\3\2\2\2Y\u01ba\3\2\2\2["+
		"\u01c1\3\2\2\2]\u01c7\3\2\2\2_\u01cd\3\2\2\2a\u01da\3\2\2\2c\u01dc\3\2"+
		"\2\2e\u01e3\3\2\2\2g\u01e5\3\2\2\2i\u01ea\3\2\2\2k\u01ed\3\2\2\2m\u01f5"+
		"\3\2\2\2o\u01f7\3\2\2\2q\u01f9\3\2\2\2s\u01fb\3\2\2\2u\u01fd\3\2\2\2w"+
		"\u01ff\3\2\2\2y\u0201\3\2\2\2{\u0203\3\2\2\2}\u0205\3\2\2\2\177\u0207"+
		"\3\2\2\2\u0081\u0209\3\2\2\2\u0083\u020b\3\2\2\2\u0085\u020d\3\2\2\2\u0087"+
		"\u020f\3\2\2\2\u0089\u0211\3\2\2\2\u008b\u0213\3\2\2\2\u008d\u0215\3\2"+
		"\2\2\u008f\u0218\3\2\2\2\u0091\u021b\3\2\2\2\u0093\u021e\3\2\2\2\u0095"+
		"\u0221\3\2\2\2\u0097\u0224\3\2\2\2\u0099\u0227\3\2\2\2\u009b\u022a\3\2"+
		"\2\2\u009d\u022d\3\2\2\2\u009f\u022f\3\2\2\2\u00a1\u0231\3\2\2\2\u00a3"+
		"\u0233\3\2\2\2\u00a5\u0235\3\2\2\2\u00a7\u0237\3\2\2\2\u00a9\u0239\3\2"+
		"\2\2\u00ab\u023b\3\2\2\2\u00ad\u023d\3\2\2\2\u00af\u0240\3\2\2\2\u00b1"+
		"\u0243\3\2\2\2\u00b3\u0246\3\2\2\2\u00b5\u0249\3\2\2\2\u00b7\u024c\3\2"+
		"\2\2\u00b9\u024f\3\2\2\2\u00bb\u0252\3\2\2\2\u00bd\u0255\3\2\2\2\u00bf"+
		"\u0259\3\2\2\2\u00c1\u025d\3\2\2\2\u00c3\u0262\3\2\2\2\u00c5\u026f\3\2"+
		"\2\2\u00c7\u0277\3\2\2\2\u00c9\u0279\3\2\2\2\u00cb\u027b\3\2\2\2\u00cd"+
		"\u0280\3\2\2\2\u00cf\u0286\3\2\2\2\u00d1\u0294\3\2\2\2\u00d3\u00d4\7k"+
		"\2\2\u00d4\u00d5\7o\2\2\u00d5\u00d6\7r\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8"+
		"\7t\2\2\u00d8\u00d9\7v\2\2\u00d9\4\3\2\2\2\u00da\u00df\5\7\4\2\u00db\u00df"+
		"\5\t\5\2\u00dc\u00df\5\13\6\2\u00dd\u00df\5\r\7\2\u00de\u00da\3\2\2\2"+
		"\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\6\3"+
		"\2\2\2\u00e0\u00e2\5\21\t\2\u00e1\u00e3\5\17\b\2\u00e2\u00e1\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\b\3\2\2\2\u00e4\u00e6\5\37\20\2\u00e5\u00e7\5\17"+
		"\b\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\n\3\2\2\2\u00e8\u00ea"+
		"\5)\25\2\u00e9\u00eb\5\17\b\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2"+
		"\u00eb\f\3\2\2\2\u00ec\u00ee\5\63\32\2\u00ed\u00ef\5\17\b\2\u00ee\u00ed"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\16\3\2\2\2\u00f0\u00f1\t\2\2\2\u00f1"+
		"\20\3\2\2\2\u00f2\u00fd\7\62\2\2\u00f3\u00fa\5\27\f\2\u00f4\u00f6\5\23"+
		"\n\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fb\3\2\2\2\u00f7"+
		"\u00f8\5\35\17\2\u00f8\u00f9\5\23\n\2\u00f9\u00fb\3\2\2\2\u00fa\u00f5"+
		"\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f2\3\2\2\2\u00fc"+
		"\u00f3\3\2\2\2\u00fd\22\3\2\2\2\u00fe\u0103\5\25\13\2\u00ff\u0101\5\31"+
		"\r\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0104\5\25\13\2\u0103\u0100\3\2\2\2\u0103\u0104\3\2\2\2\u0104\24\3\2"+
		"\2\2\u0105\u0108\7\62\2\2\u0106\u0108\5\27\f\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\26\3\2\2\2\u0109\u010a\t\3\2\2\u010a\30\3\2\2\2\u010b"+
		"\u010d\5\33\16\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3"+
		"\2\2\2\u010e\u010f\3\2\2\2\u010f\32\3\2\2\2\u0110\u0113\5\25\13\2\u0111"+
		"\u0113\7a\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\34\3\2\2\2"+
		"\u0114\u0116\7a\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\36\3\2\2\2\u0119\u011a\7\62\2\2\u011a"+
		"\u011b\t\4\2\2\u011b\u011c\5!\21\2\u011c \3\2\2\2\u011d\u0122\5#\22\2"+
		"\u011e\u0120\5%\23\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u0123\5#\22\2\u0122\u011f\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\"\3\2\2\2\u0124\u0125\t\5\2\2\u0125$\3\2\2\2\u0126\u0128\5\'\24\2\u0127"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a&\3\2\2\2\u012b\u012e\5#\22\2\u012c\u012e\7a\2\2\u012d\u012b"+
		"\3\2\2\2\u012d\u012c\3\2\2\2\u012e(\3\2\2\2\u012f\u0131\7\62\2\2\u0130"+
		"\u0132\5\35\17\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3"+
		"\2\2\2\u0133\u0134\5+\26\2\u0134*\3\2\2\2\u0135\u013a\5-\27\2\u0136\u0138"+
		"\5/\30\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013b\5-\27\2\u013a\u0137\3\2\2\2\u013a\u013b\3\2\2\2\u013b,\3\2\2\2"+
		"\u013c\u013d\t\6\2\2\u013d.\3\2\2\2\u013e\u0140\5\61\31\2\u013f\u013e"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\60\3\2\2\2\u0143\u0146\5-\27\2\u0144\u0146\7a\2\2\u0145\u0143\3\2\2\2"+
		"\u0145\u0144\3\2\2\2\u0146\62\3\2\2\2\u0147\u0148\7\62\2\2\u0148\u0149"+
		"\t\7\2\2\u0149\u014a\5\65\33\2\u014a\64\3\2\2\2\u014b\u0150\5\67\34\2"+
		"\u014c\u014e\59\35\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0151\5\67\34\2\u0150\u014d\3\2\2\2\u0150\u0151\3\2\2\2"+
		"\u0151\66\3\2\2\2\u0152\u0153\t\b\2\2\u01538\3\2\2\2\u0154\u0156\5;\36"+
		"\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158:\3\2\2\2\u0159\u015c\5\67\34\2\u015a\u015c\7a\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c<\3\2\2\2\u015d\u0160\5? \2\u015e"+
		"\u0160\5K&\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160>\3\2\2\2\u0161"+
		"\u0162\5\23\n\2\u0162\u0164\7\60\2\2\u0163\u0165\5\23\n\2\u0164\u0163"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0168\5A!\2\u0167"+
		"\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u016b\5I"+
		"%\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u017d\3\2\2\2\u016c"+
		"\u016d\7\60\2\2\u016d\u016f\5\23\n\2\u016e\u0170\5A!\2\u016f\u016e\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u0173\5I%\2\u0172\u0171"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u017d\3\2\2\2\u0174\u0175\5\23\n\2"+
		"\u0175\u0177\5A!\2\u0176\u0178\5I%\2\u0177\u0176\3\2\2\2\u0177\u0178\3"+
		"\2\2\2\u0178\u017d\3\2\2\2\u0179\u017a\5\23\n\2\u017a\u017b\5I%\2\u017b"+
		"\u017d\3\2\2\2\u017c\u0161\3\2\2\2\u017c\u016c\3\2\2\2\u017c\u0174\3\2"+
		"\2\2\u017c\u0179\3\2\2\2\u017d@\3\2\2\2\u017e\u017f\5C\"\2\u017f\u0180"+
		"\5E#\2\u0180B\3\2\2\2\u0181\u0182\t\t\2\2\u0182D\3\2\2\2\u0183\u0185\5"+
		"G$\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0187\5\23\n\2\u0187F\3\2\2\2\u0188\u0189\t\n\2\2\u0189H\3\2\2\2\u018a"+
		"\u018b\t\13\2\2\u018bJ\3\2\2\2\u018c\u018d\5M\'\2\u018d\u018f\5O(\2\u018e"+
		"\u0190\5I%\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190L\3\2\2\2\u0191"+
		"\u0193\5\37\20\2\u0192\u0194\7\60\2\2\u0193\u0192\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u019d\3\2\2\2\u0195\u0196\7\62\2\2\u0196\u0198\t\f\2\2"+
		"\u0197\u0199\5!\21\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u019b\7\60\2\2\u019b\u019d\5!\21\2\u019c\u0191\3\2\2\2"+
		"\u019c\u0195\3\2\2\2\u019dN\3\2\2\2\u019e\u019f\5Q)\2\u019f\u01a0\5E#"+
		"\2\u01a0P\3\2\2\2\u01a1\u01a2\t\r\2\2\u01a2R\3\2\2\2\u01a3\u01a4\7v\2"+
		"\2\u01a4\u01a5\7t\2\2\u01a5\u01a6\7w\2\2\u01a6\u01ad\7g\2\2\u01a7\u01a8"+
		"\7h\2\2\u01a8\u01a9\7c\2\2\u01a9\u01aa\7n\2\2\u01aa\u01ab\7u\2\2\u01ab"+
		"\u01ad\7g\2\2\u01ac\u01a3\3\2\2\2\u01ac\u01a7\3\2\2\2\u01adT\3\2\2\2\u01ae"+
		"\u01af\7)\2\2\u01af\u01b0\5W,\2\u01b0\u01b1\7)\2\2\u01b1\u01b7\3\2\2\2"+
		"\u01b2\u01b3\7)\2\2\u01b3\u01b4\5_\60\2\u01b4\u01b5\7)\2\2\u01b5\u01b7"+
		"\3\2\2\2\u01b6\u01ae\3\2\2\2\u01b6\u01b2\3\2\2\2\u01b7V\3\2\2\2\u01b8"+
		"\u01b9\n\16\2\2\u01b9X\3\2\2\2\u01ba\u01bc\7$\2\2\u01bb\u01bd\5[.\2\u01bc"+
		"\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\7$"+
		"\2\2\u01bfZ\3\2\2\2\u01c0\u01c2\5]/\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3"+
		"\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\\\3\2\2\2\u01c5"+
		"\u01c8\n\17\2\2\u01c6\u01c8\5_\60\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3"+
		"\2\2\2\u01c8^\3\2\2\2\u01c9\u01ca\7^\2\2\u01ca\u01ce\t\20\2\2\u01cb\u01ce"+
		"\5a\61\2\u01cc\u01ce\5c\62\2\u01cd\u01c9\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd"+
		"\u01cc\3\2\2\2\u01ce`\3\2\2\2\u01cf\u01d0\7^\2\2\u01d0\u01db\5-\27\2\u01d1"+
		"\u01d2\7^\2\2\u01d2\u01d3\5-\27\2\u01d3\u01d4\5-\27\2\u01d4\u01db\3\2"+
		"\2\2\u01d5\u01d6\7^\2\2\u01d6\u01d7\5e\63\2\u01d7\u01d8\5-\27\2\u01d8"+
		"\u01d9\5-\27\2\u01d9\u01db\3\2\2\2\u01da\u01cf\3\2\2\2\u01da\u01d1\3\2"+
		"\2\2\u01da\u01d5\3\2\2\2\u01dbb\3\2\2\2\u01dc\u01dd\7^\2\2\u01dd\u01de"+
		"\7w\2\2\u01de\u01df\5#\22\2\u01df\u01e0\5#\22\2\u01e0\u01e1\5#\22\2\u01e1"+
		"\u01e2\5#\22\2\u01e2d\3\2\2\2\u01e3\u01e4\t\21\2\2\u01e4f\3\2\2\2\u01e5"+
		"\u01e6\7p\2\2\u01e6\u01e7\7w\2\2\u01e7\u01e8\7n\2\2\u01e8\u01e9\7n\2\2"+
		"\u01e9h\3\2\2\2\u01ea\u01eb\7k\2\2\u01eb\u01ec\7h\2\2\u01ecj\3\2\2\2\u01ed"+
		"\u01ee\7h\2\2\u01ee\u01ef\7q\2\2\u01ef\u01f0\7t\2\2\u01f0\u01f1\7g\2\2"+
		"\u01f1\u01f2\7c\2\2\u01f2\u01f3\7e\2\2\u01f3\u01f4\7j\2\2\u01f4l\3\2\2"+
		"\2\u01f5\u01f6\7*\2\2\u01f6n\3\2\2\2\u01f7\u01f8\7+\2\2\u01f8p\3\2\2\2"+
		"\u01f9\u01fa\7}\2\2\u01far\3\2\2\2\u01fb\u01fc\7\177\2\2\u01fct\3\2\2"+
		"\2\u01fd\u01fe\7]\2\2\u01fev\3\2\2\2\u01ff\u0200\7_\2\2\u0200x\3\2\2\2"+
		"\u0201\u0202\7=\2\2\u0202z\3\2\2\2\u0203\u0204\7.\2\2\u0204|\3\2\2\2\u0205"+
		"\u0206\7\60\2\2\u0206~\3\2\2\2\u0207\u0208\7?\2\2\u0208\u0080\3\2\2\2"+
		"\u0209\u020a\7@\2\2\u020a\u0082\3\2\2\2\u020b\u020c\7>\2\2\u020c\u0084"+
		"\3\2\2\2\u020d\u020e\7#\2\2\u020e\u0086\3\2\2\2\u020f\u0210\7\u0080\2"+
		"\2\u0210\u0088\3\2\2\2\u0211\u0212\7A\2\2\u0212\u008a\3\2\2\2\u0213\u0214"+
		"\7<\2\2\u0214\u008c\3\2\2\2\u0215\u0216\7?\2\2\u0216\u0217\7?\2\2\u0217"+
		"\u008e\3\2\2\2\u0218\u0219\7>\2\2\u0219\u021a\7?\2\2\u021a\u0090\3\2\2"+
		"\2\u021b\u021c\7@\2\2\u021c\u021d\7?\2\2\u021d\u0092\3\2\2\2\u021e\u021f"+
		"\7#\2\2\u021f\u0220\7?\2\2\u0220\u0094\3\2\2\2\u0221\u0222\7(\2\2\u0222"+
		"\u0223\7(\2\2\u0223\u0096\3\2\2\2\u0224\u0225\7~\2\2\u0225\u0226\7~\2"+
		"\2\u0226\u0098\3\2\2\2\u0227\u0228\7-\2\2\u0228\u0229\7-\2\2\u0229\u009a"+
		"\3\2\2\2\u022a\u022b\7/\2\2\u022b\u022c\7/\2\2\u022c\u009c\3\2\2\2\u022d"+
		"\u022e\7-\2\2\u022e\u009e\3\2\2\2\u022f\u0230\7/\2\2\u0230\u00a0\3\2\2"+
		"\2\u0231\u0232\7,\2\2\u0232\u00a2\3\2\2\2\u0233\u0234\7\61\2\2\u0234\u00a4"+
		"\3\2\2\2\u0235\u0236\7(\2\2\u0236\u00a6\3\2\2\2\u0237\u0238\7~\2\2\u0238"+
		"\u00a8\3\2\2\2\u0239\u023a\7`\2\2\u023a\u00aa\3\2\2\2\u023b\u023c\7\'"+
		"\2\2\u023c\u00ac\3\2\2\2\u023d\u023e\7-\2\2\u023e\u023f\7?\2\2\u023f\u00ae"+
		"\3\2\2\2\u0240\u0241\7/\2\2\u0241\u0242\7?\2\2\u0242\u00b0\3\2\2\2\u0243"+
		"\u0244\7,\2\2\u0244\u0245\7?\2\2\u0245\u00b2\3\2\2\2\u0246\u0247\7\61"+
		"\2\2\u0247\u0248\7?\2\2\u0248\u00b4\3\2\2\2\u0249\u024a\7(\2\2\u024a\u024b"+
		"\7?\2\2\u024b\u00b6\3\2\2\2\u024c\u024d\7~\2\2\u024d\u024e\7?\2\2\u024e"+
		"\u00b8\3\2\2\2\u024f\u0250\7`\2\2\u0250\u0251\7?\2\2\u0251\u00ba\3\2\2"+
		"\2\u0252\u0253\7\'\2\2\u0253\u0254\7?\2\2\u0254\u00bc\3\2\2\2\u0255\u0256"+
		"\7>\2\2\u0256\u0257\7>\2\2\u0257\u0258\7?\2\2\u0258\u00be\3\2\2\2\u0259"+
		"\u025a\7@\2\2\u025a\u025b\7@\2\2\u025b\u025c\7?\2\2\u025c\u00c0\3\2\2"+
		"\2\u025d\u025e\7@\2\2\u025e\u025f\7@\2\2\u025f\u0260\7@\2\2\u0260\u0261"+
		"\7?\2\2\u0261\u00c2\3\2\2\2\u0262\u0266\5\u00c5c\2\u0263\u0265\5\u00c7"+
		"d\2\u0264\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267\u00c4\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u0270\t\22"+
		"\2\2\u026a\u026b\n\23\2\2\u026b\u0270\6c\2\2\u026c\u026d\t\24\2\2\u026d"+
		"\u026e\t\25\2\2\u026e\u0270\6c\3\2\u026f\u0269\3\2\2\2\u026f\u026a\3\2"+
		"\2\2\u026f\u026c\3\2\2\2\u0270\u00c6\3\2\2\2\u0271\u0278\t\26\2\2\u0272"+
		"\u0273\n\27\2\2\u0273\u0278\6d\4\2\u0274\u0275\t\30\2\2\u0275\u0276\t"+
		"\31\2\2\u0276\u0278\6d\5\2\u0277\u0271\3\2\2\2\u0277\u0272\3\2\2\2\u0277"+
		"\u0274\3\2\2\2\u0278\u00c8\3\2\2\2\u0279\u027a\7B\2\2\u027a\u00ca\3\2"+
		"\2\2\u027b\u027c\7\60\2\2\u027c\u027d\7\60\2\2\u027d\u027e\7\60\2\2\u027e"+
		"\u00cc\3\2\2\2\u027f\u0281\t\32\2\2\u0280\u027f\3\2\2\2\u0281\u0282\3"+
		"\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0285\bg\2\2\u0285\u00ce\3\2\2\2\u0286\u0287\7\61\2\2\u0287\u0288\7,"+
		"\2\2\u0288\u028c\3\2\2\2\u0289\u028b\13\2\2\2\u028a\u0289\3\2\2\2\u028b"+
		"\u028e\3\2\2\2\u028c\u028d\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u028f\3\2"+
		"\2\2\u028e\u028c\3\2\2\2\u028f\u0290\7,\2\2\u0290\u0291\7\61\2\2\u0291"+
		"\u0292\3\2\2\2\u0292\u0293\bh\3\2\u0293\u00d0\3\2\2\2\u0294\u0295\7\61"+
		"\2\2\u0295\u0296\7\61\2\2\u0296\u029a\3\2\2\2\u0297\u0299\n\33\2\2\u0298"+
		"\u0297\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029b\u029d\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029e\bi\4\2\u029e"+
		"\u00d2\3\2\2\28\2\u00de\u00e2\u00e6\u00ea\u00ee\u00f5\u00fa\u00fc\u0100"+
		"\u0103\u0107\u010e\u0112\u0117\u011f\u0122\u0129\u012d\u0131\u0137\u013a"+
		"\u0141\u0145\u014d\u0150\u0157\u015b\u015f\u0164\u0167\u016a\u016f\u0172"+
		"\u0177\u017c\u0184\u018f\u0193\u0198\u019c\u01ac\u01b6\u01bc\u01c3\u01c7"+
		"\u01cd\u01da\u0266\u026f\u0277\u0282\u028c\u029a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}