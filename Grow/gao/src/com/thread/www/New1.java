package com.thread.www;
/**
 * 创建线程的两种方式
 * @author grow
 *
 */
public class New1 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1("儿童窗口");
		Thread1 t2 = new Thread1("成人窗口");
		Thread1 t3 = new Thread1("爱心窗口");
		t1.start();
		t2.start();
		t3.start();
		
		Thread2 r1 = new Thread2("机动车道");
		Thread2 r2 = new Thread2("非机动车道");
		Thread2 r3 = new Thread2("公交车道");
		Thread h1 = new Thread(r1);
		Thread h2 = new Thread(r2);
		Thread h3 = new Thread(r3);
		h1.start();
		h2.start();
		h3.start();
	}
}
	
	//继承Thread类，实现run方法
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
				System.out.println(a-- + "这里是："+Thread.currentThread().getName());
			}
		}
	}
	
	//实现Runnable接口，重写run方法
	class Thread2 implements Runnable{
		private int b = 10;
		private String name;
		public Thread2 (String name) {
			this.name = name;
		}
		public void run() {
			while(b>0) {
				System.out.println(b-- +"这里是："+name);
			}
		}
	}