package com.aop3;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyService implements MethodBeforeAdvice{
	//前置通知
	@Override
	public void before(Method method, Object[] object, Object o)throws Throwable{
		//method：被调用方法的名字
		//object：给method传递的参数
		//0：目标对象
		System.out.println("日志记录："+method.getName());
	}
}
