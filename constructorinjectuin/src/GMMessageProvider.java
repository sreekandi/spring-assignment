package com.capgemini.spring.provider;

import org.springframework.stereotype.Component;

@Component("GMMessageProvidrer")
public class GMMessageProvider implements MessageProvider
{
	@Override
	public void getMessageProvider()
	{
		System.out.println("Good Morning!!");
	}
}