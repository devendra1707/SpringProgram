// CitizenVotingEligibilityChecking.java

package com.nt.sbeans;

import java.security.spec.XECPublicKeySpec;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("citizen")
@PropertySource("com/nt/commons/Info.properties")
public class CitizenVotingEligibilityChecking {
	@Value("${citizen.name}")
	private String name;
	@Value("${citizen.age}")
	private int age;
	@Value("{citizen.addrs}")
	private String addrs;
	private Date dov;

	public CitizenVotingEligibilityChecking() {
		System.out.println("CitizenVotingEligibilityChecking : 0-param constructor");
	}

	// init life cycle method or cusstom init method
	@PostConstruct
	public void myInit() {
		System.out.println("CitizenVotingEligibilityChecking.myInit()");
		// initializating the left over properties
		dov = new Date();
		// verifying the injected values of mandatory properties
		if (name == null || age <= 0)
			throw new IllegalArgumentException("Invalid input for age, name");
	}

	// destroy life cycle method or custom destroy method
	@PreDestroy
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
			return "Mr/Mrs/Miss :: " + name + " u r eligible for voting. verifid on " + dov;
	}
}
