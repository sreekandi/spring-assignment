package com.capgemini.spring.provider;

public class HWMessageProvider implements MessageProvider
{
	@Override
	public void getMessageProvider()
	{
		System.out.println("Hello World!");
	}
}