package com.collection.www;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * ����ArrayList
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
		
		//forѭ��,���б��Ϊ����
		Integer[] s = new Integer[a.size()];
		a.toArray(s);
		for (int j = 0; j < s.length; j++) {
			System.out.println(s[j]);
		}
		
		//��������������
		Iterator<Integer> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		//foreachѭ��
		for(Object b:a) {
			System.out.println(b);
		}
		
		//תΪ�������
		}
	}

