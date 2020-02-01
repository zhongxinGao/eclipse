package com.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GuiTaiA implements InvocationHandler{
	public static void main(String[] args) {
		
		MaoTaiJiu m = new MaoTaiJiu();
		WuLiangYe w = new WuLiangYe();
		
		InvocationHandler jingxiao1 = new GuiTaiA(m);
		//��̬��������proxy1�����������ֱ�Ϊ �����������������Ľӿڡ�һ��InvocationHandler����
		SellWine proxy1 = (SellWine) Proxy.newProxyInstance(MaoTaiJiu.class.getClassLoader(), 
				MaoTaiJiu.class.getInterfaces(), jingxiao1);
		InvocationHandler jingxiao2 = new GuiTaiA(w);
		//��̬��������proxy2�����������ֱ�Ϊ �����������������Ľӿڡ�һ��InvocationHandler����
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
		System.out.println("���ۿ�ʼ ��̨�ǣ�"+this.getClass().getSimpleName());
		method.invoke(pingpai, args);
		System.out.println("���۽���");
		return null;
	}
}
