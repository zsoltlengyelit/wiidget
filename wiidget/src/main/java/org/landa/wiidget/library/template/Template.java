package org.landa.wiidget.library.template;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.io.StringTemplate;

public class Template extends Wiidget {

	/**
	 * Name of the template. This is a file path.
	 */
	private String value;

	private Boolean removePlaceholders = false;

	@Override
	public void init() {

		super.init();
		startBuffer();
	}

	@Override
	public void run() {

		endBuffer();

		Map<String, Object> partMap = getPartMap();

		String fileContent = getFileContent(getValue());

		StringTemplate stringTemplate = new StringTemplate(fileContent, this.isRemovePlaceholders());
		String content = stringTemplate.render(partMap);

		write(content);
	}

	/**
	 * 
	 * @return
	 */
	protected Map<String, Object> getPartMap() {

		List<Part> partList = getChildren(Part.class);

		Map<String, Object> partMap = new HashMap<String, Object>();

		for (final Part part : partList) {

			String name = part.getName();
			String content = part.getContent();

			partMap.put(name, content);
		}
		return partMap;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Boolean isRemovePlaceholders() {
		return removePlaceholders;
	}

	public void setRemovePlaceholders(Boolean removePlaceholders) {
		this.removePlaceholders = removePlaceholders;
	}

}
