package com.GradedCodingAssignment_1FOP.Applications;

import com.GradedCodingAssignment_1FOP.Departments.AdminDepartment;
import com.GradedCodingAssignment_1FOP.Departments.HRDepartment;
import com.GradedCodingAssignment_1FOP.Departments.SuperDepartment;
import com.GradedCodingAssignment_1FOP.Departments.TechDepartment;

public class Main {
	public static void main(String[] args) {
		AdminDepartment obj1 = new AdminDepartment();
		System.out.println("  Welcome to " + obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline()); // departmentName
		System.out.println(obj1.isTodayAHoliday());
		System.out.println(" ");
		System.out.println(" ");

		HRDepartment obj2 = new HRDepartment();
		System.out.println("  Welcome to " + obj2.departmentName());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodaysWork()); // getTodaysWork
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAHoliday());
		System.out.println(" ");
		System.out.println(" ");

		// TECH DEPT:
		TechDepartment obj3 = new TechDepartment();
		System.out.println("  Welcome to " + obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
	    System.out.println(obj3.isTodayAHoliday());
	}
}
