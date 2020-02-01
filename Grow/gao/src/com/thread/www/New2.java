package com.thread.www;
/**
 * 多线程共享资源
 * @author grow
 *
 */
public class New2 {
	public static void main(String[] args) {
		Thread3 t = new Thread3();
		Thread t1 = new Thread(t, "儿童窗口");
		Thread t2 = new Thread(t, "成人窗口");
		Thread t3 = new Thread(t, "爱心窗口");
		
		t1.start();
		
		t2.start();
		
		t3.start();
	}
}
	class Thread3 implements Runnable {
		private int a = 10;
		public void run() {
			while(a>0) {
				
				System.out.println(--a +"这里是"+Thread.currentThread().getName());
			}
		}
	}
