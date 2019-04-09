package com.capgemini.spring.test;

import com.capgemini.spring.calculator.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorMain
{
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Calculator calc = context.getBean(Calculator.class);
		calc.addition(10,25);
		calc.division(25.0,0.0);
	}
}