package com.thread.www;

public class New5 {
	public static void main(String[] args) {
		Thread5 t = new Thread5();
		Thread t1 = new Thread(t, "窗口一");
		Thread t2 = new Thread(t, "窗口二");
		Thread t3 = new Thread(t, "窗口三");
		t1.start();
		t2.start();
		t3.start();
	}
}
	class Thread5 implements Runnable{
		private int a = 9;
		public void run() {
			while(true) {
				try {
					Thread.sleep(666);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sell();
			}
		}
			
			public synchronized void sell() {
				if(a>0) {
					try {
						Thread.sleep(666);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					
				}
					System.out.println(Thread.currentThread().getName()+"卖出了一张，还剩"+--a+"张");
				}else {
					System.out.println("卖完了");
					System.exit(0);
			}
		}
	}
