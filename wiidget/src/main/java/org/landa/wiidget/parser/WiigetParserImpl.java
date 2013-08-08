package org.landa.wiidget.parser;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.landa.wiidget.Wiidget;
import org.landa.wiidget.WiidgetView;
import org.landa.wiidget.annotation.DefaultField;
import org.landa.wiidget.antlr.WiidgetParser.BooleanExpressionContext;
import org.landa.wiidget.antlr.WiidgetParser.CompilationUnitContext;
import org.landa.wiidget.antlr.WiidgetParser.ControlStatementContext;
import org.landa.wiidget.antlr.WiidgetParser.ElementValueArrayInitializerContext;
import org.landa.wiidget.antlr.WiidgetParser.ElementValueContext;
import org.landa.wiidget.antlr.WiidgetParser.ElementValuePairContext;
import org.landa.wiidget.antlr.WiidgetParser.ElementValuePairsContext;
import org.landa.wiidget.antlr.WiidgetParser.ExpressionContext;
import org.landa.wiidget.antlr.WiidgetParser.ForeachControlContext;
import org.landa.wiidget.antlr.WiidgetParser.IfControlContext;
import org.landa.wiidget.antlr.WiidgetParser.ImportDeclarationContext;
import org.landa.wiidget.antlr.WiidgetParser.JokerImportContext;
import org.landa.wiidget.antlr.WiidgetParser.LiteralContext;
import org.landa.wiidget.antlr.WiidgetParser.QualifiedNameContext;
import org.landa.wiidget.antlr.WiidgetParser.StatementDeclarationContext;
import org.landa.wiidget.antlr.WiidgetParser.WidgetArgumentsContext;
import org.landa.wiidget.antlr.WiidgetParser.WidgetBodyContext;
import org.landa.wiidget.antlr.WiidgetParser.WidgetDeclarationContext;
import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.engine.WiidgetFactory;
import org.landa.wiidget.parser.control.ForeachControl;
import org.landa.wiidget.parser.control.IfControl;
import org.landa.wiidget.reflect.Reflection;
import org.landa.wiidget.util.DataMap;
import org.mvel2.MVEL;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class WiigetParserImpl extends WiidgetView implements WiigetParser {

	Map<String, Class<? extends Wiidget>> importClassMap;

	List<String> importPackages;

	Injector injector;

	private final WiidgetContext wiidgetContext;

	@Inject
	public WiigetParserImpl(final Injector injector, final WiidgetFactory wiidgetFactory, final WiidgetContext wiidgetContext) {
		super();

		this.importClassMap = new HashMap<String, Class<? extends Wiidget>>();
		this.importPackages = new ArrayList<String>();
		this.injector = injector;

		this.wiidgetContext = wiidgetContext;

		// importBaseClasses(); // TODO konfigurációból szedni az importálandó
		// osztályokat és csomagokat
	}

	@Override
	public void run() {
		// NO-OP
	}

	@Override
	public String render(final CompilationUnitContext compilationUnitContext) throws WiidgetParserException {

		processImports(compilationUnitContext.importDeclaration());

		processStatements(compilationUnitContext.statementDeclaration());

		final String result = this.render();

		return result;
	}

	private void processStatements(final List<StatementDeclarationContext> statementDeclaration) throws WiidgetParserException {

		if (null == statementDeclaration) {// no child statement
			return;
		}

		for (final StatementDeclarationContext statementDeclarationContext : statementDeclaration) {
			processStatement(statementDeclarationContext);
		}

	}

	private void processStatement(final StatementDeclarationContext statementDeclarationContext) throws WiidgetParserException {
		final ControlStatementContext controlStatementContext = statementDeclarationContext.controlStatement();

		if (null != controlStatementContext) {

			processControl(controlStatementContext);
			return;
		} else {

			final WidgetDeclarationContext widgetDeclarationContext = statementDeclarationContext.widgetDeclaration();

			processWidget(widgetDeclarationContext);
		}

	}

	private void processControl(final ControlStatementContext controlStatementContext) throws WiidgetParserException {

		final WidgetBodyContext bodyContext = controlStatementContext.widgetBody();

		final IfControlContext ifControlContext = controlStatementContext.ifControl();
		if (null != ifControlContext) {

			final IfControl ifControl = processIfControl(ifControlContext);

			processIf(ifControl, bodyContext);

		} else {

			final ForeachControlContext foreachControlContext = controlStatementContext.foreachControl();
			final ForeachControl foreachControl = processForeachControl(foreachControlContext);

			processForeach(foreachControl, bodyContext);
		}

	}

	private void processForeach(final ForeachControl foreachControl, final WidgetBodyContext bodyContext) throws WiidgetParserException {

		final String variable = foreachControl.getVariable();
		final Iterable<?> iterable = foreachControl.getIterable();

		Object oldVariableValue = null;
		if (wiidgetContext.isSet(variable)) {
			oldVariableValue = wiidgetContext.get(variable);
		}

		for (final Object item : iterable) {

			wiidgetContext.set(variable, item);

			processStatements(bodyContext.statementDeclaration());
		}

		if (oldVariableValue == null) {
			wiidgetContext.remove(variable); // remove
		} else {
			wiidgetContext.set(variable, oldVariableValue); // set back old
			                                                // value
		}

	}

	private void processIf(final IfControl ifControl, final WidgetBodyContext bodyContext) throws WiidgetParserException {

		if (ifControl.getValue()) {

			processStatements(bodyContext.statementDeclaration());
		}

	}

	private ForeachControl processForeachControl(final ForeachControlContext foreachControlContext) throws WiidgetParserException {

		final String variable = foreachControlContext.foreachVariable().getText();

		Iterable<?> iterable = null;
		try {
			iterable = (Iterable<?>) getQualifiedNameValue(foreachControlContext.qualifiedName());
		} catch (final ClassCastException castException) {
			throw new WiidgetParserException("Foreach statement must have iterable class.", castException);
		}

		return new ForeachControl(variable, iterable);

	}

	private Object getQualifiedNameValue(final QualifiedNameContext qualifiedName) {

		final Iterator<TerminalNode> iterator = qualifiedName.Identifier().iterator();

		final String baseName = iterator.next().getText();
		Object base = getValue(baseName);

		while (iterator.hasNext()) {
			final String nodeName = iterator.next().getText();

			base = MVEL.getProperty(nodeName, base);
		}

		return base;
	}

	private Object getValue(final String name) {
		return wiidgetContext.get(name);
	}

	private IfControl processIfControl(final IfControlContext ifControlContext) {

		final Boolean value = evaluate(ifControlContext.booleanExpression());

		return new IfControl(value);

	}

	private Boolean evaluate(final BooleanExpressionContext booleanExpression) {

		final String expression = booleanExpression.getText();

		final Map<String, Object> variables = wiidgetContext.getAll();
		final Boolean value = MVEL.evalToBoolean(expression, variables);

		return value;
	}

	private void processImports(final List<ImportDeclarationContext> importDeclaration) throws WiidgetParserException {

		for (final ImportDeclarationContext context : importDeclaration) {
			processImport(context);
		}
	}

	private void processWidget(final WidgetDeclarationContext declarationContext) throws WiidgetParserException {
		// builder.append("Widget: (" +
		// declarationContext.widgetName().getText() + ") {\n");

		final String widgetName = declarationContext.widgetName().getText();

		final Class<? extends Wiidget> wiidgetClass = getWidgetClass(widgetName);

		if (null == wiidgetClass) {
			throw new WiidgetParserException("Unknown widget name: " + widgetName);
		}

		final DataMap dataMap = processArguments(declarationContext.widgetArguments(), wiidgetClass);

		final Wiidget widget = beginWidget(wiidgetClass, dataMap);

		processStatements(declarationContext.widgetBody().statementDeclaration());

		endWidget(widget);

	}

	private Class<? extends Wiidget> getWidgetClass(final String widgetName) throws WiidgetParserException {

		Class<? extends Wiidget> wiidgetClass = importClassMap.get(widgetName);

		if (null == wiidgetClass) { // try from package

			for (final String packageName : importPackages) {

				// package plus widget name
				final String className = packageName + '.' + widgetName;
				try {

					wiidgetClass = findWidgetClass(className);

					if (null != wiidgetClass) {
						// import pragmatically the class
						importClassMap.put(widgetName, wiidgetClass);
					}

				} catch (final WiidgetParserException wiidgetParserException) {
					// No-op
				}
			}
		}

		// maybe fully qualified name
		if (null == wiidgetClass) {
			wiidgetClass = findWidgetClass(widgetName);
		}

		return wiidgetClass;

	}

	private DataMap processArguments(final WidgetArgumentsContext widgetArguments, final Class<? extends Wiidget> wiidgetClass) throws WiidgetParserException {

		final DataMap dataMap = new DataMap();

		if (null == widgetArguments) {
			return dataMap;
		}

		final ElementValueContext elementValueContext = widgetArguments.elementValue();

		if (null == elementValueContext) {

			final ElementValuePairsContext elementValuePairsContext = widgetArguments.elementValuePairs();
			if (null != elementValuePairsContext) {
				final List<ElementValuePairContext> valuePairContext = elementValuePairsContext.elementValuePair();

				if (valuePairContext != null) {
					for (final ElementValuePairContext elementValuePairContext : valuePairContext) {

						final String property = elementValuePairContext.Identifier().getText();

						final Object value = processArgumentValue(elementValuePairContext.elementValue());
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

	private String getDefaultValueProperty(final Class<? extends Wiidget> wiidgetClass) {

		final Field defaultField = Reflection.getField(wiidgetClass, DefaultField.class);

		if (null == defaultField) {
			return "value";
		} else {
			return defaultField.getName();
		}

	}

	private Object processArgumentValue(final ElementValueContext valueContext) throws WiidgetParserException {

		final LiteralContext literalContext = valueContext.literal();
		if (null != literalContext) {
			return processLiteral(literalContext);
		}

		final QualifiedNameContext qualifiedNameContext = valueContext.qualifiedName();
		if (null != qualifiedNameContext) {
			return processQualifiedName(qualifiedNameContext);
		}

		final ElementValueArrayInitializerContext arrayInitializerContext = valueContext.elementValueArrayInitializer();
		if (null != arrayInitializerContext) {
			return processValueArray(arrayInitializerContext);
		}

		final ExpressionContext expressionContext = valueContext.expression();
		if (null != expressionContext) {
			return processExpression(expressionContext);
		}
		throw new WiidgetParserException("Cannot get value of : " + valueContext.getText());

	}

	private Object processValueArray(final ElementValueArrayInitializerContext arrayInitializerContext) throws WiidgetParserException {
		final int size = arrayInitializerContext.elementValue().size();
		final Object[] dataArray = new Object[size];

		final List<ElementValueContext> elementValueContexts = arrayInitializerContext.elementValue();

		for (int index = 0; index < elementValueContexts.size(); index++) {

			dataArray[index] = processArgumentValue(elementValueContexts.get(index));

		}

		return dataArray;
	}

	private Object processQualifiedName(final QualifiedNameContext qualifiedNameContext) {
		final Iterator<TerminalNode> iterator = qualifiedNameContext.Identifier().iterator();

		final TerminalNode baseNode = iterator.next();

		Object baseObject = wiidgetContext.get(baseNode.getText());

		while (iterator.hasNext()) {
			final TerminalNode terminalNode = iterator.next();
			final String property = terminalNode.getText();

			baseObject = MVEL.getProperty(property, baseObject);
		}

		return baseObject;

	}

	private Object processExpression(final ExpressionContext expression) {
		return expression.getText(); // TODO
	}

	private Object processLiteral(final LiteralContext literalContext) throws WiidgetParserException {

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
			return Float.parseFloat(floating.getText());
		}

		final TerminalNode character = literalContext.CharacterLiteral();
		if (null != character) {
			return character.getText().charAt(0);
		}

		final TerminalNode nullNode = literalContext.NullLiteral();
		if (null != nullNode) {
			return null;
		}

		throw new WiidgetParserException("Cannot parce literal: " + literalContext.getText());
	}

	/**
	 * @param importDeclarationContext
	 * @throws WiidgetParserException
	 */
	private void processImport(final ImportDeclarationContext importDeclarationContext) throws WiidgetParserException {

		final JokerImportContext jokerImport = importDeclarationContext.jokerImport();

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
	private void processImportClass(final ImportDeclarationContext importDeclarationContext) throws WiidgetParserException {

		final Iterator<TerminalNode> iterator = importDeclarationContext.qualifiedName().Identifier().iterator();

		final String className = importDeclarationContext.qualifiedName().getText();

		String lastQuilifier = "";
		while (iterator.hasNext()) {
			final TerminalNode terminalNode = iterator.next();

			// builder.append("I: " + terminalNode.getText() + "::");
			lastQuilifier = terminalNode.getText();
		}

		final Class<? extends Wiidget> imported = findWidgetClass(className);

		if (null == imported) {
			throw new WiidgetParserException("Cannot find wiidget class: " + className);
		}

		// put the full and simple name too
		importClassMap.put(className, imported);
		importClassMap.put(lastQuilifier, imported);
	}

	@SuppressWarnings("unchecked")
	private Class<? extends Wiidget> findWidgetClass(final String widgetName) throws WiidgetParserException {

		Class<? extends Wiidget> wiidgetClass = null;

		try {
			wiidgetClass = (Class<? extends Wiidget>) getClass().getClassLoader().loadClass(widgetName);

		} catch (final ClassNotFoundException e) {
			throw new WiidgetParserException("Cannot found class: " + widgetName, e);
		} catch (final ClassCastException castException) {
			throw new WiidgetParserException("Class is not wiidget: " + widgetName, castException);
		}

		return wiidgetClass;
	}

	private void processImportPackage(final ImportDeclarationContext importDeclarationContext) {

		final String packageName = importDeclarationContext.qualifiedName().getText();

		importPackages.add(packageName);
	}
}
