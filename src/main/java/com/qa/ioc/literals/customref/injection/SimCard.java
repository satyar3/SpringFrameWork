package com.qa.ioc.literals.customref.injection;

public class SimCard
{
	private CellularService service;

	public void setService(CellularService service)
	{
		this.service = service;
	}
	
	public void activateMySim()
	{
		service.activateService();
	}
}
