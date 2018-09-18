package com.spring.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Loger {
	@Before("execution(void com.spring.AOP.Camera.display())")
	public void home() {
		System.out.println("Aspect run");
		try {
			throw(new Exception());
		} catch (Exception e) {
			
			e.getMessage();
		}
	}
}
