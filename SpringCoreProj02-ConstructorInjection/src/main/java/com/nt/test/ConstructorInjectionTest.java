package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.sbeans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		System.out.println("ConstructorInjectionTest.main() --start");
		// Hold the name and location of spring bean cfg file
		FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
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
