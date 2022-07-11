package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

import sun.net.www.content.text.Generic;

public class GenericTest1 {
	public <T extends Person> T getPersonInfo(Class<T> clazz) throws Exception {
		// get all constructors of the class
		Constructor cons[] = clazz.getDeclaredConstructors();
		// create object
		return (T) cons[0].newInstance();
	}

	public static void main(String[] args) {
		try {
			// createobject
			GenericTest1 gt1 = new GenericTest1();
			Employee emp = gt1.getPersonInfo(Employee.class);
			emp.m1();
			emp.m2();
			System.out.println("---------------------------");
			Student stud = gt1.getPersonInfo(Student.class);
			stud.m1();
			stud.m3();
			System.out.println("----------------------------");

			// Demo dt = gt1.getPersonInfo(Demo.class); // invalid becoz Demo is not sub
			// class of Person
			// System.out.println(dt.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
