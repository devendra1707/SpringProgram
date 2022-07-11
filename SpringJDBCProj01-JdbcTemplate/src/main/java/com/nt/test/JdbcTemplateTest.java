package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dao.IEmployeeDAO;

public class JdbcTemplateTest {
	public static void main(String[] args) {
		// Create IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get DAO class obj rf
		IEmployeeDAO dao = ctx.getBean("empDAO", IEmployeeDAO.class);
		// invoke the b.method
		int count = dao.getEmployeesCount();
		System.out.println("Employee count is :: " + count);
		ctx.close();
	} // main
} // class
