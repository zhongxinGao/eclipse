package com.collection.www;

import java.util.ArrayList;

public class New1 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		ArrayList<String> b = new ArrayList<>();
		//将指定元素追加到列表末尾
		a.add("long");
		a.add("time");
		a.add("no");
		a.add("see");
		b.add("how");
		b.add("are");
		b.add("you");
		System.out.println(a);//输出集合元素
		
		//在列表中指定索引位置插入元素
		a.add(0, "z");
		System.out.println(a);
		
		//将指定集合中的所有元素插入此列表末尾
		//a.addAll(b);
		//System.out.println(a);
		
		//将指定集合中的所有元素插入此列表中，从指定位置开始
				a.addAll(5, b);
				System.out.println(a);
		
		//从列表中删除所有元素
		System.out.println(b);
		b.clear();
		System.out.println(b);
		
		//返回列表中指定位置的元素
		System.out.println(a.get(0));
		
		//返回列表中第一次出现指定元素的位置，如果不包含此元素则返回-1
		System.out.println(a.indexOf("zhang"));
		
		//判断列表是否为空
		System.out.println(a.isEmpty());
		
		//用指定元素替换该列表中指定位置的元素
		System.out.println(a.set(0, "f"));
		System.out.println(a);
		
		//删除列表中指定位置的元素
		System.out.println(a.remove(0));
		System.out.println(a);
		
		//列表是否存在该元素
		System.out.println(a.contains("hello"));
		
		//返回列表的元素数
		System.out.println(a.size());
	}
}
