package com.aop2;

import org.springframework.aop.framework.ProxyFactory;

public class Test {
	public static void main(String[] args) {
		//创建代理工厂
		ProxyFactory proxyFactory = new ProxyFactory();
		//配置目标对象
		proxyFactory.setTarget(new Runtime());
		//pe配置增强
		proxyFactory.addAdvice(new AccountAdvice());
		
		TransferService proxy = (TransferService) proxyFactory.getProxy();
		proxy.transfer();
	}
}
