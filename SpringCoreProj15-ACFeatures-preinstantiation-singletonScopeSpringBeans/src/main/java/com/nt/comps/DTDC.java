// DTDC.java (Dependent class 3)

package com.nt.comps;

public final class DTDC implements Courier { // rule2 (implementation Courier(I))
// -- rule3 taking class as final class
	public DTDC() {
		System.out.println("DTDC :: 0-param constructor");
	}

	@Override
	public String deliver(int orderId) {
		return "Order Id :: " + orderId + " Products are set to deliver using DTDC Courier service";
	}

}
