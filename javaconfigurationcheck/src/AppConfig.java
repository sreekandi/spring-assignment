package com.capgemini.spring.configuration;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.MessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig{
	
	@Bean
	public MessageRenderer renderer(){
		MessageRenderer messageRenderer = new MessageRenderer(new HelloMessageProvider());
		return messageRenderer;
	}

	/*@Bean
	public MessageRenderer renderer(){
		MessageRenderer messageRenderer = new MessageRenderer();
		messageRenderer.setMessageProvider(new GMorningMessageProvider());
		return messageRenderer;
	}*/
}