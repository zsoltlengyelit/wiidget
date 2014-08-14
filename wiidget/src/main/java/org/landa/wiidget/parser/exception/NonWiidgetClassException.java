package org.landa.wiidget.parser.exception;

/**
 *
 * @author lzsolt
 *
 */
public class NonWiidgetClassException extends ImportException {

    private final Class<?> loadedClass;

    /**
     *
     * @param loadedClass
     *            the class that is not a wiidget class
     */
    public NonWiidgetClassException(final Class<?> loadedClass) {
        this.loadedClass = loadedClass;
    }

}
