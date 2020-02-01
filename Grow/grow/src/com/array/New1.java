package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class New1 {
	public static void main(String[] args)throws Exception {
		int[] a = {1,3,9};		
		System.out.println(Array.get(a, 2));
		Array.set(a, 0, 7);
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		
	}
}
