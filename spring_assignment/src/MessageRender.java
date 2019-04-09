package com.capgemini.spring.render;

import com.capgemini.spring.provider.MessageProvider;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service("render")
public class MessageRender 
{
	private MessageProvider messageProvider;

	/*@Autowired
	public MessageRender(MessageProvider messageProvider)
	{
		this.messageProvider = messageProvider;
	}*/
		
	@Autowired
	public void setMessageProvider(MessageProvider messageProvider)
	{
		this.messageProvider= messageProvider;
	}
	
	public void render()
	{
		 messageProvider.getMessageProvider();
	}
	
}
