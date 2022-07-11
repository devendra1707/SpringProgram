// NewInstanceMethodTest.java
package com.nt.test;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class NewInstanceMethodTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Value of A : ");
		int a = scan.nextInt();
		System.out.print("Enter the Value of B : ");
		int b = scan.nextInt();
		System.out.println("==========================");

		try {
			// Load the given java class dynamically at runtime
			Class c = Class.forName(args[0]);
			// get all the constructors of given java class dynamically
			Constructor cons[] = c.getDeclaredConstructors();
			// create objects for the loaded class
			Object obj1 = cons[0].newInstance(); // create the obj using 0-paran constructor
			System.out.println(obj1);
			System.out.println("_______________________");
//			Object obj2 = cons[1].newInstance(10, 20); // create the obj using 2-param constructor
			Object obj2 = cons[1].newInstance(a, b);
			System.out.println(obj2);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
