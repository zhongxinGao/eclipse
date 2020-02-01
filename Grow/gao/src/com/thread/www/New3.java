package com.thread.www;
/**
 * 没有同步的情况
 * @author grow
 *
 */
public class New3 {
	public static void main(String[] args) {
		MyThread m = new MyThread();
		Thread t1 = new Thread(m, "窗口一");
		Thread t2 = new Thread(m, "窗口二");
		Thread t3 = new Thread(m, "窗口三");
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
				System.out.println(Thread.currentThread().getName()+"卖掉一张，剩余"+--a+"张");
			}
			
		}
	}