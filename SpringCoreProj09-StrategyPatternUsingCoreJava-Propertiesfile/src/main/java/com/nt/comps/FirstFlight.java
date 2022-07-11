// FirstFlight.java (Dependent class4)

package com.nt.comps;

public final class FirstFlight implements Courier { // rule2 (implementation Courier(I))

	// -- rule3 taking class as final

	public FirstFlight() {
		System.out.println("FirstFlight :: 0-param constructor");
	}

	@Override
	public String deliver(int orderId) {

		return "order id ::" + orderId + " products are set to deliver using DTDC Courier service";
	}

}
