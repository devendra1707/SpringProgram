// FlipkartFactory.java (Factory Pattern to simplify the process of object creation)

package com.nt.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comps.Courier;
import com.nt.comps.Flipkart;

public class FlipkartFactory {

	private static Properties props;
	static {
		try {
			// create InputStream pointing to the properties file
			InputStream is = new FileInputStream("src/main/java/com/nt/commons/Info.properties");
			// Load the content of properties file to java.util.Properties class obj
			props = new Properties();
			props.load(is);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // static
		// static factory method

	public static Flipkart getInstance() {
		try {
			// get and load the dependent class
			String courierName = props.getProperty("courier.class.name");
			Class c = Class.forName(courierName);
			// get all the constructors of Loaded class
			Constructor cons[] = c.getDeclaredConstructors();
			// create object (Dependent class)
			Courier courier = (Courier) cons[0].newInstance();
			// create Target class obj
			Flipkart fpkt = new Flipkart();
			// assign dependent class obj to target class obj
			fpkt.setCourier(courier);
			return fpkt;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	} // method
} // class
