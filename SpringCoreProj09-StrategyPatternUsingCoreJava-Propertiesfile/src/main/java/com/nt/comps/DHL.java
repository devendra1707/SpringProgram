// DHL.java  (Dependent class)

package com.nt.comps;

public final class DHL implements Courier { // rule2 (implementation Courier)
//-- rule3 taking class as final

	public DHL() {
		System.out.println("DHL :: 0-param constructor");
	}

	@Override
	public String deliver(int orderId) {
		return "order id :: " + orderId + " products are set to deliver using DHL Courier service";
	}

}
