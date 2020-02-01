package com.array;
/**
 * Êý×é¿½±´
 */
import java.util.Arrays;

public class New3 {
	public static void main(String[] args) {
		int[] a = {3, 6, 9};
		int[] b = Arrays.copyOf(a, 4);
		int[] c = Arrays.copyOfRange(a, 0, 5);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
	}
}
