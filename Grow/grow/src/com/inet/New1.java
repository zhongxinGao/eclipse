package com.inet;

import java.net.InetAddress;
import java.util.Scanner;

public class New1 {
	public static void main(String[] args) throws Exception {
		InetAddress i = InetAddress.getLocalHost();
		System.out.println(i);
		System.out.println("字节IP："+i.getAddress());
		System.out.println("字符IP："+i.getHostAddress());
		System.out.println("主机名："+i.getHostName());
		System.out.println();
		System.out.println("输入远程主机名称");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		InetAddress in = InetAddress.getByName(str);
		System.out.println("远程主机IP："+in.getHostAddress());
		System.out.println("三秒是否可达："+in.isReachable(3000));
	}
	
}
