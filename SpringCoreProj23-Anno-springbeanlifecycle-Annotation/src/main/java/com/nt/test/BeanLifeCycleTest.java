//BeanLifeCycleTest.java

package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.CitizenVotingEligibilityChecking;

public class BeanLifeCycleTest {
	public static void main(String[] args) {

		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get Spring bean obj ref
		CitizenVotingEligibilityChecking citizen = ctx.getBean("citizen", CitizenVotingEligibilityChecking.class);

		// invoke the b.method
		System.out.println(citizen.checkVotingEligibility());
		// close the b.method
		ctx.close();

	}
}
