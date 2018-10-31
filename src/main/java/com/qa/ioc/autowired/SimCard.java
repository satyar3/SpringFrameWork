package com.qa.ioc.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SimCard
{
	private CellularService service;
	
	@Autowired
	@Qualifier("serviceJio")
	public void setService(CellularService service)
	{
		this.service = service;
	}
	
	public void activateMySim()
	{
		service.activateService();
	}
}
