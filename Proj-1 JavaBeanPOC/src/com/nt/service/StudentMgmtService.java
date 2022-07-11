// StudentMgmtService.java
package com.nt.service;

import com.nt.beans.StudentInfo;

public class StudentMgmtService {
	public String generateResult(StudentInfo studInfo) {
		// calc total, avg
		int total = studInfo.getM1()+studInfo.getM2()+studInfo.getM3();
		 float avg = total/3.0f;
		 String result = null;
		 if(studInfo.getM1()<35 || studInfo.getM2()<35 || studInfo.getM3()<35) 
			 result="fail";
			 else if(avg>=75)
			 result = "First class with Dist"; 
			 else if(avg>=60)
				 result = "First class";
			 else if(avg>=50) 
				 result="Second class";
			 else if(avg>=35) 
				 result="Third class";
			 else
				 result="fail";
	
		 return studInfo.getsName()+" Result of the Student is : "+result;
	}
}
