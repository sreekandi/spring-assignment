package com.capgemini.spring.provider;
import org.springframework.stereotype.Component;

@Component
public class HWMessageProvider implements MessageProvider
{
	@Override
	public void getMessageProvider()
	{
		System.out.println("Hello World!");
	}
}