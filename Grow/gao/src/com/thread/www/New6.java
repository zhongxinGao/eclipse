package com.thread.www;

public class New6 {
	public static void main(String[] args) {
		TicketWindow t = new TicketWindow();
		Thread t1 = new Thread(t, "窗口一");
		Thread t2 = new Thread(t, "窗口二");
		Thread t3 = new Thread(t, "窗口三");
		t1.start();
		t2.start();
		t3.start();
	}
}
	class TicketWindow implements Runnable{
		private int tickets = 2;
		public void run() {
			while(true) {
				try {
					this.sale();
					Thread.sleep(600);
					this.cancel();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		public synchronized void cancel() {
			System.out.println(Thread.currentThread().getName()+"准备退票");
			tickets++;
			notifyAll();
			
		}
		public  synchronized void sale() {
			if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"准备出票，还剩"+tickets+"张");
			} else {
				System.out.println("余票不足，暂停出售");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
