package com.aop2;

import java.lang.reflect.Proxy;

public class Test2 {
	public static void main(String[] args) {
		//创建目标对象
		TransferService target = new Runtime();
		//创建代理对象
		TransferService proxy = (TransferService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new TransferAdvice(target));
		proxy.transfer();
	}
}
