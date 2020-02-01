package com.reflect;

public class Car {
	public static void main(String[] args) throws Exception{
		Car c = new Car();
		
		Class c1 = Car.class;
		System.out.println(c1.hashCode());
		
		Class c2 = c.getClass();
		System.out.println(c2.hashCode());
		
		Class c3 = Class.forName("com.reflect.Car");
		System.out.println(c3.hashCode());
	}
}
