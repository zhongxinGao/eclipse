package com.thread.www;
/**
 *ʹ��Runnable�ӿڴ����̳߳�
	ʹ���̳߳����̶߳���Ĳ��裺

 1�������̳߳ض���
 2������ Runnable �ӿ��������
 3���ύ Runnable �ӿ��������
 4���ر��̳߳�
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class New7 {
	public static void main(String[] args) {
		//�����̳߳ض��� ������ ����������̵߳��̳߳�
		ExecutorService service = Executors.newFixedThreadPool(5);
		//����Runnable�߳��������
		Thread7 t = new Thread7();
		//���̳߳��л�ȡ�̶߳���
		service.submit(t);
		System.out.println("------------");
		//�ڻ�ȡһ��
		service.submit(t);
		//�ر��̳߳�
		service.shutdown();
	}
}
	class Thread7 implements Runnable{
		public void run() {
			for (int i = 0; i <10; i++) {
				System.out.println("�Զ����߳���ִ��"+i);
			}
		}
	}
