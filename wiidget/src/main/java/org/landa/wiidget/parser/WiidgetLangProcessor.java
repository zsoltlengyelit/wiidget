package org.landa.wiidget.parser;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.landa.wiidget.Wiidget;
import org.landa.wiidget.WiidgetException;
import org.landa.wiidget.WiidgetView;
import org.landa.wiidget.annotation.DefaultField;
import org.landa.wiidget.antlr.WiidgetLexer;
import org.landa.wiidget.antlr.WiidgetParser;
import org.landa.wiidget.antlr.WiidgetParser.CompilationUnitContext;
import org.landa.wiidget.antlr.WiidgetParser.ControlStatementContext;
import org.landa.wiidget.antlr.WiidgetParser.ElementValueArrayInitializerContext;
import org.landa.wiidget.antlr.WiidgetParser.ElementValueContext;
import org.landa.wiidget.antlr.WiidgetParser.ElementValuePairContext;
import org.landa.wiidget.antlr.WiidgetParser.ElementValuePairsContext;
import org.landa.wiidget.antlr.WiidgetParser.ExpressionContext;
import org.landa.wiidget.antlr.WiidgetParser.ExpressionListContext;
import org.landa.wiidget.antlr.WiidgetParser.ForeachControlContext;
import org.landa.wiidget.antlr.WiidgetParser.IfControlContext;
import org.landa.wiidget.antlr.WiidgetParser.ImportDeclarationContext;
import org.landa.wiidget.antlr.WiidgetParser.LiteralContext;
import org.landa.wiidget.antlr.WiidgetParser.PrimaryContext;
import org.landa.wiidget.antlr.WiidgetParser.QualifiedNameContext;
import org.landa.wiidget.antlr.WiidgetParser.SeamStatementContext;
import org.landa.wiidget.antlr.WiidgetParser.StatementDeclarationContext;
import org.landa.wiidget.antlr.WiidgetParser.WiidgetArgumentsContext;
import org.landa.wiidget.antlr.WiidgetParser.WiidgetBodyContext;
import org.landa.wiidget.antlr.WiidgetParser.WiidgetDeclarationContext;
import org.landa.wiidget.antlr.WiidgetParser.WiidgetMethodCallExpressionContext;
import org.landa.wiidget.antlr.WiidgetParser.WiidgetVariableBindingContext;
import org.landa.wiidget.antlr.WiidgetParser.WiidgetVariableContext;
import org.landa.wiidget.engine.WiidgetFactory;
import org.landa.wiidget.parser.control.ForeachControl;
import org.landa.wiidget.parser.control.IfControl;
import org.landa.wiidget.reflect.Reflection;
import org.landa.wiidget.reflect.ReflectionException;
import org.landa.wiidget.util.DataMap;

