package com.aop3;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyService implements MethodBeforeAdvice{
	//ǰ��֪ͨ
	@Override
	public void before(Method method, Object[] object, Object o)throws Throwable{
		//method�������÷���������
		//object����method���ݵĲ���
		//0��Ŀ�����
		System.out.println("��־��¼��"+method.getName());
	}
}
