// DTDC.java (Dependent class3)

package com.nt.comps;

public final class DTDC implements Courier {

	// -- rule3 taking class as final

	public DTDC() {
		System.out.println("DTDC :: 0-param constructor");
	}

	@Override
	public String deliver(int orderId) {
		return "order id :: " + orderId + " producs are set to deliver using DTDC Courier service";
	}

}
