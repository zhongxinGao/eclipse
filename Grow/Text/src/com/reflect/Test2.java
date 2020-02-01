package com.reflect;

import java.lang.reflect.Field;

/**
 * 
 * @author grow
 *获取成员变量并调用：
 * 
 * 1.批量的
 * 		1).Field[] getFields():获取所有的"公有字段"
 * 		2).Field[] getDeclaredFields():获取所有字段，包括：私有、受保护、默认、公有；
 * 2.获取单个的：
 * 		1).public Field getField(String fieldName):获取某个"公有的"字段；
 * 		2).public Field getDeclaredField(String fieldName):获取某个字段(可以是私有的)
 * 
 * 	 设置字段的值：
 * 		Field --> public void set(Object obj,Object value):
 * 					参数说明：
 * 					1.obj:要设置的字段所在的对象；
 * 					2.value:要为字段设置的值；
 */
public class Test2 {
	public static void main(String[] args) throws Exception{
		//获取Class对象
		Class c = Class.forName("com.reflect.User");
		
		System.out.println("获取所有公有字段");
		Field [] field = c.getFields();
		for(Object a:field) {
			System.out.println(a);
		}
		
		System.out.println("获取所有字段");
		field = c.getDeclaredFields();
		for(Object b:field) {
			System.out.println(b);
		}
		
		System.out.println("获取公有字段并调用");
		Field f = c.getField("name");
		System.out.println(f);
		//获取一个对象
		Object obj = c.getConstructor().newInstance();
		f.set(obj, "高中鑫");
		//验证
		User user = (User)obj;
		System.out.println("姓名："+user.name);
		
		System.out.println("获取私有字段并调用");
		f = c.getDeclaredField("phoneNum");
		System.out.println(f);
		f.setAccessible(true);
		f.set(obj, "110");
		System.out.println("电话："+user);
	}
	
}
