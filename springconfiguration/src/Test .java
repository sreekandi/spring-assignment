package com.capgemini.spring.test;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.*;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
import java.util.*;

class Test{

	public static void main(String args[]) throws Exception {

		ApplicationContext context = new AnnotationConfigApplicationContext(MessageRendererConfig.class);
		System.out.println("Spring Container started and is ready");
		MessageRenderer renderer = context.getBean(MessageRenderer.class);
		System.out.println("bean called");
		renderer.render();
		
		
	}

}