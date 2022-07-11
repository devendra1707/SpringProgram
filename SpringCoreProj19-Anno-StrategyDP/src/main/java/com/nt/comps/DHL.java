// DHL.java (dependent class)

package com.nt.comps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dhl")
@Scope
public final class DHL implements Courier { // rule 2 (implementation Courier(I))
											// -- ruel3 taking the class as final class
	public DHL() {
		System.out.println("DHL: 0-param constructor");
	}

	@Override
	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return "order Id :: " + orderId + " product are set to deliver using DTDC Courier Service";
	}

}
