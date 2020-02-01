package com.text.www;

public class String1 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("change");
		
		//追加
		s.append(" grow");
		System.out.println(s);
		
		//删除
		s.delete(0, 6);
		System.out.println(s);
		
		//指定位置添加
		s.insert(0, "please");
		System.out.println(s);
		
		//反转
		s.reverse();
		System.out.println(s);
	}
}
