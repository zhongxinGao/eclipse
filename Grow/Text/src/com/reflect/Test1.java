package com.reflect;

import java.lang.reflect.Constructor;

/**
 * 1.获取构造方法：
 * 		1).批量的方法：
 * 			public Constructor[] getConstructors()：所有"公有的"构造方法
            public Constructor[] getDeclaredConstructors()：获取所有的构造方法(包括私有、受保护、默认、公有)
     
 * 		2).获取单个的方法，并调用：
 * 			public Constructor getConstructor(Class... parameterTypes):获取单个的"公有的"构造方法：
 * 			public Constructor getDeclaredConstructor(Class... parameterTypes):获取"某个构造方法"可以是私有的，或受保护、默认、公有；
 * 		
 * 			调用构造方法：
 * 			Constructor-->newInstance(Object... initargs)
 * @author grow
 *
 */
public class Test1 {
	public static void main(String[] args)throws Exception {
		//加载Class对象
		Class c = Class.forName("com.reflect.User");
		
		//获取公有构造方法
		System.out.println("所有公有构造方法");
		Constructor[] con = c.getConstructors();
		for(Object a:con) {
			System.out.println(a);
		}
		
		//所有构造方法
		System.out.println("所有构造方法");
		con = c.getDeclaredConstructors();
		for(Object b:con) {
			System.out.println(b);
		}
		
		//获取公有无参构造方法
		Constructor cons = c.getConstructor(null);
		System.out.println("con+"+cons);
		
		
		//调用构造方法
		Object obj = cons.newInstance();
		
		System.out.println("obj"+obj);
		User user = (User)obj;
		
		//获取私有构造方法并调用
		cons = c.getDeclaredConstructor(char.class);
		System.out.println(cons);
		//调用构造方法
		cons.setAccessible(true);
		obj = cons.newInstance('男');
	}
}
