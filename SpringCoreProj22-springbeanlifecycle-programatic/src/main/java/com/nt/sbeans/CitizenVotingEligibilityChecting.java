//CitizenVotingEligibilityChecting.java

package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CitizenVotingEligibilityChecting implements InitializingBean, DisposableBean {

	private String name;
	private int age;
	private String addrs;
	private Date dov;

	public CitizenVotingEligibilityChecting() {
		System.out.println("CitizenVotingEligibilityChecting : 0-param constructor");
	}

	// setter method for setter injection

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public void setDov(Date dov) {
		this.dov = dov;
	}

	// b.method
	public String checkVotingEligibility() {
		System.out.println("CitizenVotingEligibilityChecting.checkVotingEligibility()");
		if (age < 18)
			return "Mr/Mrs/Miss :: " + name + " u r not eligible for voting . verified on " + dov;
		else
			return "Mr/Mrs/Miss :: " + name + " u r eligible for voting. verified  on " + dov;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("CitizenVotingEligibilityChecting.destroy()");
		name = null;
		age = 0;
		addrs = null;
		dov = null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("CitizenVotingEligibilityChecting.afterPropertiesSet()");
		// initializating the left over properties
		dov = new Date();
		// verifing the injected values of mandatory properties
		if (name == null || age <= 0)
			throw new IllegalArgumentException("invalid inputs for age , name");
	}
} // class
