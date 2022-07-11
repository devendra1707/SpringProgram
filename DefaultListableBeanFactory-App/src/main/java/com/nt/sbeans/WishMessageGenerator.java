package com.nt.sbeans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator(1-param constructor)");
		this.date = date;
	}

	// b.method
	public String showWishMessage(String user) {
		System.out.println("WishMessageGenerator.showWishMessage");
		// get current hour of the date
		int hour = date.getHours(); // gives in 0-23 hours formate
		// Generete the Wish Message
		if (hour < 12)
			return "Goog Morning : " + user;
		else if (hour < 16)
			return "Good Afternoon : " + user;
		else if (hour < 20)
			return "Good Evening : " + user;
		else
			return "Good Neight : " + user;
	}
} // class
