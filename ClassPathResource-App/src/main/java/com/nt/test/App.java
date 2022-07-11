package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.sbeans.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class App {
	public static void main(String[] args) {
		System.out.println("ConstructorInjectionTest.main() --start");
		// Hold the name and location of spring bean cfg file
//		ClassPathResource res = new ClassPathResource("com/nt/cfgs/applicationContext.xml");

		ClassPathResource res = new ClassPathResource("applicationContext.xml");

		// create spring Container (BeanFactory container)
		XmlBeanFactory factory = new XmlBeanFactory(res);
		System.out.println("________________");
		// get Target spring bean obj
		Object obj = factory.getBean("wmg");
		System.out.println("_____________________");
		// type casting / download casting
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		String result = generator.showWishMessage("Devendra");
		System.out.println("Result::" + result);
		System.out.println("_________________________");
		System.out.println("ConstructorInjectionTest.main() -- end");
	}
}
