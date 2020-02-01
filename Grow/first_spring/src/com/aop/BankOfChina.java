package com.aop;

public class BankOfChina {
	public void systemRun() {
		
		try {
			System.out.println("系统正在运行");
			Thread.sleep(3000);
			System.out.println("退出系统");
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
