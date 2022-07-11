// EmployeeInfo.java 

package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("emp")
@PropertySource("com/nt/commons/Info.properties")
public class EmployeeInfo {

	@Value("${emp.name}")
	private String name;
	@Value("${emp.age}")
	private int age;
	@Value("${emp.salary}")
	private double salary;
	@Value("${os.name}") // fixed system property name
	private String os;
	@Value("${path}") // fixed Env variable name (Path)
	private String pathInfo;
	@Value("${TEMP}")
	private String temp;

	@Override

	// toString(alt+shift+s,s)

	public String toString() {
		return "EmployeeInfo [name=" + name + ", age=" + age + ", salary=" + salary + ",\n os=" + os + ",\n pathInfo="
				+ pathInfo + ",\n TEMP=" + temp + "]";
	}
}
