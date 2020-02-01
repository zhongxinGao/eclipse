package com.aop2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK��̬����
 * @author grow
 *
 */
public class TransferAdvice implements InvocationHandler {
	//Ŀ�����
	private TransferService service;

	public TransferAdvice(TransferService servece) {
		super();
		this.service = servece;
	}
	
	//��������ÿ�ε���Ŀ�귽��ʱ�����������
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable{
		before();
		return method.invoke(service, args);
	}
	//ǰ����ǿ
	private void before() {
		System.out.println("��ת������ݽ�����֤");
	}
}
