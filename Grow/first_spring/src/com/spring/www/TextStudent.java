package com.spring.www;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextStudent {
	public static void main(String[] args) {
		ApplicationContext content = new ClassPathXmlApplicationContext("spring-config.xml");
		Student stu = (Student) content.getBean("student");
		System.out.println(stu.getName());
	}
}
