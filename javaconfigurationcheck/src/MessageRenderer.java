package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.*;


public class MessageRenderer{

	
	private MessageProvider messageProvider;
	
	
	//ForConstrctorInjection
	public MessageRenderer(MessageProvider messageProvider)
	{	
		this.messageProvider = messageProvider;
	}

	/*For Setter Injection 
	
	public void setMessageProvider(MessageProvider messageProvider)
	{	
		this.messageProvider = messageProvider;
	}*/
	
	
	public void render(){
		messageProvider.getMessage();	

	}
}