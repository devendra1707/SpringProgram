// BlueDart.java  

package com.nt.comps;

public final class BlueDart implements Courier { // rule2 (implementation Courier(I))
// -- rule 3 taking class as final

	public BlueDart() {
		System.out.println("BlueDart : 0-param constructor");
	}

	@Override
	public String deliver(int orderId) {

		return "order id :: " + orderId + " products are set to deliver using BlueDart Courier Service";
	}

}
