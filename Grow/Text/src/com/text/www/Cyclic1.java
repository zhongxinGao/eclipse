package com.text.www;

import java.util.Scanner;

public class Cyclic1 {
	public static void main(String[] args) {
		//输入一个数字
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int i = s.nextInt();
		if(i == 520) {
			System.out.println("我爱你");
		}else if(i == 99) {
			System.out.println("在一起");
		} else{
			System.out.println("打扰了");
		}
	}
}
