package com.text.www;

import java.util.Scanner;

public class Cyclic1 {
	public static void main(String[] args) {
		//����һ������
		Scanner s = new Scanner(System.in);
		System.out.println("������һ������");
		int i = s.nextInt();
		if(i == 520) {
			System.out.println("�Ұ���");
		}else if(i == 99) {
			System.out.println("��һ��");
		} else{
			System.out.println("������");
		}
	}
}
