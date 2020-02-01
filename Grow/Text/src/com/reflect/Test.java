package com.reflect;

public class Test {
	public static void main(String[] args)throws Exception {	
	User user = new User();
	
	Class c1 = user.getClass();
	System.out.println(c1.hashCode());
	
	Class c2 = User.class;
	System.out.println(c2.hashCode());
	
	Class c3 = Class.forName("com.reflect.User");
	System.out.println(c3.hashCode());
	}
}
