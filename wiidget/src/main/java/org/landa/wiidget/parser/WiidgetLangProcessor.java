package org.landa.wiidget.parser;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.landa.wiidget.ResourceWiidget;
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
import org.landa.wiidget.antlr.WiidgetParser.ExpressionWiidgetNameContext;
import org.landa.wiidget.antlr.WiidgetParser.ForeachControlContext;
import org.landa.wiidget.antlr.WiidgetParser.IfControlContext;
import org.landa.wiidget.antlr.WiidgetParser.ImportDeclarationContext;
import org.landa.wiidget.antlr.WiidgetParser.QualifiedNameContext;
import org.landa.wiidget.antlr.WiidgetParser.SeamStatementContext;
import org.landa.wiidget.antlr.WiidgetParser.StatementDeclarationContext;
import org.landa.wiidget.antlr.WiidgetParser.UnifiedWiidgetNameContext;
import org.landa.wiidget.antlr.WiidgetParser.WiidgetArgumentsContext;
import org.landa.wiidget.antlr.WiidgetParser.WiidgetBodyContext;
import org.landa.wiidget.antlr.WiidgetParser.WiidgetDeclarationContext;
import org.landa.wiidget.antlr.WiidgetParser.WiidgetMethodCallExpressionContext;
import org.landa.wiidget.antlr.WiidgetParser.WiidgetVariableBindingContext;
import org.landa.wiidget.engine.WiidgetFactory;
import org.landa.wiidget.parser.control.ForeachControl;
import org.landa.wiidget.parser.control.IfControl;
import org.landa.wiidget.parser.evaluation.EvaluationException;
import org.landa.wiidget.parser.evaluation.ExpressionEvaluator;
import org.landa.wiidget.parser.exception.ImportException;
import org.landa.wiidget.parser.resource.ClassWiidgetResource;
import org.landa.wiidget.parser.resource.ExternalWiidgetResource;
import org.landa.wiidget.parser.resource.FileWiidgetResource;
import org.landa.wiidget.parser.resource.WiidgetResource;
import org.landa.wiidget.parser.util.StringDeclaration;
import org.landa.wiidget.reflect.Reflection;
import org.landa.wiidget.util.DataMap;

