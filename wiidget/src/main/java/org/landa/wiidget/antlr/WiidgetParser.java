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
		JokerImport=1, LogicalOperator=2, MathematicalOperator=3, NegotionOperator=4, 
		CompareOperator=5, EqualityOperator=6, IMPORT=7, DEFAULT_OPERATOR=8, SEAM=9, 
		WiidgetVarSign=10, IntegerLiteral=11, FloatingPointLiteral=12, BooleanLiteral=13, 
		CharacterLiteral=14, StringLiteral=15, NullLiteral=16, IF=17, FOREACH=18, 
		LPAREN=19, RPAREN=20, LBRACE=21, RBRACE=22, LBRACK=23, RBRACK=24, SEMI=25, 
		COMMA=26, DOT=27, ASSIGN=28, GT=29, LT=30, BANG=31, TILDE=32, QUESTION=33, 
		COLON=34, EQUAL=35, LE=36, GE=37, NOTEQUAL=38, AND=39, OR=40, INC=41, 
		DEC=42, ADD=43, SUB=44, MUL=45, DIV=46, BITAND=47, BITOR=48, CARET=49, 
		MOD=50, ADD_ASSIGN=51, SUB_ASSIGN=52, MUL_ASSIGN=53, DIV_ASSIGN=54, AND_ASSIGN=55, 
		OR_ASSIGN=56, XOR_ASSIGN=57, MOD_ASSIGN=58, LSHIFT_ASSIGN=59, RSHIFT_ASSIGN=60, 
		URSHIFT_ASSIGN=61, Identifier=62, AT=63, ELLIPSIS=64, WS=65, COMMENT=66, 
		LINE_COMMENT=67;
	public static final String[] tokenNames = {
		"<INVALID>", "JokerImport", "LogicalOperator", "MathematicalOperator", 
		"NegotionOperator", "CompareOperator", "EqualityOperator", "'import'", 
		"DEFAULT_OPERATOR", "'seam'", "'$'", "IntegerLiteral", "FloatingPointLiteral", 
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
		RULE_wiidgetDeclaration = 6, RULE_wiidgetVariableBinding = 7, RULE_wiidgetVariable = 8, 
		RULE_wiidgetName = 9, RULE_wiidgetMethodCallExpression = 10, RULE_wiidgetArguments = 11, 
		RULE_seamStatement = 12, RULE_elementValuePairs = 13, RULE_elementValuePair = 14, 
		RULE_elementValue = 15, RULE_elementValueArrayInitializer = 16, RULE_importDeclaration = 17, 
		RULE_wiidgetBody = 18, RULE_qualifiedName = 19, RULE_literal = 20, RULE_expressionList = 21, 
		RULE_expression = 22, RULE_primary = 23;
	public static final String[] ruleNames = {
		"compilationUnit", "statementDeclaration", "controlStatement", "ifControl", 
		"foreachControl", "foreachVariable", "wiidgetDeclaration", "wiidgetVariableBinding", 
		"wiidgetVariable", "wiidgetName", "wiidgetMethodCallExpression", "wiidgetArguments", 
		"seamStatement", "elementValuePairs", "elementValuePair", "elementValue", 
		"elementValueArrayInitializer", "importDeclaration", "wiidgetBody", "qualifiedName", 
		"literal", "expressionList", "expression", "primary"
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(48); importDeclaration();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEAM) | (1L << WiidgetVarSign) | (1L << IF) | (1L << FOREACH) | (1L << LBRACE) | (1L << SEMI) | (1L << Identifier))) != 0)) {
				{
				{
				setState(54); statementDeclaration();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60); match(EOF);
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
			setState(68);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62); controlStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63); wiidgetDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64); wiidgetMethodCallExpression();
				setState(65); match(SEMI);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67); seamStatement();
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
			setState(73);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(70); ifControl();
				}
				break;
			case LBRACE:
			case SEMI:
				{
				}
				break;
			case FOREACH:
				{
				setState(72); foreachControl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(75); wiidgetBody();
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
			setState(77); match(IF);
			setState(78); match(LPAREN);
			setState(79); expression(0);
			setState(80); match(RPAREN);
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
			setState(82); match(FOREACH);
			setState(83); match(LPAREN);
			setState(84); foreachVariable();
			setState(85); match(COLON);
			setState(86); expression(0);
			setState(87); match(RPAREN);
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
			setState(89); match(Identifier);
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
			setState(92);
			_la = _input.LA(1);
			if (_la==WiidgetVarSign) {
				{
				setState(91); wiidgetVariableBinding();
				}
			}

			setState(94); wiidgetName();
			setState(96);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(95); wiidgetArguments();
				}
			}

			setState(98); wiidgetBody();
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
			setState(100); wiidgetVariable();
			setState(101); match(COLON);
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
			setState(103); match(WiidgetVarSign);
			setState(104); match(Identifier);
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(106); qualifiedName();
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
		enterRule(_localctx, 20, RULE_wiidgetMethodCallExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); wiidgetVariable();
			setState(109); match(DOT);
			setState(110); match(Identifier);
			setState(111); match(LPAREN);
			setState(113);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NegotionOperator) | (1L << WiidgetVarSign) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << Identifier))) != 0)) {
				{
				setState(112); expressionList();
				}
			}

			setState(115); match(RPAREN);
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
		enterRule(_localctx, 22, RULE_wiidgetArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(LPAREN);
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(118); elementValuePairs();
				}
				break;

			case 2:
				{
				setState(119); elementValue();
				}
				break;
			}
			setState(122); match(RPAREN);
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
		enterRule(_localctx, 24, RULE_seamStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(SEAM);
			setState(125); match(LPAREN);
			setState(126); expression(0);
			setState(127); match(RPAREN);
			setState(128); wiidgetBody();
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
		enterRule(_localctx, 26, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); elementValuePair();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131); match(COMMA);
				setState(132); elementValuePair();
				}
				}
				setState(137);
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
		enterRule(_localctx, 28, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(Identifier);
			setState(139); match(ASSIGN);
			setState(140); elementValue();
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
		enterRule(_localctx, 30, RULE_elementValue);
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143); qualifiedName();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144); elementValueArrayInitializer();
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
		enterRule(_localctx, 32, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(LBRACE);
			setState(156);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NegotionOperator) | (1L << WiidgetVarSign) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << Identifier))) != 0)) {
				{
				setState(148); elementValue();
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(149); match(COMMA);
						setState(150); elementValue();
						}
						} 
					}
					setState(155);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
			}

			setState(159);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(158); match(COMMA);
				}
			}

			setState(161); match(RBRACE);
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
		public TerminalNode JokerImport() { return getToken(WiidgetParser.JokerImport, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
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
		enterRule(_localctx, 34, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(IMPORT);
			setState(164); qualifiedName();
			setState(166);
			_la = _input.LA(1);
			if (_la==JokerImport) {
				{
				setState(165); match(JokerImport);
				}
			}

			setState(168); match(SEMI);
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
		enterRule(_localctx, 36, RULE_wiidgetBody);
		int _la;
		try {
			setState(179);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(170); match(SEMI);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); match(LBRACE);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEAM) | (1L << WiidgetVarSign) | (1L << IF) | (1L << FOREACH) | (1L << LBRACE) | (1L << SEMI) | (1L << Identifier))) != 0)) {
					{
					{
					setState(172); statementDeclaration();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178); match(RBRACE);
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
		enterRule(_localctx, 38, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(Identifier);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(182); match(DOT);
				setState(183); match(Identifier);
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
		enterRule(_localctx, 40, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		enterRule(_localctx, 42, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); expression(0);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(192); match(COMMA);
				setState(193); expression(0);
				}
				}
				setState(198);
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
		int _startState = 44;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(200); match(NegotionOperator);
				setState(201); expression(7);
				}
				break;

			case 2:
				{
				setState(202); primary();
				}
				break;

			case 3:
				{
				setState(203); wiidgetVariable();
				}
				break;

			case 4:
				{
				setState(204); wiidgetMethodCallExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(208); match(MathematicalOperator);
						setState(209); expression(7);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(211); match(CompareOperator);
						setState(212); expression(6);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(214); match(EqualityOperator);
						setState(215); expression(5);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(217); match(LogicalOperator);
						setState(218); expression(4);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(220); match(DEFAULT_OPERATOR);
						setState(221); expression(3);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(223); match(QUESTION);
						setState(224); expression(0);
						setState(225); match(COLON);
						setState(226); expression(2);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(229); match(DOT);
						setState(230); match(Identifier);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(232); match(LBRACK);
						setState(233); expression(0);
						setState(234); match(RBRACK);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(237); match(DOT);
						setState(238); match(Identifier);
						setState(239); match(LPAREN);
						setState(241);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NegotionOperator) | (1L << WiidgetVarSign) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << Identifier))) != 0)) {
							{
							setState(240); expressionList();
							}
						}

						setState(243); match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 46, RULE_primary);
		try {
			setState(255);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(249); match(Identifier);
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
				setState(250); literal();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(251); match(LPAREN);
				setState(252); expression(0);
				setState(253); match(RPAREN);
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
		case 22: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		"\2\3E\u0104\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\7\2:\n\2\f\2"+
		"\16\2=\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\5\4L"+
		"\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\5\b_\n\b\3\b\3\b\5\bc\n\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\5\ft\n\f\3\f\3\f\3\r\3\r\3\r\5\r{\n\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u0088\n\17\f\17\16\17\u008b"+
		"\13\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u0094\n\21\3\22\3\22\3"+
		"\22\3\22\7\22\u009a\n\22\f\22\16\22\u009d\13\22\5\22\u009f\n\22\3\22\5"+
		"\22\u00a2\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u00a9\n\23\3\23\3\23\3\24"+
		"\3\24\3\24\7\24\u00b0\n\24\f\24\16\24\u00b3\13\24\3\24\5\24\u00b6\n\24"+
		"\3\25\3\25\3\25\7\25\u00bb\n\25\f\25\16\25\u00be\13\25\3\26\3\26\3\27"+
		"\3\27\3\27\7\27\u00c5\n\27\f\27\16\27\u00c8\13\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u00d0\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f4\n\30"+
		"\3\30\7\30\u00f7\n\30\f\30\16\30\u00fa\13\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0102\n\31\3\31\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\2\3\3\r\22\u0111\2\65\3\2\2\2\4F\3\2\2\2\6K\3\2\2\2\bO\3"+
		"\2\2\2\nT\3\2\2\2\f[\3\2\2\2\16^\3\2\2\2\20f\3\2\2\2\22i\3\2\2\2\24l\3"+
		"\2\2\2\26n\3\2\2\2\30w\3\2\2\2\32~\3\2\2\2\34\u0084\3\2\2\2\36\u008c\3"+
		"\2\2\2 \u0093\3\2\2\2\"\u0095\3\2\2\2$\u00a5\3\2\2\2&\u00b5\3\2\2\2(\u00b7"+
		"\3\2\2\2*\u00bf\3\2\2\2,\u00c1\3\2\2\2.\u00cf\3\2\2\2\60\u0101\3\2\2\2"+
		"\62\64\5$\23\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2"+
		"\66;\3\2\2\2\67\65\3\2\2\28:\5\4\3\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3"+
		"\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\1\2\2?\3\3\2\2\2@G\5\6\4\2AG\5\16\b\2B"+
		"C\5\26\f\2CD\7\33\2\2DG\3\2\2\2EG\5\32\16\2F@\3\2\2\2FA\3\2\2\2FB\3\2"+
		"\2\2FE\3\2\2\2G\5\3\2\2\2HL\5\b\5\2IL\3\2\2\2JL\5\n\6\2KH\3\2\2\2KI\3"+
		"\2\2\2KJ\3\2\2\2LM\3\2\2\2MN\5&\24\2N\7\3\2\2\2OP\7\23\2\2PQ\7\25\2\2"+
		"QR\5.\30\2RS\7\26\2\2S\t\3\2\2\2TU\7\24\2\2UV\7\25\2\2VW\5\f\7\2WX\7$"+
		"\2\2XY\5.\30\2YZ\7\26\2\2Z\13\3\2\2\2[\\\7@\2\2\\\r\3\2\2\2]_\5\20\t\2"+
		"^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`b\5\24\13\2ac\5\30\r\2ba\3\2\2\2bc\3\2"+
		"\2\2cd\3\2\2\2de\5&\24\2e\17\3\2\2\2fg\5\22\n\2gh\7$\2\2h\21\3\2\2\2i"+
		"j\7\f\2\2jk\7@\2\2k\23\3\2\2\2lm\5(\25\2m\25\3\2\2\2no\5\22\n\2op\7\35"+
		"\2\2pq\7@\2\2qs\7\25\2\2rt\5,\27\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\26"+
		"\2\2v\27\3\2\2\2wz\7\25\2\2x{\5\34\17\2y{\5 \21\2zx\3\2\2\2zy\3\2\2\2"+
		"z{\3\2\2\2{|\3\2\2\2|}\7\26\2\2}\31\3\2\2\2~\177\7\13\2\2\177\u0080\7"+
		"\25\2\2\u0080\u0081\5.\30\2\u0081\u0082\7\26\2\2\u0082\u0083\5&\24\2\u0083"+
		"\33\3\2\2\2\u0084\u0089\5\36\20\2\u0085\u0086\7\34\2\2\u0086\u0088\5\36"+
		"\20\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\35\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7@\2\2"+
		"\u008d\u008e\7\36\2\2\u008e\u008f\5 \21\2\u008f\37\3\2\2\2\u0090\u0094"+
		"\5.\30\2\u0091\u0094\5(\25\2\u0092\u0094\5\"\22\2\u0093\u0090\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094!\3\2\2\2\u0095\u009e\7"+
		"\27\2\2\u0096\u009b\5 \21\2\u0097\u0098\7\34\2\2\u0098\u009a\5 \21\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u0096\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2\7\34\2\2\u00a1\u00a0\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\30\2\2\u00a4"+
		"#\3\2\2\2\u00a5\u00a6\7\t\2\2\u00a6\u00a8\5(\25\2\u00a7\u00a9\7\3\2\2"+
		"\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab"+
		"\7\33\2\2\u00ab%\3\2\2\2\u00ac\u00b6\7\33\2\2\u00ad\u00b1\7\27\2\2\u00ae"+
		"\u00b0\5\4\3\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b6\7\30\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b6\'\3\2\2"+
		"\2\u00b7\u00bc\7@\2\2\u00b8\u00b9\7\35\2\2\u00b9\u00bb\7@\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		")\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\t\2\2\2\u00c0+\3\2\2\2\u00c1"+
		"\u00c6\5.\30\2\u00c2\u00c3\7\34\2\2\u00c3\u00c5\5.\30\2\u00c4\u00c2\3"+
		"\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"-\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\b\30\1\2\u00ca\u00cb\7\6\2\2"+
		"\u00cb\u00d0\5.\30\2\u00cc\u00d0\5\60\31\2\u00cd\u00d0\5\22\n\2\u00ce"+
		"\u00d0\5\26\f\2\u00cf\u00c9\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00f8\3\2\2\2\u00d1\u00d2\6\30\2\3\u00d2"+
		"\u00d3\7\5\2\2\u00d3\u00f7\5.\30\2\u00d4\u00d5\6\30\3\3\u00d5\u00d6\7"+
		"\7\2\2\u00d6\u00f7\5.\30\2\u00d7\u00d8\6\30\4\3\u00d8\u00d9\7\b\2\2\u00d9"+
		"\u00f7\5.\30\2\u00da\u00db\6\30\5\3\u00db\u00dc\7\4\2\2\u00dc\u00f7\5"+
		".\30\2\u00dd\u00de\6\30\6\3\u00de\u00df\7\n\2\2\u00df\u00f7\5.\30\2\u00e0"+
		"\u00e1\6\30\7\3\u00e1\u00e2\7#\2\2\u00e2\u00e3\5.\30\2\u00e3\u00e4\7$"+
		"\2\2\u00e4\u00e5\5.\30\2\u00e5\u00f7\3\2\2\2\u00e6\u00e7\6\30\b\3\u00e7"+
		"\u00e8\7\35\2\2\u00e8\u00f7\7@\2\2\u00e9\u00ea\6\30\t\3\u00ea\u00eb\7"+
		"\31\2\2\u00eb\u00ec\5.\30\2\u00ec\u00ed\7\32\2\2\u00ed\u00f7\3\2\2\2\u00ee"+
		"\u00ef\6\30\n\3\u00ef\u00f0\7\35\2\2\u00f0\u00f1\7@\2\2\u00f1\u00f3\7"+
		"\25\2\2\u00f2\u00f4\5,\27\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f7\7\26\2\2\u00f6\u00d1\3\2\2\2\u00f6\u00d4\3"+
		"\2\2\2\u00f6\u00d7\3\2\2\2\u00f6\u00da\3\2\2\2\u00f6\u00dd\3\2\2\2\u00f6"+
		"\u00e0\3\2\2\2\u00f6\u00e6\3\2\2\2\u00f6\u00e9\3\2\2\2\u00f6\u00ee\3\2"+
		"\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"/\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u0102\7@\2\2\u00fc\u0102\5*\26\2\u00fd"+
		"\u00fe\7\25\2\2\u00fe\u00ff\5.\30\2\u00ff\u0100\7\26\2\2\u0100\u0102\3"+
		"\2\2\2\u0101\u00fb\3\2\2\2\u0101\u00fc\3\2\2\2\u0101\u00fd\3\2\2\2\u0102"+
		"\61\3\2\2\2\31\65;FK^bsz\u0089\u0093\u009b\u009e\u00a1\u00a8\u00b1\u00b5"+
		"\u00bc\u00c6\u00cf\u00f3\u00f6\u00f8\u0101";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}