// Generated from D:\projects\wiidget\src\main\java\landa\wiidget\antlr\Wiidget.g4 by ANTLR 4.0
package org.landa.wiidget.antlr;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class WiidgetBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements WiidgetVisitor<T> {
	@Override public T visitExpression(WiidgetParser.ExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitParExpression(WiidgetParser.ParExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitForeachControl(WiidgetParser.ForeachControlContext ctx) { return visitChildren(ctx); }

	@Override public T visitCompilationUnit(WiidgetParser.CompilationUnitContext ctx) { return visitChildren(ctx); }

	@Override public T visitElementValue(WiidgetParser.ElementValueContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpressionList(WiidgetParser.ExpressionListContext ctx) { return visitChildren(ctx); }

	@Override public T visitIfControl(WiidgetParser.IfControlContext ctx) { return visitChildren(ctx); }

	@Override public T visitWidgetName(WiidgetParser.WidgetNameContext ctx) { return visitChildren(ctx); }

	@Override public T visitStatementExpression(WiidgetParser.StatementExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitQualifiedName(WiidgetParser.QualifiedNameContext ctx) { return visitChildren(ctx); }

	@Override public T visitElementValuePairs(WiidgetParser.ElementValuePairsContext ctx) { return visitChildren(ctx); }

	@Override public T visitElementValuePair(WiidgetParser.ElementValuePairContext ctx) { return visitChildren(ctx); }

	@Override public T visitBooleanExpressionPart(WiidgetParser.BooleanExpressionPartContext ctx) { return visitChildren(ctx); }

	@Override public T visitElementValueArrayInitializer(WiidgetParser.ElementValueArrayInitializerContext ctx) { return visitChildren(ctx); }

	@Override public T visitArguments(WiidgetParser.ArgumentsContext ctx) { return visitChildren(ctx); }

	@Override public T visitSuperSuffix(WiidgetParser.SuperSuffixContext ctx) { return visitChildren(ctx); }

	@Override public T visitConstantExpression(WiidgetParser.ConstantExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitControlStatement(WiidgetParser.ControlStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitWidgetArguments(WiidgetParser.WidgetArgumentsContext ctx) { return visitChildren(ctx); }

	@Override public T visitBooleanExpression(WiidgetParser.BooleanExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitWidgetBody(WiidgetParser.WidgetBodyContext ctx) { return visitChildren(ctx); }

	@Override public T visitJokerImport(WiidgetParser.JokerImportContext ctx) { return visitChildren(ctx); }

	@Override public T visitStatementDeclaration(WiidgetParser.StatementDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitImportDeclaration(WiidgetParser.ImportDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitForeachVariable(WiidgetParser.ForeachVariableContext ctx) { return visitChildren(ctx); }

	@Override public T visitWidgetDeclaration(WiidgetParser.WidgetDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitLiteral(WiidgetParser.LiteralContext ctx) { return visitChildren(ctx); }
}