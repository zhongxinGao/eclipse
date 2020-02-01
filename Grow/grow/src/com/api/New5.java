package com.api;

public class New5 {
	public static void main(String[] args) {
		String a = "呵呵";//创建了一个字符串对象
		String b = new String("喝喝");//创建了两个字符串对象
		System.out.println(a);
		System.out.println(b);
		//通过字符数组创建字符串
		char[] c = {'你','好','啊'};
		String d = new String(c);
		System.out.println(d);
	}
}
