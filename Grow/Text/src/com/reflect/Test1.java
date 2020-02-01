package com.reflect;

import java.lang.reflect.Constructor;

/**
 * 1.��ȡ���췽����
 * 		1).�����ķ�����
 * 			public Constructor[] getConstructors()������"���е�"���췽��
            public Constructor[] getDeclaredConstructors()����ȡ���еĹ��췽��(����˽�С��ܱ�����Ĭ�ϡ�����)
     
 * 		2).��ȡ�����ķ����������ã�
 * 			public Constructor getConstructor(Class... parameterTypes):��ȡ������"���е�"���췽����
 * 			public Constructor getDeclaredConstructor(Class... parameterTypes):��ȡ"ĳ�����췽��"������˽�еģ����ܱ�����Ĭ�ϡ����У�
 * 		
 * 			���ù��췽����
 * 			Constructor-->newInstance(Object... initargs)
 * @author grow
 *
 */
public class Test1 {
	public static void main(String[] args)throws Exception {
		//����Class����
		Class c = Class.forName("com.reflect.User");
		
		//��ȡ���й��췽��
		System.out.println("���й��й��췽��");
		Constructor[] con = c.getConstructors();
		for(Object a:con) {
			System.out.println(a);
		}
		
		//���й��췽��
		System.out.println("���й��췽��");
		con = c.getDeclaredConstructors();
		for(Object b:con) {
			System.out.println(b);
		}
		
		//��ȡ�����޲ι��췽��
		Constructor cons = c.getConstructor(null);
		System.out.println("con+"+cons);
		
		
		//���ù��췽��
		Object obj = cons.newInstance();
		
		System.out.println("obj"+obj);
		User user = (User)obj;
		
		//��ȡ˽�й��췽��������
		cons = c.getDeclaredConstructor(char.class);
		System.out.println(cons);
		//���ù��췽��
		cons.setAccessible(true);
		obj = cons.newInstance('��');
	}
}
