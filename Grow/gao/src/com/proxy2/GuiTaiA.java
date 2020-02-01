package com.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GuiTaiA implements InvocationHandler{
	public static void main(String[] args) {
		
		MaoTaiJiu m = new MaoTaiJiu();
		WuLiangYe w = new WuLiangYe();
		
		InvocationHandler jingxiao1 = new GuiTaiA(m);
		//动态创建代理proxy1，三个参数分别为 类加载器、用来代理的接口、一个InvocationHandler对象
		SellWine proxy1 = (SellWine) Proxy.newProxyInstance(MaoTaiJiu.class.getClassLoader(), 
				MaoTaiJiu.class.getInterfaces(), jingxiao1);
		InvocationHandler jingxiao2 = new GuiTaiA(w);
		//动态创建代理proxy2，三个参数分别为 类加载器、用来代理的接口、一个InvocationHandler对象
		SellWine proxy2 = (SellWine) Proxy.newProxyInstance(MaoTaiJiu.class.getClassLoader(), 
				MaoTaiJiu.class.getInterfaces(), jingxiao2);
		
		proxy1.mainJiu();
		proxy2.mainJiu();
	}
	private Object pingpai;

	public GuiTaiA(Object pingpai) {
		super();
		this.pingpai = pingpai;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
		System.out.println("销售开始 柜台是："+this.getClass().getSimpleName());
		method.invoke(pingpai, args);
		System.out.println("销售结束");
		return null;
	}
}
