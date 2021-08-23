package com.gl.assignment.oops;


public class AdminDepartment extends SuperDepartment{
	

	public String departmentName(){
		return "Admin Department";
		
	}
	public String getTodaysWork(){
		return "Complete your documents Submission";
		
	}
	private String getWorkDeadline(){
		return "Complete by EOD";
		
	}
	/**
	 * Constructor:AdminDepartment()
	 */
	 AdminDepartment() {
		System.out.println("Welecome to "+departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		//SuperDepartment will act as a super class 
		System.out.println(super.isTodayAHoliday());
		System.out.println();
	}
	
	

}
