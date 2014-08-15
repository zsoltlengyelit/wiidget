package org.landa.wiidget.parser.evaluation;

import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.landa.wiidget.Wiidget;
import org.landa.wiidget.antlr.WiidgetParser.ExpressionContext;
import org.landa.wiidget.antlr.WiidgetParser.ExpressionListContext;
import org.landa.wiidget.antlr.WiidgetParser.LiteralContext;
import org.landa.wiidget.antlr.WiidgetParser.PrimaryContext;
import org.landa.wiidget.antlr.WiidgetParser.WiidgetMethodCallExpressionContext;
import org.landa.wiidget.antlr.WiidgetParser.WiidgetVariableContext;
import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.parser.util.StringDeclaration;
import org.landa.wiidget.reflect.Reflection;
import org.landa.wiidget.reflect.ReflectionException;
import org.mvel2.PropertyAccessException;

/**
 *
 * @author lzsolt
 *
 */
public class ExpressionEvaluator {

    private final WiidgetContext wiidgetContext;
    private final Map<String, Wiidget> wiidgetMap;

    public ExpressionEvaluator(final WiidgetContext wiidgetContext, final Map<String, Wiidget> wiidgetMap) {
        this.wiidgetContext = wiidgetContext;
        this.wiidgetMap = wiidgetMap;
    }

    public Object evaluate(final WiidgetMethodCallExpressionContext callExpressionContext) throws EvaluationException {
        return processWiidgetMethodCall(callExpressionContext);
    }

    public Object evaluate(final ExpressionContext expression) throws EvaluationException {
        // primary
        final PrimaryContext primaryContext = expression.primary();
        if (null != primaryContext) {
            return evaluatePrimary(primaryContext);
        }

        // wiidget variable
        final WiidgetVariableContext wiidgetVariableContext = expression.wiidgetVariable();
        if (null != wiidgetVariableContext) {
            return evaluateWiidgetVariable(wiidgetVariableContext);
        }

        // wiidget method call
        final WiidgetMethodCallExpressionContext wiidgetMethodCallExpressionContext = expression.wiidgetMethodCallExpression();
        if (null != wiidgetMethodCallExpressionContext) {
            return processWiidgetMethodCall(wiidgetMethodCallExpressionContext);
        }

        // expression with identifier
        final TerminalNode identifierNode = expression.Identifier();
        if (null != identifierNode) {
            return evaluateExpressionWithIdentifier(expression, identifierNode);
        }

        // indexing
        final TerminalNode lbrack = expression.LBRACK();
        if (null != lbrack) {

            final ExpressionContext baseExpressionContext = expression.expression(0);
            final Object baseValue = evaluate(baseExpressionContext);
            if (baseValue == null) {
                throw new EvaluationException("Value is null for: " + baseExpressionContext.getText());
            }

            final ExpressionContext indexExpressionContext = expression.expression(1);
            final Object index = evaluate(indexExpressionContext);

            // resolve index
            if (baseValue instanceof Map) {
                @SuppressWarnings("rawtypes")
                final Map mapValue = (Map) baseValue;
                return mapValue.get(index);

            } else if (baseValue instanceof List) {
                @SuppressWarnings("rawtypes")
                final List listValue = (List) baseValue;
                try {
                    final int indexNumber = Integer.parseInt(index.toString());
                    return listValue.get(indexNumber);
                } catch (final NumberFormatException numberFormatException) {
                    // try get property

                    try {
                        return evaluatePropertyByReflection(listValue, index.toString());
                    } catch (final PropertyAccessException propertyAccessException) {

                        return MethodUtils.getAccessibleMethod(listValue.getClass(), index.toString());
                    }
                    //  throw new EvaluationException(String.format("Illegal index: %s on list: %s", index, listValue), numberFormatException);
                }

            } else {
                // try get property
                return evaluatePropertyByReflection(baseValue, index);
            }
        }

        // negotion
        final TerminalNode negotionOperator = expression.NegotionOperator();
        if (null != negotionOperator) {

            return evaluateNegatedBoolean(expression);
        }

        // mathematical
        final TerminalNode mathematicalOperator = expression.MathematicalOperator();
        if (null != mathematicalOperator) {
            return evaluateMathematicalExpression(expression.expression(0), mathematicalOperator.getText(), expression.expression(1));
        }

        // compare operator
        final TerminalNode compareOperator = expression.CompareOperator();
        if (null != compareOperator) {
            return evaluateComparisonExpression(expression.expression(0), compareOperator.getText(), expression.expression(1));
        }

        // equality operator
        final TerminalNode equalityOperator = expression.EqualityOperator();
        if (null != equalityOperator) {
            return evaluateEqualityExpression(expression.expression(0), equalityOperator.getText(), expression.expression(1));
        }

        // logical operator
        final TerminalNode logicalOperator = expression.LogicalOperator();
        if (null != logicalOperator) {
            return evaluateLogicalExpression(expression.expression(0), logicalOperator.getText(), expression.expression(1));
        }

        // default operator
        final TerminalNode defaultOperator = expression.DEFAULT_OPERATOR();
        if (defaultOperator != null) {
            final Object value = evaluate(expression.expression(0));

            if (null == value) { // if null, evaluate the second
                return evaluate(expression.expression(1));
            }
        }

        // threeway operator
        final TerminalNode question = expression.QUESTION();
        final TerminalNode colon = expression.COLON();

        if (null != question && null != colon) {
            return evaluateTernaryOperator(expression);
        }

        throw new EvaluationException("Cannot evaluate expression: '" + expression.getText() + "'");
    }

