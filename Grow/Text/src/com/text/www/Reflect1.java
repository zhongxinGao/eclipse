package com.text.www;
/**
 * ��ȡclass��������ַ�ʽ
 * 1��object --> getclass
 * 2���κ��������Ͷ�ֻ��һ����̬��class����
 * 3��ͨ��class�ľ�̬������forname(String classname)(����)
 * 
 * @author grow
 *�������ڼ�һ����ֻ��һ��class�������
 *ͨ��class������Ի�ȡĳ�����еģ����췽������Ա��������Ա����
 *
 */
public class Reflect1 {
	public static void main(String[] args) {
		Reflect1 r = new Reflect1();
		
		//��һ�ַ�ʽ��ȡ
		Class c1 = r.getClass();
		System.out.println(c1.hashCode());
		
		//�ڶ��ַ�ʽ��ȡ
		Class c2 = Reflect1.class;
		System.out.println(c2.hashCode());
		
		//�����ַ�ʽ
		Class c3;
		try {
			c3 = Class.forName("com.text.www.Reflect1");
			System.out.println(c3.hashCode());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
