package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("MARI VIGNESH");
	}
	
	public void studentDept()
	{
		System.out.println("ECE");
	}
	
	public void studentId()
	{
		System.out.println("123456");
	}

	
	public static void main(String[] args) {
		
		Student studentInfo=new Student();
		
		studentInfo.collegeCode();
		studentInfo.collegeName();
		studentInfo.collegeRank();
		studentInfo.deptName();
		studentInfo.studentDept();
		studentInfo.studentId();
		studentInfo.studentName();
		
	}
	
}
