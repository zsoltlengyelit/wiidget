package org.landa.wiidget.library.template;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.io.StringTemplate;
import org.landa.wiidget.util.WiidgetProperties;

import com.google.inject.Inject;

public class Template extends Wiidget {

	/**
	 * Name of the template. This is a file path.
	 */
	private String value;

	private Boolean removePlaceholders = false;

	private final WiidgetProperties properties;

	@Inject
	public Template(final WiidgetProperties properties) {
		this.properties = properties;
	}

	@Override
	public void init() {

		super.init();
		startBuffer();
	}

	@Override
	public void run() {

		endBuffer();

		final Map<String, Object> partMap = getPartMap();

		String fileContent = getFileContent(getValue());

		if (isCompilableTemplate()) {
			startBuffer();
			widget(WiidgetLangCompiler.class, dataMap().set("value", fileContent));

			fileContent = endBuffer(); // get compile result
		}

		final StringTemplate stringTemplate = new StringTemplate(fileContent, this.isRemovePlaceholders());
		final String content = stringTemplate.render(partMap);

		write(content);
	}

	/**
	 * @return
	 */
	protected Map<String, Object> getPartMap() {

		final List<Part> partList = getChildren(Part.class);

		final Map<String, Object> partMap = new HashMap<String, Object>();

		for (final Part part : partList) {

			final String name = part.getName();
			final String content = part.getContent();

			partMap.put(name, content);
		}
		return partMap;
	}

	public String getValue() {
		return value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

	public Boolean isRemovePlaceholders() {
		return removePlaceholders;
	}

	public void setRemovePlaceholders(final Boolean removePlaceholders) {
		this.removePlaceholders = removePlaceholders;
	}

	protected boolean isCompilableTemplate() {

		final String fileSuffix = properties.getString(WiidgetProperties.WIIDGET_FILE_EXTENSION);

		return getValue().endsWith(fileSuffix);
	}
}
