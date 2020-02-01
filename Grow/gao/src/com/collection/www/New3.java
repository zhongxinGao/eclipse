package com.collection.www;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * ����MAP
 * @author grow
 *
 */
public class New3 {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<>();
		h.put(1, "hello");
		h.put(2, "world");
		System.out.println(h);
		
		//��һ��ͨ��keyset
		for(Object a:h.keySet()) {
			System.out.println("key="+a+" "+"value="+h.get(a));
		}
		
		//
		Set s = h.keySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Object key = i.next();
			Object value = h.get(key);
			System.out.println(key+":"+value);
		}
		
		//����ֵ
		for(Object o:h.values()) {
			System.out.println("value="+o);
		}
	}
}
