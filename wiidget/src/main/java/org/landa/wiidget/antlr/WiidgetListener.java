// Generated from D:\projects\wiidget\src\main\java\landa\wiidget\antlr\Wiidget.g4 by ANTLR 4.0
package org.landa.wiidget.antlr;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface WiidgetListener extends ParseTreeListener {
	void enterExpression(WiidgetParser.ExpressionContext ctx);
	void exitExpression(WiidgetParser.ExpressionContext ctx);

	void enterParExpression(WiidgetParser.ParExpressionContext ctx);
	void exitParExpression(WiidgetParser.ParExpressionContext ctx);

	void enterForeachControl(WiidgetParser.ForeachControlContext ctx);
	void exitForeachControl(WiidgetParser.ForeachControlContext ctx);

	void enterCompilationUnit(WiidgetParser.CompilationUnitContext ctx);
	void exitCompilationUnit(WiidgetParser.CompilationUnitContext ctx);

	void enterElementValue(WiidgetParser.ElementValueContext ctx);
	void exitElementValue(WiidgetParser.ElementValueContext ctx);

	void enterExpressionList(WiidgetParser.ExpressionListContext ctx);
	void exitExpressionList(WiidgetParser.ExpressionListContext ctx);

	void enterIfControl(WiidgetParser.IfControlContext ctx);
	void exitIfControl(WiidgetParser.IfControlContext ctx);

	void enterWidgetName(WiidgetParser.WidgetNameContext ctx);
	void exitWidgetName(WiidgetParser.WidgetNameContext ctx);

	void enterStatementExpression(WiidgetParser.StatementExpressionContext ctx);
	void exitStatementExpression(WiidgetParser.StatementExpressionContext ctx);

	void enterQualifiedName(WiidgetParser.QualifiedNameContext ctx);
	void exitQualifiedName(WiidgetParser.QualifiedNameContext ctx);

	void enterElementValuePairs(WiidgetParser.ElementValuePairsContext ctx);
	void exitElementValuePairs(WiidgetParser.ElementValuePairsContext ctx);

	void enterElementValuePair(WiidgetParser.ElementValuePairContext ctx);
	void exitElementValuePair(WiidgetParser.ElementValuePairContext ctx);

	void enterBooleanExpressionPart(WiidgetParser.BooleanExpressionPartContext ctx);
	void exitBooleanExpressionPart(WiidgetParser.BooleanExpressionPartContext ctx);

	void enterElementValueArrayInitializer(WiidgetParser.ElementValueArrayInitializerContext ctx);
	void exitElementValueArrayInitializer(WiidgetParser.ElementValueArrayInitializerContext ctx);

	void enterArguments(WiidgetParser.ArgumentsContext ctx);
	void exitArguments(WiidgetParser.ArgumentsContext ctx);

	void enterSuperSuffix(WiidgetParser.SuperSuffixContext ctx);
	void exitSuperSuffix(WiidgetParser.SuperSuffixContext ctx);

	void enterConstantExpression(WiidgetParser.ConstantExpressionContext ctx);
	void exitConstantExpression(WiidgetParser.ConstantExpressionContext ctx);

	void enterControlStatement(WiidgetParser.ControlStatementContext ctx);
	void exitControlStatement(WiidgetParser.ControlStatementContext ctx);

	void enterWidgetArguments(WiidgetParser.WidgetArgumentsContext ctx);
	void exitWidgetArguments(WiidgetParser.WidgetArgumentsContext ctx);

	void enterBooleanExpression(WiidgetParser.BooleanExpressionContext ctx);
	void exitBooleanExpression(WiidgetParser.BooleanExpressionContext ctx);

	void enterWidgetBody(WiidgetParser.WidgetBodyContext ctx);
	void exitWidgetBody(WiidgetParser.WidgetBodyContext ctx);

	void enterJokerImport(WiidgetParser.JokerImportContext ctx);
	void exitJokerImport(WiidgetParser.JokerImportContext ctx);

	void enterStatementDeclaration(WiidgetParser.StatementDeclarationContext ctx);
	void exitStatementDeclaration(WiidgetParser.StatementDeclarationContext ctx);

	void enterImportDeclaration(WiidgetParser.ImportDeclarationContext ctx);
	void exitImportDeclaration(WiidgetParser.ImportDeclarationContext ctx);

	void enterForeachVariable(WiidgetParser.ForeachVariableContext ctx);
	void exitForeachVariable(WiidgetParser.ForeachVariableContext ctx);

	void enterWidgetDeclaration(WiidgetParser.WidgetDeclarationContext ctx);
	void exitWidgetDeclaration(WiidgetParser.WidgetDeclarationContext ctx);

	void enterLiteral(WiidgetParser.LiteralContext ctx);
	void exitLiteral(WiidgetParser.LiteralContext ctx);
}