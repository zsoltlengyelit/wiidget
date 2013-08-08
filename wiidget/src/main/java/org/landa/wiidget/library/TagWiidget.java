package org.landa.wiidget.library;

import java.util.List;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.annotation.Attribute;
import org.landa.wiidget.reflect.FieldAccessor;
import org.landa.wiidget.reflect.Reflection;
import org.landa.wiidget.util.DataMap;

/**
 * @author Zsolt Lengyel
 */
public abstract class TagWiidget extends Wiidget {

	/**
	 * Name of rendered tag.
	 */
	protected String tagName;

	/**
	 * Is the tag empty XML tag? If true the wiidget will render only an empty tag without content.
	 * Otherwise the content will placed into the tag body.
	 */
	protected boolean isEmptyTag;

	/**
	 * @param tagName
	 *            name of the tag
	 */
	protected TagWiidget(final String tagName) {
		this(tagName, false);
	}

	/**
	 * @param tagName
	 *            name of the tag
	 * @param isEmptyTag
	 *            if true the wiidget will render empty tag.
	 */
	protected TagWiidget(final String tagName, final boolean isEmptyTag) {
		this.tagName = tagName;
		this.isEmptyTag = isEmptyTag;
	}

	@Override
	public void init() {
		super.init();

		if (!isEmptyTag()) {

			write(Tag.open(getTagName(), getAttributeMap()));

			startBuffer();
		}
	}

	@Override
	public void run() {

		if (isEmptyTag()) {

			write(Tag.tag(getTagName(), getAttributeMap()));

		} else {
			final String content = endBuffer();
			write(content);

			write(Tag.close(getTagName()));
		}

	}

	/**
	 * Generates data map with attributes that represents the fields of the class having {@link Attribute} annotation.
	 * The map will contain the values of these fields too.
	 * 
	 * @return the data map with field names and values of this object
	 */
	protected DataMap getAttributeMap() {

		final DataMap dataMap = new DataMap();

		final Class<?> ownClass = getClass();

		final List<FieldAccessor> fieldAccessors = Reflection.getFieldAccessors(ownClass, Attribute.class);

		for (final FieldAccessor accessor : fieldAccessors) {
			dataMap.put(accessor.getFieldName(), accessor.getValue(this));
		}

		return dataMap;

	}

	/**
	 * Tag name getter.
	 * 
	 * @return name of the tag
	 */
	public String getTagName() {
		return tagName;
	}

	/**
	 * @return
	 */
	public boolean isEmptyTag() {
		return isEmptyTag;
	}

}
