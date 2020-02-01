package com.reflect;

import java.lang.reflect.Method;

/**
 * 
 * @author grow
 *��ȡ��Ա���������ã�
 * 
 * 1.�����ģ�
 * 		public Method[] getMethods():��ȡ����"���з���"���������˸���ķ���Ҳ����Object�ࣩ
 * 		public Method[] getDeclaredMethods():��ȡ���еĳ�Ա����������˽�е�(�������̳е�)
 * 2.��ȡ�����ģ�
 * 		public Method getMethod(String name,Class<?>... parameterTypes):
 * 					������
 * 						name : ��������
 * 						Class ... : �βε�Class���Ͷ���
 * 		public Method getDeclaredMethod(String name,Class<?>... parameterTypes)
 * 
 * 	 ���÷�����
 * 		Method --> public Object invoke(Object obj,Object... args):
 * 					����˵����
 * 					obj : Ҫ���÷����Ķ���
 * 					args:���÷�ʽʱ�����ݵ�ʵ�Σ�
 */
public class Test3 {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("com.reflect.User");
				System.out.println("���еĹ��з���");
				c.getMethods();
				Method [] me = c.getMethods();
				for(Object a:me) {
					System.out.println(a);
				}
				
				System.out.println("��ȡ���еķ���");
				me = c.getDeclaredMethods();
				for(Object b:me) {
					System.out.println(b);
				}
					
				System.out.println("��ȡ���е�show1����");
				Method m = c.getMethod("show1", String.class);
				System.out.println(m);
				//ʵ�л�һ������
				Object obj = c.getConstructor().newInstance();
				m.invoke(obj, "������");
				
				
				System.out.println("��ȡ˽�е�show4����");
				 m = c.getDeclaredMethod("show4", int.class);
				System.out.println(m);
				m.setAccessible(true);//���˽���޶�
				Object result  = m.invoke(obj, 21);
				System.out.println("����ֵ"+result);
	}
}
