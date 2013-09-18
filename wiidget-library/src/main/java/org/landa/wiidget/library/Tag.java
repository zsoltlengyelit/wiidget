package org.landa.wiidget.library;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.landa.wiidget.util.DataMap;

/**
 * XML tag builder.
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */

/**
 * Represents an HTML tag.
 * 
 * @author lzsolt
 */
public class Tag implements Cloneable, Serializable {

	/**
	 * Generated.
	 */
	private static final long serialVersionUID = -295174841757891126L;

	/**
	 * Contains names of non-empty HTML tags.
	 */
	private static List<String> nonEmptyTags = Collections.unmodifiableList(new ArrayList<String>() {
		/**
		 * generated serial
		 */
		private static final long serialVersionUID = 2426785812473436055L;

		{
			add("div");
			add("span");
			add("form");
			add("textarea");
			add("h1");
			add("h2");
			add("h3");
			add("h4");
			add("h5");
			add("h6");
			add("script");
			add("pre");
			// TODO add more non-empty tag
		}
	});

	/**
	 * Name of tag.
	 */
	private String name = "";

	/**
	 * Attributes of tag.
	 */
	private Map<String, String> attributes;

	/**
	 * Children.
	 */
	private List<Object> children;

	/**
	 * Default constructor.
	 */
	private Tag() {
		this(null);
	}

	/**
	 * @param name
	 *            name of tag
	 */
	public Tag(final String name) {
		this.name = name;
		this.attributes = new HashMap<String, String>();
		this.children = new LinkedList<Object>();
	}

	/**
	 * @param name
	 *            name of tag
	 * @param attributes
	 *            attributes
	 * @param children
	 *            children objects
	 */
	public Tag(final String name, final Map<String, String> attributes, final List<Object> children) {
		super();
		this.name = name;
		this.attributes = attributes;
		this.children = children;
	}

