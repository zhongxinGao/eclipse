package com.collection;
/**
 * linkedlist���÷���
 */
import java.util.LinkedList;

public class New4 {
	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<>();
		a.add(1);
		a.add(3);
		a.add(5);
		System.out.println(a.toString());
		//��Ԫ����ӵ�ָ��λ��
		a.add(0, 0);
		System.out.println(a.toString());
		//��ָ��Ԫ����ӵ���ͷ
		a.addFirst(66);
		System.out.println(a.toString());
		//��ָ��Ԫ����ӵ�ĩβ
		a.addLast(99);
		System.out.println(a.toString());
		//���ص�һ��Ԫ��
		System.out.println(a.getFirst());
		//�������һ��Ԫ��
		System.out.println(a.getLast());
		//һ�������ص�һ��
		System.out.println(a.removeFirst());
		//һ�����������һ��
		System.out.println(a.removeLast());
		System.out.println(a.toString());
	}
}
