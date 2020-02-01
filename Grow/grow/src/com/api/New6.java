package com.api;

public class New6 {
	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("你好");
		System.out.println(a);
		
		//在最后面增加
		a.append("啊");
		System.out.println(a);
		
		//删除
		a.delete(2, 3);
		System.out.println(a);
		
		//插入
		a.insert(1, "们");
		System.out.println(a);
	}
}
