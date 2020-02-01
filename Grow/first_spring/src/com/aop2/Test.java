package com.aop2;

import org.springframework.aop.framework.ProxyFactory;

public class Test {
	public static void main(String[] args) {
		//����������
		ProxyFactory proxyFactory = new ProxyFactory();
		//����Ŀ�����
		proxyFactory.setTarget(new Runtime());
		//pe������ǿ
		proxyFactory.addAdvice(new AccountAdvice());
		
		TransferService proxy = (TransferService) proxyFactory.getProxy();
		proxy.transfer();
	}
}
