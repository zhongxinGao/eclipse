package com.text.www;

public class Cyclic3 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		while(a <= 100) {
			b += a;
			a++;
			}
		System.out.println(b);
	}
}
