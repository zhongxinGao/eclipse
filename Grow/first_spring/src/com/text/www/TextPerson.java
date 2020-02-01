package com.text.www;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextPerson {
	public static void main(String[] args) {
		//创建工厂，加载核心配置文件
		ApplicationContext acx = new ClassPathXmlApplicationContext("spring-config.xml");
		//从工厂中获取得到对象
		Person p = acx.getBean("Person", Person.class);
		p.introduce();
		
	}
}
