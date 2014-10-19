package com.cheehong.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserDAOAdvice {
	
	@Before("execution(* com.cheehong.dao.UserDAOImpl.createUser(..))")
	public void createUserAdvice(JoinPoint joinPoint){
		System.out.println("@Before called..");
	}
}
