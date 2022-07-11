// FirstFlight.java  (Dependent class 4)

package com.nt.comps;

public final class FirstFlight implements Courier { // rule2 (implementation Courier(I))
// taking class as final class
	public FirstFlight() {
		System.out.println("FirstFlight :: 0-param constructor");
	}

	@Override
	public String deliver(int orderId) {
		return "Order Id :: " + orderId + " products are delivered using DTDS Courier Service";
	}

}
