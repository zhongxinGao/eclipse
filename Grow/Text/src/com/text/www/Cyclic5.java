package com.text.www;

public class Cyclic5 {
	public static void main(String[] args) {
		int a = 0;
		for(int i = 0; i <= 10; i++) {
			a += i;
			if(i>4) {
				break;//breakµÄÓÃ·¨
			}
		}
		System.out.println(a);
	}
}