/**
 * The part of Wiidget framework interprets the ANTLR lexer result.
 * <p>
 * The processor extends the {@link WiidgetView}, so behaves as a view. Cause of
 * this fact, the processor can create wiidgets, and can render a template.
 * </p>
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class WiidgetLangProcessor extends WiidgetView {

	Map<String, Class<? extends Wiidget>> importClassMap=new HashMap<String, Class<? extends Wiidget>>();;

	List<String> importPackages = new ArrayList<String>();;

	/**
	 * Lang processor will act as this view.
	 */
	private final WiidgetView ownerView;

	/**
	 * Stores wiidget by names if name is defined.
	 */
	private final Map<String, Wiidget> wiidgetMap = new HashMap<>();

	public WiidgetLangProcessor() {
		super();

		this.ownerView = null;
	}

	/**
	 * 
	 * @param wiidgetFactory
	 */
	public WiidgetLangProcessor(WiidgetFactory wiidgetFactory) {
		this(wiidgetFactory, null);
	}

	/**
	 * 
	 * @param wiidgetFactory
	 * @param owner
	 */
	public WiidgetLangProcessor(final WiidgetFactory wiidgetFactory,
			WiidgetView owner) {
		super(wiidgetFactory);

		this.ownerView = owner == null ? this : owner;
		

		importDefaultClasses();
	}

	private void importDefaultClasses() {
		// TODO

	}

	@Override
	public void run() {
		// NO-OP
	}

	@Override
	public WiidgetView getOwner() {
		return ownerView == null ? super.getOwner() : ownerView;
	}

	/**
	 * @param template
	 * @return
	 * @throws WiidgetParserException
	 */
	public String render(final String template) throws WiidgetParserException {

		final CompilationUnitContext compilationUnitContext = getCompilationUnitContext(template);
		return render(compilationUnitContext);
	}

	/**
	 * @param template
	 * @return
	 * @throws WiidgetParserException
	 * @throws IOException
	 */
	public String render(final InputStream template)
			throws WiidgetParserException {

		final CompilationUnitContext compilationUnitContext = getCompilationUnitContext(template);
		return render(compilationUnitContext);
	}

	/**
	 * @param compilationUnitContext
	 * @return
	 * @throws WiidgetParserException
	 */
	private String render(final CompilationUnitContext compilationUnitContext)
			throws WiidgetParserException {

		processImports(compilationUnitContext.importDeclaration());

		processStatements(compilationUnitContext.statementDeclaration());

		final String result = this.render();

		return result;
	}

	private void processStatements(
			final List<StatementDeclarationContext> statementDeclaration)
			throws WiidgetParserException {

		if (null == statementDeclaration) {// no child statement
			return;
		}

		for (final StatementDeclarationContext statementDeclarationContext : statementDeclaration) {
			processStatement(statementDeclarationContext);
		}

	}

	private void processStatement(
			final StatementDeclarationContext statementDeclarationContext)
			throws WiidgetParserException {
		final ControlStatementContext controlStatementContext = statementDeclarationContext
				.controlStatement();

		if (null != controlStatementContext) {

			processControl(controlStatementContext);
			return;
		}

		final WiidgetDeclarationContext wiidgetDeclarationContext = statementDeclarationContext
				.wiidgetDeclaration();
		if (null != wiidgetDeclarationContext) {
			processWiidget(wiidgetDeclarationContext);
		}

		final WiidgetMethodCallExpressionContext wiidgetMethodCallExpressionContext = statementDeclarationContext
				.wiidgetMethodCallExpression();
		if (null != wiidgetMethodCallExpressionContext) {

			processWiidgetMethodCall(wiidgetMethodCallExpressionContext);
		}

		final SeamStatementContext seamStatementContext = statementDeclarationContext
				.seamStatement();
		if (null != seamStatementContext) {
			processSeamStatement(seamStatementContext);
		}

	}

	private void processSeamStatement(
			final SeamStatementContext seamStatementContext)
			throws WiidgetParserException {

		final ExpressionContext expressionContext = seamStatementContext
				.expression();

		final Object object = evaluateExpression(expressionContext);

		if (object instanceof Wiidget == false) {
			throw new WiidgetParserException("Expression '"
					+ expressionContext.getText()
					+ "' must be return wiidget instance.");
		}

		final Wiidget wiidget = (Wiidget) object;

		beginWiidget(wiidget);

		final WiidgetBodyContext wiidgetBodyContext = seamStatementContext
				.wiidgetBody();
		if (null != wiidgetBodyContext) {
			processStatements(wiidgetBodyContext.statementDeclaration());
		}

		endWiidget(wiidget);
	}

	private Object processWiidgetMethodCall(
			final WiidgetMethodCallExpressionContext wiidgetMethodCallExpressionContext)
			throws WiidgetParserException {

		final String wiidgetVariable = wiidgetMethodCallExpressionContext
				.wiidgetVariable().Identifier().getText();

		final Wiidget wiidget = wiidgetMap.get(wiidgetVariable);

		if (null == wiidget) {
			handleUndefinedWiidgetVariable(wiidgetVariable);
		}

		final String methodName = wiidgetMethodCallExpressionContext
				.Identifier().getText();

		final ExpressionListContext expressionListContext = wiidgetMethodCallExpressionContext
				.expressionList();

		final Object[] parameters = null == expressionListContext ? new Object[0]
				: evaluateExpressionList(expressionListContext);

		try {
			return Reflection.callMethod(wiidget, methodName, parameters);
		} catch (final ReflectionException reflectionException) {
			throw new WiidgetParserException("Cannot call method '"
					+ methodName + "' on "
					+ wiidget.getClass().getCanonicalName(),
					reflectionException);
		}
	}

	private void processControl(
			final ControlStatementContext controlStatementContext)
			throws WiidgetParserException {

		final WiidgetBodyContext bodyContext = controlStatementContext
				.wiidgetBody();

		final IfControlContext ifControlContext = controlStatementContext
				.ifControl();
		if (null != ifControlContext) {

			final IfControl ifControl = processIfControl(ifControlContext);

			processIf(ifControl, bodyContext);

		} else {

			final ForeachControlContext foreachControlContext = controlStatementContext
					.foreachControl();
			final ForeachControl foreachControl = processForeachControl(foreachControlContext);

			processForeach(foreachControl, bodyContext);
		}

	}

	private void processForeach(final ForeachControl foreachControl,
			final WiidgetBodyContext bodyContext) throws WiidgetParserException {

		final String variable = foreachControl.getVariable();
		final Iterable<?> iterable = foreachControl.getIterable();

		Object oldVariableValue = null;
		if (getWiidgetContext().isSet(variable)) {
			oldVariableValue = getWiidgetContext().get(variable);
		}

		if (null == iterable) {
			throw new WiidgetException(
					"Itarable value in 'foreach' statement is null.");
		}

		for (final Object item : iterable) {

			getWiidgetContext().set(variable, item);

			processStatements(bodyContext.statementDeclaration());
		}

		if (oldVariableValue == null) {
			getWiidgetContext().remove(variable); // remove
		} else {
			getWiidgetContext().set(variable, oldVariableValue); // set back old
			// value
		}

	}

	private void processIf(final IfControl ifControl,
			final WiidgetBodyContext bodyContext) throws WiidgetParserException {

		if (ifControl.getValue()) {

			processStatements(bodyContext.statementDeclaration());
		}

	}

	private ForeachControl processForeachControl(
			final ForeachControlContext foreachControlContext)
			throws WiidgetParserException {

		final String variable = foreachControlContext.foreachVariable()
				.getText();

		Iterable<?> iterable = null;
		try {
			iterable = (Iterable<?>) evaluateExpression(foreachControlContext
					.expression());
		} catch (final ClassCastException castException) {

			throw new WiidgetParserException(
					"Foreach statement must have iterable class.",
					castException);
		}

		return new ForeachControl(variable, iterable);

	}

	private Object getValue(final String name) {
		return getWiidgetContext().get(name);
	}

	private IfControl processIfControl(final IfControlContext ifControlContext)
			throws WiidgetParserException {
		try {

			final Boolean condition = (Boolean) evaluateExpression(ifControlContext
					.expression());

			return new IfControl(condition);

		} catch (final ClassCastException castException) {

			throw new WiidgetParserException("Expression must be boolean: "
					+ ifControlContext.expression().getText(), castException);
		}

	}

	private void processImports(
			final List<ImportDeclarationContext> importDeclaration)
			throws WiidgetParserException {

		for (final ImportDeclarationContext context : importDeclaration) {
			processImport(context);
		}
	}

	private void processWiidget(
			final WiidgetDeclarationContext declarationContext)
			throws WiidgetParserException {

		// variable name of wiidget
		String wiidgetVariable = null;

		final WiidgetVariableBindingContext wiidgetVariableBindingContext = declarationContext
				.wiidgetVariableBinding();
		if (null != wiidgetVariableBindingContext) {
			wiidgetVariable = wiidgetVariableBindingContext.wiidgetVariable()
					.Identifier().getText();
		}

		final String wiidgetName = declarationContext.wiidgetName().getText();

		final Class<? extends Wiidget> wiidgetClass = getWiidgetClass(wiidgetName);

		if (null == wiidgetClass) {
			throw new WiidgetParserException("Unknown wiidget name: "
					+ wiidgetName);
		}

		final DataMap dataMap = processArguments(
				declarationContext.wiidgetArguments(), wiidgetClass);

		final Wiidget wiidget = beginWiidget(wiidgetClass, dataMap);

		// bind to variable
		if (null != wiidgetVariable) {
			wiidgetMap.put(wiidgetVariable, wiidget);
		}

		// rendered property has meaning here
		if (null != wiidget) {
			processStatements(declarationContext.wiidgetBody()
					.statementDeclaration());
		}

		endWiidget(wiidget);

	}

	private Class<? extends Wiidget> getWiidgetClass(final String wiidgetName)
			throws WiidgetParserException {

		Class<? extends Wiidget> wiidgetClass = importClassMap.get(wiidgetName);

		if (null == wiidgetClass) { // try from package

			for (final String packageName : importPackages) {

				// package plus wiidget name
				final String className = packageName + '.' + wiidgetName;
				try {

					wiidgetClass = findWiidgetClass(className);

					if (null != wiidgetClass) {
						// import pragmatically the class
						importClassMap.put(wiidgetName, wiidgetClass);
					}

				} catch (final WiidgetParserException wiidgetParserException) {
					// No-op
				}
			}
		}

		// maybe fully qualified name
		if (null == wiidgetClass) {
			wiidgetClass = findWiidgetClass(wiidgetName);
		}

		return wiidgetClass;

	}

	private DataMap processArguments(
			final WiidgetArgumentsContext wiidgetArguments,
			final Class<? extends Wiidget> wiidgetClass)
			throws WiidgetParserException {

		final DataMap dataMap = new DataMap();

		if (null == wiidgetArguments) {
			return dataMap;
		}

		final ElementValueContext elementValueContext = wiidgetArguments
				.elementValue();

		if (null == elementValueContext) {

			final ElementValuePairsContext elementValuePairsContext = wiidgetArguments
					.elementValuePairs();
			if (null != elementValuePairsContext) {
				final List<ElementValuePairContext> valuePairContext = elementValuePairsContext
						.elementValuePair();

				if (valuePairContext != null) {
					for (final ElementValuePairContext elementValuePairContext : valuePairContext) {

						final String property = elementValuePairContext
								.Identifier().getText();

						final Object value = processArgumentValue(elementValuePairContext
								.elementValue());
						dataMap.put(property, value);

					}
				}

			}

		} else {

			final Object value = processArgumentValue(elementValueContext);
			final String property = getDefaultValueProperty(wiidgetClass);

			dataMap.put(property, value);

		}

		return dataMap;

	}

	private String getDefaultValueProperty(
			final Class<? extends Wiidget> wiidgetClass) {

		final Field defaultField = Reflection.getField(wiidgetClass,
				DefaultField.class);

		if (null == defaultField) {
			return "value";
		} else {
			return defaultField.getName();
		}

	}

	private Object processArgumentValue(final ElementValueContext valueContext)
			throws WiidgetParserException {

		final QualifiedNameContext qualifiedNameContext = valueContext
				.qualifiedName();
		if (null != qualifiedNameContext) {
			return processQualifiedName(qualifiedNameContext);
		}

		final ElementValueArrayInitializerContext arrayInitializerContext = valueContext
				.elementValueArrayInitializer();
		if (null != arrayInitializerContext) {
			return processValueArray(arrayInitializerContext);
		}

		final ExpressionContext expressionContext = valueContext.expression();
		if (null != expressionContext) {
			return evaluateExpression(expressionContext);
		}
		throw new WiidgetParserException("Cannot get value of : "
				+ valueContext.getText());

	}

	/**
	 * Element value array evaluator.
	 * 
	 * @param arrayInitializerContext
	 *            context
	 * @return array of evaluated values
	 * @throws WiidgetParserException
	 */
	private Object[] processValueArray(
			final ElementValueArrayInitializerContext arrayInitializerContext)
			throws WiidgetParserException {

		final List<ElementValueContext> elementValueContexts = arrayInitializerContext
				.elementValue();
		final int size = elementValueContexts.size();
		final Object[] dataArray = new Object[size];

		for (int index = 0; index < elementValueContexts.size(); index++) {

			dataArray[index] = processArgumentValue(elementValueContexts
					.get(index));

		}

		return dataArray;
	}

	private Object processQualifiedName(
			final QualifiedNameContext qualifiedNameContext)
			throws WiidgetParserException {
		final Iterator<TerminalNode> iterator = qualifiedNameContext
				.Identifier().iterator();

		final TerminalNode baseNode = iterator.next();

		Object baseObject = getWiidgetContext().get(baseNode.getText());

		while (iterator.hasNext()) {
			final TerminalNode terminalNode = iterator.next();
			final String property = terminalNode.getText();

			baseObject = Reflection.getFieldValue(baseObject, property);

		}

		return baseObject;

	}

	@SuppressWarnings("rawtypes")
	private Object evaluateExpression(final ExpressionContext expression)
			throws WiidgetParserException {

		// primary
		final PrimaryContext primaryContext = expression.primary();
		if (null != primaryContext) {
			return evaluatePrimary(primaryContext);
		}

		// wiidget variable
		final WiidgetVariableContext wiidgetVariableContext = expression
				.wiidgetVariable();
		if (null != wiidgetVariableContext) {
			final String wiidgetVariable = wiidgetVariableContext.Identifier()
					.getText();

			final Wiidget wiidget = wiidgetMap.get(wiidgetVariable);
			if (null == wiidget) {
				handleUndefinedWiidgetVariable(wiidgetVariable);
			}
			return wiidget;
		}

		// wiidget method call
		final WiidgetMethodCallExpressionContext wiidgetMethodCallExpressionContext = expression
				.wiidgetMethodCallExpression();
		if (null != wiidgetMethodCallExpressionContext) {
			return processWiidgetMethodCall(wiidgetMethodCallExpressionContext);
		}

		// expression with identifier
		final TerminalNode identifierNode = expression.Identifier();
		if (null != identifierNode) {
			final String identifier = identifierNode.getText();

			final ExpressionContext baseExpressionContext = expression
					.expression(0);
			if (null != baseExpressionContext) {

				final Object baseValue = evaluateExpression(baseExpressionContext);
				if (baseValue == null) {
					throw new WiidgetParserException("Value is null for: "
							+ baseExpressionContext.getText());
				}

				final TerminalNode lparen = expression.LPAREN();
				if (null == lparen) {
					// property getter
					return Reflection.getFieldValue(baseValue, identifier);
				} else {

					final ExpressionListContext expressionListContext = expression
							.expressionList();
					final Object[] arguments = evaluateExpressionList(expressionListContext);

					return Reflection.callMethod(baseValue, identifier,
							arguments);

				}

			}

			throw new WiidgetParserException("Cannot evaluate expression: "
					+ expression.getText());
		}

		// indexing
		final TerminalNode lbrack = expression.LBRACK();
		if (null != lbrack) {

			final ExpressionContext baseExpressionContext = expression
					.expression(0);
			final Object baseValue = evaluateExpression(baseExpressionContext);
			if (baseValue == null) {
				throw new WiidgetParserException("Value is null for: "
						+ baseExpressionContext.getText());
			}

			final ExpressionContext indexExpressionContext = expression
					.expression(1);
			final Object index = evaluateExpression(indexExpressionContext);

			// resolve index
			if (baseValue instanceof Map) {
				final Map mapValue = (Map) baseValue;
				return mapValue.get(index);

			} else if (baseValue instanceof List) {
				final List listValue = (List) baseValue;
				listValue.get(Integer.parseInt(index.toString()));

			} else {

				// try get property
				return Reflection.getFieldValue(baseValue, index.toString());
			}
		}

		// negotion
		final TerminalNode negotionOperator = expression.NegotionOperator();
		if (null != negotionOperator) {

			final Boolean booleanValue = (Boolean) evaluateExpression(expression
					.expression(0));
			return !booleanValue;
		}

		// mathematical
		final TerminalNode mathematicalOperator = expression
				.MathematicalOperator();
		if (null != mathematicalOperator) {
			return evaluateMathematicalExpression(expression.expression(0),
					mathematicalOperator.getText(), expression.expression(1));
		}

		// compare operator
		final TerminalNode compareOperator = expression.CompareOperator();
		if (null != compareOperator) {
			return evaluateComparisonExpression(expression.expression(0),
					compareOperator.getText(), expression.expression(1));
		}

		// equality operator
		final TerminalNode equalityOperator = expression.EqualityOperator();
		if (null != equalityOperator) {
			return evaluateEqualityExpression(expression.expression(0),
					equalityOperator.getText(), expression.expression(1));
		}

		// logical operator
		final TerminalNode logicalOperator = expression.LogicalOperator();
		if (null != logicalOperator) {
			return evaluateLogicalExpression(expression.expression(0),
					logicalOperator.getText(), expression.expression(1));
		}

		// default operator
		final TerminalNode defaultOperator = expression.DEFAULT_OPERATOR();
		if (defaultOperator != null) {
			final Object value = evaluateExpression(expression.expression(0));

			if (null == value) { // if null, evaluate the second
				return evaluateExpression(expression.expression(1));
			}
		}

		// threeway operator
		final TerminalNode question = expression.QUESTION();
		final TerminalNode colon = expression.COLON();

		if (null != question && null != colon) {
			final ExpressionContext conditionExpression = expression
					.expression(0);

			final Boolean condition = (Boolean) evaluateExpression(conditionExpression);

			final ExpressionContext value = expression.expression(condition ? 1
					: 2);

			return evaluateExpression(value);
		}

		throw new WiidgetParserException("Cannot evaluate expression: '"
				+ expression.getText() + "'");
	}

	/**
	 * Evaluates the logical expression from parts.
	 * 
	 * @param firstOperandExpression
	 *            first operand
	 * @param operator
	 *            operator (&&, ||)
	 * @param secondOperandExpression
	 *            second operator
	 * @return evaluated value of logical expression
	 * @throws WiidgetParserException
	 *             when cannot parse expression(s)
	 */
	private boolean evaluateLogicalExpression(
			final ExpressionContext firstOperandExpression,
			final String operator,
			final ExpressionContext secondOperandExpression)
			throws WiidgetParserException {

		final Boolean firstOperand = (Boolean) evaluateExpression(firstOperandExpression);
		Boolean secondOperand = false;

		switch (operator) {
		case "&&":
			if (!firstOperand) {
				return false;
			}
			secondOperand = (Boolean) evaluateExpression(secondOperandExpression);

			return firstOperand && secondOperand;

		case "||":
			if (firstOperand) {
				return true;
			}
			secondOperand = (Boolean) evaluateExpression(secondOperandExpression);
			return firstOperand || secondOperand;

		default:
			throw new WiidgetParserException("Unknown operator: " + operator);
		}
	}

	/**
	 * @param firstExpression
	 * @param operator
	 * @param secondExpression
	 * @return
	 * @throws WiidgetParserException
	 */
	private boolean evaluateEqualityExpression(
			final ExpressionContext firstExpression, final String operator,
			final ExpressionContext secondExpression)
			throws WiidgetParserException {

		final Object firstOperand = evaluateExpression(firstExpression);
		final Object secondOperand = evaluateExpression(secondExpression);

		boolean equals = false;
		if (firstOperand == null ^ secondOperand == null) {
			equals = false;
		}
		equals = null != firstOperand ? firstOperand.equals(secondOperand)
				: secondOperand.equals(secondOperand);

		return "==".equals(operator) ? equals : !equals;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private Boolean evaluateComparisonExpression(
			final ExpressionContext firstExpression, final String operator,
			final ExpressionContext secondExpression)
			throws WiidgetParserException {

		final Comparable firstOperand = (Comparable) evaluateExpression(firstExpression);
		final Comparable secondOperand = (Comparable) evaluateExpression(secondExpression);

		final int compareValue = firstOperand.compareTo(secondOperand);

		switch (operator) {
		case "<":
			return compareValue < 0;

		case "<=":
			return compareValue <= 0;

		case ">":
			return compareValue > 0;

		case ">=":
			return compareValue >= 0;

		default:
			throw new WiidgetParserException("Unknown operator: '" + operator
					+ "'");
		}
	}

	/**
	 * Evaluates primary expression
	 * 
	 * @param primaryContext
	 *            expression
	 * @return evaluated value
	 * @throws WiidgetParserException
	 */
	private Object evaluatePrimary(final PrimaryContext primaryContext)
			throws WiidgetParserException {

		final LiteralContext literalContext = primaryContext.literal();
		if (null != literalContext) {
			return evaluateLiteral(literalContext);
		}

		final ExpressionContext expressionContext = primaryContext.expression();
		if (null != expressionContext) {
			return evaluateExpression(expressionContext);
		}

		final TerminalNode identifier = primaryContext.Identifier();
		if (null != identifier) {
			return getValue(identifier.getText());
		}

		throw new WiidgetParserException("Unexpected expression: "
				+ primaryContext.getText());
	}

	private Object evaluateMathematicalExpression(
			final ExpressionContext firstOperandExpression,
			final String operator,
			final ExpressionContext secondOperandExpression)
			throws WiidgetParserException {

		final Object firstExpr = evaluateExpression(firstOperandExpression);
		final Object secondExpr = evaluateExpression(secondOperandExpression);

		// string concatenation
		if (operator.equals("+")
				&& (firstExpr instanceof String || secondExpr instanceof String)) {
			return stringConcatenation(firstExpr, secondExpr);
		}

		final Number firstOperand = (Number) firstExpr;
		final Number secondOperand = (Number) secondExpr;

		final boolean isFirstDouble = firstOperand instanceof Double;
		final boolean isSecondDouble = secondOperand instanceof Double;

		Number result = 0;

		switch (operator) {
		case "+":
			result = (isFirstDouble ? firstOperand.doubleValue() : firstOperand
					.intValue())
					+ (isSecondDouble ? secondOperand.doubleValue()
							: secondOperand.intValue());
			break;
		case "-":
			result = (isFirstDouble ? firstOperand.doubleValue() : firstOperand
					.intValue())
					- (isSecondDouble ? secondOperand.doubleValue()
							: secondOperand.intValue());
			break;
		case "*":
			result = (isFirstDouble ? firstOperand.doubleValue() : firstOperand
					.intValue())
					* (isSecondDouble ? secondOperand.doubleValue()
							: secondOperand.intValue());
			break;
		case "/":
			result = (isFirstDouble ? firstOperand.doubleValue() : firstOperand
					.intValue())
					/ (isSecondDouble ? secondOperand.doubleValue()
							: secondOperand.intValue());
			break;
		case "%":
			result = (isFirstDouble ? firstOperand.doubleValue() : firstOperand
					.intValue())
					% (isSecondDouble ? secondOperand.doubleValue()
							: secondOperand.intValue());
			break;
		default:
			throw new WiidgetParserException("Cannot evaluate expression: "
					+ operator);
		}

		if (isFirstDouble || isSecondDouble) {
			return Double.valueOf(result.doubleValue());
		}
		return Integer.valueOf(result.intValue());

	}

	/**
	 * Simple string concatenation.
	 * 
	 * @param firstExpr
	 * @param secondExpr
	 * @return
	 */
	private Object stringConcatenation(final Object firstExpr,
			final Object secondExpr) {
		final String first = null == firstExpr ? "" : firstExpr.toString();
		final String second = null == secondExpr ? "" : secondExpr.toString();

		return first + second;
	}

	private Object[] evaluateExpressionList(
			final ExpressionListContext expressionListContext)
			throws WiidgetParserException {
		if (null == expressionListContext) {
			return new Object[0];
		}

		final List<ExpressionContext> expressionContexts = expressionListContext
				.expression();

		final Object[] objects = new Object[expressionContexts.size()];

		for (int i = 0; i < expressionContexts.size(); i++) {

			final ExpressionContext expression = expressionContexts.get(i);

			objects[i] = evaluateExpression(expression);
		}

		return objects;
	}

	private Object evaluateLiteral(final LiteralContext literalContext)
			throws WiidgetParserException {

		final TerminalNode string = literalContext.StringLiteral();
		if (null != string) {
			final String stringText = string.getText();
			return stringText.substring(1, stringText.length() - 1);
		}

		final TerminalNode integer = literalContext.IntegerLiteral();
		if (null != integer) {
			return Integer.parseInt(integer.getText());
		}

		final TerminalNode bool = literalContext.BooleanLiteral();
		if (null != bool) {
			return Boolean.parseBoolean(bool.getText());
		}

		final TerminalNode floating = literalContext.FloatingPointLiteral();
		if (null != floating) {
			return Double.parseDouble(floating.getText());
		}

		final TerminalNode character = literalContext.CharacterLiteral();
		if (null != character) {
			return character.getText().charAt(0);
		}

		final TerminalNode nullNode = literalContext.NullLiteral();
		if (null != nullNode) {
			return null;
		}

		throw new WiidgetParserException("Cannot evaluate literal: "
				+ literalContext.getText());
	}

	/**
	 * @param importDeclarationContext
	 * @throws WiidgetParserException
	 */
	private void processImport(
			final ImportDeclarationContext importDeclarationContext)
			throws WiidgetParserException {

		final TerminalNode jokerImport = importDeclarationContext.JokerImport();

		if (null == jokerImport) {
			processImportClass(importDeclarationContext);
		} else {
			processImportPackage(importDeclarationContext);
		}
	}

	/**
	 * Import class.
	 * 
	 * @param importDeclarationContext
	 * @throws WiidgetParserException
	 */
	private void processImportClass(
			final ImportDeclarationContext importDeclarationContext)
			throws WiidgetParserException {

		final Iterator<TerminalNode> iterator = importDeclarationContext
				.qualifiedName().Identifier().iterator();

		final String className = importDeclarationContext.qualifiedName()
				.getText();

		String lastQuilifier = "";
		while (iterator.hasNext()) {
			final TerminalNode terminalNode = iterator.next();
			lastQuilifier = terminalNode.getText();
		}

		final Class<? extends Wiidget> imported = findWiidgetClass(className);

		if (null == imported) {
			throw new WiidgetParserException("Cannot find wiidget class: "
					+ className);
		}

		// put the full and simple name too
		importClassMap.put(className, imported);
		importClassMap.put(lastQuilifier, imported);
	}

	@SuppressWarnings("unchecked")
	private Class<? extends Wiidget> findWiidgetClass(final String wiidgetName)
			throws WiidgetParserException {

		Class<? extends Wiidget> wiidgetClass = null;

		try {
			wiidgetClass = (Class<? extends Wiidget>) getClass()
					.getClassLoader().loadClass(wiidgetName);

		} catch (final ClassNotFoundException e) {
			throw new WiidgetParserException("Cannot found class: "
					+ wiidgetName, e);
		} catch (final ClassCastException castException) {
			throw new WiidgetParserException("Class is not wiidget: "
					+ wiidgetName, castException);
		}

		return wiidgetClass;
	}

	private void processImportPackage(
			final ImportDeclarationContext importDeclarationContext) {

		final String packageName = importDeclarationContext.qualifiedName()
				.getText();

		importPackages.add(packageName);
	}

	/**
	 * @param variable
	 * @throws WiidgetParserException
	 */
	private void handleUndefinedWiidgetVariable(final String variable)
			throws WiidgetParserException {
		throw new WiidgetParserException("Variable is undefined: '" + variable
				+ "'");
	}

	public static CompilationUnitContext getCompilationUnitContext(
			final InputStream inputStream) throws WiidgetParserException {
		try {
			final ANTLRInputStream input = new ANTLRInputStream(inputStream);
			return getCompilationUnitContext(input);

		} catch (final IOException exception) {
			throw new WiidgetParserException("Cannot parse input.", exception);
		}
	}

	public static CompilationUnitContext getCompilationUnitContext(
			final String template) {
		final ANTLRInputStream input = new ANTLRInputStream(template);

		return getCompilationUnitContext(input);
	}

	/**
	 * Returns the compilation context of input.
	 * 
	 * @param antlrInputStream
	 *            ANTLR input
	 * @return the parsed context
	 */
	private static CompilationUnitContext getCompilationUnitContext(
			final ANTLRInputStream antlrInputStream) {

		final WiidgetLexer aWiidgetLexer = new WiidgetLexer(antlrInputStream);
		final BufferedTokenStream tokenStream = new BufferedTokenStream(
				aWiidgetLexer);
		final WiidgetParser aWiidgetParser = new WiidgetParser(tokenStream);
		final CompilationUnitContext compilationUnit = aWiidgetParser
				.compilationUnit();

		return compilationUnit;
	}
}
