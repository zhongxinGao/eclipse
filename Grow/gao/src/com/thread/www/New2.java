package com.thread.www;
/**
 * ���̹߳�����Դ
 * @author grow
 *
 */
public class New2 {
	public static void main(String[] args) {
		Thread3 t = new Thread3();
		Thread t1 = new Thread(t, "��ͯ����");
		Thread t2 = new Thread(t, "���˴���");
		Thread t3 = new Thread(t, "���Ĵ���");
		
		t1.start();
		
		t2.start();
		
		t3.start();
	}
}
	class Thread3 implements Runnable {
		private int a = 10;
		public void run() {
			while(a>0) {
				
				System.out.println(--a +"������"+Thread.currentThread().getName());
			}
		}
	}
