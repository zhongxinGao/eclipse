package com.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactory;

public class AopClient {
	public static void main(String[] args) {
		//创建beforeAdvice对象
		
		Advice beforeAdvice = (Advice) new SafeCheck();
		
		//创建afterAdvice对象
		Advice afterAdvice = (Advice) new SafeClose();
		
		//创建一个代理对象
		ProxyFactory proxy = new ProxyFactory(new BankOfChina());
		
		//在代理对象中添加beforeAdvice
		proxy.addAdvice(beforeAdvice);
		//在代理对象中添加afterAdvice
		proxy.addAdvice(afterAdvice);
		
		//通过代理对象获得被代理对象的实例
		BankOfChina bank = (BankOfChina)proxy.getProxy();
		
		//运行系统
		bank.systemRun();
	}
}
