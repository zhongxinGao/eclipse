package com.aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("spring-config.xml");
		Service1 s = (Service1) a.getBean("proxyFactoryBean");
		s.sayHello();
		 //��һ����̳ж���ӿڣ���ô����֮����Ի�ת
        ((Service2)s).sayBye();
	}
}
