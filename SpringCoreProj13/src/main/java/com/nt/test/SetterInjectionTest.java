// SetterInjectionTest.java

package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.sbeans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main( String[] args )
    {
    	// IOC container creation (BeanFactory)
    	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    	// create XmlBeanDefinitionReader having container
    	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
    	// Load spring bean cfgs file
    	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
    	
    	// get Target spring bean class obj
    	WishMessageGenerator generator = factory.getBean("wmg",WishMessageGenerator.class);
    	WishMessageGenerator generator1 = factory.getBean("wmg",WishMessageGenerator.class);
    	System.out.println(generator.hashCode()+" "+generator1.hashCode());
    	System.out.println("generator == generator1? "+(generator == generator1));
    	
    	// invoke the b.method
    	String result = generator.showWishMessge("Devendra...");
    	System.out.println("Result :: "+result);
    }
}
