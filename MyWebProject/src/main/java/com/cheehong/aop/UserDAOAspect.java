package com.cheehong.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class UserDAOAspect {
	
	@Before("execution(public void *.*.createUser(..))")
	public void createUserAdvice(JoinPoint joinPoint){
		System.out.println("@Before called..");
	}
}
