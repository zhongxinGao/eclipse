package com.text.www;

public class Array1 {
	public static void main(String[] args) {
		//动态初始化
		int [] a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		//静态初始化
		int [] b = {1, 3, 4};
		for(int i = 0; i<b.length; i++) {
			System.out.println(i+1+"="+b[i]);
		}
	}
}
