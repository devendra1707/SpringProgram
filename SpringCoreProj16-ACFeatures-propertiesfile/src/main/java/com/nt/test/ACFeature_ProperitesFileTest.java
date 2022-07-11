package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.EmployeeInfo;

public class ACFeature_ProperitesFileTest {
	public static void main(String[] args) {
		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get Employee class obj ref
		EmployeeInfo emp = ctx.getBean("emp", EmployeeInfo.class);
		// display the data
		System.out.println(emp.toString());

	}
}
