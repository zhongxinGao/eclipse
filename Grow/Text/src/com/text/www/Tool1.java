package com.text.www;
/**
 * 数据类型转化
 * @author grow
 *
 */
public class Tool1 {
	public static void main(String[] args) {
		Integer i1 = 1;//自动装箱
		int i2 = i1;//自动拆箱
		
		int i = 5;
		Integer i3 = new Integer(i);
		int i4 = Integer.valueOf(i3);
	}
}
