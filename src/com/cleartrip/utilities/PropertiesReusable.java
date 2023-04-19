package com.cleartrip.utilities;



	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class PropertiesReusable {
		private String filePath;
		private FileInputStream fip;
		private FileOutputStream fop;
		private Properties p;

		public PropertiesReusable(String filePath) throws IOException {
			this.filePath = filePath;

			fip = new FileInputStream(filePath);
			p = new Properties();
			p.load(fip);

		}

		public String getPropertyValue(String key) {
			String value = p.getProperty(key);
			return value;
		}

		public void setProperties(String key, String value) throws IOException {
			p.setProperty(key, value);
			p.store(fop, "..........");
			fop = new FileOutputStream(filePath);
		}

		public void removeProperty(String key) throws IOException {
			p.remove(key);
			p.store(fop, ".....");
			fop = new FileOutputStream(filePath);
		}

	}




