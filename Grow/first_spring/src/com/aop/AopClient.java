package com.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactory;

public class AopClient {
	public static void main(String[] args) {
		//����beforeAdvice����
		
		Advice beforeAdvice = (Advice) new SafeCheck();
		
		//����afterAdvice����
		Advice afterAdvice = (Advice) new SafeClose();
		
		//����һ���������
		ProxyFactory proxy = new ProxyFactory(new BankOfChina());
		
		//�ڴ�����������beforeAdvice
		proxy.addAdvice(beforeAdvice);
		//�ڴ�����������afterAdvice
		proxy.addAdvice(afterAdvice);
		
		//ͨ����������ñ���������ʵ��
		BankOfChina bank = (BankOfChina)proxy.getProxy();
		
		//����ϵͳ
		bank.systemRun();
	}
}
