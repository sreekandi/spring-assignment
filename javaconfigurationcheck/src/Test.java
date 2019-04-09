package com.capgemini.spring.test;

import org.springframework.context.*;
import org.springframework.context.support.*;
import org.springframework.context.annotation.*;
import com.capgemini.spring.renderer.MessageRenderer;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.configuration.*;

public class Test{
	public static void main(String args[]){
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Working with test");
		MessageRenderer renderer = context.getBean(MessageRenderer.class);
		renderer.render();
	}
}