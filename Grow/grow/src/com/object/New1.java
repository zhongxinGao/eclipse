package com.object;
/**
 * 
 * @author grow
 *多态
 */
public class New1 {
	public static void main(String[] args) {
		Person p1 = new Teacher();
		p1.work();
		Person p2 = new Student();
		p2.work();
	}
}
	class Person{
		public void work() {
			System.out.println("工作");
		}
	}
	class Teacher extends Person{
		public void work() {
			System.out.println("老师教书");
		}
	}
	class Student extends Person{
		public void work() {
			System.out.println("学生上课");
		}
	}