package com.capgemini.bankapp.aspects;


import org.springframework.sterotype.*;
import org.apache.log4j.*;
import  org.aspectj.lang.annotation.*;


@Component
@Aspect
public class LoggingAsspects
{	
	private Logger logger = Logger.getLogger(LoggingAspects.class);
	
	@After("execution(*com.capgemini.bankapp.service.impl.BankAccountServiceImpl.addNewBankAccount(...))")

	public void log()
	{
		logger.info("account Created Sucessfully");
	}

}
