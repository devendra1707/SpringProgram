package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.sbeans.WishMessageGenerator;

public class App {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		// get target spring bean class object
				Object obj = factory.getBean("wmg");
				// type casting download casting
				WishMessageGenerator generator = (WishMessageGenerator) obj;
				String result = generator.showWishMessage("Devendra");
				System.out.println("Result: " + result);
	}
}
