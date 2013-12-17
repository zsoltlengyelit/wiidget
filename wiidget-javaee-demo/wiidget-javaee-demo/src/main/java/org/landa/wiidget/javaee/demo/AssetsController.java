package org.landa.wiidget.javaee.demo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 * 
 */
public class AssetsController extends HttpServlet {

	/** */
	private static final long serialVersionUID = -6814567851681593183L;

	public static interface LookupResult {
		public void respondGet(HttpServletResponse resp) throws IOException;

		public void respondHead(HttpServletResponse resp);

		public long getLastModified();
	}

	public static class Error implements LookupResult {
		protected final int statusCode;
		protected final String message;

		public Error(final int statusCode, final String message) {
			this.statusCode = statusCode;
			this.message = message;
		}

		public long getLastModified() {
			return -1;
		}

		public void respondGet(final HttpServletResponse resp)
				throws IOException {
			resp.sendError(statusCode, message);
		}

		public void respondHead(final HttpServletResponse resp) {
			throw new UnsupportedOperationException();
		}
	}

	public static class StaticFile implements LookupResult {
		protected final long lastModified;
		protected final String mimeType;
		protected final int contentLength;
		protected final boolean acceptsDeflate;
		protected final URL url;

		public StaticFile(final long lastModified, final String mimeType,
				final int contentLength, final boolean acceptsDeflate,
				final URL url) {
			this.lastModified = lastModified;
			this.mimeType = mimeType;
			this.contentLength = contentLength;
			this.acceptsDeflate = acceptsDeflate;
			this.url = url;
		}

		public long getLastModified() {
			return lastModified;
		}

		protected boolean willDeflate() {
			return acceptsDeflate && deflatable(mimeType)
					&& contentLength >= deflateThreshold;
		}

		protected void setHeaders(final HttpServletResponse resp) {
			resp.setStatus(HttpServletResponse.SC_OK);
			resp.setContentType(mimeType);
			if (contentLength >= 0 && !willDeflate()) {
				resp.setContentLength(contentLength);
			}
		}

		public void respondGet(final HttpServletResponse resp)
				throws IOException {
			setHeaders(resp);
			final OutputStream os;
			if (willDeflate()) {
				resp.setHeader("Content-Encoding", "gzip");
				os = new GZIPOutputStream(resp.getOutputStream(), bufferSize);
			} else {
				os = resp.getOutputStream();
			}
			transferStreams(url.openStream(), os);
		}

		public void respondHead(final HttpServletResponse resp) {
			if (willDeflate()) {
				throw new UnsupportedOperationException();
			}
			setHeaders(resp);
		}
	}

	@Override
	protected void doGet(final HttpServletRequest req,
			final HttpServletResponse resp) throws IOException {
		lookup(req).respondGet(resp);
	}

	@Override
	protected void doPut(final HttpServletRequest req,
			final HttpServletResponse resp) throws IOException {
		doGet(req, resp);
	}

	@Override
	protected void doHead(final HttpServletRequest req,
			final HttpServletResponse resp) throws IOException,
			ServletException {
		try {
			lookup(req).respondHead(resp);
		} catch (final UnsupportedOperationException e) {
			super.doHead(req, resp);
		}
	}

	@Override
	protected long getLastModified(final HttpServletRequest req) {
		return lookup(req).getLastModified();
	}

	protected LookupResult lookup(final HttpServletRequest req) {
		LookupResult r = (LookupResult) req.getAttribute("lookupResult");
		if (r == null) {
			r = lookupNoCache(req);
			req.setAttribute("lookupResult", r);
		}
		return r;
	}

	protected LookupResult lookupNoCache(final HttpServletRequest req) {
		final String path = getPath(req);
		if (isForbidden(path)) {
			return new Error(HttpServletResponse.SC_FORBIDDEN, "Forbidden");
		}

		final URL url;
		try {
			url = getServletContext().getResource(path);
		} catch (final MalformedURLException e) {
			return new Error(HttpServletResponse.SC_BAD_REQUEST,
					"Malformed path");
		}
		if (url == null) {
			return new Error(HttpServletResponse.SC_NOT_FOUND, "Not found");
		}

		final String mimeType = getMimeType(path);

		final String realpath = getServletContext().getRealPath(path);
		if (realpath != null) {
			// Try as an ordinary file
			final File f = new File(realpath);
			if (!f.isFile()) {
				return new Error(HttpServletResponse.SC_FORBIDDEN, "Forbidden");
			} else {
				return new StaticFile(f.lastModified(), mimeType,
						(int) f.length(), acceptsDeflate(req), url);
			}
		} else {
			try {
				// Try as a JAR Entry
				final ZipEntry ze = ((JarURLConnection) url.openConnection())
						.getJarEntry();
				if (ze != null) {
					if (ze.isDirectory()) {
						return new Error(HttpServletResponse.SC_FORBIDDEN,
								"Forbidden");
					} else {
						return new StaticFile(ze.getTime(), mimeType,
								(int) ze.getSize(), acceptsDeflate(req), url);
					}
				} else {
					// Unexpected?
					return new StaticFile(-1, mimeType, -1,
							acceptsDeflate(req), url);
				}
			} catch (final ClassCastException e) {
				// Unknown resource type
				return new StaticFile(-1, mimeType, -1, acceptsDeflate(req),
						url);
			} catch (final IOException e) {
				return new Error(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
						"Internal server error");
			}
		}
	}

	protected String getPath(final HttpServletRequest req) {
		final String servletPath = req.getServletPath();
		final String pathInfo = req.getPathInfo();
		return servletPath + (pathInfo == null ? "" : pathInfo);
	}

	protected boolean isForbidden(final String path) {
		final String lpath = path.toLowerCase();
		return lpath.startsWith("/web-inf/") || lpath.startsWith("/meta-inf/");
	}

	protected String getMimeType(final String path) {
		final String mimeType = getServletContext().getMimeType(path);
		return null == mimeType ? "application/octet-stream" : mimeType;
	}

	protected static boolean acceptsDeflate(final HttpServletRequest req) {
		final String ae = req.getHeader("Accept-Encoding");
		return ae != null && ae.contains("gzip");
	}

	protected static boolean deflatable(final String mimetype) {
		return mimetype.startsWith("text/")
				|| mimetype.equals("application/postscript")
				|| mimetype.startsWith("application/ms")
				|| mimetype.startsWith("application/vnd")
				|| mimetype.endsWith("xml");
	}

	protected static final int deflateThreshold = 4 * 1024;

	protected static final int bufferSize = 4 * 1024;

	protected static void transferStreams(final InputStream is,
			final OutputStream os) throws IOException {
		try {
			final byte[] buf = new byte[bufferSize];
			int bytesRead;
			while ((bytesRead = is.read(buf)) != -1) {
				os.write(buf, 0, bytesRead);
			}
		} finally {
			is.close();
			os.close();
		}
	}

}
