package com.reflect;

import java.lang.reflect.Field;

/**
 * 
 * @author grow
 *��ȡ��Ա���������ã�
 * 
 * 1.������
 * 		1).Field[] getFields():��ȡ���е�"�����ֶ�"
 * 		2).Field[] getDeclaredFields():��ȡ�����ֶΣ�������˽�С��ܱ�����Ĭ�ϡ����У�
 * 2.��ȡ�����ģ�
 * 		1).public Field getField(String fieldName):��ȡĳ��"���е�"�ֶΣ�
 * 		2).public Field getDeclaredField(String fieldName):��ȡĳ���ֶ�(������˽�е�)
 * 
 * 	 �����ֶε�ֵ��
 * 		Field --> public void set(Object obj,Object value):
 * 					����˵����
 * 					1.obj:Ҫ���õ��ֶ����ڵĶ���
 * 					2.value:ҪΪ�ֶ����õ�ֵ��
 */
public class Test2 {
	public static void main(String[] args) throws Exception{
		//��ȡClass����
		Class c = Class.forName("com.reflect.User");
		
		System.out.println("��ȡ���й����ֶ�");
		Field [] field = c.getFields();
		for(Object a:field) {
			System.out.println(a);
		}
		
		System.out.println("��ȡ�����ֶ�");
		field = c.getDeclaredFields();
		for(Object b:field) {
			System.out.println(b);
		}
		
		System.out.println("��ȡ�����ֶβ�����");
		Field f = c.getField("name");
		System.out.println(f);
		//��ȡһ������
		Object obj = c.getConstructor().newInstance();
		f.set(obj, "������");
		//��֤
		User user = (User)obj;
		System.out.println("������"+user.name);
		
		System.out.println("��ȡ˽���ֶβ�����");
		f = c.getDeclaredField("phoneNum");
		System.out.println(f);
		f.setAccessible(true);
		f.set(obj, "110");
		System.out.println("�绰��"+user);
	}
	
}
