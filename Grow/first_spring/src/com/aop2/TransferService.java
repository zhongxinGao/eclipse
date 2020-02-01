package com.aop2;

public interface TransferService {
	//主业务逻辑，转账
	void transfer();
	
}
	 class Runtime implements TransferService{
		@Override
		public void transfer() {
			System.out.println("完成转账业务");
		}
	}
