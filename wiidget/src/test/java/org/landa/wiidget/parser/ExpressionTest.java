package org.landa.wiidget.parser;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.landa.wiidget.Tag;
import org.landa.wiidget.Wiidget;
import org.landa.wiidget.antlr.WiidgetLexer;
import org.landa.wiidget.antlr.WiidgetParser;
import org.landa.wiidget.context.DefaultWiidgetContext;
import org.landa.wiidget.context.WiidgetContext;
import org.landa.wiidget.engine.DefaultWiidgetFactory;
import org.landa.wiidget.parser.evaluation.EvaluationException;
import org.landa.wiidget.parser.evaluation.ExpressionEvaluator;
import org.landa.wiidget.util.DataMap;

public class ExpressionTest {

    private WiidgetContext wiidgetContext;

    @Before
    public void initContext() {
        wiidgetContext = new DefaultWiidgetContext();

    }

    @Test
    public void testIndexedListExpression() {

        final Object object = new Object();
        wiidgetContext.set("list", Arrays.asList(1, 2, 3, 4, "foo", object));

        assertExpression(1, "list[0]");
        assertExpression(2, "list[1]");
        assertExpression("foo", "list[4]");
        assertExpression(object, "list[5]");
    }

    @Test
    public void testPropertyByIndexing() throws NoSuchMethodException, SecurityException {

        final Tag tag = new Tag("div");

        wiidgetContext.set("tag", tag);
        assertExpression("div", "tag[\"name\"]");

        wiidgetContext.set("propertyName", "name");
        assertExpression("div", "tag[propertyName]");

        wiidgetContext.set("list", Arrays.asList(1, 2, 4));
        assertExpression(Collection.class.getMethod("size"), "list[\"size\"]");

        // TODO make it possible
        //assertExpression(3, "list[\"size\"]()");
    }

    @Test
    public void testMapExpression() throws NoSuchMethodException, SecurityException {

        wiidgetContext.set("map", new DataMap().set("someValue", 12));
        assertExpression(12, "map[\"someValue\"]");

        wiidgetContext.set("someValueKey", "someValue");
        assertExpression(12, "map[someValueKey]");

        assertExpression(null, "map[\"someUnsetKey\"]");

    }

    private void assertExpression(final Object expected, final String template) {

        Assert.assertEquals(expected, safeEvaluate(template));
    }

    private Object safeEvaluate(final String string) {
        try {
            return evaluate(string);
        } catch (EvaluationException | RecognitionException e) {
            throw new RuntimeException(e);
        }

    }

    private Object evaluate(final String template) throws EvaluationException, RecognitionException {

        final WiidgetParser createParser = createParser(template);
        final ExpressionEvaluator evaluator = createEvaluator(wiidgetContext);

        return evaluator.evaluate(createParser.expressionList().expression().get(0));
    }

    private static ExpressionEvaluator createEvaluator(final WiidgetContext wiidgetContext) {
        return new DefaultWiidgetFactory(wiidgetContext).getConfiguration().getExpressionEvaluatorFactory(wiidgetContext, new HashMap<String, Wiidget>()).create();
    }

    private static WiidgetParser createParser(final String template) {
        final ANTLRInputStream input = new ANTLRInputStream(template);
        final WiidgetLexer aWiidgetLexer = new WiidgetLexer(input);
        final BufferedTokenStream tokenStream = new BufferedTokenStream(aWiidgetLexer);
        final WiidgetParser wiidgetParser = new CustomWiidgetParser(tokenStream);

        return wiidgetParser;
    }

}
