package com.collection;
/**
 * collection常用方法
 */
import java.util.*;

public class New1 {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		//向集合添加元素
		c.add(1);
		c.add(6);
		c.add(99);
		//判断集合是否为空
		System.out.println(c.isEmpty());
		//迭代器，遍历
		Iterator<Integer> i =c.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		System.out.println();
		System.out.println(c.toString());
		
		System.out.println();
		//判断集合是否包含某个元素
		System.out.println(c.contains(2));
		//返回元素个数
		System.out.println(c.size());
		//移除单个元素
		c.remove(1);
		System.out.println(c.toString());
		//移除所有元素
		c.clear();
		System.out.println(c.toString());
		
	}
}
