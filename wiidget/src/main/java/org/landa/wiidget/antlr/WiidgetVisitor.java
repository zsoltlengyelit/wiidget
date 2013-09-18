// Generated from D:\projects\wiidget\wiidget\src\main\java\org\landa\wiidget\antlr\Wiidget.g4 by ANTLR 4.0
package org.landa.wiidget.antlr;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface WiidgetVisitor<T> extends ParseTreeVisitor<T> {
	T visitExpression(WiidgetParser.ExpressionContext ctx);

	T visitWiidgetDeclaration(WiidgetParser.WiidgetDeclarationContext ctx);

	T visitWiidgetArguments(WiidgetParser.WiidgetArgumentsContext ctx);

	T visitForeachControl(WiidgetParser.ForeachControlContext ctx);

	T visitElementValue(WiidgetParser.ElementValueContext ctx);

	T visitCompilationUnit(WiidgetParser.CompilationUnitContext ctx);

	T visitExpressionList(WiidgetParser.ExpressionListContext ctx);

	T visitIfControl(WiidgetParser.IfControlContext ctx);

	T visitQualifiedName(WiidgetParser.QualifiedNameContext ctx);

	T visitWiidgetName(WiidgetParser.WiidgetNameContext ctx);

	T visitWiidgetBody(WiidgetParser.WiidgetBodyContext ctx);

	T visitWiidgetVariableBinding(WiidgetParser.WiidgetVariableBindingContext ctx);

	T visitElementValuePair(WiidgetParser.ElementValuePairContext ctx);

	T visitElementValuePairs(WiidgetParser.ElementValuePairsContext ctx);

	T visitSeamStatement(WiidgetParser.SeamStatementContext ctx);

	T visitWiidgetVariable(WiidgetParser.WiidgetVariableContext ctx);

	T visitElementValueArrayInitializer(WiidgetParser.ElementValueArrayInitializerContext ctx);

	T visitPrimary(WiidgetParser.PrimaryContext ctx);

	T visitControlStatement(WiidgetParser.ControlStatementContext ctx);

	T visitStatementDeclaration(WiidgetParser.StatementDeclarationContext ctx);

	T visitWiidgetMethodCallExpression(WiidgetParser.WiidgetMethodCallExpressionContext ctx);

	T visitImportDeclaration(WiidgetParser.ImportDeclarationContext ctx);

	T visitForeachVariable(WiidgetParser.ForeachVariableContext ctx);

	T visitLiteral(WiidgetParser.LiteralContext ctx);
}