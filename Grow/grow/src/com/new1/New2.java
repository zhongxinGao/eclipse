package com.new1;

import java.util.Scanner;

public class New2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���ַ�����˭");
		String i = s.next();
		
		switch(i) {
		case "����":	System.out.println("��֮���ģ���������");break;
		case "��Ī":	System.out.println("�ǣ�����");break;
		default:	System.out.println("�ú���һ��");
		}
	}
}
