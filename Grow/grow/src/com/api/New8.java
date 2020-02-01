package com.api;

import java.util.Random;

public class New8 {
	public static void main(String[] args) {
		String a = "一元,两元,五元,十元,谢谢惠顾";
		String[] b = a.split(",");
		Random r = new Random();
		int c = r.nextInt(5);
		System.out.println("奖品是："+b[c]);
	}
}
