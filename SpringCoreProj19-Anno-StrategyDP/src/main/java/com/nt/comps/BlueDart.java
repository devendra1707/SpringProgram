// BlueDart.java (Dependent class2)

package com.nt.comps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bDart")
@Scope("prototype")
public final class BlueDart implements Courier { // rule 2 (implementation Courier(I))
	// -- rule3 taking the class as final class

	public BlueDart() {
		System.out.println("BlueDart: 0-param constructor");
	}

	@Override
	public String deliver(int orderId) {
		return "order Id :: " + orderId + " product are set to deliver using BlueDart Courier Service";
	}

}
