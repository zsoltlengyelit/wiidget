package org.landa.wiidget.parser;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.landa.wiidget.Renderer;
import org.landa.wiidget.util.DataMap;

/**
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 *
 */
public class ExternalImportTest {

    private static final Logger LOGGER = Logger.getLogger(ExternalImportTest.class.getSimpleName());

    private static final int PORT = 7249;
    static Server server;
    static DataMap content;
    static Map<String, String> files;

    @BeforeClass
    public static void initServer() throws Exception {
        // run only in locale
        // TODO support CI environment
        org.landa.wiidget.testutil.Assume.assumeNonCiServer();

        server = new Server(PORT);
        server.setHandler(new ContentServer());
        server.start();

        LOGGER.log(Level.INFO, "External wiidget server started");

    }

    @Before
    public void init() {
        content = new DataMap();
        files = new HashMap<String, String>();

    }

    @AfterClass
    public static void stopServer() throws Exception {
        if (null != server) {

            server.stop();
            server.destroy();
            LOGGER.log(Level.INFO, "External wiidget server stopped");
        }
    }

    @Test
    public void testExternalLoading() {

        final String path = "simpleOut";
        files.put(path, "/externalWiidgets/simpleOut.wdgt");

        final String externalUrl = getExternalUrl(path);

        final StringBuilder builder = new StringBuilder();
        builder.append("import \"");
        builder.append(externalUrl);
        builder.append("\" as external;\n");
        builder.append(" external;	");

        final String rendered = Renderer.create().render(builder.toString());

        final String expected = "Hello external wiidget";
        Assert.assertEquals(expected, rendered);
    }

    @Test
    public void testPassParameter() {

        final String path = "varOut";
        files.put(path, "/externalWiidgets/varOut.wdgt");

        final String externalUrl = getExternalUrl(path);

        final StringBuilder builder = new StringBuilder();
        builder.append("import \"");
        builder.append(externalUrl);
        builder.append("\" as external;\n");
        builder.append(" external(passedVariable = \"Must print\");	");

        final String rendered = Renderer.create().render(builder.toString());

        final String expected = "Must print";
        Assert.assertEquals(expected, rendered);
    }

    @Test
    public void testResourceFile() {

        final StringBuilder builder = new StringBuilder();
        builder.append("import \"");
        builder.append("resource:///externalWiidgets/varOut.wdgt");
        builder.append("\" as localfile;\n");
        builder.append(" localfile(passedVariable = \"Must print\");	");

        final String rendered = Renderer.create().render(builder.toString());

        final String expected = "Must print";
        Assert.assertEquals(expected, rendered);
    }

    @Test
    public void testLocalFile() throws URISyntaxException {

        final URL resource = getClass().getResource("/externalWiidgets/varOut.wdgt");
        String absolutePath = Paths.get(resource.toURI()).toFile().getAbsolutePath();
        absolutePath = absolutePath.replaceAll("\\\\", "/");

        final StringBuilder builder = new StringBuilder();
        builder.append("import \"file://");
        builder.append(absolutePath);
        builder.append("\" as localfile;\n");
        builder.append(" localfile(passedVariable = \"Must print\");	");

        final String rendered = Renderer.create().render(builder.toString());

        final String expected = "Must print";
        Assert.assertEquals(expected, rendered);

    }

    private String getExternalUrl(final String path) {
        return "http://localhost:" + PORT + "/" + path;
    }

    // to serve wiidget files
    public static class ContentServer extends AbstractHandler {

        @Override
        public void handle(final String target, final Request baseRequest, final HttpServletRequest request, final HttpServletResponse response) throws IOException,
        ServletException {

            response.setContentType("application/wiidget;charset=utf-8");
            response.setStatus(HttpServletResponse.SC_OK);
            baseRequest.setHandled(true);

            final String resourceName = target.substring(1);

            if (files.containsKey(resourceName)) {

                final String fileName = files.get(resourceName);

                final InputStream resourceAsStream = getClass().getResourceAsStream(fileName);
                final String content = IOUtils.toString(resourceAsStream);
                response.getWriter().print(content);

            } else {
                final Object object = content.get(resourceName);
                response.getWriter().print(object);
            }
        }
    }
}
