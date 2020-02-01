package com.collection;
/**
 * linkedlist常用方法
 */
import java.util.LinkedList;

public class New4 {
	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<>();
		a.add(1);
		a.add(3);
		a.add(5);
		System.out.println(a.toString());
		//将元素添加到指定位置
		a.add(0, 0);
		System.out.println(a.toString());
		//将指定元素添加到开头
		a.addFirst(66);
		System.out.println(a.toString());
		//将指定元素添加到末尾
		a.addLast(99);
		System.out.println(a.toString());
		//返回第一个元素
		System.out.println(a.getFirst());
		//返回最后一个元素
		System.out.println(a.getLast());
		//一处并返回第一个
		System.out.println(a.removeFirst());
		//一处并返回最后一个
		System.out.println(a.removeLast());
		System.out.println(a.toString());
	}
}
