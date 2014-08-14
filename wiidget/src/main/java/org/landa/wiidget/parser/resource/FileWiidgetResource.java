package org.landa.wiidget.parser.resource;


/**
 *
 * @author lzsolt
 *
 */
public class FileWiidgetResource implements WiidgetResource {

    private final String canonicalFileName;

    public FileWiidgetResource(final String fileName) {
        this.canonicalFileName = fileName;
    }

    public String getCanonicalFileName() {
        return canonicalFileName;
    }

}