    private Object evaluatePropertyByReflection(final Object baseValue, final Object index) throws PropertyAccessException {
        return Reflection.getFieldValue(baseValue, index.toString());
    }

    /**
     * Evaluates " condition ? 'when true' : 'otherwise' " like expressions.
     *
     * @param expression
     *            the expression with ternary operators.
     * @return value of expression
     * @throws EvaluationException
     *             when cannot evaluate expression
     */
    private Object evaluateTernaryOperator(final ExpressionContext expression) throws EvaluationException {
        final ExpressionContext conditionExpression = expression.expression(0);

        final Boolean condition = (Boolean) evaluate(conditionExpression);

        // evaluate the first operand if true. otherwise the second
        final ExpressionContext value = expression.expression(condition ? 1 : 2);

        return evaluate(value);
    }

    private Object evaluateNegatedBoolean(final ExpressionContext expression) throws EvaluationException {
        final Boolean booleanValue = (Boolean) evaluate(expression.expression(0));
        return !booleanValue;
    }

    /**
     * Evaluates expression that contains identifier
     *
     * @param expression
     *            expression
     * @param identifierNode
     *            the identifier
     * @return value of expression
     * @throws EvaluationException
     *             when cannot evaluate expression
     */
    private Object evaluateExpressionWithIdentifier(final ExpressionContext expression, final TerminalNode identifierNode) throws EvaluationException {
        final String identifier = identifierNode.getText();

        final ExpressionContext baseExpressionContext = expression.expression(0);
        if (null != baseExpressionContext) {

            final Object baseValue = evaluate(baseExpressionContext);
            if (baseValue == null) {
                throw new EvaluationException("Value is null for: " + baseExpressionContext.getText());
            }

            final TerminalNode lparen = expression.LPAREN();
            if (null == lparen) {
                // property getter
                return Reflection.getFieldValue(baseValue, identifier);
            } else {

                final ExpressionListContext expressionListContext = expression.expressionList();
                final Object[] arguments = evaluateExpressionList(expressionListContext);

                return Reflection.callMethod(baseValue, identifier, arguments);

            }

        }

        throw new EvaluationException("Cannot evaluate expression: " + expression.getText());
    }

