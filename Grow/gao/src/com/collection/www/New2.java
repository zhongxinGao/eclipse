package com.collection.www;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 遍历ArrayList
 * @author grow
 *
 */
public class New2 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		System.out.println(a);
		
		//for循环,把列表变为数组
		Integer[] s = new Integer[a.size()];
		a.toArray(s);
		for (int j = 0; j < s.length; j++) {
			System.out.println(s[j]);
		}
		
		//迭代器遍历集合
		Iterator<Integer> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		//foreach循环
		for(Object b:a) {
			System.out.println(b);
		}
		
		//转为数组遍历
		}
	}

