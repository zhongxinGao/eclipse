package com.text.www;

public class Cyclic6 {
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			if(i == 5 || i == 7) {
				continue;//continueµÄÓÃ·¨
			}
			System.out.println("i="+i);
		}
	}
}
