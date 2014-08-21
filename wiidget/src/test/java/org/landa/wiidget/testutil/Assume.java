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
        final String ciProperty = System.getProperty(CONTINUOUS_INTEGRATION_EVN_VAR);

        System.out.println(String.format("CI server property: %s = %s ", CONTINUOUS_INTEGRATION_EVN_VAR, ciProperty));

        return Boolean.parseBoolean(ciProperty);
    }

}
