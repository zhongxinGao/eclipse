package com.new1;

import java.util.Scanner;

public class New1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�������������");
		int i = s.nextInt();
		if(i<=0 || i>99) {
			System.out.println("������0-99֮�������");
		}else if(i<18) {
			System.out.println("δ�����ֹ����");
		}else if(i<99) {
			System.out.println("��ӭ����Ӣ������");
		}
	}
}
