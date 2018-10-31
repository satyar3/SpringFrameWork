package com.qa.ioc.literals.constructor.injection;

public class Student
{
	int rollNo;
	String studentName;
	
	public Student(int rollNo, String studentName)
	{
		this.rollNo = rollNo;
		this.studentName = studentName;
	}
	

	public void getStudentDetails()
	{
		System.out.println("Student Name is : "+studentName+" And Roll No. is : "+rollNo);
	}
	
}
