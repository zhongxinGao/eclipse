package com.aop;

public class BankOfChina {
	public void systemRun() {
		
		try {
			System.out.println("ϵͳ��������");
			Thread.sleep(3000);
			System.out.println("�˳�ϵͳ");
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
