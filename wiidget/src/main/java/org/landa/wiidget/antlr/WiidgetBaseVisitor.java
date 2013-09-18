// Generated from D:\projects\wiidget\wiidget\src\main\java\org\landa\wiidget\antlr\Wiidget.g4 by ANTLR 4.0
package org.landa.wiidget.antlr;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class WiidgetBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements WiidgetVisitor<T> {
	@Override public T visitExpression(WiidgetParser.ExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitWiidgetDeclaration(WiidgetParser.WiidgetDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitWiidgetArguments(WiidgetParser.WiidgetArgumentsContext ctx) { return visitChildren(ctx); }

	@Override public T visitForeachControl(WiidgetParser.ForeachControlContext ctx) { return visitChildren(ctx); }

	@Override public T visitElementValue(WiidgetParser.ElementValueContext ctx) { return visitChildren(ctx); }

	@Override public T visitCompilationUnit(WiidgetParser.CompilationUnitContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpressionList(WiidgetParser.ExpressionListContext ctx) { return visitChildren(ctx); }

	@Override public T visitIfControl(WiidgetParser.IfControlContext ctx) { return visitChildren(ctx); }

	@Override public T visitQualifiedName(WiidgetParser.QualifiedNameContext ctx) { return visitChildren(ctx); }

	@Override public T visitWiidgetName(WiidgetParser.WiidgetNameContext ctx) { return visitChildren(ctx); }

	@Override public T visitWiidgetBody(WiidgetParser.WiidgetBodyContext ctx) { return visitChildren(ctx); }

	@Override public T visitWiidgetVariableBinding(WiidgetParser.WiidgetVariableBindingContext ctx) { return visitChildren(ctx); }

	@Override public T visitElementValuePair(WiidgetParser.ElementValuePairContext ctx) { return visitChildren(ctx); }

	@Override public T visitElementValuePairs(WiidgetParser.ElementValuePairsContext ctx) { return visitChildren(ctx); }

	@Override public T visitSeamStatement(WiidgetParser.SeamStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitWiidgetVariable(WiidgetParser.WiidgetVariableContext ctx) { return visitChildren(ctx); }

	@Override public T visitElementValueArrayInitializer(WiidgetParser.ElementValueArrayInitializerContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrimary(WiidgetParser.PrimaryContext ctx) { return visitChildren(ctx); }

	@Override public T visitControlStatement(WiidgetParser.ControlStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitStatementDeclaration(WiidgetParser.StatementDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitWiidgetMethodCallExpression(WiidgetParser.WiidgetMethodCallExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitImportDeclaration(WiidgetParser.ImportDeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitForeachVariable(WiidgetParser.ForeachVariableContext ctx) { return visitChildren(ctx); }

	@Override public T visitLiteral(WiidgetParser.LiteralContext ctx) { return visitChildren(ctx); }
}