package com.text.www;

import java.util.Scanner;

public class Cyclic2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入周1-7的数字");
		int i = s.nextInt();
		switch(i) {
		case 1:
			System.out.println("周一上班别迟到");
			break;
		case 2:
			System.out.println("周二要早起");
			break;
		case 3:
			System.out.println("周三继续努力");
			break;
		case 4:
			System.out.println("周四也要坚持");
			break;
		case 5:
			System.out.println("大吉大利，晚上吃鸡");
			break;
		case 6:
			System.out.println("keep up");
			break;
		case 7:
			System.out.println("明天上班了");
			break;
		default:
			System.out.println("输入有误");
		}
	}
}
