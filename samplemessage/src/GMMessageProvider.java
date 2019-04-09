package com.capgemini.spring.provider;

public class GMMessageProvider implements MessageProvider
{
	@Override
	public void getMessageProvider()
	{
		System.out.println("Good Morning!!");
	}
}