package com.qa.ioc.literals.customref.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSIM
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("SIM.xml");
		
		SimCard sim = context.getBean("ActivateSim",SimCard.class);
		sim.activateMySim();

	}

}
