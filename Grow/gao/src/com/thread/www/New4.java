package com.thread.www;
/**
 * �߳�ͬ�������
 * @author grow
 *��һ��
 */
public class New4 {
	public static void main(String[] args) {
		MyThread1 m = new MyThread1();
		Thread t1 = new Thread(m, "����һ");
		Thread t2 = new Thread(m, "���ڶ�");
		Thread t3 = new Thread(m, "������");
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
						System.out.println(Thread.currentThread().getName()+"����һ�ţ���ʣ��"+--a+"��");
					} else {
						System.out.println("������");
						System.exit(0);
					}
				}
			}
		}
	}
