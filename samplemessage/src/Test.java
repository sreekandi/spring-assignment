package com.capgemini.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

import com.capgemini.spring.render.MessageRender;

public class Test
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("cont.xml");
		MessageRender renderer = (MessageRender)context.getBean("render");
		renderer.render();
	}
}
