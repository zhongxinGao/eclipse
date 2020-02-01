package com.thread.www;

public class New6 {
	public static void main(String[] args) {
		TicketWindow t = new TicketWindow();
		Thread t1 = new Thread(t, "����һ");
		Thread t2 = new Thread(t, "���ڶ�");
		Thread t3 = new Thread(t, "������");
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
			System.out.println(Thread.currentThread().getName()+"׼����Ʊ");
			tickets++;
			notifyAll();
			
		}
		public  synchronized void sale() {
			if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"׼����Ʊ����ʣ"+tickets+"��");
			} else {
				System.out.println("��Ʊ���㣬��ͣ����");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
