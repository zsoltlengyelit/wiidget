package org.landa.wiidget.engine.externals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
public class LocalFileWiidgetLoader extends AbstractWiidgetLoader {

	@Override
	public String load(final URI uri) {

		final String path = uri.getPath();

		try {
			final FileInputStream fileInputStream = new FileInputStream(path);
			return IOUtils.toString(fileInputStream);
		} catch (final FileNotFoundException e) {
			throw new LoadingException(String.format("Cannot found file: %s", path), e);
		} catch (final IOException e) {
			throw new LoadingException(String.format("Cannot convert to string: %s", path), e);
		}

	}

	@Override
	protected Set<String> getSupportedSchemes() {
		return new HashSet<>(Arrays.asList("file"));
	}

}
