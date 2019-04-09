package com.capgemini.spring.calculator.impl;

import com.capgemini.spring.calculator.*;
import org.springframework.stereotype.*;
@Component
public class CalculatorImpl implements Calculator{
	
	public void addition(int number1, int number2){
		System.out.println(number1+number2);
	}

	public void division(double number1,double number2){
		System.out.println(number1/number2);
	}
}