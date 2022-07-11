package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		// create ApplicationContext container
		// FileSystemXmlApplicationContext ctx = new
		// FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		// get Target spring bean class obj
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);

		// invoke the b.method
		String result = generator.showWishMessage("Devendra...");
		System.out.println("Result :: " + result);
	}
}
