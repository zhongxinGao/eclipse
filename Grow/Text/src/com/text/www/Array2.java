package com.text.www;
/**
 * 
 * @author grow
 *����������һ����
 */
public class Array2 {
	public static void main(String[] args) {
		int [] a = {1, -99, -66, 520, 101, 66};
		int max = 0;
		for(int i = 0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
			
		}
		System.out.println(max);
	}
}
