// Flipkart.java (target class)

package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {

	// HAS-A property
	@Autowired
	private Courier courier; // rule-1 (HAS-A properrty)
								// rule-2 (code to interfaces)
								// rule-3 (taking the class final class)
	public Flipkart() {
		System.out.println("Flipkart: 0-param constructor");
	}

	// b.method
	public String shopping(String items[], float prices[]) {
		// calculate bill amount
		float billAmt = 0.0f;
		for (float p : prices)
			billAmt = billAmt + p;
		// generate random number as the order id
		int oid = new Random().nextInt(10000);
		// deliver the products using Courier service
		String deliverMsg = courier.deliver(oid);
		// return final message
		return Arrays.toString(items) + " with prices " + Arrays.toString(prices) + " having billAmt :: " + billAmt
				+ " " + deliverMsg;
	} // method
} // class
