package com.text.www;

public class Tool2 {
	public static void main(String[] args) {
		//数字转字符串
		int i = 6;
		//方法一
		String s = String.valueOf(i);
		System.out.println(s);
		
		//方法二
		Integer it = i;
		String s2 = it.toString();
		System.out.println(s2);
		
		//字符串转数字
		String j ="66";
		int s3 = Integer.parseInt(j);
		System.out.println(s3);
	}
}
