package com.text.www;

public class String1 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("change");
		
		//׷��
		s.append(" grow");
		System.out.println(s);
		
		//ɾ��
		s.delete(0, 6);
		System.out.println(s);
		
		//ָ��λ�����
		s.insert(0, "please");
		System.out.println(s);
		
		//��ת
		s.reverse();
		System.out.println(s);
	}
}
