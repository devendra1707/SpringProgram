//StrategyDPTest.java (Client App)

package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public class StrategyDPTest {
	public static void main(String[] args) {
		/*// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		System.out.println("_______________________");
		// get Target class obj ref
		Flipkart fpkt = factory.getBean("fpkt", Flipkart.class);
		// invoke the b.method
		String resultMsg = fpkt.shopping(new String[] { "shirt", "trouser", "watch" },
				new float[] { 3000, 6000, 10000 });
		System.out.println(resultMsg);
		System.out.println("__________________");
		DTDC dtdc = factory.getBean("dtdc", DTDC.class);
		*/
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("_______________________________________________");
		// get Target class obj ref
		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
		// invoke the b.method
		String resultMsg = fpkt.shopping(new String[] { "shirt", "trouser", "watch" },
				new float[] { 3000, 5000, 4000 });
		System.out.println(resultMsg);
		System.out.println("_______________________________________________");
		DTDC dtdc = ctx.getBean("dtdc", DTDC.class);

	} // main
} // class
