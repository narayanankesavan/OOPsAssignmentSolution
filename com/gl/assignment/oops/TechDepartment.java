package com.gl.assignment.oops;

public class TechDepartment extends SuperDepartment {
	
	public String departmentName(){
		return "Tech Department";
		
	}
	public String getTodaysWork(){
		return "Complete coding of module 1";
		
	}
	public String getWorkDeadline(){
		return "Complete by EOD";
		
	}
	private String getTechStackInformation(){
		return "core Java";
		
	}
	
	/**
	 * Constructor:TechDepartment()
	 */
	TechDepartment() {
		System.out.println("Welcome to "+departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		//SuperDepartment will act as a super class 
		System.out.println(super.isTodayAHoliday());
	}

}
