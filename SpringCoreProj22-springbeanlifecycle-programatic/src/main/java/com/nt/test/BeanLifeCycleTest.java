package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.CitizenVotingEligibilityChecting;

public class BeanLifeCycleTest {
	public static void main(String[] args) {
		// create IOC cOntainer
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get Spring bean class obj ref
		CitizenVotingEligibilityChecting citizen = ctx.getBean("citizen", CitizenVotingEligibilityChecting.class);
		// invoke the b.method
		System.out.println(citizen.checkVotingEligibility());
		// close container
		ctx.close();
	} // main
} // class
