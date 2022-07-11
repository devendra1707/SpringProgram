package com.nt.test;

import com.nt.beans.StudentInfo;
import com.nt.service.StudentMgmtService;

public class ClientApp {
	public static void main(String[] args) {
		// prepare JavaBean class obj
		StudentInfo info = new StudentInfo();
		info.setSno(1001);
		info.setsName("Devendra");
		info.setM1(35);
		info.setM2(45);
		info.setM3(98);
		// invoke method
		StudentMgmtService service = new StudentMgmtService();
		String result = service.generateResult(info);
		System.out.println(result);
	}
}
