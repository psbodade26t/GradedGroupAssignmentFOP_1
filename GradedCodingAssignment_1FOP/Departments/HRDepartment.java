package com.GradedCodingAssignment_1FOP.Departments;

import com.GradedCodingAssignment_1FOP.Applications.*;

public class HRDepartment extends SuperDepartment {

	public String departmentName() {
		return " HR Department";
	}

	public String getTodaysWork() {
		return " Fill today's timesheet and mark your attendance ";
	}

	public String getWorkDeadline() {
		return " Complete by EOD ";
	}

	public String doActivity() {
		return " team Lunch ";
	}

}
