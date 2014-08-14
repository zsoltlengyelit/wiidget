// Generated from C:\Users\lzsolt\Documents\GitHub\wiidget\wiidget\src\main\java\org\landa\wiidget\antlr\Wiidget.g4 by ANTLR 4.1
package org.landa.wiidget.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WiidgetParser}.
 */
public interface WiidgetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WiidgetParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull WiidgetParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull WiidgetParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#wiidgetDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterWiidgetDeclaration(@NotNull WiidgetParser.WiidgetDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#wiidgetDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitWiidgetDeclaration(@NotNull WiidgetParser.WiidgetDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#wiidgetArguments}.
	 * @param ctx the parse tree
	 */
	void enterWiidgetArguments(@NotNull WiidgetParser.WiidgetArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#wiidgetArguments}.
	 * @param ctx the parse tree
	 */
	void exitWiidgetArguments(@NotNull WiidgetParser.WiidgetArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull WiidgetParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull WiidgetParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(@NotNull WiidgetParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(@NotNull WiidgetParser.ElementValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull WiidgetParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull WiidgetParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#wiidgetVariableBinding}.
	 * @param ctx the parse tree
	 */
	void enterWiidgetVariableBinding(@NotNull WiidgetParser.WiidgetVariableBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#wiidgetVariableBinding}.
	 * @param ctx the parse tree
	 */
	void exitWiidgetVariableBinding(@NotNull WiidgetParser.WiidgetVariableBindingContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(@NotNull WiidgetParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(@NotNull WiidgetParser.ElementValueArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull WiidgetParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull WiidgetParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#controlStatement}.
	 * @param ctx the parse tree
	 */
	void enterControlStatement(@NotNull WiidgetParser.ControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#controlStatement}.
	 * @param ctx the parse tree
	 */
	void exitControlStatement(@NotNull WiidgetParser.ControlStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#wiidgetMethodCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterWiidgetMethodCallExpression(@NotNull WiidgetParser.WiidgetMethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#wiidgetMethodCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitWiidgetMethodCallExpression(@NotNull WiidgetParser.WiidgetMethodCallExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#foreachVariable}.
	 * @param ctx the parse tree
	 */
	void enterForeachVariable(@NotNull WiidgetParser.ForeachVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#foreachVariable}.
	 * @param ctx the parse tree
	 */
	void exitForeachVariable(@NotNull WiidgetParser.ForeachVariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull WiidgetParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull WiidgetParser.ImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#expressionWiidgetName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionWiidgetName(@NotNull WiidgetParser.ExpressionWiidgetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#expressionWiidgetName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionWiidgetName(@NotNull WiidgetParser.ExpressionWiidgetNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#foreachControl}.
	 * @param ctx the parse tree
	 */
	void enterForeachControl(@NotNull WiidgetParser.ForeachControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#foreachControl}.
	 * @param ctx the parse tree
	 */
	void exitForeachControl(@NotNull WiidgetParser.ForeachControlContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#ifControl}.
	 * @param ctx the parse tree
	 */
	void enterIfControl(@NotNull WiidgetParser.IfControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#ifControl}.
	 * @param ctx the parse tree
	 */
	void exitIfControl(@NotNull WiidgetParser.IfControlContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull WiidgetParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull WiidgetParser.QualifiedNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#wiidgetBody}.
	 * @param ctx the parse tree
	 */
	void enterWiidgetBody(@NotNull WiidgetParser.WiidgetBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#wiidgetBody}.
	 * @param ctx the parse tree
	 */
	void exitWiidgetBody(@NotNull WiidgetParser.WiidgetBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(@NotNull WiidgetParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(@NotNull WiidgetParser.ElementValuePairsContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(@NotNull WiidgetParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(@NotNull WiidgetParser.ElementValuePairContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#seamStatement}.
	 * @param ctx the parse tree
	 */
	void enterSeamStatement(@NotNull WiidgetParser.SeamStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#seamStatement}.
	 * @param ctx the parse tree
	 */
	void exitSeamStatement(@NotNull WiidgetParser.SeamStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#wiidgetVariable}.
	 * @param ctx the parse tree
	 */
	void enterWiidgetVariable(@NotNull WiidgetParser.WiidgetVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#wiidgetVariable}.
	 * @param ctx the parse tree
	 */
	void exitWiidgetVariable(@NotNull WiidgetParser.WiidgetVariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#innerImport}.
	 * @param ctx the parse tree
	 */
	void enterInnerImport(@NotNull WiidgetParser.InnerImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#innerImport}.
	 * @param ctx the parse tree
	 */
	void exitInnerImport(@NotNull WiidgetParser.InnerImportContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#unifiedWiidgetName}.
	 * @param ctx the parse tree
	 */
	void enterUnifiedWiidgetName(@NotNull WiidgetParser.UnifiedWiidgetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#unifiedWiidgetName}.
	 * @param ctx the parse tree
	 */
	void exitUnifiedWiidgetName(@NotNull WiidgetParser.UnifiedWiidgetNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#statementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStatementDeclaration(@NotNull WiidgetParser.StatementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#statementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStatementDeclaration(@NotNull WiidgetParser.StatementDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#externalImport}.
	 * @param ctx the parse tree
	 */
	void enterExternalImport(@NotNull WiidgetParser.ExternalImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#externalImport}.
	 * @param ctx the parse tree
	 */
	void exitExternalImport(@NotNull WiidgetParser.ExternalImportContext ctx);

	/**
	 * Enter a parse tree produced by {@link WiidgetParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull WiidgetParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link WiidgetParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull WiidgetParser.LiteralContext ctx);
}