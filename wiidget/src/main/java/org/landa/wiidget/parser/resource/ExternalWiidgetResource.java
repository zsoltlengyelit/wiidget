package org.landa.wiidget.parser.resource;

import java.net.URI;

/**
 *
 * @author lzsolt
 *
 */
public class ExternalWiidgetResource implements WiidgetResource {

    private final URI uri;

    /**
     *
     * @param content
     * @throws IllegalArgumentException
     *             when the content is not a valid URI
     * @see URI
     */
    public ExternalWiidgetResource(final String content) {
        this.uri = URI.create(content);
    }

    public URI getUri() {
        return uri;
    }

}
