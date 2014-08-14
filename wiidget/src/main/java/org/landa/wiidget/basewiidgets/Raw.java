package org.landa.wiidget.basewiidgets;

import java.util.Map.Entry;

import org.landa.wiidget.Tag;
import org.landa.wiidget.Wiidget;
import org.landa.wiidget.util.DataMap;

/**
 *
 * @author lzsolt
 *
 */
public class Raw extends Wiidget {

    /** Attributes. */
    private final DataMap attributes = new DataMap();

    /** Name of the tag. */
    private String rawTagName;

    @Override
    public void init() {
        super.init();

        startBuffer();
    }

    @Override
    public void run() {
        super.run();

        final String children = endBuffer();

        final Tag tag = new Tag(getRawTagName());
        for (final Entry<String, Object> attribute : attributes.entrySet()) {

            final String value = null == attribute ? null : attribute.toString();
            tag.a(attribute.getKey(), value);
        }

        tag.addChild(children);

        write(tag);
    }

    @Override
    public void setAttribute(final String name, final Object value) {
        attributes.put(name, value);
    }

    public String getRawTagName() {
        return rawTagName;
    }

    public void setRawTagName(final String rawTagName) {
        this.rawTagName = rawTagName;
    }

}
