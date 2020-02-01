package com.api;
/**
 * 
 * @author grow
 *
 */
public class New1 {
	public static void main(String[] args) {
		//基本数据类型转为包装类型
		int a = 1;
		Integer i = new Integer(a);
		System.out.println(i);
		//包装类转基本数据类型
		int b = i.intValue();
		System.out.println(b);
	}
}
