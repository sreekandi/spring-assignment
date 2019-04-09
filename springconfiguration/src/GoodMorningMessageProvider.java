package com.capgemini.spring.provider;

public class GoodMorningMessageProvider implements MessageProvider{
	
	@Override
	public String getMessage(){
		return "Good Morning..!!";
	}

}