package com.text.www;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {}
	
	public void introduce() {
		System.out.println("hello my name is"+" "+this.name+" "+"this year"+" "+this.age);
	}
}
