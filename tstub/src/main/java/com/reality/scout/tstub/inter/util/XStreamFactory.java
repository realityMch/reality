package com.reality.scout.tstub.inter.util;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.CompactWriter;

public class XStreamFactory {

	private static final XStream xStream = new XStream(new HierarchicalStreamDriver() {
		
		@Override
		public HierarchicalStreamWriter createWriter(OutputStream out) {
			return null;
		}
		
		@Override
		public HierarchicalStreamWriter createWriter(Writer out) {
			return new CompactWriter(out);
		}
		
		@Override
		public HierarchicalStreamReader createReader(File in) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public HierarchicalStreamReader createReader(URL in) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public HierarchicalStreamReader createReader(InputStream in) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public HierarchicalStreamReader createReader(Reader in) {
			// TODO Auto-generated method stub
			return null;
		}
	});
	static {
		xStream.autodetectAnnotations(true);
	}
	
	public static XStream createXStream() {
		return xStream;
	}
}
