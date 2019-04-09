package com.capgemini.spring.provider;
import org.springframework.stereotype.*;
import org.springframework.context.annotation.*;

@Lazy(false)
@Component
class HelloWorldMessageProvider implements MessageProvider{

	@Override
	public String getMessage(){
		
		return "Hello World";
	}

}