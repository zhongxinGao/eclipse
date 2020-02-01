package com.test.www;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int[] a = {1, 99, 44, 66, 2, 11, 9, 7};
		int b = 0;
		for (int i = 0; i < a.length-1; i++) {
			boolean flag = true;
 			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					int c = a[j];
					a[j] = a[j+1];
					a[j+1] = c;
					flag = false;
				}
				b++;
			}
 			if(flag) {
 				break;
 			}
		}
		System.out.println("÷¥––¡À£∫"+b);
		System.out.println(Arrays.toString(a));
	}
}
