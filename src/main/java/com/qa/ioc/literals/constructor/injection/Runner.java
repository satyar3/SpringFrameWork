package com.qa.ioc.literals.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Runner
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorbean.xml");
		
		Student obj1 = context.getBean("Student1", Student.class);
		obj1.getStudentDetails();
		
		Student obj2 = context.getBean("Student2", Student.class);
		obj2.getStudentDetails();
		
		Student obj3 = context.getBean("Student3", Student.class);
		obj3.getStudentDetails();
		
	}

}