/**
 * The part of Wiidget framework interprets the ANTLR lexer result.
 * <p>
 * The processor extends the {@link WiidgetView}, so behaves as a view. Cause of this fact, the processor can create wiidgets, and can render a template.
 * </p>
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class WiidgetLangProcessor extends WiidgetView {

    /** In this object can we store imported classes, files and aliases. */
    private ImportContext importContext;

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
    public WiidgetLangProcessor(final WiidgetFactory wiidgetFactory) {
        this(wiidgetFactory, null);
    }

    /**
     *
     * @param wiidgetFactory
     * @param owner
     */
    public WiidgetLangProcessor(final WiidgetFactory wiidgetFactory, final WiidgetView owner) {
        super(wiidgetFactory);

        this.ownerView = owner == null ? this : owner;

    }

    protected void importDefaultClasses() {
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
    public String render(final InputStream template) throws WiidgetParserException {

        final CompilationUnitContext compilationUnitContext = getCompilationUnitContext(template);
        return render(compilationUnitContext);
    }

    /**
     * @param compilationUnitContext
     * @return
     * @throws WiidgetParserException
     */
    private String render(final CompilationUnitContext compilationUnitContext) throws WiidgetParserException {

        importContext = createImportContext(compilationUnitContext.importDeclaration());
        try {
            importContext.process();
        } catch (final ImportException e) {
            throw new WiidgetParserException("Illegal import", e);
        }

        importDefaultClasses();

        processStatements(compilationUnitContext.statementDeclaration());

        final String result = this.render();

        return result;
    }

    /**
     * Creates import context that can process and hold import informatons.
     *
     * @param importDeclaration
     *            imports in template
     * @return import context
     */
    protected ImportContext createImportContext(final List<ImportDeclarationContext> importDeclaration) {
        return new ImportContext(importDeclaration); // use default context
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
        }

        final WiidgetDeclarationContext wiidgetDeclarationContext = statementDeclarationContext.wiidgetDeclaration();
        if (null != wiidgetDeclarationContext) {
            processWiidget(wiidgetDeclarationContext);
        }

        final WiidgetMethodCallExpressionContext wiidgetMethodCallExpressionContext = statementDeclarationContext.wiidgetMethodCallExpression();
        if (null != wiidgetMethodCallExpressionContext) {

            evaluateWiidgetMethodCall(wiidgetMethodCallExpressionContext);
        }

        final SeamStatementContext seamStatementContext = statementDeclarationContext.seamStatement();
        if (null != seamStatementContext) {
            processSeamStatement(seamStatementContext);
        }

    }

    private Object evaluateWiidgetMethodCall(final WiidgetMethodCallExpressionContext wiidgetMethodCallExpressionContext) throws EvaluationException {
        final ExpressionEvaluator evaluator = createExpressionEvaluator();
        return evaluator.evaluate(wiidgetMethodCallExpressionContext);
    }

    private void processSeamStatement(final SeamStatementContext seamStatementContext) throws WiidgetParserException {

        final ExpressionContext expressionContext = seamStatementContext.expression();

        final Object object = evaluateExpression(expressionContext);

        if (object instanceof Wiidget == false) {
            throw new WiidgetParserException("Expression '" + expressionContext.getText() + "' must be return wiidget instance.");
        }

        final Wiidget wiidget = (Wiidget) object;

        beginWiidget(wiidget);

        final WiidgetBodyContext wiidgetBodyContext = seamStatementContext.wiidgetBody();
        if (null != wiidgetBodyContext) {
            processStatements(wiidgetBodyContext.statementDeclaration());
        }

        endWiidget(wiidget);
    }

    private void processControl(final ControlStatementContext controlStatementContext) throws WiidgetParserException {

        final WiidgetBodyContext bodyContext = controlStatementContext.wiidgetBody();

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

    private void processForeach(final ForeachControl foreachControl, final WiidgetBodyContext bodyContext) throws WiidgetParserException {

        final String variable = foreachControl.getVariable();
        final Iterable<?> iterable = foreachControl.getIterable();

        Object oldVariableValue = null;
        if (getWiidgetContext().isSet(variable)) {
            oldVariableValue = getWiidgetContext().get(variable);
        }

        if (null == iterable) {
            throw new WiidgetException("Itarable value in 'foreach' statement is null.");
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

    private void processIf(final IfControl ifControl, final WiidgetBodyContext bodyContext) throws WiidgetParserException {

        if (ifControl.getValue()) {

            processStatements(bodyContext.statementDeclaration());
        }

    }

    private ForeachControl processForeachControl(final ForeachControlContext foreachControlContext) throws WiidgetParserException {

        final String variable = foreachControlContext.foreachVariable().getText();

        Iterable<?> iterable = null;
        try {
            iterable = (Iterable<?>) evaluateExpression(foreachControlContext.expression());
        } catch (final ClassCastException castException) {

            throw new WiidgetParserException("Foreach statement must have iterable class.", castException);
        }

        return new ForeachControl(variable, iterable);

    }

    private IfControl processIfControl(final IfControlContext ifControlContext) throws WiidgetParserException {
        try {

            final Boolean condition = (Boolean) evaluateExpression(ifControlContext.expression());

            return new IfControl(condition);

        } catch (final ClassCastException castException) {

            throw new WiidgetParserException("Expression must be boolean: " + ifControlContext.expression().getText(), castException);
        }

    }

    private void processWiidget(final WiidgetDeclarationContext declarationContext) throws WiidgetParserException {

        // variable name of wiidget
        String wiidgetVariable = null;

        final WiidgetVariableBindingContext wiidgetVariableBindingContext = declarationContext.wiidgetVariableBinding();
        if (null != wiidgetVariableBindingContext) {
            wiidgetVariable = wiidgetVariableBindingContext.wiidgetVariable().Identifier().getText();
        }

        Wiidget wiidget;

        final UnifiedWiidgetNameContext wiidgetNameContext = declarationContext.unifiedWiidgetName();
        final TerminalNode stringWiidgetName = wiidgetNameContext.StringLiteral();
        final WiidgetArgumentsContext wiidgetArguments = declarationContext.wiidgetArguments();

        if (null == stringWiidgetName) {

            final ExpressionWiidgetNameContext expressionWiidgetName = wiidgetNameContext.expressionWiidgetName();
            if (null == expressionWiidgetName) {

                final String alias = wiidgetNameContext.Identifier().getText();
                final WiidgetResource wiidgetResource = getWiidgetClass(alias);

                if (null == wiidgetResource) {
                    throw new WiidgetParserException("Unknown wiidget alias: " + alias);
                }

                wiidget = createWiidget(wiidgetResource, wiidgetArguments);
            } else {

                wiidget = createWiidgetFromExpression(expressionWiidgetName.expression(), wiidgetArguments);

            }

        } else {

            final String tagName = new StringDeclaration(stringWiidgetName).getContent();
            wiidget = createRawWiidget(tagName, wiidgetArguments);

        }

        wiidget = startWiidget(wiidget); // after start wiidget can be null when its not rendered

        // bind to variable
        if (null != wiidgetVariable) {
            wiidgetMap.put(wiidgetVariable, wiidget);
        }

        // rendered property has meaning here
        if (null != wiidget) {
            processStatements(declarationContext.wiidgetBody().statementDeclaration());
        }

        endWiidget(wiidget);

    }

    private Wiidget createWiidgetFromExpression(final ExpressionContext expression, final WiidgetArgumentsContext wiidgetArguments) throws WiidgetParserException {

        final Object value = evaluateExpression(expression);
        if (value instanceof Wiidget) {
            return (Wiidget) value;

        } else if (value instanceof String) {
            return createRawWiidget((String) value, wiidgetArguments);
        } else if (value instanceof Class) {

            if (Wiidget.class.isAssignableFrom((Class<?>) value)) {

                final Class<? extends Wiidget> type = (Class<? extends Wiidget>) value;
                final DataMap dataMap = processArguments(wiidgetArguments, type);

            }

        }

        throw new WiidgetParserException(String.format("Unsupported wiidget name expression: %s", value));
    }

    private Wiidget createRawWiidget(final String tagName, final WiidgetArgumentsContext wiidgetArguments) throws WiidgetParserException {

        final Class<? extends Wiidget> rawType = getRawType();

        final DataMap dataMap = processArguments(wiidgetArguments, rawType);
        dataMap.put("rawTagName", tagName); // TODO interface for rawtype
        final Wiidget wiidget = getWiidgetFactory().createWiidget(this, rawType, dataMap, true);

        return wiidget;
    }

    private Class<? extends Wiidget> getRawType() {
        return getWiidgetFactory().getWiidgetProperties().getRawType();
    }

    private Wiidget createWiidget(final WiidgetResource wiidgetResource, final WiidgetArgumentsContext arguments) throws WiidgetParserException {
        Wiidget wiidget;
        if (wiidgetResource instanceof FileWiidgetResource) {

            final FileWiidgetResource fileWiidgetResource = (FileWiidgetResource) wiidgetResource;

            final String fileName = getRealFilename(fileWiidgetResource.getCanonicalFileName());
            final ResourceWiidget resourceWiidget = getWiidgetFactory().createWiidget(getOwner(), ResourceWiidget.class, EMPTY_DATA, true);
            resourceWiidget.setFileName(fileName);

            wiidget = resourceWiidget;

        } else if (wiidgetResource instanceof ClassWiidgetResource) {

            final Class<? extends Wiidget> type = ((ClassWiidgetResource) wiidgetResource).getWiidgetClass();
            final DataMap dataMap = processArguments(arguments, type);

            wiidget = getWiidgetFactory().createWiidget(this, type, dataMap, true);

        } else if (wiidgetResource instanceof ExternalWiidgetResource) {

            wiidget = createExternalWiidget((ExternalWiidgetResource) wiidgetResource, arguments);

        } else {
            throw new IllegalStateException("Illegal import elemenet: " + wiidgetResource);
        }

        return wiidget;
    }

    private Wiidget createExternalWiidget(final ExternalWiidgetResource wiidgetResource, final WiidgetArgumentsContext arguments) {
        // TODO Auto-generated method stub
        return null;
    }

    private String getRealFilename(final String canonicalFileName) {
        // TODO Auto-generated method stub
        return null;
    }

    private WiidgetResource getWiidgetClass(final String wiidgetName) throws WiidgetParserException {
        return importContext.findByAlias(wiidgetName);
    }

    private DataMap processArguments(final WiidgetArgumentsContext wiidgetArguments, final Class<? extends Wiidget> wiidgetClass) throws WiidgetParserException {

        final DataMap dataMap = new DataMap();

        if (null == wiidgetArguments) {
            return dataMap;
        }

        final ElementValueContext elementValueContext = wiidgetArguments.elementValue();

        if (null == elementValueContext) {

            final ElementValuePairsContext elementValuePairsContext = wiidgetArguments.elementValuePairs();
            if (null != elementValuePairsContext) {
                final List<ElementValuePairContext> valuePairContext = elementValuePairsContext.elementValuePair();

                if (valuePairContext != null) {
                    for (final ElementValuePairContext elementValuePairContext : valuePairContext) {

                        final String property = elementValuePairContext.Identifier().getText();

                        final ElementValueContext elementValue = elementValuePairContext.elementValue();
                        final Object value = processArgumentValue(elementValue);

                        dataMap.put(property, value);
                    }
                }
            }

        } else {

            final Object value = processArgumentValue(elementValueContext);

            if (null == wiidgetClass) {
                dataMap.put("id", value); // id is the default attribute
            } else {
                final String property = getDefaultValueProperty(wiidgetClass);
                dataMap.put(property, value);
            }

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
            return evaluateExpression(expressionContext);
        }
        throw new WiidgetParserException("Cannot get value of : " + valueContext.getText());

    }

    /**
     * Element value array evaluator.
     *
     * @param arrayInitializerContext
     *            context
     * @return array of evaluated values
     * @throws WiidgetParserException
     */
    private Object[] processValueArray(final ElementValueArrayInitializerContext arrayInitializerContext) throws WiidgetParserException {

        final List<ElementValueContext> elementValueContexts = arrayInitializerContext.elementValue();
        final int size = elementValueContexts.size();
        final Object[] dataArray = new Object[size];

        for (int index = 0; index < elementValueContexts.size(); index++) {

            dataArray[index] = processArgumentValue(elementValueContexts.get(index));

        }

        return dataArray;
    }

    private Object processQualifiedName(final QualifiedNameContext qualifiedNameContext) throws WiidgetParserException {
        final Iterator<TerminalNode> iterator = qualifiedNameContext.Identifier().iterator();

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
    private Object evaluateExpression(final ExpressionContext expression) throws WiidgetParserException {

        final ExpressionEvaluator evaluator = createExpressionEvaluator();

        return evaluator.evaluate(expression);
    }

    private ExpressionEvaluator createExpressionEvaluator() {
        return new ExpressionEvaluator(getWiidgetContext(), wiidgetMap);
    }

    public static CompilationUnitContext getCompilationUnitContext(final InputStream inputStream) throws WiidgetParserException {
        try {
            final ANTLRInputStream input = new ANTLRInputStream(inputStream);
            return getCompilationUnitContext(input);

        } catch (final IOException exception) {
            throw new WiidgetParserException("Cannot parse input.", exception);
        }
    }

    public static CompilationUnitContext getCompilationUnitContext(final String template) {
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
    private static CompilationUnitContext getCompilationUnitContext(final ANTLRInputStream antlrInputStream) {

        final WiidgetLexer aWiidgetLexer = new WiidgetLexer(antlrInputStream);
        final BufferedTokenStream tokenStream = new BufferedTokenStream(aWiidgetLexer);
        final WiidgetParser aWiidgetParser = new CustomWiidgetParser(tokenStream);
        final CompilationUnitContext compilationUnit = aWiidgetParser.compilationUnit();

        return compilationUnit;
    }
}
