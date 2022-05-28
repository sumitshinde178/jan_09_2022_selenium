package org.propertiesOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static void main(String[]args) {
		try {FileInputStream fis = new FileInputStream("./propertiesFiles/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String str = prop.getProperty("url");
		System.out.println(str);

		}catch(IOException io) {
			io.printStackTrace();
		}
	}

	public String getPropData (String key) {
		try {
			String file = "./propertiesFiles/config.properties";

			FileInputStream fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
			
			return prop.getProperty(null);
			
		}catch(IOException io) {
			io.printStackTrace();


		}
		return null;}}


