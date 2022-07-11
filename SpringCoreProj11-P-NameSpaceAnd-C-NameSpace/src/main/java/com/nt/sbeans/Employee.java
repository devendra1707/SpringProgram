// Employee.java (Target class)

package com.nt.sbeans;

import java.util.Date;

public class Employee {

	private int eno;
	private String ename;
	private Date dob;
	private double salary;
	private Department dept;

	public Employee() {
		System.out.println("Employee :: 0-param constructor");
	}

	// setter methods for setter Injection (alt+shift+s,r)

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	// toString (alt+shift+s,s)

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", dob=" + dob + ", salary=" + salary + ", dept=" + dept
				+ "]";
	}

} // class
