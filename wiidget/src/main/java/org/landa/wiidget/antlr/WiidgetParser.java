// Generated from C:\Users\lzsolt\Documents\GitHub\wiidget\wiidget\src\main\java\org\landa\wiidget\antlr\Wiidget.g4 by ANTLR 4.1
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
		T__0=1, LogicalOperator=2, MathematicalOperator=3, NegotionOperator=4, 
		CompareOperator=5, EqualityOperator=6, IMPORT=7, DEFAULT_OPERATOR=8, SEAM=9, 
		WiidgetVarSign=10, IntegerLiteral=11, FloatingPointLiteral=12, BooleanLiteral=13, 
		CharacterLiteral=14, StringLiteral=15, NullLiteral=16, IF=17, FOREACH=18, 
		AS=19, LPAREN=20, RPAREN=21, LBRACE=22, RBRACE=23, LBRACK=24, RBRACK=25, 
		SEMI=26, COMMA=27, DOT=28, ARROW=29, ASSIGN=30, GT=31, LT=32, BANG=33, 
		TILDE=34, QUESTION=35, COLON=36, EQUAL=37, LE=38, GE=39, NOTEQUAL=40, 
		AND=41, OR=42, INC=43, DEC=44, ADD=45, SUB=46, MUL=47, DIV=48, BITAND=49, 
		BITOR=50, CARET=51, MOD=52, ADD_ASSIGN=53, SUB_ASSIGN=54, MUL_ASSIGN=55, 
		DIV_ASSIGN=56, AND_ASSIGN=57, OR_ASSIGN=58, XOR_ASSIGN=59, MOD_ASSIGN=60, 
		LSHIFT_ASSIGN=61, RSHIFT_ASSIGN=62, URSHIFT_ASSIGN=63, Identifier=64, 
		WS=65, COMMENT=66, LINE_COMMENT=67;
	public static final String[] tokenNames = {
		"<INVALID>", "'`'", "LogicalOperator", "MathematicalOperator", "NegotionOperator", 
		"CompareOperator", "EqualityOperator", "'import'", "DEFAULT_OPERATOR", 
		"'seam'", "'$'", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "'null'", "'if'", "'foreach'", "'as'", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", 
		"'='", "'>'", "'<'", "'!'", "TILDE", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_innerImport = 2, 
		RULE_externalImport = 3, RULE_statementDeclaration = 4, RULE_controlStatement = 5, 
		RULE_ifControl = 6, RULE_foreachControl = 7, RULE_foreachVariable = 8, 
		RULE_wiidgetDeclaration = 9, RULE_wiidgetVariableBinding = 10, RULE_wiidgetVariable = 11, 
		RULE_unifiedWiidgetName = 12, RULE_expressionWiidgetName = 13, RULE_wiidgetMethodCallExpression = 14, 
		RULE_seamStatement = 15, RULE_wiidgetArguments = 16, RULE_elementValuePairs = 17, 
		RULE_elementValuePair = 18, RULE_elementValue = 19, RULE_elementValueArrayInitializer = 20, 
		RULE_wiidgetBody = 21, RULE_qualifiedName = 22, RULE_literal = 23, RULE_expressionList = 24, 
		RULE_expression = 25, RULE_primary = 26;
	public static final String[] ruleNames = {
		"compilationUnit", "importDeclaration", "innerImport", "externalImport", 
		"statementDeclaration", "controlStatement", "ifControl", "foreachControl", 
		"foreachVariable", "wiidgetDeclaration", "wiidgetVariableBinding", "wiidgetVariable", 
		"unifiedWiidgetName", "expressionWiidgetName", "wiidgetMethodCallExpression", 
		"seamStatement", "wiidgetArguments", "elementValuePairs", "elementValuePair", 
		"elementValue", "elementValueArrayInitializer", "wiidgetBody", "qualifiedName", 
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
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(WiidgetParser.EOF, 0); }
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public StatementDeclarationContext statementDeclaration(int i) {
			return getRuleContext(StatementDeclarationContext.class,i);
		}
		public List<StatementDeclarationContext> statementDeclaration() {
			return getRuleContexts(StatementDeclarationContext.class);
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(54); importDeclaration();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (1 - 1)) | (1L << (SEAM - 1)) | (1L << (WiidgetVarSign - 1)) | (1L << (StringLiteral - 1)) | (1L << (IF - 1)) | (1L << (FOREACH - 1)) | (1L << (LBRACE - 1)) | (1L << (SEMI - 1)) | (1L << (Identifier - 1)))) != 0)) {
				{
				{
				setState(60); statementDeclaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66); match(EOF);
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
		public ExternalImportContext externalImport() {
			return getRuleContext(ExternalImportContext.class,0);
		}
		public InnerImportContext innerImport() {
			return getRuleContext(InnerImportContext.class,0);
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
		enterRule(_localctx, 2, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(IMPORT);
			setState(71);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(69); innerImport();
				}
				break;
			case StringLiteral:
				{
				setState(70); externalImport();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(73); match(SEMI);
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

	public static class InnerImportContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(WiidgetParser.AS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public InnerImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterInnerImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitInnerImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitInnerImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerImportContext innerImport() throws RecognitionException {
		InnerImportContext _localctx = new InnerImportContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_innerImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); qualifiedName();
			setState(78);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(76); match(AS);
				setState(77); match(Identifier);
				}
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

	public static class ExternalImportContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(WiidgetParser.AS, 0); }
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(WiidgetParser.StringLiteral, 0); }
		public ExternalImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterExternalImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitExternalImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitExternalImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalImportContext externalImport() throws RecognitionException {
		ExternalImportContext _localctx = new ExternalImportContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_externalImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(StringLiteral);
			setState(81); match(AS);
			setState(82); match(Identifier);
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
		public SeamStatementContext seamStatement() {
			return getRuleContext(SeamStatementContext.class,0);
		}
		public WiidgetMethodCallExpressionContext wiidgetMethodCallExpression() {
			return getRuleContext(WiidgetMethodCallExpressionContext.class,0);
		}
		public WiidgetDeclarationContext wiidgetDeclaration() {
			return getRuleContext(WiidgetDeclarationContext.class,0);
		}
		public ControlStatementContext controlStatement() {
			return getRuleContext(ControlStatementContext.class,0);
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
		enterRule(_localctx, 8, RULE_statementDeclaration);
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); controlStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); wiidgetDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86); wiidgetMethodCallExpression();
				setState(87); match(SEMI);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89); seamStatement();
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
		public IfControlContext ifControl() {
			return getRuleContext(IfControlContext.class,0);
		}
		public WiidgetBodyContext wiidgetBody() {
			return getRuleContext(WiidgetBodyContext.class,0);
		}
		public ForeachControlContext foreachControl() {
			return getRuleContext(ForeachControlContext.class,0);
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
		enterRule(_localctx, 10, RULE_controlStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(92); ifControl();
				}
				break;
			case LBRACE:
			case SEMI:
				{
				}
				break;
			case FOREACH:
				{
				setState(94); foreachControl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(97); wiidgetBody();
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
		public TerminalNode IF() { return getToken(WiidgetParser.IF, 0); }
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
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
		enterRule(_localctx, 12, RULE_ifControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(IF);
			setState(100); match(LPAREN);
			setState(101); expression(0);
			setState(102); match(RPAREN);
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
		public ForeachVariableContext foreachVariable() {
			return getRuleContext(ForeachVariableContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
		public TerminalNode FOREACH() { return getToken(WiidgetParser.FOREACH, 0); }
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
		enterRule(_localctx, 14, RULE_foreachControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(FOREACH);
			setState(105); match(LPAREN);
			setState(106); foreachVariable();
			setState(107); match(COLON);
			setState(108); expression(0);
			setState(109); match(RPAREN);
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
		enterRule(_localctx, 16, RULE_foreachVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(111); match(Identifier);
				setState(112); match(ARROW);
				}
				break;
			}
			setState(115); match(Identifier);
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
		public WiidgetVariableBindingContext wiidgetVariableBinding() {
			return getRuleContext(WiidgetVariableBindingContext.class,0);
		}
		public WiidgetArgumentsContext wiidgetArguments() {
			return getRuleContext(WiidgetArgumentsContext.class,0);
		}
		public UnifiedWiidgetNameContext unifiedWiidgetName() {
			return getRuleContext(UnifiedWiidgetNameContext.class,0);
		}
		public WiidgetBodyContext wiidgetBody() {
			return getRuleContext(WiidgetBodyContext.class,0);
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
		enterRule(_localctx, 18, RULE_wiidgetDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if (_la==WiidgetVarSign) {
				{
				setState(117); wiidgetVariableBinding();
				}
			}

			setState(120); unifiedWiidgetName();
			setState(122);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(121); wiidgetArguments();
				}
			}

			setState(124); wiidgetBody();
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
		public WiidgetVariableContext wiidgetVariable() {
			return getRuleContext(WiidgetVariableContext.class,0);
		}
		public TerminalNode COLON() { return getToken(WiidgetParser.COLON, 0); }
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
		enterRule(_localctx, 20, RULE_wiidgetVariableBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); wiidgetVariable();
			setState(127); match(COLON);
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
		enterRule(_localctx, 22, RULE_wiidgetVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(WiidgetVarSign);
			setState(130); match(Identifier);
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

	public static class UnifiedWiidgetNameContext extends ParserRuleContext {
		public ExpressionWiidgetNameContext expressionWiidgetName() {
			return getRuleContext(ExpressionWiidgetNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(WiidgetParser.StringLiteral, 0); }
		public UnifiedWiidgetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unifiedWiidgetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterUnifiedWiidgetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitUnifiedWiidgetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitUnifiedWiidgetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnifiedWiidgetNameContext unifiedWiidgetName() throws RecognitionException {
		UnifiedWiidgetNameContext _localctx = new UnifiedWiidgetNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unifiedWiidgetName);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); expressionWiidgetName();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); match(Identifier);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(134); match(StringLiteral);
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
		enterRule(_localctx, 26, RULE_expressionWiidgetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(1);
			setState(138); expression(0);
			setState(139); match(1);
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
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
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
		enterRule(_localctx, 28, RULE_wiidgetMethodCallExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); wiidgetVariable();
			setState(142); match(DOT);
			setState(143); match(Identifier);
			setState(144); match(LPAREN);
			setState(146);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (NegotionOperator - 4)) | (1L << (WiidgetVarSign - 4)) | (1L << (IntegerLiteral - 4)) | (1L << (FloatingPointLiteral - 4)) | (1L << (BooleanLiteral - 4)) | (1L << (CharacterLiteral - 4)) | (1L << (StringLiteral - 4)) | (1L << (NullLiteral - 4)) | (1L << (LPAREN - 4)) | (1L << (Identifier - 4)))) != 0)) {
				{
				setState(145); expressionList();
				}
			}

			setState(148); match(RPAREN);
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
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public TerminalNode SEAM() { return getToken(WiidgetParser.SEAM, 0); }
		public WiidgetBodyContext wiidgetBody() {
			return getRuleContext(WiidgetBodyContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 30, RULE_seamStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(SEAM);
			setState(151); match(LPAREN);
			setState(152); expression(0);
			setState(153); match(RPAREN);
			setState(154); wiidgetBody();
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
		enterRule(_localctx, 32, RULE_wiidgetArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(LPAREN);
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(157); elementValue();
				}
				break;

			case 2:
				{
				setState(158); elementValuePairs();
				}
				break;
			}
			setState(161); match(RPAREN);
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
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
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
		enterRule(_localctx, 34, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); elementValuePair();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(164); match(COMMA);
				setState(165); elementValuePair();
				}
				}
				setState(170);
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
		enterRule(_localctx, 36, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(Identifier);
			setState(172); match(ASSIGN);
			setState(173); elementValue();
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 38, RULE_elementValue);
		try {
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176); qualifiedName();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177); elementValueArrayInitializer();
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
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
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
		enterRule(_localctx, 40, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(LBRACE);
			setState(189);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (NegotionOperator - 4)) | (1L << (WiidgetVarSign - 4)) | (1L << (IntegerLiteral - 4)) | (1L << (FloatingPointLiteral - 4)) | (1L << (BooleanLiteral - 4)) | (1L << (CharacterLiteral - 4)) | (1L << (StringLiteral - 4)) | (1L << (NullLiteral - 4)) | (1L << (LPAREN - 4)) | (1L << (LBRACE - 4)) | (1L << (Identifier - 4)))) != 0)) {
				{
				setState(181); elementValue();
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(182); match(COMMA);
					setState(183); elementValue();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(191); match(RBRACE);
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
		public StatementDeclarationContext statementDeclaration(int i) {
			return getRuleContext(StatementDeclarationContext.class,i);
		}
		public List<StatementDeclarationContext> statementDeclaration() {
			return getRuleContexts(StatementDeclarationContext.class);
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
		enterRule(_localctx, 42, RULE_wiidgetBody);
		int _la;
		try {
			setState(202);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); match(SEMI);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(194); match(LBRACE);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (1 - 1)) | (1L << (SEAM - 1)) | (1L << (WiidgetVarSign - 1)) | (1L << (StringLiteral - 1)) | (1L << (IF - 1)) | (1L << (FOREACH - 1)) | (1L << (LBRACE - 1)) | (1L << (SEMI - 1)) | (1L << (Identifier - 1)))) != 0)) {
					{
					{
					setState(195); statementDeclaration();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201); match(RBRACE);
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
		enterRule(_localctx, 44, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(Identifier);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(205); match(DOT);
				setState(206); match(Identifier);
				}
				}
				setState(211);
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
		public TerminalNode NullLiteral() { return getToken(WiidgetParser.NullLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(WiidgetParser.CharacterLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(WiidgetParser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(WiidgetParser.StringLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(WiidgetParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(WiidgetParser.BooleanLiteral, 0); }
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
		enterRule(_localctx, 46, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
		enterRule(_localctx, 48, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); expression(0);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(215); match(COMMA);
				setState(216); expression(0);
				}
				}
				setState(221);
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
		public TerminalNode QUESTION() { return getToken(WiidgetParser.QUESTION, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public TerminalNode NegotionOperator() { return getToken(WiidgetParser.NegotionOperator, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
		public TerminalNode EqualityOperator() { return getToken(WiidgetParser.EqualityOperator, 0); }
		public TerminalNode LBRACK() { return getToken(WiidgetParser.LBRACK, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode LogicalOperator() { return getToken(WiidgetParser.LogicalOperator, 0); }
		public TerminalNode DOT() { return getToken(WiidgetParser.DOT, 0); }
		public TerminalNode MathematicalOperator() { return getToken(WiidgetParser.MathematicalOperator, 0); }
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public WiidgetMethodCallExpressionContext wiidgetMethodCallExpression() {
			return getRuleContext(WiidgetMethodCallExpressionContext.class,0);
		}
		public TerminalNode CompareOperator() { return getToken(WiidgetParser.CompareOperator, 0); }
		public TerminalNode DEFAULT_OPERATOR() { return getToken(WiidgetParser.DEFAULT_OPERATOR, 0); }
		public WiidgetVariableContext wiidgetVariable() {
			return getRuleContext(WiidgetVariableContext.class,0);
		}
		public TerminalNode COLON() { return getToken(WiidgetParser.COLON, 0); }
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
		int _startState = 50;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(223); match(NegotionOperator);
				setState(224); expression(7);
				}
				break;

			case 2:
				{
				setState(225); primary();
				}
				break;

			case 3:
				{
				setState(226); wiidgetVariable();
				}
				break;

			case 4:
				{
				setState(227); wiidgetMethodCallExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(267);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(231); match(MathematicalOperator);
						setState(232); expression(7);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(234); match(CompareOperator);
						setState(235); expression(6);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(237); match(EqualityOperator);
						setState(238); expression(5);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(239);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(240); match(LogicalOperator);
						setState(241); expression(4);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(243); match(DEFAULT_OPERATOR);
						setState(244); expression(3);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(246); match(QUESTION);
						setState(247); expression(0);
						setState(248); match(COLON);
						setState(249); expression(2);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(252); match(DOT);
						setState(253); match(Identifier);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(254);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(255); match(LBRACK);
						setState(256); expression(0);
						setState(257); match(RBRACK);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(259);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(260); match(DOT);
						setState(261); match(Identifier);
						setState(262); match(LPAREN);
						setState(264);
						_la = _input.LA(1);
						if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (NegotionOperator - 4)) | (1L << (WiidgetVarSign - 4)) | (1L << (IntegerLiteral - 4)) | (1L << (FloatingPointLiteral - 4)) | (1L << (BooleanLiteral - 4)) | (1L << (CharacterLiteral - 4)) | (1L << (StringLiteral - 4)) | (1L << (NullLiteral - 4)) | (1L << (LPAREN - 4)) | (1L << (Identifier - 4)))) != 0)) {
							{
							setState(263); expressionList();
							}
						}

						setState(266); match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(271);
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
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_primary);
		try {
			setState(278);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(272); match(Identifier);
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
				setState(273); literal();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(274); match(LPAREN);
				setState(275); expression(0);
				setState(276); match(RPAREN);
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
		case 25: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3E\u011b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\5\3J\n\3\3\3\3\3\3\4\3\4\3\4\5\4"+
		"Q\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\5\7"+
		"b\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\5\nt\n\n\3\n\3\n\3\13\5\13y\n\13\3\13\3\13\5\13}\n\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u008a\n\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0095\n\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\5\22\u00a2\n\22\3\22\3\22\3\23\3\23\3\23\7\23"+
		"\u00a9\n\23\f\23\16\23\u00ac\13\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\5\25\u00b5\n\25\3\26\3\26\3\26\3\26\7\26\u00bb\n\26\f\26\16\26\u00be"+
		"\13\26\5\26\u00c0\n\26\3\26\3\26\3\27\3\27\3\27\7\27\u00c7\n\27\f\27\16"+
		"\27\u00ca\13\27\3\27\5\27\u00cd\n\27\3\30\3\30\3\30\7\30\u00d2\n\30\f"+
		"\30\16\30\u00d5\13\30\3\31\3\31\3\32\3\32\3\32\7\32\u00dc\n\32\f\32\16"+
		"\32\u00df\13\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00e7\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u010b\n\33\3\33\7\33\u010e\n\33\f\33\16\33\u0111"+
		"\13\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0119\n\34\3\34\2\35\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\3\3\2\r\22\u0128"+
		"\2;\3\2\2\2\4F\3\2\2\2\6M\3\2\2\2\bR\3\2\2\2\n\\\3\2\2\2\fa\3\2\2\2\16"+
		"e\3\2\2\2\20j\3\2\2\2\22s\3\2\2\2\24x\3\2\2\2\26\u0080\3\2\2\2\30\u0083"+
		"\3\2\2\2\32\u0089\3\2\2\2\34\u008b\3\2\2\2\36\u008f\3\2\2\2 \u0098\3\2"+
		"\2\2\"\u009e\3\2\2\2$\u00a5\3\2\2\2&\u00ad\3\2\2\2(\u00b4\3\2\2\2*\u00b6"+
		"\3\2\2\2,\u00cc\3\2\2\2.\u00ce\3\2\2\2\60\u00d6\3\2\2\2\62\u00d8\3\2\2"+
		"\2\64\u00e6\3\2\2\2\66\u0118\3\2\2\28:\5\4\3\298\3\2\2\2:=\3\2\2\2;9\3"+
		"\2\2\2;<\3\2\2\2<A\3\2\2\2=;\3\2\2\2>@\5\n\6\2?>\3\2\2\2@C\3\2\2\2A?\3"+
		"\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\2\2\3E\3\3\2\2\2FI\7\t\2\2GJ"+
		"\5\6\4\2HJ\5\b\5\2IG\3\2\2\2IH\3\2\2\2JK\3\2\2\2KL\7\34\2\2L\5\3\2\2\2"+
		"MP\5.\30\2NO\7\25\2\2OQ\7B\2\2PN\3\2\2\2PQ\3\2\2\2Q\7\3\2\2\2RS\7\21\2"+
		"\2ST\7\25\2\2TU\7B\2\2U\t\3\2\2\2V]\5\f\7\2W]\5\24\13\2XY\5\36\20\2YZ"+
		"\7\34\2\2Z]\3\2\2\2[]\5 \21\2\\V\3\2\2\2\\W\3\2\2\2\\X\3\2\2\2\\[\3\2"+
		"\2\2]\13\3\2\2\2^b\5\16\b\2_b\3\2\2\2`b\5\20\t\2a^\3\2\2\2a_\3\2\2\2a"+
		"`\3\2\2\2bc\3\2\2\2cd\5,\27\2d\r\3\2\2\2ef\7\23\2\2fg\7\26\2\2gh\5\64"+
		"\33\2hi\7\27\2\2i\17\3\2\2\2jk\7\24\2\2kl\7\26\2\2lm\5\22\n\2mn\7&\2\2"+
		"no\5\64\33\2op\7\27\2\2p\21\3\2\2\2qr\7B\2\2rt\7\37\2\2sq\3\2\2\2st\3"+
		"\2\2\2tu\3\2\2\2uv\7B\2\2v\23\3\2\2\2wy\5\26\f\2xw\3\2\2\2xy\3\2\2\2y"+
		"z\3\2\2\2z|\5\32\16\2{}\5\"\22\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\5"+
		",\27\2\177\25\3\2\2\2\u0080\u0081\5\30\r\2\u0081\u0082\7&\2\2\u0082\27"+
		"\3\2\2\2\u0083\u0084\7\f\2\2\u0084\u0085\7B\2\2\u0085\31\3\2\2\2\u0086"+
		"\u008a\5\34\17\2\u0087\u008a\7B\2\2\u0088\u008a\7\21\2\2\u0089\u0086\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\33\3\2\2\2\u008b"+
		"\u008c\7\3\2\2\u008c\u008d\5\64\33\2\u008d\u008e\7\3\2\2\u008e\35\3\2"+
		"\2\2\u008f\u0090\5\30\r\2\u0090\u0091\7\36\2\2\u0091\u0092\7B\2\2\u0092"+
		"\u0094\7\26\2\2\u0093\u0095\5\62\32\2\u0094\u0093\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\27\2\2\u0097\37\3\2\2\2\u0098"+
		"\u0099\7\13\2\2\u0099\u009a\7\26\2\2\u009a\u009b\5\64\33\2\u009b\u009c"+
		"\7\27\2\2\u009c\u009d\5,\27\2\u009d!\3\2\2\2\u009e\u00a1\7\26\2\2\u009f"+
		"\u00a2\5(\25\2\u00a0\u00a2\5$\23\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\27\2\2\u00a4"+
		"#\3\2\2\2\u00a5\u00aa\5&\24\2\u00a6\u00a7\7\35\2\2\u00a7\u00a9\5&\24\2"+
		"\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab%\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7B\2\2\u00ae\u00af"+
		"\7 \2\2\u00af\u00b0\5(\25\2\u00b0\'\3\2\2\2\u00b1\u00b5\5\64\33\2\u00b2"+
		"\u00b5\5.\30\2\u00b3\u00b5\5*\26\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b3\3\2\2\2\u00b5)\3\2\2\2\u00b6\u00bf\7\30\2\2\u00b7\u00bc"+
		"\5(\25\2\u00b8\u00b9\7\35\2\2\u00b9\u00bb\5(\25\2\u00ba\u00b8\3\2\2\2"+
		"\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\7\31\2\2\u00c2+\3\2\2\2\u00c3\u00cd\7\34\2"+
		"\2\u00c4\u00c8\7\30\2\2\u00c5\u00c7\5\n\6\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\7\31\2\2\u00cc\u00c3\3\2\2\2\u00cc"+
		"\u00c4\3\2\2\2\u00cd-\3\2\2\2\u00ce\u00d3\7B\2\2\u00cf\u00d0\7\36\2\2"+
		"\u00d0\u00d2\7B\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4/\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d7\t\2\2\2\u00d7\61\3\2\2\2\u00d8\u00dd\5\64\33\2\u00d9\u00da\7\35"+
		"\2\2\u00da\u00dc\5\64\33\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\63\3\2\2\2\u00df\u00dd\3\2\2"+
		"\2\u00e0\u00e1\b\33\1\2\u00e1\u00e2\7\6\2\2\u00e2\u00e7\5\64\33\2\u00e3"+
		"\u00e7\5\66\34\2\u00e4\u00e7\5\30\r\2\u00e5\u00e7\5\36\20\2\u00e6\u00e0"+
		"\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u010f\3\2\2\2\u00e8\u00e9\6\33\2\3\u00e9\u00ea\7\5\2\2\u00ea\u010e\5"+
		"\64\33\2\u00eb\u00ec\6\33\3\3\u00ec\u00ed\7\7\2\2\u00ed\u010e\5\64\33"+
		"\2\u00ee\u00ef\6\33\4\3\u00ef\u00f0\7\b\2\2\u00f0\u010e\5\64\33\2\u00f1"+
		"\u00f2\6\33\5\3\u00f2\u00f3\7\4\2\2\u00f3\u010e\5\64\33\2\u00f4\u00f5"+
		"\6\33\6\3\u00f5\u00f6\7\n\2\2\u00f6\u010e\5\64\33\2\u00f7\u00f8\6\33\7"+
		"\3\u00f8\u00f9\7%\2\2\u00f9\u00fa\5\64\33\2\u00fa\u00fb\7&\2\2\u00fb\u00fc"+
		"\5\64\33\2\u00fc\u010e\3\2\2\2\u00fd\u00fe\6\33\b\3\u00fe\u00ff\7\36\2"+
		"\2\u00ff\u010e\7B\2\2\u0100\u0101\6\33\t\3\u0101\u0102\7\32\2\2\u0102"+
		"\u0103\5\64\33\2\u0103\u0104\7\33\2\2\u0104\u010e\3\2\2\2\u0105\u0106"+
		"\6\33\n\3\u0106\u0107\7\36\2\2\u0107\u0108\7B\2\2\u0108\u010a\7\26\2\2"+
		"\u0109\u010b\5\62\32\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010e\7\27\2\2\u010d\u00e8\3\2\2\2\u010d\u00eb\3\2\2\2"+
		"\u010d\u00ee\3\2\2\2\u010d\u00f1\3\2\2\2\u010d\u00f4\3\2\2\2\u010d\u00f7"+
		"\3\2\2\2\u010d\u00fd\3\2\2\2\u010d\u0100\3\2\2\2\u010d\u0105\3\2\2\2\u010e"+
		"\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\65\3\2\2"+
		"\2\u0111\u010f\3\2\2\2\u0112\u0119\7B\2\2\u0113\u0119\5\60\31\2\u0114"+
		"\u0115\7\26\2\2\u0115\u0116\5\64\33\2\u0116\u0117\7\27\2\2\u0117\u0119"+
		"\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0113\3\2\2\2\u0118\u0114\3\2\2\2\u0119"+
		"\67\3\2\2\2\33;AIP\\asx|\u0089\u0094\u00a1\u00aa\u00b4\u00bc\u00bf\u00c8"+
		"\u00cc\u00d3\u00dd\u00e6\u010a\u010d\u010f\u0118";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}