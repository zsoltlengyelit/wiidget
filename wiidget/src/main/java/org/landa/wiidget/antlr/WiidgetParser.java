// Generated from D:\projects\wiidget\src\main\java\landa\wiidget\antlr\Wiidget.g4 by ANTLR 4.0
package org.landa.wiidget.antlr;

import java.util.List;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class WiidgetParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int IMPORT = 1, IntegerLiteral = 2, FloatingPointLiteral = 3, BooleanLiteral = 4, CharacterLiteral = 5, StringLiteral = 6, NullLiteral = 7, IF = 8, FOREACH = 9, LPAREN = 10,
			RPAREN = 11, LBRACE = 12, RBRACE = 13, LBRACK = 14, RBRACK = 15, SEMI = 16, COMMA = 17, DOT = 18, ASSIGN = 19, GT = 20, LT = 21, BANG = 22, TILDE = 23, QUESTION = 24, COLON = 25,
			EQUAL = 26, LE = 27, GE = 28, NOTEQUAL = 29, AND = 30, OR = 31, INC = 32, DEC = 33, ADD = 34, SUB = 35, MUL = 36, DIV = 37, BITAND = 38, BITOR = 39, CARET = 40, MOD = 41, ADD_ASSIGN = 42,
			SUB_ASSIGN = 43, MUL_ASSIGN = 44, DIV_ASSIGN = 45, AND_ASSIGN = 46, OR_ASSIGN = 47, XOR_ASSIGN = 48, MOD_ASSIGN = 49, LSHIFT_ASSIGN = 50, RSHIFT_ASSIGN = 51, URSHIFT_ASSIGN = 52,
			Identifier = 53, AT = 54, ELLIPSIS = 55, WS = 56, COMMENT = 57, LINE_COMMENT = 58;
	public static final String[] tokenNames = { "<INVALID>", "'import'", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", "'null'", "'if'",
			"'foreach'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'",
			"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'",
			"WS", "COMMENT", "LINE_COMMENT" };
	public static final int RULE_compilationUnit = 0, RULE_statementDeclaration = 1, RULE_controlStatement = 2, RULE_ifControl = 3, RULE_foreachControl = 4, RULE_foreachVariable = 5,
			RULE_widgetDeclaration = 6, RULE_widgetName = 7, RULE_widgetArguments = 8, RULE_elementValuePairs = 9, RULE_elementValuePair = 10, RULE_elementValue = 11,
			RULE_elementValueArrayInitializer = 12, RULE_importDeclaration = 13, RULE_jokerImport = 14, RULE_widgetBody = 15, RULE_qualifiedName = 16, RULE_literal = 17, RULE_parExpression = 18,
			RULE_expressionList = 19, RULE_statementExpression = 20, RULE_constantExpression = 21, RULE_booleanExpression = 22, RULE_booleanExpressionPart = 23, RULE_expression = 24,
			RULE_superSuffix = 25, RULE_arguments = 26;
	public static final String[] ruleNames = { "compilationUnit", "statementDeclaration", "controlStatement", "ifControl", "foreachControl", "foreachVariable", "widgetDeclaration", "widgetName",
			"widgetArguments", "elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer", "importDeclaration", "jokerImport", "widgetBody", "qualifiedName", "literal",
			"parExpression", "expressionList", "statementExpression", "constantExpression", "booleanExpression", "booleanExpressionPart", "expression", "superSuffix", "arguments" };

	@Override
	public String getGrammarFileName() {
		return "Wiidget.g4";
	}

	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public WiidgetParser(final TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
		_errHandler = new WiidgetErrorStrategy(); // user own error strategy
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration(final int i) {
			return getRuleContext(ImportDeclarationContext.class, i);
		}

		public TerminalNode EOF() {
			return getToken(WiidgetParser.EOF, 0);
		}

		public List<StatementDeclarationContext> statementDeclaration() {
			return getRuleContexts(StatementDeclarationContext.class);
		}

		public StatementDeclarationContext statementDeclaration(final int i) {
			return getRuleContext(StatementDeclarationContext.class, i);
		}

		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}

		public CompilationUnitContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_compilationUnit;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterCompilationUnit(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitCompilationUnit(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitCompilationUnit(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		final CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == IMPORT) {
					{
						{
							setState(54);
							importDeclaration();
						}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << LBRACE) | (1L << SEMI) | (1L << Identifier))) != 0)) {
					{
						{
							setState(60);
							statementDeclaration();
						}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(EOF);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementDeclarationContext extends ParserRuleContext {
		public ControlStatementContext controlStatement() {
			return getRuleContext(ControlStatementContext.class, 0);
		}

		public WidgetDeclarationContext widgetDeclaration() {
			return getRuleContext(WidgetDeclarationContext.class, 0);
		}

		public StatementDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statementDeclaration;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterStatementDeclaration(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitStatementDeclaration(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitStatementDeclaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final StatementDeclarationContext statementDeclaration() throws RecognitionException {
		final StatementDeclarationContext _localctx = new StatementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementDeclaration);
		try {
			setState(70);
			switch (_input.LA(1)) {
			case IF:
			case FOREACH:
			case LBRACE:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
					setState(68);
					controlStatement();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
					setState(69);
					widgetDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlStatementContext extends ParserRuleContext {
		public ForeachControlContext foreachControl() {
			return getRuleContext(ForeachControlContext.class, 0);
		}

		public IfControlContext ifControl() {
			return getRuleContext(IfControlContext.class, 0);
		}

		public WidgetBodyContext widgetBody() {
			return getRuleContext(WidgetBodyContext.class, 0);
		}

		public ControlStatementContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_controlStatement;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterControlStatement(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitControlStatement(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitControlStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ControlStatementContext controlStatement() throws RecognitionException {
		final ControlStatementContext _localctx = new ControlStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_controlStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(75);
				switch (_input.LA(1)) {
				case IF: {
					setState(72);
					ifControl();
				}
					break;
				case LBRACE:
				case SEMI: {
				}
					break;
				case FOREACH: {
					setState(74);
					foreachControl();
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77);
				widgetBody();
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfControlContext extends ParserRuleContext {
		public TerminalNode RPAREN() {
			return getToken(WiidgetParser.RPAREN, 0);
		}

		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(WiidgetParser.LPAREN, 0);
		}

		public TerminalNode IF() {
			return getToken(WiidgetParser.IF, 0);
		}

		public IfControlContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifControl;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterIfControl(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitIfControl(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitIfControl(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final IfControlContext ifControl() throws RecognitionException {
		final IfControlContext _localctx = new IfControlContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(79);
				match(IF);
				setState(80);
				match(LPAREN);
				setState(81);
				booleanExpression();
				setState(82);
				match(RPAREN);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachControlContext extends ParserRuleContext {
		public TerminalNode RPAREN() {
			return getToken(WiidgetParser.RPAREN, 0);
		}

		public TerminalNode FOREACH() {
			return getToken(WiidgetParser.FOREACH, 0);
		}

		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class, 0);
		}

		public ForeachVariableContext foreachVariable() {
			return getRuleContext(ForeachVariableContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(WiidgetParser.LPAREN, 0);
		}

		public ForeachControlContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_foreachControl;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterForeachControl(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitForeachControl(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitForeachControl(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ForeachControlContext foreachControl() throws RecognitionException {
		final ForeachControlContext _localctx = new ForeachControlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_foreachControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(84);
				match(FOREACH);
				setState(85);
				match(LPAREN);
				setState(86);
				foreachVariable();
				setState(87);
				match(COLON);
				setState(88);
				qualifiedName();
				setState(89);
				match(RPAREN);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(WiidgetParser.Identifier, 0);
		}

		public ForeachVariableContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_foreachVariable;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterForeachVariable(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitForeachVariable(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitForeachVariable(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ForeachVariableContext foreachVariable() throws RecognitionException {
		final ForeachVariableContext _localctx = new ForeachVariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_foreachVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(91);
				match(Identifier);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetDeclarationContext extends ParserRuleContext {
		public WidgetNameContext widgetName() {
			return getRuleContext(WidgetNameContext.class, 0);
		}

		public WidgetArgumentsContext widgetArguments() {
			return getRuleContext(WidgetArgumentsContext.class, 0);
		}

		public WidgetBodyContext widgetBody() {
			return getRuleContext(WidgetBodyContext.class, 0);
		}

		public WidgetDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_widgetDeclaration;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterWidgetDeclaration(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitWidgetDeclaration(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitWidgetDeclaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final WidgetDeclarationContext widgetDeclaration() throws RecognitionException {
		final WidgetDeclarationContext _localctx = new WidgetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_widgetDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(93);
				widgetName();
				setState(95);
				_la = _input.LA(1);
				if (_la == LPAREN) {
					{
						setState(94);
						widgetArguments();
					}
				}

				setState(97);
				widgetBody();
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class, 0);
		}

		public WidgetNameContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_widgetName;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterWidgetName(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitWidgetName(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitWidgetName(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final WidgetNameContext widgetName() throws RecognitionException {
		final WidgetNameContext _localctx = new WidgetNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_widgetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(99);
				qualifiedName();
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetArgumentsContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class, 0);
		}

		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class, 0);
		}

		public WidgetArgumentsContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_widgetArguments;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterWidgetArguments(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitWidgetArguments(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitWidgetArguments(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final WidgetArgumentsContext widgetArguments() throws RecognitionException {
		final WidgetArgumentsContext _localctx = new WidgetArgumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_widgetArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(101);
				match(LPAREN);
				setState(104);
				switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
				case 1: {
					setState(102);
					elementValuePairs();
				}
					break;

				case 2: {
					setState(103);
					elementValue();
				}
					break;
				}
				setState(106);
				match(RPAREN);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair(final int i) {
			return getRuleContext(ElementValuePairContext.class, i);
		}

		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}

		public ElementValuePairsContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValuePairs;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterElementValuePairs(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitElementValuePairs(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitElementValuePairs(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		final ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(108);
				elementValuePair();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(109);
							match(COMMA);
							setState(110);
							elementValuePair();
						}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(WiidgetParser.Identifier, 0);
		}

		public ElementValuePairContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValuePair;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterElementValuePair(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitElementValuePair(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitElementValuePair(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		final ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(116);
				match(Identifier);
				setState(117);
				match(ASSIGN);
				setState(118);
				elementValue();
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class, 0);
		}

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class, 0);
		}

		public ElementValueContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValue;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterElementValue(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitElementValue(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitElementValue(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		final ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elementValue);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
					setState(120);
					expression(0);
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
					setState(121);
					literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
					setState(122);
					qualifiedName();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 4);
				{
					setState(123);
					elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}

		public ElementValueContext elementValue(final int i) {
			return getRuleContext(ElementValueContext.class, i);
		}

		public ElementValueArrayInitializerContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValueArrayInitializer;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterElementValueArrayInitializer(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitElementValueArrayInitializer(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitElementValueArrayInitializer(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		final ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(126);
				match(LBRACE);
				setState(135);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LBRACE) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << Identifier))) != 0)) {
					{
						setState(127);
						elementValue();
						setState(132);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
						while (_alt != 2 && _alt != -1) {
							if (_alt == 1) {
								{
									{
										setState(128);
										match(COMMA);
										setState(129);
										elementValue();
									}
								}
							}
							setState(134);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
						}
					}
				}

				setState(138);
				_la = _input.LA(1);
				if (_la == COMMA) {
					{
						setState(137);
						match(COMMA);
					}
				}

				setState(140);
				match(RBRACE);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() {
			return getToken(WiidgetParser.IMPORT, 0);
		}

		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class, 0);
		}

		public JokerImportContext jokerImport() {
			return getRuleContext(JokerImportContext.class, 0);
		}

		public ImportDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_importDeclaration;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterImportDeclaration(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitImportDeclaration(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitImportDeclaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		final ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(142);
				match(IMPORT);
				setState(143);
				qualifiedName();
				setState(145);
				_la = _input.LA(1);
				if (_la == DOT) {
					{
						setState(144);
						jokerImport();
					}
				}

				setState(147);
				match(SEMI);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JokerImportContext extends ParserRuleContext {
		public JokerImportContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_jokerImport;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterJokerImport(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitJokerImport(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitJokerImport(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final JokerImportContext jokerImport() throws RecognitionException {
		final JokerImportContext _localctx = new JokerImportContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jokerImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(149);
				match(DOT);
				setState(150);
				match(MUL);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetBodyContext extends ParserRuleContext {
		public List<StatementDeclarationContext> statementDeclaration() {
			return getRuleContexts(StatementDeclarationContext.class);
		}

		public StatementDeclarationContext statementDeclaration(final int i) {
			return getRuleContext(StatementDeclarationContext.class, i);
		}

		public WidgetBodyContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_widgetBody;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterWidgetBody(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitWidgetBody(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitWidgetBody(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final WidgetBodyContext widgetBody() throws RecognitionException {
		final WidgetBodyContext _localctx = new WidgetBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_widgetBody);
		int _la;
		try {
			setState(161);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
					setState(152);
					match(SEMI);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
					setState(153);
					match(LBRACE);
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << LBRACE) | (1L << SEMI) | (1L << Identifier))) != 0)) {
						{
							{
								setState(154);
								statementDeclaration();
							}
						}
						setState(159);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(160);
					match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode Identifier(final int i) {
			return getToken(WiidgetParser.Identifier, i);
		}

		public List<TerminalNode> Identifier() {
			return getTokens(WiidgetParser.Identifier);
		}

		public QualifiedNameContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_qualifiedName;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterQualifiedName(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitQualifiedName(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitQualifiedName(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		final QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(163);
				match(Identifier);
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
				while (_alt != 2 && _alt != -1) {
					if (_alt == 1) {
						{
							{
								setState(164);
								match(DOT);
								setState(165);
								match(Identifier);
							}
						}
					}
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
				}
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() {
			return getToken(WiidgetParser.StringLiteral, 0);
		}

		public TerminalNode NullLiteral() {
			return getToken(WiidgetParser.NullLiteral, 0);
		}

		public TerminalNode IntegerLiteral() {
			return getToken(WiidgetParser.IntegerLiteral, 0);
		}

		public TerminalNode CharacterLiteral() {
			return getToken(WiidgetParser.CharacterLiteral, 0);
		}

		public TerminalNode BooleanLiteral() {
			return getToken(WiidgetParser.BooleanLiteral, 0);
		}

		public TerminalNode FloatingPointLiteral() {
			return getToken(WiidgetParser.FloatingPointLiteral, 0);
		}

		public LiteralContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_literal;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterLiteral(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitLiteral(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitLiteral(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		final LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(171);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0))) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ParExpressionContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_parExpression;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterParExpression(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitParExpression(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitParExpression(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		final ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(173);
				match(LPAREN);
				setState(174);
				expression(0);
				setState(175);
				match(RPAREN);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(final int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public ExpressionListContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expressionList;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterExpressionList(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitExpressionList(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitExpressionList(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		final ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(177);
				expression(0);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(178);
							match(COMMA);
							setState(179);
							expression(0);
						}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public StatementExpressionContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statementExpression;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterStatementExpression(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitStatementExpression(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitStatementExpression(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		final StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(185);
				expression(0);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ConstantExpressionContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constantExpression;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterConstantExpression(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitConstantExpression(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitConstantExpression(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		final ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(187);
				expression(0);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public BooleanExpressionPartContext booleanExpressionPart(final int i) {
			return getRuleContext(BooleanExpressionPartContext.class, i);
		}

		public List<BooleanExpressionPartContext> booleanExpressionPart() {
			return getRuleContexts(BooleanExpressionPartContext.class);
		}

		public BooleanExpressionContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_booleanExpression;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterBooleanExpression(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitBooleanExpression(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitBooleanExpression(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		final BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_booleanExpression);
		int _la;
		try {
			setState(218);
			switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(189);
					booleanExpressionPart();
					setState(190);
					_la = _input.LA(1);
					if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0))) {
						_errHandler.recoverInline(this);
					}
					consume();
					setState(191);
					booleanExpressionPart();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(193);
					booleanExpressionPart();
					setState(194);
					_la = _input.LA(1);
					if (!(_la == EQUAL || _la == NOTEQUAL)) {
						_errHandler.recoverInline(this);
					}
					consume();
					setState(195);
					booleanExpressionPart();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(197);
					booleanExpressionPart();
					setState(198);
					match(BITAND);
					setState(199);
					booleanExpressionPart();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(201);
					booleanExpressionPart();
					setState(202);
					match(CARET);
					setState(203);
					booleanExpressionPart();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(205);
					booleanExpressionPart();
					setState(206);
					match(BITOR);
					setState(207);
					booleanExpressionPart();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(209);
					booleanExpressionPart();
					setState(210);
					match(AND);
					setState(211);
					booleanExpressionPart();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(213);
					booleanExpressionPart();
					setState(214);
					match(OR);
					setState(215);
					booleanExpressionPart();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
					setState(217);
					expression(0);
				}
				break;
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionPartContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class, 0);
		}

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class, 0);
		}

		public BooleanExpressionPartContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_booleanExpressionPart;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterBooleanExpressionPart(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitBooleanExpressionPart(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitBooleanExpressionPart(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionPartContext booleanExpressionPart() throws RecognitionException {
		final BooleanExpressionPartContext _localctx = new BooleanExpressionPartContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_booleanExpressionPart);
		try {
			setState(223);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
					setState(220);
					qualifiedName();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
					setState(221);
					literal();
				}
				break;
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
					setState(222);
					expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(final int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(WiidgetParser.Identifier, 0);
		}

		public ExpressionContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionContext(final ParserRuleContext parent, final int invokingState, final int _p) {
			super(parent, invokingState);
			this._p = _p;
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterExpression(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitExpression(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitExpression(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(final int _p) throws RecognitionException {
		final ParserRuleContext _parentctx = _ctx;
		final int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		final int _startState = 48;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(230);
				switch (_input.LA(1)) {
				case INC:
				case DEC:
				case ADD:
				case SUB: {
					setState(226);
					_la = _input.LA(1);
					if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0))) {
						_errHandler.recoverInline(this);
					}
					consume();
					setState(227);
					expression(14);
				}
					break;
				case BANG:
				case TILDE: {
					setState(228);
					_la = _input.LA(1);
					if (!(_la == BANG || _la == TILDE)) {
						_errHandler.recoverInline(this);
					}
					consume();
					setState(229);
					expression(13);
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
				while (_alt != 2 && _alt != -1) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(308);
							switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
							case 1: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(232);
								if (!(12 >= _localctx._p))
									throw new FailedPredicateException(this, "12 >= $_p");
								setState(233);
								_la = _input.LA(1);
								if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0))) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(234);
								expression(13);
							}
								break;

							case 2: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(235);
								if (!(11 >= _localctx._p))
									throw new FailedPredicateException(this, "11 >= $_p");
								setState(236);
								_la = _input.LA(1);
								if (!(_la == ADD || _la == SUB)) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(237);
								expression(12);
							}
								break;

							case 3: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(238);
								if (!(10 >= _localctx._p))
									throw new FailedPredicateException(this, "10 >= $_p");
								setState(246);
								switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
								case 1: {
									setState(239);
									match(LT);
									setState(240);
									match(LT);
								}
									break;

								case 2: {
									setState(241);
									match(GT);
									setState(242);
									match(GT);
									setState(243);
									match(GT);
								}
									break;

								case 3: {
									setState(244);
									match(GT);
									setState(245);
									match(GT);
								}
									break;
								}
								setState(248);
								expression(11);
							}
								break;

							case 4: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(249);
								if (!(9 >= _localctx._p))
									throw new FailedPredicateException(this, "9 >= $_p");
								setState(250);
								_la = _input.LA(1);
								if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0))) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(251);
								expression(10);
							}
								break;

							case 5: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(252);
								if (!(8 >= _localctx._p))
									throw new FailedPredicateException(this, "8 >= $_p");
								setState(253);
								_la = _input.LA(1);
								if (!(_la == EQUAL || _la == NOTEQUAL)) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(254);
								expression(9);
							}
								break;

							case 6: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(255);
								if (!(7 >= _localctx._p))
									throw new FailedPredicateException(this, "7 >= $_p");
								setState(256);
								match(BITAND);
								setState(257);
								expression(8);
							}
								break;

							case 7: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(258);
								if (!(6 >= _localctx._p))
									throw new FailedPredicateException(this, "6 >= $_p");
								setState(259);
								match(CARET);
								setState(260);
								expression(7);
							}
								break;

							case 8: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(261);
								if (!(5 >= _localctx._p))
									throw new FailedPredicateException(this, "5 >= $_p");
								setState(262);
								match(BITOR);
								setState(263);
								expression(6);
							}
								break;

							case 9: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(264);
								if (!(4 >= _localctx._p))
									throw new FailedPredicateException(this, "4 >= $_p");
								setState(265);
								match(AND);
								setState(266);
								expression(5);
							}
								break;

							case 10: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(267);
								if (!(3 >= _localctx._p))
									throw new FailedPredicateException(this, "3 >= $_p");
								setState(268);
								match(OR);
								setState(269);
								expression(4);
							}
								break;

							case 11: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(270);
								if (!(1 >= _localctx._p))
									throw new FailedPredicateException(this, "1 >= $_p");
								setState(283);
								switch (_input.LA(1)) {
								case ASSIGN: {
									setState(271);
									match(ASSIGN);
								}
									break;
								case ADD_ASSIGN: {
									setState(272);
									match(ADD_ASSIGN);
								}
									break;
								case SUB_ASSIGN: {
									setState(273);
									match(SUB_ASSIGN);
								}
									break;
								case MUL_ASSIGN: {
									setState(274);
									match(MUL_ASSIGN);
								}
									break;
								case DIV_ASSIGN: {
									setState(275);
									match(DIV_ASSIGN);
								}
									break;
								case AND_ASSIGN: {
									setState(276);
									match(AND_ASSIGN);
								}
									break;
								case OR_ASSIGN: {
									setState(277);
									match(OR_ASSIGN);
								}
									break;
								case XOR_ASSIGN: {
									setState(278);
									match(XOR_ASSIGN);
								}
									break;
								case RSHIFT_ASSIGN: {
									setState(279);
									match(RSHIFT_ASSIGN);
								}
									break;
								case URSHIFT_ASSIGN: {
									setState(280);
									match(URSHIFT_ASSIGN);
								}
									break;
								case LSHIFT_ASSIGN: {
									setState(281);
									match(LSHIFT_ASSIGN);
								}
									break;
								case MOD_ASSIGN: {
									setState(282);
									match(MOD_ASSIGN);
								}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(285);
								expression(1);
							}
								break;

							case 12: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(286);
								if (!(2 >= _localctx._p))
									throw new FailedPredicateException(this, "2 >= $_p");
								setState(287);
								match(QUESTION);
								setState(288);
								expression(0);
								setState(289);
								match(COLON);
								setState(290);
								expression(3);
							}
								break;

							case 13: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(292);
								if (!(18 >= _localctx._p))
									throw new FailedPredicateException(this, "18 >= $_p");
								setState(293);
								match(DOT);
								setState(294);
								match(Identifier);
							}
								break;

							case 14: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(295);
								if (!(17 >= _localctx._p))
									throw new FailedPredicateException(this, "17 >= $_p");
								setState(296);
								match(LBRACK);
								setState(297);
								expression(0);
								setState(298);
								match(RBRACK);
							}
								break;

							case 15: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(300);
								if (!(16 >= _localctx._p))
									throw new FailedPredicateException(this, "16 >= $_p");
								setState(301);
								match(LPAREN);
								setState(303);
								_la = _input.LA(1);
								if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
									{
										setState(302);
										expressionList();
									}
								}

								setState(305);
								match(RPAREN);
							}
								break;

							case 16: {
								_localctx = new ExpressionContext(_parentctx, _parentState, _p);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(306);
								if (!(15 >= _localctx._p))
									throw new FailedPredicateException(this, "15 >= $_p");
								setState(307);
								_la = _input.LA(1);
								if (!(_la == INC || _la == DEC)) {
									_errHandler.recoverInline(this);
								}
								consume();
							}
								break;
							}
						}
					}
					setState(312);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
				}
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(WiidgetParser.Identifier, 0);
		}

		public SuperSuffixContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_superSuffix;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterSuperSuffix(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitSuperSuffix(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitSuperSuffix(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		final SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_superSuffix);
		int _la;
		try {
			setState(319);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
					setState(313);
					arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
					setState(314);
					match(DOT);
					setState(315);
					match(Identifier);
					setState(317);
					_la = _input.LA(1);
					if (_la == LPAREN) {
						{
							setState(316);
							arguments();
						}
					}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class, 0);
		}

		public ArgumentsContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arguments;
		}

		@Override
		public void enterRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).enterArguments(this);
		}

		@Override
		public void exitRule(final ParseTreeListener listener) {
			if (listener instanceof WiidgetListener)
				((WiidgetListener) listener).exitArguments(this);
		}

		@Override
		public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof WiidgetVisitor)
				return ((WiidgetVisitor<? extends T>) visitor).visitArguments(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		final ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(321);
				match(LPAREN);
				setState(323);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
					{
						setState(322);
						expressionList();
					}
				}

				setState(325);
				match(RPAREN);
			}
		} catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(final RuleContext _localctx, final int ruleIndex, final int predIndex) {
		switch (ruleIndex) {
		case 24:
			return expression_sempred((ExpressionContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expression_sempred(final ExpressionContext _localctx, final int predIndex) {
		switch (predIndex) {
		case 0:
			return 12 >= _localctx._p;

		case 1:
			return 11 >= _localctx._p;

		case 2:
			return 10 >= _localctx._p;

		case 3:
			return 9 >= _localctx._p;

		case 4:
			return 8 >= _localctx._p;

		case 5:
			return 7 >= _localctx._p;

		case 6:
			return 6 >= _localctx._p;

		case 7:
			return 5 >= _localctx._p;

		case 8:
			return 4 >= _localctx._p;

		case 9:
			return 3 >= _localctx._p;

		case 10:
			return 1 >= _localctx._p;

		case 11:
			return 2 >= _localctx._p;

		case 12:
			return 18 >= _localctx._p;

		case 13:
			return 17 >= _localctx._p;

		case 14:
			return 16 >= _localctx._p;

		case 15:
			return 15 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN = "\2\3<\u014a\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4" + "\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"
			+ "\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27" + "\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16"
			+ "\2=\13\2\3\2\7\2@\n\2\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\5\3I\n\3\3\4\3\4" + "\3\4\5\4N\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"
			+ "\3\7\3\7\3\b\3\b\5\bb\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\5\nk\n\n\3\n\3\n" + "\3\13\3\13\3\13\7\13r\n\13\f\13\16\13u\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3"
			+ "\r\3\r\5\r\177\n\r\3\16\3\16\3\16\3\16\7\16\u0085\n\16\f\16\16\16\u0088" + "\13\16\5\16\u008a\n\16\3\16\5\16\u008d\n\16\3\16\3\16\3\17\3\17\3\17\5"
			+ "\17\u0094\n\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u009e\n\21" + "\f\21\16\21\u00a1\13\21\3\21\5\21\u00a4\n\21\3\22\3\22\3\22\7\22\u00a9"
			+ "\n\22\f\22\16\22\u00ac\13\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3" + "\25\7\25\u00b7\n\25\f\25\16\25\u00ba\13\25\3\26\3\26\3\27\3\27\3\30\3"
			+ "\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3" + "\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5"
			+ "\30\u00dd\n\30\3\31\3\31\3\31\5\31\u00e2\n\31\3\32\3\32\3\32\3\32\3\32" + "\5\32\u00e9\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"
			+ "\3\32\3\32\3\32\5\32\u00f9\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32" + "\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"
			+ "\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32" + "\u011e\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"
			+ "\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0132\n\32\3\32\3\32\3\32\7\32\u0137" + "\n\32\f\32\16\32\u013a\13\32\3\33\3\33\3\33\3\33\5\33\u0140\n\33\5\33"
			+ "\u0142\n\33\3\34\3\34\5\34\u0146\n\34\3\34\3\34\3\34\2\35\2\4\6\b\n\f" + "\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\f\3\4\t\4\26\27\35"
			+ "\36\4\34\34\37\37\3\"%\3\30\31\4&\'++\3$%\4\26\27\35\36\4\34\34\37\37" + "\3\"#\u016d\2;\3\2\2\2\4H\3\2\2\2\6M\3\2\2\2\bQ\3\2\2\2\nV\3\2\2\2\f]"
			+ "\3\2\2\2\16_\3\2\2\2\20e\3\2\2\2\22g\3\2\2\2\24n\3\2\2\2\26v\3\2\2\2\30" + "~\3\2\2\2\32\u0080\3\2\2\2\34\u0090\3\2\2\2\36\u0097\3\2\2\2 \u00a3\3"
			+ "\2\2\2\"\u00a5\3\2\2\2$\u00ad\3\2\2\2&\u00af\3\2\2\2(\u00b3\3\2\2\2*\u00bb" + "\3\2\2\2,\u00bd\3\2\2\2.\u00dc\3\2\2\2\60\u00e1\3\2\2\2\62\u00e8\3\2\2"
			+ "\2\64\u0141\3\2\2\2\66\u0143\3\2\2\28:\5\34\17\298\3\2\2\2:=\3\2\2\2;" + "9\3\2\2\2;<\3\2\2\2<A\3\2\2\2=;\3\2\2\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2\2"
			+ "A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\1\2\2E\3\3\2\2\2FI\5\6\4" + "\2GI\5\16\b\2HF\3\2\2\2HG\3\2\2\2I\5\3\2\2\2JN\5\b\5\2KN\3\2\2\2LN\5\n"
			+ "\6\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2NO\3\2\2\2OP\5 \21\2P\7\3\2\2\2QR\7" + "\n\2\2RS\7\f\2\2ST\5.\30\2TU\7\r\2\2U\t\3\2\2\2VW\7\13\2\2WX\7\f\2\2X"
			+ "Y\5\f\7\2YZ\7\33\2\2Z[\5\"\22\2[\\\7\r\2\2\\\13\3\2\2\2]^\7\67\2\2^\r" + "\3\2\2\2_a\5\20\t\2`b\5\22\n\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\5 \21\2"
			+ "d\17\3\2\2\2ef\5\"\22\2f\21\3\2\2\2gj\7\f\2\2hk\5\24\13\2ik\5\30\r\2j" + "h\3\2\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\r\2\2m\23\3\2\2\2ns\5\26\f"
			+ "\2op\7\23\2\2pr\5\26\f\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\25\3" + "\2\2\2us\3\2\2\2vw\7\67\2\2wx\7\25\2\2xy\5\30\r\2y\27\3\2\2\2z\177\5\62"
			+ "\32\2{\177\5$\23\2|\177\5\"\22\2}\177\5\32\16\2~z\3\2\2\2~{\3\2\2\2~|" + "\3\2\2\2~}\3\2\2\2\177\31\3\2\2\2\u0080\u0089\7\16\2\2\u0081\u0086\5\30"
			+ "\r\2\u0082\u0083\7\23\2\2\u0083\u0085\5\30\r\2\u0084\u0082\3\2\2\2\u0085" + "\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2"
			+ "\2\2\u0088\u0086\3\2\2\2\u0089\u0081\3\2\2\2\u0089\u008a\3\2\2\2\u008a" + "\u008c\3\2\2\2\u008b\u008d\7\23\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3"
			+ "\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\17\2\2\u008f\33\3\2\2\2\u0090" + "\u0091\7\3\2\2\u0091\u0093\5\"\22\2\u0092\u0094\5\36\20\2\u0093\u0092"
			+ "\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\22\2\2" + "\u0096\35\3\2\2\2\u0097\u0098\7\24\2\2\u0098\u0099\7&\2\2\u0099\37\3\2"
			+ "\2\2\u009a\u00a4\7\22\2\2\u009b\u009f\7\16\2\2\u009c\u009e\5\4\3\2\u009d" + "\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"
			+ "\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\7\17\2\2\u00a3" + "\u009a\3\2\2\2\u00a3\u009b\3\2\2\2\u00a4!\3\2\2\2\u00a5\u00aa\7\67\2\2"
			+ "\u00a6\u00a7\7\24\2\2\u00a7\u00a9\7\67\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac" + "\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab#\3\2\2\2\u00ac"
			+ "\u00aa\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae%\3\2\2\2\u00af\u00b0\7\f\2\2" + "\u00b0\u00b1\5\62\32\2\u00b1\u00b2\7\r\2\2\u00b2\'\3\2\2\2\u00b3\u00b8"
			+ "\5\62\32\2\u00b4\u00b5\7\23\2\2\u00b5\u00b7\5\62\32\2\u00b6\u00b4\3\2" + "\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"
			+ ")\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\5\62\32\2\u00bc+\3\2\2\2\u00bd" + "\u00be\5\62\32\2\u00be-\3\2\2\2\u00bf\u00c0\5\60\31\2\u00c0\u00c1\t\3"
			+ "\2\2\u00c1\u00c2\5\60\31\2\u00c2\u00dd\3\2\2\2\u00c3\u00c4\5\60\31\2\u00c4" + "\u00c5\t\4\2\2\u00c5\u00c6\5\60\31\2\u00c6\u00dd\3\2\2\2\u00c7\u00c8\5"
			+ "\60\31\2\u00c8\u00c9\7(\2\2\u00c9\u00ca\5\60\31\2\u00ca\u00dd\3\2\2\2" + "\u00cb\u00cc\5\60\31\2\u00cc\u00cd\7*\2\2\u00cd\u00ce\5\60\31\2\u00ce"
			+ "\u00dd\3\2\2\2\u00cf\u00d0\5\60\31\2\u00d0\u00d1\7)\2\2\u00d1\u00d2\5" + "\60\31\2\u00d2\u00dd\3\2\2\2\u00d3\u00d4\5\60\31\2\u00d4\u00d5\7 \2\2"
			+ "\u00d5\u00d6\5\60\31\2\u00d6\u00dd\3\2\2\2\u00d7\u00d8\5\60\31\2\u00d8" + "\u00d9\7!\2\2\u00d9\u00da\5\60\31\2\u00da\u00dd\3\2\2\2\u00db\u00dd\5"
			+ "\62\32\2\u00dc\u00bf\3\2\2\2\u00dc\u00c3\3\2\2\2\u00dc\u00c7\3\2\2\2\u00dc" + "\u00cb\3\2\2\2\u00dc\u00cf\3\2\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00d7\3\2"
			+ "\2\2\u00dc\u00db\3\2\2\2\u00dd/\3\2\2\2\u00de\u00e2\5\"\22\2\u00df\u00e2" + "\5$\23\2\u00e0\u00e2\5\62\32\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2"
			+ "\u00e1\u00e0\3\2\2\2\u00e2\61\3\2\2\2\u00e3\u00e4\b\32\1\2\u00e4\u00e5" + "\t\5\2\2\u00e5\u00e9\5\62\32\2\u00e6\u00e7\t\6\2\2\u00e7\u00e9\5\62\32"
			+ "\2\u00e8\u00e3\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u0138\3\2\2\2\u00ea\u00eb" + "\6\32\2\3\u00eb\u00ec\t\7\2\2\u00ec\u0137\5\62\32\2\u00ed\u00ee\6\32\3"
			+ "\3\u00ee\u00ef\t\b\2\2\u00ef\u0137\5\62\32\2\u00f0\u00f8\6\32\4\3\u00f1" + "\u00f2\7\27\2\2\u00f2\u00f9\7\27\2\2\u00f3\u00f4\7\26\2\2\u00f4\u00f5"
			+ "\7\26\2\2\u00f5\u00f9\7\26\2\2\u00f6\u00f7\7\26\2\2\u00f7\u00f9\7\26\2" + "\2\u00f8\u00f1\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa"
			+ "\3\2\2\2\u00fa\u0137\5\62\32\2\u00fb\u00fc\6\32\5\3\u00fc\u00fd\t\t\2" + "\2\u00fd\u0137\5\62\32\2\u00fe\u00ff\6\32\6\3\u00ff\u0100\t\n\2\2\u0100"
			+ "\u0137\5\62\32\2\u0101\u0102\6\32\7\3\u0102\u0103\7(\2\2\u0103\u0137\5" + "\62\32\2\u0104\u0105\6\32\b\3\u0105\u0106\7*\2\2\u0106\u0137\5\62\32\2"
			+ "\u0107\u0108\6\32\t\3\u0108\u0109\7)\2\2\u0109\u0137\5\62\32\2\u010a\u010b" + "\6\32\n\3\u010b\u010c\7 \2\2\u010c\u0137\5\62\32\2\u010d\u010e\6\32\13"
			+ "\3\u010e\u010f\7!\2\2\u010f\u0137\5\62\32\2\u0110\u011d\6\32\f\3\u0111" + "\u011e\7\25\2\2\u0112\u011e\7,\2\2\u0113\u011e\7-\2\2\u0114\u011e\7.\2"
			+ "\2\u0115\u011e\7/\2\2\u0116\u011e\7\60\2\2\u0117\u011e\7\61\2\2\u0118" + "\u011e\7\62\2\2\u0119\u011e\7\65\2\2\u011a\u011e\7\66\2\2\u011b\u011e"
			+ "\7\64\2\2\u011c\u011e\7\63\2\2\u011d\u0111\3\2\2\2\u011d\u0112\3\2\2\2" + "\u011d\u0113\3\2\2\2\u011d\u0114\3\2\2\2\u011d\u0115\3\2\2\2\u011d\u0116"
			+ "\3\2\2\2\u011d\u0117\3\2\2\2\u011d\u0118\3\2\2\2\u011d\u0119\3\2\2\2\u011d" + "\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2"
			+ "\2\2\u011f\u0137\5\62\32\2\u0120\u0121\6\32\r\3\u0121\u0122\7\32\2\2\u0122" + "\u0123\5\62\32\2\u0123\u0124\7\33\2\2\u0124\u0125\5\62\32\2\u0125\u0137"
			+ "\3\2\2\2\u0126\u0127\6\32\16\3\u0127\u0128\7\24\2\2\u0128\u0137\7\67\2" + "\2\u0129\u012a\6\32\17\3\u012a\u012b\7\20\2\2\u012b\u012c\5\62\32\2\u012c"
			+ "\u012d\7\21\2\2\u012d\u0137\3\2\2\2\u012e\u012f\6\32\20\3\u012f\u0131" + "\7\f\2\2\u0130\u0132\5(\25\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"
			+ "\u0133\3\2\2\2\u0133\u0137\7\r\2\2\u0134\u0135\6\32\21\3\u0135\u0137\t" + "\13\2\2\u0136\u00ea\3\2\2\2\u0136\u00ed\3\2\2\2\u0136\u00f0\3\2\2\2\u0136"
			+ "\u00fb\3\2\2\2\u0136\u00fe\3\2\2\2\u0136\u0101\3\2\2\2\u0136\u0104\3\2" + "\2\2\u0136\u0107\3\2\2\2\u0136\u010a\3\2\2\2\u0136\u010d\3\2\2\2\u0136"
			+ "\u0110\3\2\2\2\u0136\u0120\3\2\2\2\u0136\u0126\3\2\2\2\u0136\u0129\3\2" + "\2\2\u0136\u012e\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138"
			+ "\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\63\3\2\2\2\u013a\u0138\3\2\2" + "\2\u013b\u0142\5\66\34\2\u013c\u013d\7\24\2\2\u013d\u013f\7\67\2\2\u013e"
			+ "\u0140\5\66\34\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3" + "\2\2\2\u0141\u013b\3\2\2\2\u0141\u013c\3\2\2\2\u0142\65\3\2\2\2\u0143"
			+ "\u0145\7\f\2\2\u0144\u0146\5(\25\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2" + "\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\r\2\2\u0148\67\3\2\2\2\35;AHMa"
			+ "js~\u0086\u0089\u008c\u0093\u009f\u00a3\u00aa\u00b8\u00dc\u00e1\u00e8" + "\u00f8\u011d\u0131\u0136\u0138\u013f\u0141\u0145";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}