package com.reflect;

import java.lang.reflect.Method;

/**
 * 
 * @author grow
 *获取成员方法并调用：
 * 
 * 1.批量的：
 * 		public Method[] getMethods():获取所有"公有方法"；（包含了父类的方法也包含Object类）
 * 		public Method[] getDeclaredMethods():获取所有的成员方法，包括私有的(不包括继承的)
 * 2.获取单个的：
 * 		public Method getMethod(String name,Class<?>... parameterTypes):
 * 					参数：
 * 						name : 方法名；
 * 						Class ... : 形参的Class类型对象
 * 		public Method getDeclaredMethod(String name,Class<?>... parameterTypes)
 * 
 * 	 调用方法：
 * 		Method --> public Object invoke(Object obj,Object... args):
 * 					参数说明：
 * 					obj : 要调用方法的对象；
 * 					args:调用方式时所传递的实参；
 */
public class Test3 {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("com.reflect.User");
				System.out.println("所有的公有方法");
				c.getMethods();
				Method [] me = c.getMethods();
				for(Object a:me) {
					System.out.println(a);
				}
				
				System.out.println("获取所有的方法");
				me = c.getDeclaredMethods();
				for(Object b:me) {
					System.out.println(b);
				}
					
				System.out.println("获取公有的show1方法");
				Method m = c.getMethod("show1", String.class);
				System.out.println(m);
				//实列化一个对象
				Object obj = c.getConstructor().newInstance();
				m.invoke(obj, "高中鑫");
				
				
				System.out.println("获取私有的show4方法");
				 m = c.getDeclaredMethod("show4", int.class);
				System.out.println(m);
				m.setAccessible(true);//解除私有限定
				Object result  = m.invoke(obj, 21);
				System.out.println("返回值"+result);
	}
}
