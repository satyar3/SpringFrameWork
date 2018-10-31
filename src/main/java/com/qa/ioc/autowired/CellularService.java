package com.qa.ioc.autowired;

public class CellularService
{
	String bandwidth;
	public void setBandwidth(String bandwidth)
	{
		this.bandwidth = bandwidth;
	}

	public void setServiceProvider(String serviceProvider)
	{
		this.serviceProvider = serviceProvider;
	}

	String serviceProvider;
	
	public void activateService()
	{
		System.out.println("Service Provider is : "+serviceProvider);
		System.out.println("Bandwidth is : "+bandwidth);
	}
	
}
