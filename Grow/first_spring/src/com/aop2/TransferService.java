package com.aop2;

public interface TransferService {
	//��ҵ���߼���ת��
	void transfer();
	
}
	 class Runtime implements TransferService{
		@Override
		public void transfer() {
			System.out.println("���ת��ҵ��");
		}
	}
