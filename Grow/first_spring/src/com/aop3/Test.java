package com.aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("spring-config.xml");
		Service1 s = (Service1) a.getBean("proxyFactoryBean");
		s.sayHello();
		 //当一个类继承多个接口，那么他们之间可以互转
        ((Service2)s).sayBye();
	}
}
