package org.landa.wiidget.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtil {

	public static String readFile(String path) throws IOException {

		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return Charset.defaultCharset().decode(ByteBuffer.wrap(encoded)).toString();

	}
}
