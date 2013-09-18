// Generated from D:\projects\wiidget\wiidget\src\main\java\org\landa\wiidget\antlr\Wiidget.g4 by ANTLR 4.0
package org.landa.wiidget.antlr;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface WiidgetListener extends ParseTreeListener {
	void enterExpression(WiidgetParser.ExpressionContext ctx);
	void exitExpression(WiidgetParser.ExpressionContext ctx);

	void enterWiidgetDeclaration(WiidgetParser.WiidgetDeclarationContext ctx);
	void exitWiidgetDeclaration(WiidgetParser.WiidgetDeclarationContext ctx);

	void enterWiidgetArguments(WiidgetParser.WiidgetArgumentsContext ctx);
	void exitWiidgetArguments(WiidgetParser.WiidgetArgumentsContext ctx);

	void enterForeachControl(WiidgetParser.ForeachControlContext ctx);
	void exitForeachControl(WiidgetParser.ForeachControlContext ctx);

	void enterElementValue(WiidgetParser.ElementValueContext ctx);
	void exitElementValue(WiidgetParser.ElementValueContext ctx);

	void enterCompilationUnit(WiidgetParser.CompilationUnitContext ctx);
	void exitCompilationUnit(WiidgetParser.CompilationUnitContext ctx);

	void enterExpressionList(WiidgetParser.ExpressionListContext ctx);
	void exitExpressionList(WiidgetParser.ExpressionListContext ctx);

	void enterIfControl(WiidgetParser.IfControlContext ctx);
	void exitIfControl(WiidgetParser.IfControlContext ctx);

	void enterQualifiedName(WiidgetParser.QualifiedNameContext ctx);
	void exitQualifiedName(WiidgetParser.QualifiedNameContext ctx);

	void enterWiidgetName(WiidgetParser.WiidgetNameContext ctx);
	void exitWiidgetName(WiidgetParser.WiidgetNameContext ctx);

	void enterWiidgetBody(WiidgetParser.WiidgetBodyContext ctx);
	void exitWiidgetBody(WiidgetParser.WiidgetBodyContext ctx);

	void enterWiidgetVariableBinding(WiidgetParser.WiidgetVariableBindingContext ctx);
	void exitWiidgetVariableBinding(WiidgetParser.WiidgetVariableBindingContext ctx);

	void enterElementValuePair(WiidgetParser.ElementValuePairContext ctx);
	void exitElementValuePair(WiidgetParser.ElementValuePairContext ctx);

	void enterElementValuePairs(WiidgetParser.ElementValuePairsContext ctx);
	void exitElementValuePairs(WiidgetParser.ElementValuePairsContext ctx);

	void enterSeamStatement(WiidgetParser.SeamStatementContext ctx);
	void exitSeamStatement(WiidgetParser.SeamStatementContext ctx);

	void enterWiidgetVariable(WiidgetParser.WiidgetVariableContext ctx);
	void exitWiidgetVariable(WiidgetParser.WiidgetVariableContext ctx);

	void enterElementValueArrayInitializer(WiidgetParser.ElementValueArrayInitializerContext ctx);
	void exitElementValueArrayInitializer(WiidgetParser.ElementValueArrayInitializerContext ctx);

	void enterPrimary(WiidgetParser.PrimaryContext ctx);
	void exitPrimary(WiidgetParser.PrimaryContext ctx);

	void enterControlStatement(WiidgetParser.ControlStatementContext ctx);
	void exitControlStatement(WiidgetParser.ControlStatementContext ctx);

	void enterStatementDeclaration(WiidgetParser.StatementDeclarationContext ctx);
	void exitStatementDeclaration(WiidgetParser.StatementDeclarationContext ctx);

	void enterWiidgetMethodCallExpression(WiidgetParser.WiidgetMethodCallExpressionContext ctx);
	void exitWiidgetMethodCallExpression(WiidgetParser.WiidgetMethodCallExpressionContext ctx);

	void enterImportDeclaration(WiidgetParser.ImportDeclarationContext ctx);
	void exitImportDeclaration(WiidgetParser.ImportDeclarationContext ctx);

	void enterForeachVariable(WiidgetParser.ForeachVariableContext ctx);
	void exitForeachVariable(WiidgetParser.ForeachVariableContext ctx);

	void enterLiteral(WiidgetParser.LiteralContext ctx);
	void exitLiteral(WiidgetParser.LiteralContext ctx);
}