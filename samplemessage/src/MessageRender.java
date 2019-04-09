package com.capgemini.spring.render;

import com.capgemini.spring.provider.MessageProvider;

public class MessageRender 
{
	private MessageProvider messageProvider;


	public MessageRender(MessageProvider messageProvider)
	{
		this.messageProvider = messageProvider;
	}
	
	/*public void setMessageProvider(MessageProvider messageProvider)
	{
		this.messageProvider= messageProvider;
	}*/
	
	public void render()
	{
		 messageProvider.getMessageProvider();
	}
	
}
