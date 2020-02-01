package com.new1;

import java.util.Scanner;

public class New2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("快乐风男是谁");
		String i = s.next();
		
		switch(i) {
		case "亚索":	System.out.println("吾之初心，永世不忘");break;
		case "提莫":	System.out.println("是，长官");break;
		default:	System.out.println("好好想一想");
		}
	}
}
