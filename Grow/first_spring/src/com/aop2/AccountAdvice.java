package com.aop2;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * ¾²Ì¬´úÀí
 * @author grow
 *
 */
public class AccountAdvice implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable{
		before();
		Object result = invocation.proceed();
		after();
		return result;
	}
	private void before() {
		System.out.println("before");
	}
	private void after() {
		System.out.println("after");
	}
}
