package com.capgemini.spring.provider;

import org.springframework.stereotype.*;

@Component("GMMessageProvider")
public interface MessageProvider
{
	public void getMessageProvider();
}