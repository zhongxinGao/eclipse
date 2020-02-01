package com.collection;

import java.util.ArrayList;

public class New3 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("你好");
		a.add("世界");
		System.out.println(a.toString());
		a.set(0, "hello");
		System.out.println(a.toString());
		String s = a.get(0);
		System.out.println(s);
		int i = a.indexOf("世界");
		System.out.println(i);
	}
}
