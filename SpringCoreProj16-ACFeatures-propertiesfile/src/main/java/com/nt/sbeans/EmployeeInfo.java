// EpmloyeeInfo.java 

package com.nt.sbeans;

public class EmployeeInfo {
// bean properties to hold properties file content
	private String empName;
	private String empAddrs;
	private int empAge;

	// to hold system properrty os.name
	private String os;
	// to hold path env... variable value
	private String pathData;

	// setter method for Setter Injection

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpAddrs(String empAddrs) {
		this.empAddrs = empAddrs;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public void setPathData(String pathData) {
		this.pathData = pathData;
	}

	// toString()

	@Override
	public String toString() {
		return "EmployeeInfo [empName=" + empName + ", empAddrs=" + empAddrs + ", empAge=" + empAge + ", os=" + os
				+ ", pathData=" + pathData + "]";
	}

}
