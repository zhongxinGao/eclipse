package com.text.www;

import java.util.Scanner;

public class Cyclic2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("��������1-7������");
		int i = s.nextInt();
		switch(i) {
		case 1:
			System.out.println("��һ�ϰ��ٵ�");
			break;
		case 2:
			System.out.println("�ܶ�Ҫ����");
			break;
		case 3:
			System.out.println("��������Ŭ��");
			break;
		case 4:
			System.out.println("����ҲҪ���");
			break;
		case 5:
			System.out.println("�󼪴��������ϳԼ�");
			break;
		case 6:
			System.out.println("keep up");
			break;
		case 7:
			System.out.println("�����ϰ���");
			break;
		default:
			System.out.println("��������");
		}
	}
}
