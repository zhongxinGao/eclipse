package com.array;

public class New6 {
	public static void main(String[] args) {
		//�����ֵ
		int[] a = {8, 9,23,7,18,40,3};
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