	/**
	 * @return empty html tag
	 */
	public static Tag empty() {
		return new Tag();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param tagName
	 *            the name to set
	 * @return reference of object to chaining method
	 */
	public Tag setName(final String tagName) {
		this.name = tagName;
		return this;
	}

	/**
	 * @return the attributes
	 */
	public Map<String, String> getAttributes() {
		return attributes;
	}

	/**
	 * @param tagAttributes
	 *            the attributes to set
	 * @return reference of object to chaining method
	 */
	public Tag setAttributes(final Map<String, String> tagAttributes) {
		this.attributes = tagAttributes;
		return this;
	}

	/**
	 * @return the children
	 */
	public List<Object> getChildren() {
		return children;
	}

	/**
	 * @param newChildren
	 *            the children to set
	 * @return reference of object to chaining method
	 */
	public Tag setChildren(final List<Object> newChildren) {
		this.children = newChildren;
		return this;
	}

	/**
	 * @param childrenList
	 *            to add
	 */
	public void addChildren(final List<Tag> childrenList) {
		children.addAll(childrenList);
	}

	/**
	 * @param key
	 *            attribute key
	 * @param value
	 *            attribute value
	 * @return reference of object to chaining method
	 */
	public Tag setAttribute(final String key, final String value) {
		this.attributes.put(key, value);
		return this;
	}

	/**
	 * Alias of {@link #setAttribute(String, String)}.
	 * 
	 * @param key
	 *            attribute key
	 * @param value
	 *            attribute value
	 * @return reference of object to chaining method
	 */
	public Tag a(final String key, final String value) {
		return setAttribute(key, value);
	}

	/**
	 * @param key
	 *            attribute key
	 * @return attribute value
	 */
	public String getAttribute(final String key) {
		return attributes.get(key);
	}

	/**
	 * Alias of {@link #getAttribute(String)}.
	 * 
	 * @param key
	 *            key
	 * @return value
	 */
	public String a(final String key) {
		return getAttribute(key);
	}

	/**
	 * Use for attributes like 'disabled', 'readonly'. When you ain't give value.
	 * 
	 * @param singleAttribute
	 *            name of single attribute
	 * @return reference of object to chaining method
	 */
	public Tag singleAttribute(final String singleAttribute) {
		this.a(singleAttribute, null);
		return this;
	}

	/**
	 * @param styleClass
	 *            class to add
	 * @return reference of object to chaining method
	 */
	public Tag addClass(final String styleClass) {

		if (null == attributes.get("class")) {
			setAttribute("class", styleClass);
		} else {

			final String prevClass = getAttribute("class");

			/*
			 * Check containing.
			 */
			boolean contains = false;
			final String[] classes = prevClass.split(" ");
			for (final String eClass : classes) {
				if (styleClass.equals(eClass)) {
					contains = true;
				}
			}

			if (!contains) {
				setAttribute("class", prevClass + " " + styleClass);
			}
		}
		return this;
	}

	/**
	 * Adds a children.
	 * 
	 * @param child
	 *            to add
	 * @return reference of object to chaining method
	 */
	public Tag addChild(final Object child) {
		this.children.add(child);
		return this;
	}

	/**
	 * Adds a children.
	 * 
	 * @param child
	 *            to add
	 * @return reference of object to chaining method
	 */
	public Tag c(final Object child) {
		return addChild(child);
	}

	/**
	 * Prepends a child.
	 * 
	 * @param child
	 *            to prepend
	 * @return reference of object
	 */
	public Tag prependChild(final Object child) {
		final List<Object> newChildren = new LinkedList<Object>();

		newChildren.add(child);
		newChildren.addAll(this.children);

		this.children = newChildren;

		return this;
	}

	/**
	 * Deletes all the children.
	 * 
	 * @return reference to this object
	 */
	public Tag emptyChildren() {
		children.clear();
		return this;
	}

	/**
	 * Finds a html tag object with the specified id attribute in this tree.
	 * 
	 * @param tagId
	 *            id of tag
	 * @return the specified tag if found, else null
	 */
	public Tag byId(final String tagId) {

		if (tagId.equals(this.a("id"))) {
			return this;
		}

		for (final Object child : children) {

			if (child instanceof Tag) {
				final Tag foundChild = ((Tag) child).byId(tagId);

				if (null != foundChild) {
					return foundChild;
				}

			}

		}

		return null;

	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (null == name) {
			return "";
		}

		final StringBuilder builder = new StringBuilder("<");

		builder.append(name).append(attributes.isEmpty() ? "" : " ").append(renderAttributes());

		if (children.isEmpty() && !nonEmptyTags.contains(name)) {
			builder.append(" />");
		} else {
			builder.append(">").append(renderChildren()).append("</" + name + ">");
		}

		return builder.toString();
	}

	@Override
	public Tag clone() {

		final Map<String, String> clonedAttributes = new HashMap<String, String>();
		clonedAttributes.putAll(attributes);

		final List<Object> clonedChildred = new ArrayList<Object>();
		clonedChildred.addAll(children);

		return new Tag(name).setAttributes(clonedAttributes).setChildren(clonedChildred);
	}

	/**
	 * @return rendered children
	 */
	private String renderChildren() {
		final StringBuilder builder = new StringBuilder();

		for (final Object child : children) {

			if (null == child) {
				continue;
			}

			if (!(child instanceof String)) {
				builder.append("\n\t");
			}
			builder.append(child.toString());
		}

		if (!(children.size() == 1 && children.get(0) instanceof String)) {
			builder.append("\n");
		}

		return builder.toString();
	}

	/**
	 * @return concatenated attributes
	 */
	private String renderAttributes() {

		final List<String> renderedAttributes = new ArrayList<String>();
		for (final String key : attributes.keySet()) {
			final String value = attributes.get(key);

			if (null == value) {
				renderedAttributes.add(key);
			} else {
				renderedAttributes.add(key + "=\"" + value + "\"");
			}
		}

		return StringUtils.join(renderedAttributes.toArray(new String[0]), " ");
	}

	public static String open(final String name) {
		return open(name, new DataMap());
	}

	public static String tag(final String name, final String content) {
		return open(name) + content + close(name);
	}

	public static String open(final String name, final Map<String, Object> data) {

		return "<" + name + renderAttributes(data) + ">";

	}

	public static String close(final String name) {
		return "</" + name + ">";
	}

	/**
	 * @param data
	 * @return
	 */
	private static String renderAttributes(final Map<String, Object> data) {
		if (data.isEmpty()) {
			return "";
		}

		String attributes = "";

		for (final Entry<String, Object> attribute : data.entrySet()) {

			attributes += " " + attribute.getKey() + "=\"" + attribute.getValue() + "\"";

		}

		return attributes;
	}

	/**
	 * Renders empty tag.
	 * 
	 * @param tagName
	 * @param attributeMap
	 * @return
	 */
	public static String tag(final String tagName, final DataMap attributeMap) {
		return "<" + tagName + renderAttributes(attributeMap) + " />";
	}
}
