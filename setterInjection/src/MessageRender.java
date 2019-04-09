package com.capgemini.spring.render;

import com.capgemini.spring.provider.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;;

@Component
public class MessageRender 
{
	private MessageProvider messageProvider;

	
		
	@Autowired
	@Qualifier("GMMessageProvidrer")
	public void setMessageProvider(MessageProvider messageProvider)
	{
		this.messageProvider= messageProvider;
	}
	
	public void render()
	{
		 messageProvider.getMessageProvider();
	}
	
}
