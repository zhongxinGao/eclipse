package com.thread.www;
/**
 * �����̵߳����ַ�ʽ
 * @author grow
 *
 */
public class New1 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1("��ͯ����");
		Thread1 t2 = new Thread1("���˴���");
		Thread1 t3 = new Thread1("���Ĵ���");
		t1.start();
		t2.start();
		t3.start();
		
		Thread2 r1 = new Thread2("��������");
		Thread2 r2 = new Thread2("�ǻ�������");
		Thread2 r3 = new Thread2("��������");
		Thread h1 = new Thread(r1);
		Thread h2 = new Thread(r2);
		Thread h3 = new Thread(r3);
		h1.start();
		h2.start();
		h3.start();
	}
}
	
	//�̳�Thread�࣬ʵ��run����
	class Thread1 extends Thread{
		private int a = 10;
		public Thread1 (String name) {
			super(name);
		}
		public void run () {
			while(a>0) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(a-- + "�����ǣ�"+Thread.currentThread().getName());
			}
		}
	}
	
	//ʵ��Runnable�ӿڣ���дrun����
	class Thread2 implements Runnable{
		private int b = 10;
		private String name;
		public Thread2 (String name) {
			this.name = name;
		}
		public void run() {
			while(b>0) {
				System.out.println(b-- +"�����ǣ�"+name);
			}
		}
	}