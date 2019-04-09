package com.capgemini.spring.test;

import com.capgemini.spring.render.*;
import com.capgemini.spring.provider.*;

import org.springframework.context.*;
import org.springframework.context.support.*;


class Test {
   public static void main(String args[])
   {
     ApplicationContext context = new ClassPathXmlApplicationContext("cont.xml");
     System.out.println("wow it is working!...");
      MessageRender renderer = (MessageRender)context.getBean("render");
      renderer.render();
    }
}