package com.collection;
/**
 * collection���÷���
 */
import java.util.*;

public class New1 {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		//�򼯺����Ԫ��
		c.add(1);
		c.add(6);
		c.add(99);
		//�жϼ����Ƿ�Ϊ��
		System.out.println(c.isEmpty());
		//������������
		Iterator<Integer> i =c.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		System.out.println();
		System.out.println(c.toString());
		
		System.out.println();
		//�жϼ����Ƿ����ĳ��Ԫ��
		System.out.println(c.contains(2));
		//����Ԫ�ظ���
		System.out.println(c.size());
		//�Ƴ�����Ԫ��
		c.remove(1);
		System.out.println(c.toString());
		//�Ƴ�����Ԫ��
		c.clear();
		System.out.println(c.toString());
		
	}
}
