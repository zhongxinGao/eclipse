package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class New2 {
	public static void main(String[] args) {
		Integer[] i = {3, 7, 9};
		System.out.println(Arrays.toString(i));
		//����ת����
		List<Integer> list = new ArrayList<>(Arrays.asList(i));
		list.add(5);
		Integer[] a =new Integer [list.size()];
		//����ת����
		list.toArray(a);
		System.out.println(Arrays.toString(a));
	}
}
