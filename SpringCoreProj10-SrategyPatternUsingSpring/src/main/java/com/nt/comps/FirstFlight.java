// FirstFlight.java  (Dependent class 4)

package com.nt.comps;

public final class FirstFlight implements Courier { // rule2 (implementation Courier(I))
	// -- rule3 taking the class as final class

	public FirstFlight() {
		System.out.println("FirstFlight :: 0-param constructor");
	}

	public String deliver(int orderId) {

		return "order id :: " + orderId + " products are set to deliver using FirstFlight Courier service";
	}

}
