// Generated from D:\projects\wiidget\wiidget\src\main\java\org\landa\wiidget\antlr\Wiidget.g4 by ANTLR 4.0
package org.landa.wiidget.antlr;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface WiidgetVisitor<T> extends ParseTreeVisitor<T> {
	T visitExpression(WiidgetParser.ExpressionContext ctx);

	T visitElementValue(WiidgetParser.ElementValueContext ctx);

	T visitCompilationUnit(WiidgetParser.CompilationUnitContext ctx);

	T visitExpressionList(WiidgetParser.ExpressionListContext ctx);

	T visitIndexExpression(WiidgetParser.IndexExpressionContext ctx);

	T visitIndexingExpression(WiidgetParser.IndexingExpressionContext ctx);

	T visitElementValueArrayInitializer(WiidgetParser.ElementValueArrayInitializerContext ctx);

	T visitMathematicalOperandExpression(WiidgetParser.MathematicalOperandExpressionContext ctx);

	T visitControlStatement(WiidgetParser.ControlStatementContext ctx);

	T visitJokerImport(WiidgetParser.JokerImportContext ctx);

	T visitWidgetBody(WiidgetParser.WidgetBodyContext ctx);

	T visitMethodCallExpression(WiidgetParser.MethodCallExpressionContext ctx);

	T visitForeachVariable(WiidgetParser.ForeachVariableContext ctx);

	T visitImportDeclaration(WiidgetParser.ImportDeclarationContext ctx);

	T visitMathematicalOperator(WiidgetParser.MathematicalOperatorContext ctx);

	T visitWidgetDeclaration(WiidgetParser.WidgetDeclarationContext ctx);

	T visitParExpression(WiidgetParser.ParExpressionContext ctx);

	T visitForeachControl(WiidgetParser.ForeachControlContext ctx);

	T visitWidgetName(WiidgetParser.WidgetNameContext ctx);

	T visitIfControl(WiidgetParser.IfControlContext ctx);

	T visitMathematicalExpression(WiidgetParser.MathematicalExpressionContext ctx);

	T visitQualifiedName(WiidgetParser.QualifiedNameContext ctx);

	T visitElementValuePair(WiidgetParser.ElementValuePairContext ctx);

	T visitElementValuePairs(WiidgetParser.ElementValuePairsContext ctx);

	T visitBooleanExpressionPart(WiidgetParser.BooleanExpressionPartContext ctx);

	T visitWidgetArguments(WiidgetParser.WidgetArgumentsContext ctx);

	T visitBooleanExpression(WiidgetParser.BooleanExpressionContext ctx);

	T visitStatementDeclaration(WiidgetParser.StatementDeclarationContext ctx);

	T visitLiteral(WiidgetParser.LiteralContext ctx);
}