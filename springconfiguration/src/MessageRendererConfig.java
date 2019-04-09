package com.capgemini.spring.renderer;

import org.springframework.context.annotation.*;
import com.capgemini.spring.renderer.MessageRenderer;
import com.capgemini.spring.provider.*;


@Lazy
@Configuration
 public class MessageRendererConfig{


	@Bean
	public MessageRenderer config(){
		System.out.println("you are in bean ");
		MessageRenderer render =  new MessageRenderer();
		render.setMessageProvider(new HelloWorldMessageProvider());
		return render;
	}

}