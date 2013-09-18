package org.landa.wiidget.io;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XMLFormatter {

	public static String format(final String input, final int indent) {
		try {
			final Source xmlInput = new StreamSource(new StringReader(input));
			final StringWriter stringWriter = new StringWriter();
			final StreamResult xmlOutput = new StreamResult(stringWriter);
			final TransformerFactory transformerFactory = TransformerFactory.newInstance();
			// This statement works with JDK 6
			transformerFactory.setAttribute("indent-number", indent);

			final Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(xmlInput, xmlOutput);
			return xmlOutput.getWriter().toString();
		} catch (final Throwable e) {
			// You'll come here if you are using JDK 1.5
			// you are getting an the following exeption
			// java.lang.IllegalArgumentException: Not supported: indent-number
			// Use this code (Set the output property in transformer.
			try {
				final Source xmlInput = new StreamSource(new StringReader(input));
				final StringWriter stringWriter = new StringWriter();
				final StreamResult xmlOutput = new StreamResult(stringWriter);
				final TransformerFactory transformerFactory = TransformerFactory.newInstance();
				final Transformer transformer = transformerFactory.newTransformer();
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", String.valueOf(indent));
				transformer.transform(xmlInput, xmlOutput);
				return xmlOutput.getWriter().toString();
			} catch (final Throwable t) {
				return input;
			}
		}
	}

	public static String format(final String input) {
		return format(input, 2);
	}
}
