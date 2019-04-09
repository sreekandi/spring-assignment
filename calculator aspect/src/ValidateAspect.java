package com.capgemini.spring.aspect;

import com.capgemini.spring.calculator.*;
import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*;

@Component
@Aspect
public class ValidateAspect{

	/*@Before("execution (* com.capgemini.spring.calculator.impl.CalculatorImpl.addition(..))")
	public void valid(){
		System.out.println("In Aspect");
	}*/

	@Around("execution (* com.capgemini.spring.calculator.impl.CalculatorImpl.addition(..))")
	public void validateAdd(ProceedingJoinPoint pjp) throws Throwable{
		Object[] args = pjp.getArgs();
		int firstarg = Integer.parseInt(args[0].toString());
		int secongarg = Integer.parseInt(args[1].toString());
		if(firstarg>0 && secongarg >0){
			System.out.println("validation is Succesfull");
			pjp.proceed();
		}
		else
			System.out.println("Number cannot be less zero");		
	}

	@Around("execution (* com.capgemini.spring.calculator.impl.CalculatorImpl.division(..))")
	public void validateDivision(ProceedingJoinPoint pjp)throws Throwable{
		Object[] args = pjp.getArgs();
		double secongarg = Double.parseDouble(args[1].toString());
		if(secongarg > 0){
			
			System.out.println("validation is Succesfull");
			pjp.proceed();
		}
		else
			System.out.println("Number cannot be less zero");				
	}

	/*@After("execution (* com.capgemini.spring.calculator.impl.CalculatorImpl.addition(..))")
	public void valid(){
		System.out.println("In Aspect");
	}*/	
	
}