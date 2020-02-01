package com.new1;

import java.util.Scanner;

public class New1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入你的年龄");
		int i = s.nextInt();
		if(i<=0 || i>99) {
			System.out.println("请输入0-99之间的年龄");
		}else if(i<18) {
			System.out.println("未成年禁止进入");
		}else if(i<99) {
			System.out.println("欢迎来到英雄联盟");
		}
	}
}
