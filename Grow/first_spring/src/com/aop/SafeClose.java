package com.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class SafeClose implements AfterReturningAdvice{
	public void afterReturning(Object arg0, Method arg1, Object [] arg2, Object arg3) {
		System.out.println("����ִ��ϵͳ��ȫ�˳��Ĳ���");
	}
}
