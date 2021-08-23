package com.gl.assignment.oops;

public class HrDepartment extends SuperDepartment{

	public String departmentName(){
		return "Hr Department";
		
	}
	public String getTodaysWork(){
		return "Fill today’s worksheet and mark your attendance";
		
	}
	public String getWorkDeadline(){
		return "Complete by EOD";
		
	}
	private String doActivity(){
		return "team Lunch";
		
	}
	/**
	 * Constructor:HrDepartment()
	 */
	HrDepartment() {
		System.out.println("Welecome to "+departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		//SuperDepartment will act as a super class 
		System.out.println(super.isTodayAHoliday());
		System.out.println();
		
	}
}
