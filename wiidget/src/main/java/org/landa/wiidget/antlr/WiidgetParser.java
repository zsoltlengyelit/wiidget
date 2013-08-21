// Generated from D:\projects\wiidget\wiidget\src\main\java\org\landa\wiidget\antlr\Wiidget.g4 by ANTLR 4.0
package org.landa.wiidget.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WiidgetParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'import'", "DEFAULT_OPERATOR", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "'null'", "'if'", 
		"'foreach'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "TILDE", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'", "WS", 
		"COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_statementDeclaration = 1, RULE_controlStatement = 2, 
		RULE_ifControl = 3, RULE_foreachControl = 4, RULE_foreachVariable = 5, 
		RULE_widgetDeclaration = 6, RULE_widgetName = 7, RULE_widgetArguments = 8, 
		RULE_elementValuePairs = 9, RULE_elementValuePair = 10, RULE_elementValue = 11, 
		RULE_elementValueArrayInitializer = 12, RULE_importDeclaration = 13, RULE_jokerImport = 14, 
		RULE_widgetBody = 15, RULE_qualifiedName = 16, RULE_literal = 17, RULE_parExpression = 18, 
		RULE_expressionList = 19, RULE_booleanExpression = 20, RULE_booleanExpressionPart = 21, 
		RULE_indexingExpression = 22, RULE_indexExpression = 23, RULE_methodCallExpression = 24, 
		RULE_mathematicalExpression = 25, RULE_mathematicalOperator = 26, RULE_mathematicalOperandExpression = 27, 
		RULE_expression = 28;
	public static final String[] ruleNames = {
		"compilationUnit", "statementDeclaration", "controlStatement", "ifControl", 
		"foreachControl", "foreachVariable", "widgetDeclaration", "widgetName", 
		"widgetArguments", "elementValuePairs", "elementValuePair", "elementValue", 
		"elementValueArrayInitializer", "importDeclaration", "jokerImport", "widgetBody", 
		"qualifiedName", "literal", "parExpression", "expressionList", "booleanExpression", 
		"booleanExpressionPart", "indexingExpression", "indexExpression", "methodCallExpression", 
		"mathematicalExpression", "mathematicalOperator", "mathematicalOperandExpression", 
		"expression"
	};

	@Override
	public String getGrammarFileName() { return "Wiidget.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public WiidgetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public TerminalNode EOF() { return getToken(WiidgetParser.EOF, 0); }
		public List<StatementDeclarationContext> statementDeclaration() {
			return getRuleContexts(StatementDeclarationContext.class);
		}
		public StatementDeclarationContext statementDeclaration(int i) {
			return getRuleContext(StatementDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(58); importDeclaration();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << LBRACE) | (1L << SEMI) | (1L << Identifier))) != 0)) {
				{
				{
				setState(64); statementDeclaration();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementDeclarationContext extends ParserRuleContext {
		public ControlStatementContext controlStatement() {
			return getRuleContext(ControlStatementContext.class,0);
		}
		public WidgetDeclarationContext widgetDeclaration() {
			return getRuleContext(WidgetDeclarationContext.class,0);
		}
		public StatementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterStatementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitStatementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitStatementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementDeclarationContext statementDeclaration() throws RecognitionException {
		StatementDeclarationContext _localctx = new StatementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementDeclaration);
		try {
			setState(74);
			switch (_input.LA(1)) {
			case IF:
			case FOREACH:
			case LBRACE:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); controlStatement();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); widgetDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlStatementContext extends ParserRuleContext {
		public ForeachControlContext foreachControl() {
			return getRuleContext(ForeachControlContext.class,0);
		}
		public IfControlContext ifControl() {
			return getRuleContext(IfControlContext.class,0);
		}
		public WidgetBodyContext widgetBody() {
			return getRuleContext(WidgetBodyContext.class,0);
		}
		public ControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitControlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitControlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlStatementContext controlStatement() throws RecognitionException {
		ControlStatementContext _localctx = new ControlStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_controlStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(76); ifControl();
				}
				break;
			case LBRACE:
			case SEMI:
				{
				}
				break;
			case FOREACH:
				{
				setState(78); foreachControl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(81); widgetBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfControlContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
		public TerminalNode IF() { return getToken(WiidgetParser.IF, 0); }
		public IfControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterIfControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitIfControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitIfControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfControlContext ifControl() throws RecognitionException {
		IfControlContext _localctx = new IfControlContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(IF);
			setState(84); match(LPAREN);
			setState(85); booleanExpression();
			setState(86); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachControlContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public TerminalNode FOREACH() { return getToken(WiidgetParser.FOREACH, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ForeachVariableContext foreachVariable() {
			return getRuleContext(ForeachVariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
		public ForeachControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterForeachControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitForeachControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitForeachControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachControlContext foreachControl() throws RecognitionException {
		ForeachControlContext _localctx = new ForeachControlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_foreachControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(FOREACH);
			setState(89); match(LPAREN);
			setState(90); foreachVariable();
			setState(91); match(COLON);
			setState(92); qualifiedName();
			setState(93); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public ForeachVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterForeachVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitForeachVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitForeachVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachVariableContext foreachVariable() throws RecognitionException {
		ForeachVariableContext _localctx = new ForeachVariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_foreachVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetDeclarationContext extends ParserRuleContext {
		public WidgetNameContext widgetName() {
			return getRuleContext(WidgetNameContext.class,0);
		}
		public WidgetArgumentsContext widgetArguments() {
			return getRuleContext(WidgetArgumentsContext.class,0);
		}
		public WidgetBodyContext widgetBody() {
			return getRuleContext(WidgetBodyContext.class,0);
		}
		public WidgetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgetDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWidgetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWidgetDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWidgetDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetDeclarationContext widgetDeclaration() throws RecognitionException {
		WidgetDeclarationContext _localctx = new WidgetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_widgetDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); widgetName();
			setState(99);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(98); widgetArguments();
				}
			}

			setState(101); widgetBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public WidgetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWidgetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWidgetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWidgetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetNameContext widgetName() throws RecognitionException {
		WidgetNameContext _localctx = new WidgetNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_widgetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetArgumentsContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public WidgetArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgetArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWidgetArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWidgetArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWidgetArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetArgumentsContext widgetArguments() throws RecognitionException {
		WidgetArgumentsContext _localctx = new WidgetArgumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_widgetArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(LPAREN);
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(106); elementValuePairs();
				}
				break;

			case 2:
				{
				setState(107); elementValue();
				}
				break;
			}
			setState(110); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); elementValuePair();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(113); match(COMMA);
				setState(114); elementValuePair();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(Identifier);
			setState(121); match(ASSIGN);
			setState(122); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elementValue);
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); literal();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126); qualifiedName();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127); elementValueArrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(LBRACE);
			setState(139);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << Identifier))) != 0)) {
				{
				setState(131); elementValue();
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(132); match(COMMA);
						setState(133); elementValue();
						}
						} 
					}
					setState(138);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
			}

			setState(142);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(141); match(COMMA);
				}
			}

			setState(144); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(WiidgetParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public JokerImportContext jokerImport() {
			return getRuleContext(JokerImportContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(IMPORT);
			setState(147); qualifiedName();
			setState(149);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(148); jokerImport();
				}
			}

			setState(151); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JokerImportContext extends ParserRuleContext {
		public JokerImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jokerImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterJokerImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitJokerImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitJokerImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JokerImportContext jokerImport() throws RecognitionException {
		JokerImportContext _localctx = new JokerImportContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jokerImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(DOT);
			setState(154); match(MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetBodyContext extends ParserRuleContext {
		public List<StatementDeclarationContext> statementDeclaration() {
			return getRuleContexts(StatementDeclarationContext.class);
		}
		public StatementDeclarationContext statementDeclaration(int i) {
			return getRuleContext(StatementDeclarationContext.class,i);
		}
		public WidgetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgetBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWidgetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWidgetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWidgetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetBodyContext widgetBody() throws RecognitionException {
		WidgetBodyContext _localctx = new WidgetBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_widgetBody);
		int _la;
		try {
			setState(165);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(156); match(SEMI);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); match(LBRACE);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << LBRACE) | (1L << SEMI) | (1L << Identifier))) != 0)) {
					{
					{
					setState(158); statementDeclaration();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164); match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(WiidgetParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(WiidgetParser.Identifier); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(Identifier);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(168); match(DOT);
					setState(169); match(Identifier);
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(WiidgetParser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(WiidgetParser.NullLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(WiidgetParser.IntegerLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(WiidgetParser.CharacterLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(WiidgetParser.BooleanLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(WiidgetParser.FloatingPointLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(LPAREN);
			setState(178); expression(0);
			setState(179); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); expression(0);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(182); match(COMMA);
				setState(183); expression(0);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionPartContext booleanExpressionPart(int i) {
			return getRuleContext(BooleanExpressionPartContext.class,i);
		}
		public List<BooleanExpressionPartContext> booleanExpressionPart() {
			return getRuleContexts(BooleanExpressionPartContext.class);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_booleanExpression);
		int _la;
		try {
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); booleanExpressionPart();
				setState(190);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(191); booleanExpressionPart();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193); booleanExpressionPart();
				setState(194);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(195); booleanExpressionPart();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197); booleanExpressionPart();
				setState(198); match(BITAND);
				setState(199); booleanExpressionPart();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201); booleanExpressionPart();
				setState(202); match(CARET);
				setState(203); booleanExpressionPart();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205); booleanExpressionPart();
				setState(206); match(BITOR);
				setState(207); booleanExpressionPart();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(209); booleanExpressionPart();
				setState(210); match(AND);
				setState(211); booleanExpressionPart();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(213); booleanExpressionPart();
				setState(214); match(OR);
				setState(215); booleanExpressionPart();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(217); match(BANG);
				setState(218); booleanExpressionPart();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(219); booleanExpressionPart();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionPartContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public BooleanExpressionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpressionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterBooleanExpressionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitBooleanExpressionPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitBooleanExpressionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionPartContext booleanExpressionPart() throws RecognitionException {
		BooleanExpressionPartContext _localctx = new BooleanExpressionPartContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_booleanExpressionPart);
		try {
			setState(225);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222); qualifiedName();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223); literal();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224); expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexingExpressionContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IndexExpressionContext indexExpression() {
			return getRuleContext(IndexExpressionContext.class,0);
		}
		public IndexingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterIndexingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitIndexingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitIndexingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexingExpressionContext indexingExpression() throws RecognitionException {
		IndexingExpressionContext _localctx = new IndexingExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_indexingExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); qualifiedName();
			setState(228); match(LBRACK);
			setState(229); indexExpression();
			setState(230); match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexExpressionContext extends ParserRuleContext {
		public MethodCallExpressionContext methodCallExpression() {
			return getRuleContext(MethodCallExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IndexExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexExpressionContext indexExpression() throws RecognitionException {
		IndexExpressionContext _localctx = new IndexExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_indexExpression);
		try {
			setState(234);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(232); literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); methodCallExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallExpressionContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
		public MethodCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallExpressionContext methodCallExpression() throws RecognitionException {
		MethodCallExpressionContext _localctx = new MethodCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_methodCallExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); qualifiedName();
			setState(237); match(DOT);
			setState(238); match(Identifier);
			setState(239); match(LPAREN);
			setState(241);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << Identifier))) != 0)) {
				{
				setState(240); expressionList();
				}
			}

			setState(243); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathematicalExpressionContext extends ParserRuleContext {
		public List<MathematicalOperandExpressionContext> mathematicalOperandExpression() {
			return getRuleContexts(MathematicalOperandExpressionContext.class);
		}
		public MathematicalOperandExpressionContext mathematicalOperandExpression(int i) {
			return getRuleContext(MathematicalOperandExpressionContext.class,i);
		}
		public MathematicalOperatorContext mathematicalOperator() {
			return getRuleContext(MathematicalOperatorContext.class,0);
		}
		public MathematicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathematicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterMathematicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitMathematicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitMathematicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathematicalExpressionContext mathematicalExpression() throws RecognitionException {
		MathematicalExpressionContext _localctx = new MathematicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mathematicalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); mathematicalOperandExpression();
			setState(246); mathematicalOperator();
			setState(247); mathematicalOperandExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathematicalOperatorContext extends ParserRuleContext {
		public MathematicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathematicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterMathematicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitMathematicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitMathematicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathematicalOperatorContext mathematicalOperator() throws RecognitionException {
		MathematicalOperatorContext _localctx = new MathematicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mathematicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathematicalOperandExpressionContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(WiidgetParser.IntegerLiteral, 0); }
		public MethodCallExpressionContext methodCallExpression() {
			return getRuleContext(MethodCallExpressionContext.class,0);
		}
		public TerminalNode FloatingPointLiteral() { return getToken(WiidgetParser.FloatingPointLiteral, 0); }
		public IndexingExpressionContext indexingExpression() {
			return getRuleContext(IndexingExpressionContext.class,0);
		}
		public MathematicalOperandExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathematicalOperandExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterMathematicalOperandExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitMathematicalOperandExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitMathematicalOperandExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathematicalOperandExpressionContext mathematicalOperandExpression() throws RecognitionException {
		MathematicalOperandExpressionContext _localctx = new MathematicalOperandExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mathematicalOperandExpression);
		try {
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251); match(IntegerLiteral);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252); match(FloatingPointLiteral);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253); methodCallExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254); indexingExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public TerminalNode COLON() { return getToken(WiidgetParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode DEFAULT_OPERATOR() { return getToken(WiidgetParser.DEFAULT_OPERATOR, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(WiidgetParser.QUESTION, 0); }
		public MathematicalExpressionContext mathematicalExpression() {
			return getRuleContext(MathematicalExpressionContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public MethodCallExpressionContext methodCallExpression() {
			return getRuleContext(MethodCallExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IndexingExpressionContext indexingExpression() {
			return getRuleContext(IndexingExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(258); qualifiedName();
				}
				break;

			case 2:
				{
				setState(259); parExpression();
				}
				break;

			case 3:
				{
				setState(260); indexingExpression();
				}
				break;

			case 4:
				{
				setState(261); methodCallExpression();
				}
				break;

			case 5:
				{
				setState(262); mathematicalExpression();
				}
				break;

			case 6:
				{
				setState(263); literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(275);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(267); match(DEFAULT_OPERATOR);
						setState(268); expression(3);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(269);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(270); match(QUESTION);
						setState(271); expression(0);
						setState(272); match(COLON);
						setState(273); expression(2);
						}
						break;
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 2 >= _localctx._p;

		case 1: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3=\u011b\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\3\2\7\2>\n\2\f\2\16\2A\13\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\3\3"+
		"\3\5\3M\n\3\3\4\3\4\3\4\5\4R\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\5\bf\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\5\no\n\n\3\n\3\n\3\13\3\13\3\13\7\13v\n\13\f\13\16\13y\13\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0083\n\r\3\16\3\16\3\16\3\16\7\16\u0089"+
		"\n\16\f\16\16\16\u008c\13\16\5\16\u008e\n\16\3\16\5\16\u0091\n\16\3\16"+
		"\3\16\3\17\3\17\3\17\5\17\u0098\n\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\7\21\u00a2\n\21\f\21\16\21\u00a5\13\21\3\21\5\21\u00a8\n\21\3\22"+
		"\3\22\3\22\7\22\u00ad\n\22\f\22\16\22\u00b0\13\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\7\25\u00bb\n\25\f\25\16\25\u00be\13\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00df\n\26\3\27\3\27\3\27\5\27\u00e4\n\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\5\31\u00ed\n\31\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u00f4\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\5\35\u0102\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u010b\n\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0116\n\36\f\36\16\36"+
		"\u0119\13\36\3\36\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:\2\6\3\5\n\4\27\30\36\37\4\35\35  \4%(,,\u0127\2?\3\2\2"+
		"\2\4L\3\2\2\2\6Q\3\2\2\2\bU\3\2\2\2\nZ\3\2\2\2\fa\3\2\2\2\16c\3\2\2\2"+
		"\20i\3\2\2\2\22k\3\2\2\2\24r\3\2\2\2\26z\3\2\2\2\30\u0082\3\2\2\2\32\u0084"+
		"\3\2\2\2\34\u0094\3\2\2\2\36\u009b\3\2\2\2 \u00a7\3\2\2\2\"\u00a9\3\2"+
		"\2\2$\u00b1\3\2\2\2&\u00b3\3\2\2\2(\u00b7\3\2\2\2*\u00de\3\2\2\2,\u00e3"+
		"\3\2\2\2.\u00e5\3\2\2\2\60\u00ec\3\2\2\2\62\u00ee\3\2\2\2\64\u00f7\3\2"+
		"\2\2\66\u00fb\3\2\2\28\u0101\3\2\2\2:\u010a\3\2\2\2<>\5\34\17\2=<\3\2"+
		"\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A?\3\2\2\2BD\5\4\3\2CB\3\2"+
		"\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\1\2\2I\3\3"+
		"\2\2\2JM\5\6\4\2KM\5\16\b\2LJ\3\2\2\2LK\3\2\2\2M\5\3\2\2\2NR\5\b\5\2O"+
		"R\3\2\2\2PR\5\n\6\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2RS\3\2\2\2ST\5 \21\2"+
		"T\7\3\2\2\2UV\7\13\2\2VW\7\r\2\2WX\5*\26\2XY\7\16\2\2Y\t\3\2\2\2Z[\7\f"+
		"\2\2[\\\7\r\2\2\\]\5\f\7\2]^\7\34\2\2^_\5\"\22\2_`\7\16\2\2`\13\3\2\2"+
		"\2ab\78\2\2b\r\3\2\2\2ce\5\20\t\2df\5\22\n\2ed\3\2\2\2ef\3\2\2\2fg\3\2"+
		"\2\2gh\5 \21\2h\17\3\2\2\2ij\5\"\22\2j\21\3\2\2\2kn\7\r\2\2lo\5\24\13"+
		"\2mo\5\30\r\2nl\3\2\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\16\2\2q\23\3"+
		"\2\2\2rw\5\26\f\2st\7\24\2\2tv\5\26\f\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2"+
		"wx\3\2\2\2x\25\3\2\2\2yw\3\2\2\2z{\78\2\2{|\7\26\2\2|}\5\30\r\2}\27\3"+
		"\2\2\2~\u0083\5:\36\2\177\u0083\5$\23\2\u0080\u0083\5\"\22\2\u0081\u0083"+
		"\5\32\16\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\31\3\2\2\2\u0084\u008d\7\17\2\2\u0085\u008a\5\30"+
		"\r\2\u0086\u0087\7\24\2\2\u0087\u0089\5\30\r\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0091\7\24\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\20\2\2\u0093\33\3\2\2\2\u0094"+
		"\u0095\7\3\2\2\u0095\u0097\5\"\22\2\u0096\u0098\5\36\20\2\u0097\u0096"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\23\2\2"+
		"\u009a\35\3\2\2\2\u009b\u009c\7\25\2\2\u009c\u009d\7\'\2\2\u009d\37\3"+
		"\2\2\2\u009e\u00a8\7\23\2\2\u009f\u00a3\7\17\2\2\u00a0\u00a2\5\4\3\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\7\20\2\2\u00a7"+
		"\u009e\3\2\2\2\u00a7\u009f\3\2\2\2\u00a8!\3\2\2\2\u00a9\u00ae\78\2\2\u00aa"+
		"\u00ab\7\25\2\2\u00ab\u00ad\78\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af#\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u00b2\t\2\2\2\u00b2%\3\2\2\2\u00b3\u00b4\7\r\2\2\u00b4"+
		"\u00b5\5:\36\2\u00b5\u00b6\7\16\2\2\u00b6\'\3\2\2\2\u00b7\u00bc\5:\36"+
		"\2\u00b8\u00b9\7\24\2\2\u00b9\u00bb\5:\36\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd)\3\2\2\2"+
		"\u00be\u00bc\3\2\2\2\u00bf\u00c0\5,\27\2\u00c0\u00c1\t\3\2\2\u00c1\u00c2"+
		"\5,\27\2\u00c2\u00df\3\2\2\2\u00c3\u00c4\5,\27\2\u00c4\u00c5\t\4\2\2\u00c5"+
		"\u00c6\5,\27\2\u00c6\u00df\3\2\2\2\u00c7\u00c8\5,\27\2\u00c8\u00c9\7)"+
		"\2\2\u00c9\u00ca\5,\27\2\u00ca\u00df\3\2\2\2\u00cb\u00cc\5,\27\2\u00cc"+
		"\u00cd\7+\2\2\u00cd\u00ce\5,\27\2\u00ce\u00df\3\2\2\2\u00cf\u00d0\5,\27"+
		"\2\u00d0\u00d1\7*\2\2\u00d1\u00d2\5,\27\2\u00d2\u00df\3\2\2\2\u00d3\u00d4"+
		"\5,\27\2\u00d4\u00d5\7!\2\2\u00d5\u00d6\5,\27\2\u00d6\u00df\3\2\2\2\u00d7"+
		"\u00d8\5,\27\2\u00d8\u00d9\7\"\2\2\u00d9\u00da\5,\27\2\u00da\u00df\3\2"+
		"\2\2\u00db\u00dc\7\31\2\2\u00dc\u00df\5,\27\2\u00dd\u00df\5,\27\2\u00de"+
		"\u00bf\3\2\2\2\u00de\u00c3\3\2\2\2\u00de\u00c7\3\2\2\2\u00de\u00cb\3\2"+
		"\2\2\u00de\u00cf\3\2\2\2\u00de\u00d3\3\2\2\2\u00de\u00d7\3\2\2\2\u00de"+
		"\u00db\3\2\2\2\u00de\u00dd\3\2\2\2\u00df+\3\2\2\2\u00e0\u00e4\5\"\22\2"+
		"\u00e1\u00e4\5$\23\2\u00e2\u00e4\5:\36\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4-\3\2\2\2\u00e5\u00e6\5\"\22\2\u00e6"+
		"\u00e7\7\21\2\2\u00e7\u00e8\5\60\31\2\u00e8\u00e9\7\22\2\2\u00e9/\3\2"+
		"\2\2\u00ea\u00ed\5$\23\2\u00eb\u00ed\5\62\32\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\61\3\2\2\2\u00ee\u00ef\5\"\22\2\u00ef\u00f0\7\25"+
		"\2\2\u00f0\u00f1\78\2\2\u00f1\u00f3\7\r\2\2\u00f2\u00f4\5(\25\2\u00f3"+
		"\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7\16"+
		"\2\2\u00f6\63\3\2\2\2\u00f7\u00f8\58\35\2\u00f8\u00f9\5\66\34\2\u00f9"+
		"\u00fa\58\35\2\u00fa\65\3\2\2\2\u00fb\u00fc\t\5\2\2\u00fc\67\3\2\2\2\u00fd"+
		"\u0102\7\5\2\2\u00fe\u0102\7\6\2\2\u00ff\u0102\5\62\32\2\u0100\u0102\5"+
		".\30\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0100\3\2\2\2\u01029\3\2\2\2\u0103\u0104\b\36\1\2\u0104\u010b\5\"\22"+
		"\2\u0105\u010b\5&\24\2\u0106\u010b\5.\30\2\u0107\u010b\5\62\32\2\u0108"+
		"\u010b\5\64\33\2\u0109\u010b\5$\23\2\u010a\u0103\3\2\2\2\u010a\u0105\3"+
		"\2\2\2\u010a\u0106\3\2\2\2\u010a\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u0109\3\2\2\2\u010b\u0117\3\2\2\2\u010c\u010d\6\36\2\3\u010d\u010e\7"+
		"\4\2\2\u010e\u0116\5:\36\2\u010f\u0110\6\36\3\3\u0110\u0111\7\33\2\2\u0111"+
		"\u0112\5:\36\2\u0112\u0113\7\34\2\2\u0113\u0114\5:\36\2\u0114\u0116\3"+
		"\2\2\2\u0115\u010c\3\2\2\2\u0115\u010f\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118;\3\2\2\2\u0119\u0117\3\2\2\2"+
		"\32?ELQenw\u0082\u008a\u008d\u0090\u0097\u00a3\u00a7\u00ae\u00bc\u00de"+
		"\u00e3\u00ec\u00f3\u0101\u010a\u0115\u0117";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}