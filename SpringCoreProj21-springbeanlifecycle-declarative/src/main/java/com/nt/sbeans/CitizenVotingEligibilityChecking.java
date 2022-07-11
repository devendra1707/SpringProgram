// CitizenVotingEligibilityChecking.java

package com.nt.sbeans;

import java.util.Date;

public class CitizenVotingEligibilityChecking {

	private String name;
	private int age;
	private String addrs;
	private Date dov;

	public CitizenVotingEligibilityChecking() {
		System.out.println("CitizenVotingEligibilityChecking : 0-param constructor");
	}

	// setter method for setter Injection

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public void setDate(Date dov) {
		this.dov = dov;
	}

	// init life cycle method or custom init method
	public void myInit() {
		System.out.println("CitizenVotingEligibilityChecking.myInit()");
		// initializating the left over properties
		dov = new Date();
		// verifying the injected of mandatory properties
		if (name == null || age <= 0)
			throw new IllegalArgumentException("invalid inputs for age , name");
	}

	// destroy life cycle method or custom destroy method
	public void myDestroy() {
		System.out.println("CitizenVotingEligibilityChecking.myDestroy()");
		name = null;
		age = 0;
		addrs = null;
		dov = null;
	}

	// b.method
	public String checkVotingEligibility() {
		System.out.println("CitizenVotingEligibilityChecking.checkVotingEligibility()");
		if (age < 18)
			return "Mr/Mrs/Miss :: " + name + " u r not eligible for voting. verified on " + dov;
		else
			return "Mr/Mrs/Miss :: " + name + " u r eligible for voting. verified on  " + dov;
	}

}
