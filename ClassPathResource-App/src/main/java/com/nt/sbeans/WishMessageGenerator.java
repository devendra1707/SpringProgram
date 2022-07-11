package com.nt.sbeans;

import java.util.Date;

import java.util.Date;

public class WishMessageGenerator {

	// HAS-A property
	private Date date;

	// parameterized constructor for constructor injection (alt+shift+s,o)

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator(1-param constructor)");
		this.date = date;
	}

	// b.method
	public String showWishMessage(String user) {
		System.out.println("WishMessageGenerator.showWishMessage()");
		// get current hour of the day
		int hour = date.getHours();
		// generate the wish message
		if (hour < 12)
			return "Good Morning::" + user;
		else if (hour < 16)
			return "Good Afternoon::" + user;
		else if (hour < 20)
			return "Good Evening::" + user;
		else
			return "Good Night::" + user;
	}
}
