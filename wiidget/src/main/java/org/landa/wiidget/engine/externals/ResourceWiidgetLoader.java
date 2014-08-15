package org.landa.wiidget.engine.externals;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.IOUtils;

/**
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 *
 */
public class ResourceWiidgetLoader extends AbstractWiidgetLoader {

	@Override
	public String load(final URI uri) {

		final String path = uri.getPath();
		try {
			InputStream stream = getClass().getClassLoader().getResourceAsStream(path);
			if (null == stream) {
				stream = getClass().getResourceAsStream(path);
			}
			return IOUtils.toString(stream);
		} catch (final IOException e) {
			throw new LoadingException(String.format("Cannot load URI: %s", uri), e);
		}
	}

	@Override
	protected Set<String> getSupportedSchemes() {
		return new HashSet<>(Arrays.asList("resource"));
	}

}
