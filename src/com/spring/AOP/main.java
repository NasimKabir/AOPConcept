package com.spring.AOP;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/AOP/beans.xml");
		Camera camera=(Camera) context.getBean("camera");
		camera.display();
	}
}
