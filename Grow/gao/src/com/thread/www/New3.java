package com.thread.www;
/**
 * û��ͬ�������
 * @author grow
 *
 */
public class New3 {
	public static void main(String[] args) {
		MyThread m = new MyThread();
		Thread t1 = new Thread(m, "����һ");
		Thread t2 = new Thread(m, "���ڶ�");
		Thread t3 = new Thread(m, "������");
		t1.start();
		t2.start();
		t3.start();
	}
}
	class MyThread implements Runnable {
		private int a = 5;
		public void run() {
			while(a>0) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"����һ�ţ�ʣ��"+--a+"��");
			}
			
		}
	}