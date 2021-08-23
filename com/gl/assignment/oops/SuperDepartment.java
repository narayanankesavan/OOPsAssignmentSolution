package com.gl.assignment.oops;

@SuppressWarnings("unused")
abstract class SuperDepartment {
	
	
	private  String departmentName() {
		return "Super Department";
	}
	private  String getTodaysWork() {
		return "No Work as of now";
	}	
    private  String getWorkDeadline() {
		return "Nil";
	}
	public  String isTodayAHoliday() {
		return "Today is not a holiday";
	}

}
