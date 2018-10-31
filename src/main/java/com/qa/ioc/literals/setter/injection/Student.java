package com.qa.ioc.literals.setter.injection;

public class Student
{
	int rollNo;
	String studentName;
		
	private Student()
	{
		//System.out.println("Student Default Constructor Called");
	}

	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
		//System.out.println("Roll No has been insterted !! "+rollNo);
	}
	
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
		//System.out.println("Student Name has been insterted !! "+studentName);

	}

	public void getStudentDetails()
	{
		System.out.println("Student Name is : "+studentName+" And Roll No. is : "+rollNo);
	}
	
	//Mandatory Validation
	public boolean fetchStudentDetails()
	{
		if (rollNo == 0 || studentName == null)
		{
			System.out.println("Mandatory Student details missing, can't create student record");
			return false;
		}
		else
		{
			System.out.println("Student Name is : "+studentName+" And Roll No. is : "+rollNo);
			return true;
		}
	}	
}