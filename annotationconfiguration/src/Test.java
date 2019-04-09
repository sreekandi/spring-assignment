package com.capgemini.spring.test;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
import java.util.*;

class Test{

	public static void main(String args[]) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("y this code is running....!!");
		MessageRenderer renderer = context.getBean(MessageRenderer.class);
		System.out.println(" this code is running....!!");
		renderer.render();
		System.out.println("Code is running....!!");
		
	}

}