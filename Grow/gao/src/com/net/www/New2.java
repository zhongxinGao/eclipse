package com.net.www;
/**
 * ����Socket�ķ���˳���
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class New2 {
	public static void main(String[] args) {
		try {
			//�����������˶���erversockt,�˿�λ4008
			ServerSocket serversocket = new ServerSocket(4008);
			System.out.println("�������Ѿ�����");
			//����accept�����ڷ������˼����ͻ��˷��������Socket����
			Socket server = serversocket.accept();
			String sMsg;
			//��ϵͳ��׼���봴��BufferedReader(�����������ַ�������)����
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			//��Socket����������BufferReader����
			BufferedReader is = new BufferedReader(new InputStreamReader(server.getInputStream()));
			//��Socket��������󴴽�PrintWriter����
			PrintWriter os = new PrintWriter(server.getOutputStream());
			System.out.println("�ͻ���"+is.readLine());
			sMsg = sin.readLine();//�ӱ�׼�����豸�����û��������Ϣ
			//ѭ�������ж��������Ĳ���bye�������Ϳͻ���ͨ��
			while(!sMsg.equals("bye")) {
				os.println(sMsg);
				os.flush();//ˢ�������
				System.out.println("�ң�"+sMsg);
				System.out.println("�ͻ���"+is.readLine());
				sMsg = sin.readLine();//�����ͱ�ע�����豸����
			}
			System.out.println("����ͨ��");
			os.close();//�ر������
			is.close();//�ر�������
			server.close();//�رն˿�
			serversocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
