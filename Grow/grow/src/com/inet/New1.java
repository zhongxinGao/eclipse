package com.inet;

import java.net.InetAddress;
import java.util.Scanner;

public class New1 {
	public static void main(String[] args) throws Exception {
		InetAddress i = InetAddress.getLocalHost();
		System.out.println(i);
		System.out.println("�ֽ�IP��"+i.getAddress());
		System.out.println("�ַ�IP��"+i.getHostAddress());
		System.out.println("��������"+i.getHostName());
		System.out.println();
		System.out.println("����Զ����������");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		InetAddress in = InetAddress.getByName(str);
		System.out.println("Զ������IP��"+in.getHostAddress());
		System.out.println("�����Ƿ�ɴ"+in.isReachable(3000));
	}
	
}
