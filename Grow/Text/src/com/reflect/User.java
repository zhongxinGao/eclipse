package com.reflect;

public class User {
	public String name;
	protected int age;
	char sex;
	private String phoneNum;
	
	//Ĭ�Ϲ��췽��
	 User(String s) {
		System.out.println("Ĭ�Ϲ��췽��"+s);
	}
	//�޲ι��췽��
	public  User() {
		
	}
	
	//��һ�������Ĺ��췽��
	public  User(char name) {
		System.out.println("������"+name);
	}
	
	//�ж�����췽��
	public  User (String name, int age) {
		System.out.println("����" + name+"����"+age);
	}
	
	//�ܱ����Ĺ��췽��
	protected  User(boolean n) {
		System.out.println("�ܱ����Ĺ��췽��");
	}
	
	//˽�еĹ��췽��
	private User(int age) {
		System.out.println("˽�еĹ��췽��");
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", sex=" + sex + ", phoneNum=" + phoneNum + "]";
	}
	
	public void show1(String s){
		System.out.println("�����ˣ����еģ�String������show1(): s = " + s);
	}
	protected void show2(){
		System.out.println("�����ˣ��ܱ����ģ��޲ε�show2()");
	}
	void show3(){
		System.out.println("�����ˣ�Ĭ�ϵģ��޲ε�show3()");
	}
	private String show4(int age){
		System.out.println("�����ˣ�˽�еģ������з���ֵ�ģ�int������show4(): age = " + age);
		return "abcd";

	}
}	
