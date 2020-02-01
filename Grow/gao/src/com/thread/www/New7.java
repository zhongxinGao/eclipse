package com.thread.www;
/**
 *使用Runnable接口创建线程池
	使用线程池中线程对象的步骤：

 1、创建线程池对象
 2、创建 Runnable 接口子类对象
 3、提交 Runnable 接口子类对象
 4、关闭线程池
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class New7 {
	public static void main(String[] args) {
		//创建线程池对象 参数五 代表有五个线程的线程池
		ExecutorService service = Executors.newFixedThreadPool(5);
		//创建Runnable线程任务对象
		Thread7 t = new Thread7();
		//从线程池中获取线程对象
		service.submit(t);
		System.out.println("------------");
		//在获取一个
		service.submit(t);
		//关闭线程池
		service.shutdown();
	}
}
	class Thread7 implements Runnable{
		public void run() {
			for (int i = 0; i <10; i++) {
				System.out.println("自定义线程在执行"+i);
			}
		}
	}
