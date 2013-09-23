package org.landa.wiidget.library;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.landa.wiidget.Wiidget;
import org.landa.wiidget.annotation.Attribute;
import org.landa.wiidget.reflect.AnnotatedAccessor;
import org.landa.wiidget.reflect.Reflection;
import org.landa.wiidget.util.DataMap;

/**
 * @author Zsolt Lengyel
 */
public abstract class BaseTagWiidget extends Wiidget {

	/**
	 * In this map we collect the unhandled attributes.
	 */
	protected DataMap byPassAttributes = new DataMap();

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

		final List<AnnotatedAccessor<Attribute>> fieldAccessors = Reflection.getFieldAccessors(ownClass, Attribute.class);

		for (final AnnotatedAccessor<Attribute> accessor : fieldAccessors) {

			final Attribute attribute = accessor.getAnnotation();
			final String attributeName = attribute.name();
			final boolean showNull = attribute.showNull();

			final String name = StringUtils.isEmpty(attributeName) ? accessor.getFieldName() : attributeName;
			Object value = accessor.getValue(this);

			if (null != value || showNull) {

				if (null == value) {
					value = ""; // replace with empty string
				}

				dataMap.put(name, value);
			}
		}

		// put special ID attribute
		if (id != null) {
			dataMap.put("id", getId());
		}

		// put by-passed attributes
		dataMap.putAll(getByPassAttributes());

		return dataMap;

	}

	@Override
	public void setAttribute(final String name, final Object value) {

		byPassAttributes.set(name, value);
	}

	/**
	 * The bypasses attributes.
	 * 
	 * @return data map with simple attributes.
	 */
	protected DataMap getByPassAttributes() {
		return byPassAttributes;
	}

	/**
	 * Tag name getter.
	 * 
	 * @return name of the tag
	 */
	public String getTagName() {

		return getClass().getSimpleName().toLowerCase();
	}

	/**
	 * Is the tag empty XML tag? If true the wiidget will render only an empty tag without content.
	 * Otherwise the content will placed into the tag body.
	 */
	public boolean isEmptyTag() {
		return false;
	}

	@Override
	public String toString() {

		return getClass().getSimpleName() + "[" + getAttributeMap().toString() + "]";
	}

}
