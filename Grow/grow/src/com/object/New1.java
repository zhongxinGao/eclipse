package com.object;
/**
 * 
 * @author grow
 *��̬
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
			System.out.println("����");
		}
	}
	class Teacher extends Person{
		public void work() {
			System.out.println("��ʦ����");
		}
	}
	class Student extends Person{
		public void work() {
			System.out.println("ѧ���Ͽ�");
		}
	}