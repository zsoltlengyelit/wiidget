package org.landa.wiidget.testutil;

/**
 *
 * @author lzsolt
 *
 */
public class Assume {

    private static final String CONTINUOUS_INTEGRATION_EVN_VAR = "CONTINUOUS_INTEGRATION";

    public static void assumeCiServer() {
        org.junit.Assume.assumeTrue(isCiServer());
    }

    public static void assumeNonCiServer() {
        org.junit.Assume.assumeFalse(isCiServer());
    }

    /**
     * @return true when the environment is a continuous server
     */
    public static boolean isCiServer() {
        return Boolean.parseBoolean(System.getProperty(CONTINUOUS_INTEGRATION_EVN_VAR));
    }

}
