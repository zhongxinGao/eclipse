package com.array;

import java.util.Arrays;

public class New4 {
	public static void main(String[] args) {
		int[] a = {3, 9, 6, 66, 22};
		//����
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		//����
		System.out.println(Arrays.binarySearch(a, 9));
		
	}
}
