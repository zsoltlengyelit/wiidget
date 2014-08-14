package org.landa.wiidget.util;

import org.landa.wiidget.Wiidget;

/**
 * Basic properties of wiidgets.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public interface WiidgetProperties {

    public static final String FORMAT_OUTPUT = "wiidget.format_output";

    public static final String FORMAT_INDENTATION = "wiidget.format_indentation";

    public static final String WIIDGET_FILE_EXTENSION = "wiidget.file_extension";

    public boolean getBoolean(final String key);

    public Object get(final String key);

    public Integer getInteger(final String key);

    public String getString(final String key);

    public String getDefault(String key, String defaultValue);

    public Class<? extends Wiidget> getRawType();

}
