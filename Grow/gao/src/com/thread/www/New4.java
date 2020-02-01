package com.thread.www;
/**
 * 线程同步的情况
 * @author grow
 *第一种
 */
public class New4 {
	public static void main(String[] args) {
		MyThread1 m = new MyThread1();
		Thread t1 = new Thread(m, "窗口一");
		Thread t2 = new Thread(m, "窗口二");
		Thread t3 = new Thread(m, "窗口三");
		t1.start();
		t2.start();
		t3.start();
	}
}
	class MyThread1 implements Runnable {
		private int a = 5;
		public void run() {
			while(true) {
				synchronized (this) {
					if(a>0) {
						try {
							Thread.sleep(666);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+"卖出一张，还剩："+--a+"张");
					} else {
						System.out.println("卖完了");
						System.exit(0);
					}
				}
			}
		}
	}
