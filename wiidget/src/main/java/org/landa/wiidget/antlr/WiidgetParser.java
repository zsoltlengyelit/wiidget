// Generated from C:\Users\Zsolti\Documents\GitHub\wiidget\wiidget\src\main\java\org\landa\wiidget\antlr\Wiidget.g4 by ANTLR 4.0
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
		T__1=1, T__0=2, LogicalOperator=3, MathematicalOperator=4, NegotionOperator=5, 
		CompareOperator=6, EqualityOperator=7, IMPORT=8, DEFAULT_OPERATOR=9, SEAM=10, 
		WiidgetVarSign=11, IntegerLiteral=12, FloatingPointLiteral=13, BooleanLiteral=14, 
		CharacterLiteral=15, StringLiteral=16, NullLiteral=17, IF=18, FOREACH=19, 
		LPAREN=20, RPAREN=21, LBRACE=22, RBRACE=23, LBRACK=24, RBRACK=25, SEMI=26, 
		COMMA=27, DOT=28, ARROW=29, ASSIGN=30, GT=31, LT=32, BANG=33, TILDE=34, 
		QUESTION=35, COLON=36, EQUAL=37, LE=38, GE=39, NOTEQUAL=40, AND=41, OR=42, 
		INC=43, DEC=44, ADD=45, SUB=46, MUL=47, DIV=48, BITAND=49, BITOR=50, CARET=51, 
		MOD=52, ADD_ASSIGN=53, SUB_ASSIGN=54, MUL_ASSIGN=55, DIV_ASSIGN=56, AND_ASSIGN=57, 
		OR_ASSIGN=58, XOR_ASSIGN=59, MOD_ASSIGN=60, LSHIFT_ASSIGN=61, RSHIFT_ASSIGN=62, 
		URSHIFT_ASSIGN=63, Identifier=64, AT=65, ELLIPSIS=66, WS=67, COMMENT=68, 
		LINE_COMMENT=69;
	public static final String[] tokenNames = {
		"<INVALID>", "'as'", "'`'", "LogicalOperator", "MathematicalOperator", 
		"NegotionOperator", "CompareOperator", "EqualityOperator", "'import'", 
		"DEFAULT_OPERATOR", "'seam'", "'$'", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "'null'", "'if'", 
		"'foreach'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'->'", "'='", "'>'", "'<'", "'!'", "TILDE", "'?'", "':'", "'=='", "'<='", 
		"'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", 
		"'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
		"'^='", "'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_statementDeclaration = 1, RULE_controlStatement = 2, 
		RULE_ifControl = 3, RULE_foreachControl = 4, RULE_foreachVariable = 5, 
		RULE_wiidgetDeclaration = 6, RULE_wiidgetVariableBinding = 7, RULE_wiidgetVariable = 8, 
		RULE_wiidgetName = 9, RULE_expressionWiidgetName = 10, RULE_wiidgetMethodCallExpression = 11, 
		RULE_wiidgetArguments = 12, RULE_seamStatement = 13, RULE_elementValuePairs = 14, 
		RULE_elementValuePair = 15, RULE_elementValue = 16, RULE_elementValueArrayInitializer = 17, 
		RULE_importDeclaration = 18, RULE_wiidgetBody = 19, RULE_qualifiedName = 20, 
		RULE_literal = 21, RULE_expressionList = 22, RULE_expression = 23, RULE_primary = 24;
	public static final String[] ruleNames = {
		"compilationUnit", "statementDeclaration", "controlStatement", "ifControl", 
		"foreachControl", "foreachVariable", "wiidgetDeclaration", "wiidgetVariableBinding", 
		"wiidgetVariable", "wiidgetName", "expressionWiidgetName", "wiidgetMethodCallExpression", 
		"wiidgetArguments", "seamStatement", "elementValuePairs", "elementValuePair", 
		"elementValue", "elementValueArrayInitializer", "importDeclaration", "wiidgetBody", 
		"qualifiedName", "literal", "expressionList", "expression", "primary"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(50); importDeclaration();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (2 - 2)) | (1L << (SEAM - 2)) | (1L << (WiidgetVarSign - 2)) | (1L << (StringLiteral - 2)) | (1L << (IF - 2)) | (1L << (FOREACH - 2)) | (1L << (LBRACE - 2)) | (1L << (SEMI - 2)) | (1L << (Identifier - 2)))) != 0)) {
				{
				{
				setState(56); statementDeclaration();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62); match(EOF);
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
		public WiidgetDeclarationContext wiidgetDeclaration() {
			return getRuleContext(WiidgetDeclarationContext.class,0);
		}
		public ControlStatementContext controlStatement() {
			return getRuleContext(ControlStatementContext.class,0);
		}
		public SeamStatementContext seamStatement() {
			return getRuleContext(SeamStatementContext.class,0);
		}
		public WiidgetMethodCallExpressionContext wiidgetMethodCallExpression() {
			return getRuleContext(WiidgetMethodCallExpressionContext.class,0);
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
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); controlStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); wiidgetDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66); wiidgetMethodCallExpression();
				setState(67); match(SEMI);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69); seamStatement();
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

	public static class ControlStatementContext extends ParserRuleContext {
		public ForeachControlContext foreachControl() {
			return getRuleContext(ForeachControlContext.class,0);
		}
		public IfControlContext ifControl() {
			return getRuleContext(IfControlContext.class,0);
		}
		public WiidgetBodyContext wiidgetBody() {
			return getRuleContext(WiidgetBodyContext.class,0);
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
			setState(75);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(72); ifControl();
				}
				break;
			case LBRACE:
			case SEMI:
				{
				}
				break;
			case FOREACH:
				{
				setState(74); foreachControl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(77); wiidgetBody();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
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
			setState(79); match(IF);
			setState(80); match(LPAREN);
			setState(81); expression(0);
			setState(82); match(RPAREN);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public TerminalNode FOREACH() { return getToken(WiidgetParser.FOREACH, 0); }
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
			setState(84); match(FOREACH);
			setState(85); match(LPAREN);
			setState(86); foreachVariable();
			setState(87); match(COLON);
			setState(88); expression(0);
			setState(89); match(RPAREN);
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
		public TerminalNode ARROW() { return getToken(WiidgetParser.ARROW, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(WiidgetParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(WiidgetParser.Identifier); }
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
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(91); match(Identifier);
				setState(92); match(ARROW);
				}
				break;
			}
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

	public static class WiidgetDeclarationContext extends ParserRuleContext {
		public WiidgetArgumentsContext wiidgetArguments() {
			return getRuleContext(WiidgetArgumentsContext.class,0);
		}
		public WiidgetNameContext wiidgetName() {
			return getRuleContext(WiidgetNameContext.class,0);
		}
		public WiidgetBodyContext wiidgetBody() {
			return getRuleContext(WiidgetBodyContext.class,0);
		}
		public WiidgetVariableBindingContext wiidgetVariableBinding() {
			return getRuleContext(WiidgetVariableBindingContext.class,0);
		}
		public WiidgetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiidgetDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWiidgetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWiidgetDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWiidgetDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WiidgetDeclarationContext wiidgetDeclaration() throws RecognitionException {
		WiidgetDeclarationContext _localctx = new WiidgetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_wiidgetDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if (_la==WiidgetVarSign) {
				{
				setState(97); wiidgetVariableBinding();
				}
			}

			setState(100); wiidgetName();
			setState(102);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(101); wiidgetArguments();
				}
			}

			setState(104); wiidgetBody();
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

	public static class WiidgetVariableBindingContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(WiidgetParser.COLON, 0); }
		public WiidgetVariableContext wiidgetVariable() {
			return getRuleContext(WiidgetVariableContext.class,0);
		}
		public WiidgetVariableBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiidgetVariableBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWiidgetVariableBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWiidgetVariableBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWiidgetVariableBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WiidgetVariableBindingContext wiidgetVariableBinding() throws RecognitionException {
		WiidgetVariableBindingContext _localctx = new WiidgetVariableBindingContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_wiidgetVariableBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); wiidgetVariable();
			setState(107); match(COLON);
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

	public static class WiidgetVariableContext extends ParserRuleContext {
		public TerminalNode WiidgetVarSign() { return getToken(WiidgetParser.WiidgetVarSign, 0); }
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public WiidgetVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiidgetVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWiidgetVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWiidgetVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWiidgetVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WiidgetVariableContext wiidgetVariable() throws RecognitionException {
		WiidgetVariableContext _localctx = new WiidgetVariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_wiidgetVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(WiidgetVarSign);
			setState(110); match(Identifier);
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

	public static class WiidgetNameContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(WiidgetParser.StringLiteral, 0); }
		public ExpressionWiidgetNameContext expressionWiidgetName() {
			return getRuleContext(ExpressionWiidgetNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public WiidgetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiidgetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWiidgetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWiidgetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWiidgetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WiidgetNameContext wiidgetName() throws RecognitionException {
		WiidgetNameContext _localctx = new WiidgetNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_wiidgetName);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case 2:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); expressionWiidgetName();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); match(Identifier);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(114); match(StringLiteral);
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

	public static class ExpressionWiidgetNameContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionWiidgetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionWiidgetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterExpressionWiidgetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitExpressionWiidgetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitExpressionWiidgetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionWiidgetNameContext expressionWiidgetName() throws RecognitionException {
		ExpressionWiidgetNameContext _localctx = new ExpressionWiidgetNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionWiidgetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(2);
			setState(118); expression(0);
			setState(119); match(2);
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

	public static class WiidgetMethodCallExpressionContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
		public WiidgetVariableContext wiidgetVariable() {
			return getRuleContext(WiidgetVariableContext.class,0);
		}
		public WiidgetMethodCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiidgetMethodCallExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWiidgetMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWiidgetMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWiidgetMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WiidgetMethodCallExpressionContext wiidgetMethodCallExpression() throws RecognitionException {
		WiidgetMethodCallExpressionContext _localctx = new WiidgetMethodCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_wiidgetMethodCallExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); wiidgetVariable();
			setState(122); match(DOT);
			setState(123); match(Identifier);
			setState(124); match(LPAREN);
			setState(126);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (NegotionOperator - 5)) | (1L << (WiidgetVarSign - 5)) | (1L << (IntegerLiteral - 5)) | (1L << (FloatingPointLiteral - 5)) | (1L << (BooleanLiteral - 5)) | (1L << (CharacterLiteral - 5)) | (1L << (StringLiteral - 5)) | (1L << (NullLiteral - 5)) | (1L << (LPAREN - 5)) | (1L << (Identifier - 5)))) != 0)) {
				{
				setState(125); expressionList();
				}
			}

			setState(128); match(RPAREN);
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

	public static class WiidgetArgumentsContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public WiidgetArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiidgetArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWiidgetArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWiidgetArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWiidgetArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WiidgetArgumentsContext wiidgetArguments() throws RecognitionException {
		WiidgetArgumentsContext _localctx = new WiidgetArgumentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_wiidgetArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(LPAREN);
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(131); elementValuePairs();
				}
				break;

			case 2:
				{
				setState(132); elementValue();
				}
				break;
			}
			setState(135); match(RPAREN);
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

	public static class SeamStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public TerminalNode SEAM() { return getToken(WiidgetParser.SEAM, 0); }
		public WiidgetBodyContext wiidgetBody() {
			return getRuleContext(WiidgetBodyContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
		public SeamStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seamStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterSeamStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitSeamStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitSeamStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeamStatementContext seamStatement() throws RecognitionException {
		SeamStatementContext _localctx = new SeamStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_seamStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(SEAM);
			setState(138); match(LPAREN);
			setState(139); expression(0);
			setState(140); match(RPAREN);
			setState(141); wiidgetBody();
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
		enterRule(_localctx, 28, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); elementValuePair();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144); match(COMMA);
				setState(145); elementValuePair();
				}
				}
				setState(150);
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
		enterRule(_localctx, 30, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(Identifier);
			setState(152); match(ASSIGN);
			setState(153); elementValue();
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
		enterRule(_localctx, 32, RULE_elementValue);
		try {
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); qualifiedName();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157); elementValueArrayInitializer();
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
		enterRule(_localctx, 34, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(LBRACE);
			setState(169);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (NegotionOperator - 5)) | (1L << (WiidgetVarSign - 5)) | (1L << (IntegerLiteral - 5)) | (1L << (FloatingPointLiteral - 5)) | (1L << (BooleanLiteral - 5)) | (1L << (CharacterLiteral - 5)) | (1L << (StringLiteral - 5)) | (1L << (NullLiteral - 5)) | (1L << (LPAREN - 5)) | (1L << (LBRACE - 5)) | (1L << (Identifier - 5)))) != 0)) {
				{
				setState(161); elementValue();
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(162); match(COMMA);
						setState(163); elementValue();
						}
						} 
					}
					setState(168);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
			}

			setState(172);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(171); match(COMMA);
				}
			}

			setState(174); match(RBRACE);
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
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
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
		enterRule(_localctx, 36, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(IMPORT);
			setState(177); qualifiedName();
			setState(180);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(178); match(1);
				setState(179); match(Identifier);
				}
			}

			setState(182); match(SEMI);
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

	public static class WiidgetBodyContext extends ParserRuleContext {
		public List<StatementDeclarationContext> statementDeclaration() {
			return getRuleContexts(StatementDeclarationContext.class);
		}
		public StatementDeclarationContext statementDeclaration(int i) {
			return getRuleContext(StatementDeclarationContext.class,i);
		}
		public WiidgetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiidgetBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWiidgetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWiidgetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWiidgetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WiidgetBodyContext wiidgetBody() throws RecognitionException {
		WiidgetBodyContext _localctx = new WiidgetBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_wiidgetBody);
		int _la;
		try {
			setState(193);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); match(SEMI);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); match(LBRACE);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (2 - 2)) | (1L << (SEAM - 2)) | (1L << (WiidgetVarSign - 2)) | (1L << (StringLiteral - 2)) | (1L << (IF - 2)) | (1L << (FOREACH - 2)) | (1L << (LBRACE - 2)) | (1L << (SEMI - 2)) | (1L << (Identifier - 2)))) != 0)) {
					{
					{
					setState(186); statementDeclaration();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192); match(RBRACE);
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
		enterRule(_localctx, 40, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(Identifier);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(196); match(DOT);
				setState(197); match(Identifier);
				}
				}
				setState(202);
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
		enterRule(_localctx, 42, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		enterRule(_localctx, 44, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); expression(0);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(206); match(COMMA);
				setState(207); expression(0);
				}
				}
				setState(212);
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public TerminalNode RBRACK() { return getToken(WiidgetParser.RBRACK, 0); }
		public TerminalNode COLON() { return getToken(WiidgetParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public TerminalNode DEFAULT_OPERATOR() { return getToken(WiidgetParser.DEFAULT_OPERATOR, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(WiidgetParser.LBRACK, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(WiidgetParser.QUESTION, 0); }
		public TerminalNode LogicalOperator() { return getToken(WiidgetParser.LogicalOperator, 0); }
		public TerminalNode CompareOperator() { return getToken(WiidgetParser.CompareOperator, 0); }
		public WiidgetVariableContext wiidgetVariable() {
			return getRuleContext(WiidgetVariableContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(WiidgetParser.DOT, 0); }
		public TerminalNode EqualityOperator() { return getToken(WiidgetParser.EqualityOperator, 0); }
		public TerminalNode MathematicalOperator() { return getToken(WiidgetParser.MathematicalOperator, 0); }
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public TerminalNode NegotionOperator() { return getToken(WiidgetParser.NegotionOperator, 0); }
		public WiidgetMethodCallExpressionContext wiidgetMethodCallExpression() {
			return getRuleContext(WiidgetMethodCallExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
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
		int _startState = 46;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(214); match(NegotionOperator);
				setState(215); expression(7);
				}
				break;

			case 2:
				{
				setState(216); primary();
				}
				break;

			case 3:
				{
				setState(217); wiidgetVariable();
				}
				break;

			case 4:
				{
				setState(218); wiidgetMethodCallExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(258);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(222); match(MathematicalOperator);
						setState(223); expression(7);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(225); match(CompareOperator);
						setState(226); expression(6);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(228); match(EqualityOperator);
						setState(229); expression(5);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(231); match(LogicalOperator);
						setState(232); expression(4);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(234); match(DEFAULT_OPERATOR);
						setState(235); expression(3);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(237); match(QUESTION);
						setState(238); expression(0);
						setState(239); match(COLON);
						setState(240); expression(2);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(243); match(DOT);
						setState(244); match(Identifier);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(246); match(LBRACK);
						setState(247); expression(0);
						setState(248); match(RBRACK);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(251); match(DOT);
						setState(252); match(Identifier);
						setState(253); match(LPAREN);
						setState(255);
						_la = _input.LA(1);
						if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (NegotionOperator - 5)) | (1L << (WiidgetVarSign - 5)) | (1L << (IntegerLiteral - 5)) | (1L << (FloatingPointLiteral - 5)) | (1L << (BooleanLiteral - 5)) | (1L << (CharacterLiteral - 5)) | (1L << (StringLiteral - 5)) | (1L << (NullLiteral - 5)) | (1L << (LPAREN - 5)) | (1L << (Identifier - 5)))) != 0)) {
							{
							setState(254); expressionList();
							}
						}

						setState(257); match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(262);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primary);
		try {
			setState(269);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(263); match(Identifier);
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
				setState(264); literal();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(265); match(LPAREN);
				setState(266); expression(0);
				setState(267); match(RPAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 6 >= _localctx._p;

		case 1: return 5 >= _localctx._p;

		case 2: return 4 >= _localctx._p;

		case 3: return 3 >= _localctx._p;

		case 4: return 2 >= _localctx._p;

		case 5: return 1 >= _localctx._p;

		case 6: return 10 >= _localctx._p;

		case 7: return 9 >= _localctx._p;

		case 8: return 8 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3G\u0112\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\7\2<"+
		"\n\2\f\2\16\2?\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\4\3\4\3"+
		"\4\5\4N\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\5\7`\n\7\3\7\3\7\3\b\5\be\n\b\3\b\3\b\5\bi\n\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\5\13v\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0081\n\r\3\r\3\r\3\16\3\16\3\16\5\16\u0088\n\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u0095\n\20\f\20\16"+
		"\20\u0098\13\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00a1\n\22\3\23"+
		"\3\23\3\23\3\23\7\23\u00a7\n\23\f\23\16\23\u00aa\13\23\5\23\u00ac\n\23"+
		"\3\23\5\23\u00af\n\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00b7\n\24\3"+
		"\24\3\24\3\25\3\25\3\25\7\25\u00be\n\25\f\25\16\25\u00c1\13\25\3\25\5"+
		"\25\u00c4\n\25\3\26\3\26\3\26\7\26\u00c9\n\26\f\26\16\26\u00cc\13\26\3"+
		"\27\3\27\3\30\3\30\3\30\7\30\u00d3\n\30\f\30\16\30\u00d6\13\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u00de\n\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0102\n\31\3\31\7\31\u0105\n\31\f\31\16\31\u0108\13\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0110\n\32\3\32\2\33\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\2\3\3\16\23\u0121\2\67\3\2\2\2\4H\3\2\2"+
		"\2\6M\3\2\2\2\bQ\3\2\2\2\nV\3\2\2\2\f_\3\2\2\2\16d\3\2\2\2\20l\3\2\2\2"+
		"\22o\3\2\2\2\24u\3\2\2\2\26w\3\2\2\2\30{\3\2\2\2\32\u0084\3\2\2\2\34\u008b"+
		"\3\2\2\2\36\u0091\3\2\2\2 \u0099\3\2\2\2\"\u00a0\3\2\2\2$\u00a2\3\2\2"+
		"\2&\u00b2\3\2\2\2(\u00c3\3\2\2\2*\u00c5\3\2\2\2,\u00cd\3\2\2\2.\u00cf"+
		"\3\2\2\2\60\u00dd\3\2\2\2\62\u010f\3\2\2\2\64\66\5&\24\2\65\64\3\2\2\2"+
		"\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28=\3\2\2\29\67\3\2\2\2:<\5\4\3\2"+
		";:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\1\2\2"+
		"A\3\3\2\2\2BI\5\6\4\2CI\5\16\b\2DE\5\30\r\2EF\7\34\2\2FI\3\2\2\2GI\5\34"+
		"\17\2HB\3\2\2\2HC\3\2\2\2HD\3\2\2\2HG\3\2\2\2I\5\3\2\2\2JN\5\b\5\2KN\3"+
		"\2\2\2LN\5\n\6\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2NO\3\2\2\2OP\5(\25\2P\7"+
		"\3\2\2\2QR\7\24\2\2RS\7\26\2\2ST\5\60\31\2TU\7\27\2\2U\t\3\2\2\2VW\7\25"+
		"\2\2WX\7\26\2\2XY\5\f\7\2YZ\7&\2\2Z[\5\60\31\2[\\\7\27\2\2\\\13\3\2\2"+
		"\2]^\7B\2\2^`\7\37\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7B\2\2b\r\3\2\2"+
		"\2ce\5\20\t\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fh\5\24\13\2gi\5\32\16\2hg"+
		"\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\5(\25\2k\17\3\2\2\2lm\5\22\n\2mn\7&\2\2"+
		"n\21\3\2\2\2op\7\r\2\2pq\7B\2\2q\23\3\2\2\2rv\5\26\f\2sv\7B\2\2tv\7\22"+
		"\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\25\3\2\2\2wx\7\4\2\2xy\5\60\31\2y"+
		"z\7\4\2\2z\27\3\2\2\2{|\5\22\n\2|}\7\36\2\2}~\7B\2\2~\u0080\7\26\2\2\177"+
		"\u0081\5.\30\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0083\7\27\2\2\u0083\31\3\2\2\2\u0084\u0087\7\26\2\2\u0085\u0088"+
		"\5\36\20\2\u0086\u0088\5\"\22\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2"+
		"\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\27\2\2\u008a"+
		"\33\3\2\2\2\u008b\u008c\7\f\2\2\u008c\u008d\7\26\2\2\u008d\u008e\5\60"+
		"\31\2\u008e\u008f\7\27\2\2\u008f\u0090\5(\25\2\u0090\35\3\2\2\2\u0091"+
		"\u0096\5 \21\2\u0092\u0093\7\35\2\2\u0093\u0095\5 \21\2\u0094\u0092\3"+
		"\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\37\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7B\2\2\u009a\u009b\7 \2\2"+
		"\u009b\u009c\5\"\22\2\u009c!\3\2\2\2\u009d\u00a1\5\60\31\2\u009e\u00a1"+
		"\5*\26\2\u009f\u00a1\5$\23\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1#\3\2\2\2\u00a2\u00ab\7\30\2\2\u00a3\u00a8\5\"\22"+
		"\2\u00a4\u00a5\7\35\2\2\u00a5\u00a7\5\"\22\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00af\7\35\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3"+
		"\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\31\2\2\u00b1%\3\2\2\2\u00b2\u00b3"+
		"\7\n\2\2\u00b3\u00b6\5*\26\2\u00b4\u00b5\7\3\2\2\u00b5\u00b7\7B\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\34"+
		"\2\2\u00b9\'\3\2\2\2\u00ba\u00c4\7\34\2\2\u00bb\u00bf\7\30\2\2\u00bc\u00be"+
		"\5\4\3\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\7\31"+
		"\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c4)\3\2\2\2\u00c5\u00ca"+
		"\7B\2\2\u00c6\u00c7\7\36\2\2\u00c7\u00c9\7B\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb+\3\2\2\2"+
		"\u00cc\u00ca\3\2\2\2\u00cd\u00ce\t\2\2\2\u00ce-\3\2\2\2\u00cf\u00d4\5"+
		"\60\31\2\u00d0\u00d1\7\35\2\2\u00d1\u00d3\5\60\31\2\u00d2\u00d0\3\2\2"+
		"\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5/"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\b\31\1\2\u00d8\u00d9\7\7\2\2"+
		"\u00d9\u00de\5\60\31\2\u00da\u00de\5\62\32\2\u00db\u00de\5\22\n\2\u00dc"+
		"\u00de\5\30\r\2\u00dd\u00d7\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3"+
		"\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u0106\3\2\2\2\u00df\u00e0\6\31\2\3\u00e0"+
		"\u00e1\7\6\2\2\u00e1\u0105\5\60\31\2\u00e2\u00e3\6\31\3\3\u00e3\u00e4"+
		"\7\b\2\2\u00e4\u0105\5\60\31\2\u00e5\u00e6\6\31\4\3\u00e6\u00e7\7\t\2"+
		"\2\u00e7\u0105\5\60\31\2\u00e8\u00e9\6\31\5\3\u00e9\u00ea\7\5\2\2\u00ea"+
		"\u0105\5\60\31\2\u00eb\u00ec\6\31\6\3\u00ec\u00ed\7\13\2\2\u00ed\u0105"+
		"\5\60\31\2\u00ee\u00ef\6\31\7\3\u00ef\u00f0\7%\2\2\u00f0\u00f1\5\60\31"+
		"\2\u00f1\u00f2\7&\2\2\u00f2\u00f3\5\60\31\2\u00f3\u0105\3\2\2\2\u00f4"+
		"\u00f5\6\31\b\3\u00f5\u00f6\7\36\2\2\u00f6\u0105\7B\2\2\u00f7\u00f8\6"+
		"\31\t\3\u00f8\u00f9\7\32\2\2\u00f9\u00fa\5\60\31\2\u00fa\u00fb\7\33\2"+
		"\2\u00fb\u0105\3\2\2\2\u00fc\u00fd\6\31\n\3\u00fd\u00fe\7\36\2\2\u00fe"+
		"\u00ff\7B\2\2\u00ff\u0101\7\26\2\2\u0100\u0102\5.\30\2\u0101\u0100\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\7\27\2\2\u0104"+
		"\u00df\3\2\2\2\u0104\u00e2\3\2\2\2\u0104\u00e5\3\2\2\2\u0104\u00e8\3\2"+
		"\2\2\u0104\u00eb\3\2\2\2\u0104\u00ee\3\2\2\2\u0104\u00f4\3\2\2\2\u0104"+
		"\u00f7\3\2\2\2\u0104\u00fc\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\61\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0110"+
		"\7B\2\2\u010a\u0110\5,\27\2\u010b\u010c\7\26\2\2\u010c\u010d\5\60\31\2"+
		"\u010d\u010e\7\27\2\2\u010e\u0110\3\2\2\2\u010f\u0109\3\2\2\2\u010f\u010a"+
		"\3\2\2\2\u010f\u010b\3\2\2\2\u0110\63\3\2\2\2\33\67=HM_dhu\u0080\u0087"+
		"\u0096\u00a0\u00a8\u00ab\u00ae\u00b6\u00bf\u00c3\u00ca\u00d4\u00dd\u0101"+
		"\u0104\u0106\u010f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}