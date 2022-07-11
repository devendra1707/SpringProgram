// FirstFlight.java (Dependent class)

package com.nt.comps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ft")
@Scope
public final class FirstFlight implements Courier { // rule2 (implementation Courier(I))
													// -- rule3 taking the class as final class

	public FirstFlight() {
		System.out.println("FirstFlight: 0-param constructor");
	}

	@Override
	public String deliver(int orderId) {
		return "orderId :: " + orderId + " product are set to deliver using FirstFlight Courier Service";
	}

}
