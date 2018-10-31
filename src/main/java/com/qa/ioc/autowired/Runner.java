package com.qa.ioc.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("SIM_AutoWired.xml");
		
		SimCard sim = context.getBean("ActivateSim",SimCard.class);
		sim.activateMySim();

	}

}
