//SetterInjectionTest.java
package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.sbeans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		// Hold the name and location of spring bean cfg file
		FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		// create spring Container (BeanFactory container)
		XmlBeanFactory factory = new XmlBeanFactory(res);
		// get target spring bean class object
		Object obj = factory.getBean("wmg");
		// type casting download casting
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		String result = generator.showWishMessage("Devendra");
		System.out.println("Result: " + result);
	}
}
