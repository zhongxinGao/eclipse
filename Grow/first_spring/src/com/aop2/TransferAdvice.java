package com.aop2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理
 * @author grow
 *
 */
public class TransferAdvice implements InvocationHandler {
	//目标对象
	private TransferService service;

	public TransferAdvice(TransferService servece) {
		super();
		this.service = servece;
	}
	
	//代理方法，每次调用目标方法时都会进入这里
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable{
		before();
		return method.invoke(service, args);
	}
	//前置增强
	private void before() {
		System.out.println("对转账人身份进行验证");
	}
}