    private Object evaluateWiidgetVariable(final WiidgetVariableContext wiidgetVariableContext) throws EvaluationException {
        final String wiidgetVariable = wiidgetVariableContext.Identifier().getText();

        final Wiidget wiidget = getWiidgetMap().get(wiidgetVariable);
        if (null == wiidget) {
            handleUndefinedWiidgetVariable(wiidgetVariable);
        }
        return wiidget;
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
     * @throws EvaluationException
     *             when cannot parse expression(s)
     */
    private boolean evaluateLogicalExpression(final ExpressionContext firstOperandExpression, final String operator, final ExpressionContext secondOperandExpression)
            throws EvaluationException {

        final Boolean firstOperand = (Boolean) evaluate(firstOperandExpression);
        Boolean secondOperand = false;

        switch (operator) {
        case "&&":
            if (!firstOperand) {
                return false;
            }
            secondOperand = (Boolean) evaluate(secondOperandExpression);

            return firstOperand && secondOperand;

        case "||":
            if (firstOperand) {
                return true;
            }
            secondOperand = (Boolean) evaluate(secondOperandExpression);
            return firstOperand || secondOperand;

        default:
            throw new EvaluationException("Unknown operator: " + operator);
        }
    }

    /**
     * @param firstExpression
     * @param operator
     * @param secondExpression
     * @return
     * @throws EvaluationException
     */
    private boolean evaluateEqualityExpression(final ExpressionContext firstExpression, final String operator, final ExpressionContext secondExpression) throws EvaluationException {

        final Object firstOperand = evaluate(firstExpression);
        final Object secondOperand = evaluate(secondExpression);

        boolean equals = false;
        if (firstOperand == null ^ secondOperand == null) {
            equals = false;
        }
        equals = null != firstOperand ? firstOperand.equals(secondOperand) : secondOperand.equals(secondOperand);

        return "==".equals(operator) ? equals : !equals;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private Boolean evaluateComparisonExpression(final ExpressionContext firstExpression, final String operator, final ExpressionContext secondExpression)
            throws EvaluationException {

        final Comparable firstOperand = (Comparable) evaluate(firstExpression);
        final Comparable secondOperand = (Comparable) evaluate(secondExpression);

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
            throw new EvaluationException("Unknown operator: '" + operator + "'");
        }
    }

    /**
     * Evaluates primary expression
     *
     * @param primaryContext
     *            expression
     * @return evaluated value
     * @throws EvaluationException
     */
    private Object evaluatePrimary(final PrimaryContext primaryContext) throws EvaluationException {

        final LiteralContext literalContext = primaryContext.literal();
        if (null != literalContext) {
            return evaluateLiteral(literalContext);
        }

        final ExpressionContext expressionContext = primaryContext.expression();
        if (null != expressionContext) {
            return evaluate(expressionContext);
        }

        final TerminalNode identifier = primaryContext.Identifier();
        if (null != identifier) {
            return getValue(identifier.getText());
        }

        throw new EvaluationException("Unexpected expression: " + primaryContext.getText());
    }

    private Object evaluateMathematicalExpression(final ExpressionContext firstOperandExpression, final String operator, final ExpressionContext secondOperandExpression)
            throws EvaluationException {

        final Object firstExpr = evaluate(firstOperandExpression);
        final Object secondExpr = evaluate(secondOperandExpression);

        // string concatenation
        if (operator.equals("+") && (firstExpr instanceof String || secondExpr instanceof String)) {
            return stringConcatenation(firstExpr, secondExpr);
        }

        final Number firstOperand = (Number) firstExpr;
        final Number secondOperand = (Number) secondExpr;

        final boolean isFirstDouble = firstOperand instanceof Double;
        final boolean isSecondDouble = secondOperand instanceof Double;

        Number result = 0;

        switch (operator) {
        case "+":
            result = (isFirstDouble ? firstOperand.doubleValue() : firstOperand.intValue()) + (isSecondDouble ? secondOperand.doubleValue() : secondOperand.intValue());
            break;
        case "-":
            result = (isFirstDouble ? firstOperand.doubleValue() : firstOperand.intValue()) - (isSecondDouble ? secondOperand.doubleValue() : secondOperand.intValue());
            break;
        case "*":
            result = (isFirstDouble ? firstOperand.doubleValue() : firstOperand.intValue()) * (isSecondDouble ? secondOperand.doubleValue() : secondOperand.intValue());
            break;
        case "/":
            result = (isFirstDouble ? firstOperand.doubleValue() : firstOperand.intValue()) / (isSecondDouble ? secondOperand.doubleValue() : secondOperand.intValue());
            break;
        case "%":
            result = (isFirstDouble ? firstOperand.doubleValue() : firstOperand.intValue()) % (isSecondDouble ? secondOperand.doubleValue() : secondOperand.intValue());
            break;
        default:
            throw new EvaluationException("Cannot evaluate expression: " + operator);
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
    private Object stringConcatenation(final Object firstExpr, final Object secondExpr) {
        final String first = null == firstExpr ? "" : firstExpr.toString();
        final String second = null == secondExpr ? "" : secondExpr.toString();

        return new StringBuilder(first).append(second).toString();
    }

    private Object[] evaluateExpressionList(final ExpressionListContext expressionListContext) throws EvaluationException {
        if (null == expressionListContext) {
            return new Object[0];
        }

        final List<ExpressionContext> expressionContexts = expressionListContext.expression();

        final Object[] objects = new Object[expressionContexts.size()];

        for (int i = 0; i < expressionContexts.size(); i++) {

            final ExpressionContext expression = expressionContexts.get(i);

            objects[i] = evaluate(expression);
        }

        return objects;
    }

    private Object evaluateLiteral(final LiteralContext literalContext) throws EvaluationException {

        final TerminalNode string = literalContext.StringLiteral();
        if (null != string) {
            return new StringDeclaration(string).getContent();
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

        throw new EvaluationException("Cannot evaluate literal: " + literalContext.getText());
    }

    private Object processWiidgetMethodCall(final WiidgetMethodCallExpressionContext wiidgetMethodCallExpressionContext) throws EvaluationException {

        final String wiidgetVariable = wiidgetMethodCallExpressionContext.wiidgetVariable().Identifier().getText();

        final Wiidget wiidget = getWiidgetMap().get(wiidgetVariable);

        if (null == wiidget) {
            handleUndefinedWiidgetVariable(wiidgetVariable);
        }

        final String methodName = wiidgetMethodCallExpressionContext.Identifier().getText();

        final ExpressionListContext expressionListContext = wiidgetMethodCallExpressionContext.expressionList();

        final Object[] parameters = null == expressionListContext ? new Object[0] : evaluateExpressionList(expressionListContext);

        try {
            return Reflection.callMethod(wiidget, methodName, parameters);
        } catch (final ReflectionException reflectionException) {
            throw new EvaluationException("Cannot call method '" + methodName + "' on " + wiidget.getClass().getCanonicalName(), reflectionException);
        }
    }

    /**
     * @param variable
     * @throws EvaluationException
     */
    private void handleUndefinedWiidgetVariable(final String variable) throws EvaluationException {
        throw new EvaluationException("Variable is undefined: '" + variable + "'");
    }

    private Object getValue(final String name) {
        return getWiidgetContext().get(name);
    }

    public WiidgetContext getWiidgetContext() {
        return wiidgetContext;
    }

    /**
     * @return the wiidgetMap
     */
    public Map<String, Wiidget> getWiidgetMap() {
        return wiidgetMap;
    }
}
