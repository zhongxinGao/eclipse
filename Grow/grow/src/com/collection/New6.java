package com.collection;

import java.util.*;

/**
 * 
 * @author grow
 *map的遍历
 */
public class New6 {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "高");
		m.put(2, "中");
		m.put(3, "鑫");
		
		//第一种
		for(Integer key : m.keySet()) {
			System.out.print(key +" "+m.get(key));
		}
		System.out.println();
		//第二种Iterator
		Iterator<Map.Entry<Integer, String>>  i = m.entrySet().iterator();
		while(i.hasNext()) {
			Map.Entry<Integer, String> j = i.next();
			System.out.print(j);
		}
		System.out.println();
		//第三种(推荐)
		for(Map.Entry<Integer, String> c:m.entrySet()) {
			System.out.print(c.getKey()+" "+c.getValue());
		}
	}
}
