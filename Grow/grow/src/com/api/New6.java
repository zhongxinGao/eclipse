package com.api;

public class New6 {
	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("���");
		System.out.println(a);
		
		//�����������
		a.append("��");
		System.out.println(a);
		
		//ɾ��
		a.delete(2, 3);
		System.out.println(a);
		
		//����
		a.insert(1, "��");
		System.out.println(a);
	}
}
