package com.collection;

import java.util.ArrayList;

public class New2 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(3);
		a.add(6);
		a.add(9);
		//for—≠ª∑
		for (int i = 0; i < a.size(); i++) {
		}
		System.out.println(a);
		//foreach
		for(Object b:a) {
			System.out.print(b+" ");
		}
	}
}
