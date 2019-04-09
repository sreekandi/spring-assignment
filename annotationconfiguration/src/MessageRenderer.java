package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.MessageProvider;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.context.annotation.*;


@Component
public class MessageRenderer{

	private MessageProvider provider;
	

	@Autowired
	//@Qualifier("goodMorningMessageProvider")
	@Qualifier("helloWorldMessageProvider")
	public void setMessageProvider(MessageProvider provider){
		this.provider=provider;
	
	}
	
	public void render(){
		System.out.println(provider.getMessage());
	}
}