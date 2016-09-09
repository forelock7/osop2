package ua.bms.osop.utils;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/*
 * Class that extracts properties from the prop file("application.properties").
 */
public class ConfigProperties {
	
	private static Properties PROPERTIES;
	
	static {
		PROPERTIES = new Properties();
		URL props = ClassLoader.getSystemResource("application.properties");
		try {
			PROPERTIES.load(props.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) {
		return PROPERTIES.getProperty(key);
	}

}
