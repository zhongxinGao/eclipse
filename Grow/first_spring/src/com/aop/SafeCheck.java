package com.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SafeCheck implements MethodBeforeAdvice{
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable{
		System.out.println("正在启动系统启动前检查");
		Thread.sleep(3000);
	}
}
