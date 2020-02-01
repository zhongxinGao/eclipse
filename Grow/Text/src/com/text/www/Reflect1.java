package com.text.www;
/**
 * 获取class对象的三种方式
 * 1、object --> getclass
 * 2、任何数据类型都只有一个静态的class属性
 * 3、通过class的静态方法：forname(String classname)(常用)
 * 
 * @author grow
 *在运行期间一个类只有一个class对象产生
 *通过class对象可以获取某个类中的：构造方法、成员变量、成员方法
 *
 */
public class Reflect1 {
	public static void main(String[] args) {
		Reflect1 r = new Reflect1();
		
		//第一种方式获取
		Class c1 = r.getClass();
		System.out.println(c1.hashCode());
		
		//第二种方式获取
		Class c2 = Reflect1.class;
		System.out.println(c2.hashCode());
		
		//第三种方式
		Class c3;
		try {
			c3 = Class.forName("com.text.www.Reflect1");
			System.out.println(c3.hashCode());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
