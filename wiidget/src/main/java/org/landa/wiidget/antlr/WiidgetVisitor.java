// Generated from D:\projects\wiidget\src\main\java\landa\wiidget\antlr\Wiidget.g4 by ANTLR 4.0
package org.landa.wiidget.antlr;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface WiidgetVisitor<T> extends ParseTreeVisitor<T> {
	T visitExpression(WiidgetParser.ExpressionContext ctx);

	T visitParExpression(WiidgetParser.ParExpressionContext ctx);

	T visitForeachControl(WiidgetParser.ForeachControlContext ctx);

	T visitCompilationUnit(WiidgetParser.CompilationUnitContext ctx);

	T visitElementValue(WiidgetParser.ElementValueContext ctx);

	T visitExpressionList(WiidgetParser.ExpressionListContext ctx);

	T visitIfControl(WiidgetParser.IfControlContext ctx);

	T visitWidgetName(WiidgetParser.WidgetNameContext ctx);

	T visitStatementExpression(WiidgetParser.StatementExpressionContext ctx);

	T visitQualifiedName(WiidgetParser.QualifiedNameContext ctx);

	T visitElementValuePairs(WiidgetParser.ElementValuePairsContext ctx);

	T visitElementValuePair(WiidgetParser.ElementValuePairContext ctx);

	T visitBooleanExpressionPart(WiidgetParser.BooleanExpressionPartContext ctx);

	T visitElementValueArrayInitializer(WiidgetParser.ElementValueArrayInitializerContext ctx);

	T visitArguments(WiidgetParser.ArgumentsContext ctx);

	T visitSuperSuffix(WiidgetParser.SuperSuffixContext ctx);

	T visitConstantExpression(WiidgetParser.ConstantExpressionContext ctx);

	T visitControlStatement(WiidgetParser.ControlStatementContext ctx);

	T visitWidgetArguments(WiidgetParser.WidgetArgumentsContext ctx);

	T visitBooleanExpression(WiidgetParser.BooleanExpressionContext ctx);

	T visitWidgetBody(WiidgetParser.WidgetBodyContext ctx);

	T visitJokerImport(WiidgetParser.JokerImportContext ctx);

	T visitStatementDeclaration(WiidgetParser.StatementDeclarationContext ctx);

	T visitImportDeclaration(WiidgetParser.ImportDeclarationContext ctx);

	T visitForeachVariable(WiidgetParser.ForeachVariableContext ctx);

	T visitWidgetDeclaration(WiidgetParser.WidgetDeclarationContext ctx);

	T visitLiteral(WiidgetParser.LiteralContext ctx);
}