package com.reflect;

public class User {
	public String name;
	protected int age;
	char sex;
	private String phoneNum;
	
	//默认构造方法
	 User(String s) {
		System.out.println("默认构造方法"+s);
	}
	//无参构造方法
	public  User() {
		
	}
	
	//有一个参数的构造方法
	public  User(char name) {
		System.out.println("姓名："+name);
	}
	
	//有多个构造方法
	public  User (String name, int age) {
		System.out.println("姓名" + name+"年龄"+age);
	}
	
	//受保护的构造方法
	protected  User(boolean n) {
		System.out.println("受保护的构造方法");
	}
	
	//私有的构造方法
	private User(int age) {
		System.out.println("私有的构造方法");
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", sex=" + sex + ", phoneNum=" + phoneNum + "]";
	}
	
	public void show1(String s){
		System.out.println("调用了：公有的，String参数的show1(): s = " + s);
	}
	protected void show2(){
		System.out.println("调用了：受保护的，无参的show2()");
	}
	void show3(){
		System.out.println("调用了：默认的，无参的show3()");
	}
	private String show4(int age){
		System.out.println("调用了，私有的，并且有返回值的，int参数的show4(): age = " + age);
		return "abcd";

	}
}	
