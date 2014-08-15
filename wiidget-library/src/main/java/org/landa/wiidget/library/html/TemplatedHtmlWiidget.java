package org.landa.wiidget.library.html;

import java.io.InputStream;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.landa.wiidget.WiidgetException;
import org.landa.wiidget.antlr.WiidgetLexerException;
import org.landa.wiidget.basewiidgets.WiidgetLangCompiler;
import org.landa.wiidget.io.StringTemplate;
import org.landa.wiidget.library.BaseTagWiidget;
import org.landa.wiidget.library.template.Part;
import org.landa.wiidget.util.DataMap;
import org.landa.wiidget.util.WiidgetProperties;

/**
 * The wiidgets extend this class have an template file. By default this file is
 * in the same folder, and named: '{class simple name}.tmpt'. To template file
 * we can put placeholders and variables.
 * <p>
 * </p>
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public abstract class TemplatedHtmlWiidget extends BaseTagWiidget {

	/**
	 * Keyword to attach the current wiidget.
	 */
	public static final String THIS_VAR = "this";

	@Override
	public void init() {


		// bind this wiidget to context
		getWiidgetFactory().getWiidgetContext().set(THIS_VAR, this);

		startBuffer();
	}

	@Override
	public void run() {

		endBuffer();

		final String fileContent = getTemplateContent();
		final DataMap partMap = getPartMap();

		final String content = replacePlaceholders(fileContent, partMap);

		write(content);


		getWiidgetFactory().getWiidgetContext().remove(THIS_VAR);

	}

	/**
	 * Replaces placeholders.
	 * 
	 * @param content
	 * @param data
	 * @return
	 */
	protected String replacePlaceholders(final String content,
			final DataMap data) {

		final StringTemplate stringTemplate = new StringTemplate(content);
		return stringTemplate.render(data);
	}

	/**
	 * The template name by default is: '{class simple name}.tmpt'.
	 * 
	 * @return template file name
	 */
	protected String getTemplateName() {

		final String simpleName = StringUtils.uncapitalize(getClass()
				.getSimpleName());

		final String packaged = '/'	+ getClass().getPackage().getName().replaceAll("\\.", "/")			+ '/' + simpleName;

		final String wiidgetExtension = getWiidgetFactory()
				.getWiidgetProperties().getString(
						WiidgetProperties.WIIDGET_FILE_EXTENSION);

		// check wiidget template
		final InputStream template = getClass().getResourceAsStream(
				simpleName + wiidgetExtension);

		if (null == template) {
			final String extension = getWiidgetFactory().getWiidgetProperties()
					.getDefault("wiidget.template.extension", ".tmpt");
			return packaged + extension;
		}

		return packaged + wiidgetExtension;
	}

	/**
	 * String content of template.
	 * 
	 * @return content
	 */

	protected String getTemplateContent() {

		final String fileName = getTemplateName();
		final String fileContent = getFileContent(fileName);

		if (isCompilableTemplate(fileName)) {
			startBuffer();

			try {
				wiidget(WiidgetLangCompiler.class,
						data().set("value", fileContent));
			} catch (final WiidgetLexerException exception) {
				throw new WiidgetException(
						"Failed to render file: " + fileName, exception);
			}

			final String compileResult = endBuffer(); // get compile result
			return compileResult;

		}
		return fileContent;
	}

	protected boolean isCompilableTemplate(final String fileName) {

		final WiidgetProperties properties = getWiidgetFactory()
				.getWiidgetProperties();

		final String fileSuffix = properties
				.getString(WiidgetProperties.WIIDGET_FILE_EXTENSION);

		return fileName.endsWith(fileSuffix);
	}

	/**
	 * @return
	 */
	protected DataMap getPartMap() {

		final List<Part> partList = getChildren(Part.class);

		final DataMap partMap = new DataMap();

		for (final Part part : partList) {

			final String name = part.getName();
			final String content = part.getContent();

			partMap.put(name, content);
		}
		return partMap;
	}
}
