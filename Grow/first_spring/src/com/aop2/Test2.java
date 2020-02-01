package com.aop2;

import java.lang.reflect.Proxy;

public class Test2 {
	public static void main(String[] args) {
		//����Ŀ�����
		TransferService target = new Runtime();
		//�����������
		TransferService proxy = (TransferService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new TransferAdvice(target));
		proxy.transfer();
	}
}
