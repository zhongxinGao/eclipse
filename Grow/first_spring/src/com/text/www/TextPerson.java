package com.text.www;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextPerson {
	public static void main(String[] args) {
		//�������������غ��������ļ�
		ApplicationContext acx = new ClassPathXmlApplicationContext("spring-config.xml");
		//�ӹ����л�ȡ�õ�����
		Person p = acx.getBean("Person", Person.class);
		p.introduce();
		
	}
}
