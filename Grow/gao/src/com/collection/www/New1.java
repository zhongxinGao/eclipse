package com.collection.www;

import java.util.ArrayList;

public class New1 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		ArrayList<String> b = new ArrayList<>();
		//��ָ��Ԫ��׷�ӵ��б�ĩβ
		a.add("long");
		a.add("time");
		a.add("no");
		a.add("see");
		b.add("how");
		b.add("are");
		b.add("you");
		System.out.println(a);//�������Ԫ��
		
		//���б���ָ������λ�ò���Ԫ��
		a.add(0, "z");
		System.out.println(a);
		
		//��ָ�������е�����Ԫ�ز�����б�ĩβ
		//a.addAll(b);
		//System.out.println(a);
		
		//��ָ�������е�����Ԫ�ز�����б��У���ָ��λ�ÿ�ʼ
				a.addAll(5, b);
				System.out.println(a);
		
		//���б���ɾ������Ԫ��
		System.out.println(b);
		b.clear();
		System.out.println(b);
		
		//�����б���ָ��λ�õ�Ԫ��
		System.out.println(a.get(0));
		
		//�����б��е�һ�γ���ָ��Ԫ�ص�λ�ã������������Ԫ���򷵻�-1
		System.out.println(a.indexOf("zhang"));
		
		//�ж��б��Ƿ�Ϊ��
		System.out.println(a.isEmpty());
		
		//��ָ��Ԫ���滻���б���ָ��λ�õ�Ԫ��
		System.out.println(a.set(0, "f"));
		System.out.println(a);
		
		//ɾ���б���ָ��λ�õ�Ԫ��
		System.out.println(a.remove(0));
		System.out.println(a);
		
		//�б��Ƿ���ڸ�Ԫ��
		System.out.println(a.contains("hello"));
		
		//�����б��Ԫ����
		System.out.println(a.size());
	}
}
