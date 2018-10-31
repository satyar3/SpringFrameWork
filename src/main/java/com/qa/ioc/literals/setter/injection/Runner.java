package com.qa.ioc.literals.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Runner
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("setterbean.xml");
		
		Student obj1 = context.getBean("Student1", Student.class);
		obj1.fetchStudentDetails();
		
		Student obj2 = context.getBean("Student2", Student.class);
		obj2.fetchStudentDetails();
		
		Student obj4 = context.getBean("Student4", Student.class);
		obj4.fetchStudentDetails();
					
		Student obj3 = context.getBean("Student3", Student.class);
		obj3.fetchStudentDetails();
	}
}
