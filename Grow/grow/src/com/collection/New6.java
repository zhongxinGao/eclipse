package com.collection;

import java.util.*;

/**
 * 
 * @author grow
 *map�ı���
 */
public class New6 {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "��");
		m.put(2, "��");
		m.put(3, "��");
		
		//��һ��
		for(Integer key : m.keySet()) {
			System.out.print(key +" "+m.get(key));
		}
		System.out.println();
		//�ڶ���Iterator
		Iterator<Map.Entry<Integer, String>>  i = m.entrySet().iterator();
		while(i.hasNext()) {
			Map.Entry<Integer, String> j = i.next();
			System.out.print(j);
		}
		System.out.println();
		//������(�Ƽ�)
		for(Map.Entry<Integer, String> c:m.entrySet()) {
			System.out.print(c.getKey()+" "+c.getValue());
		}
	}
}
