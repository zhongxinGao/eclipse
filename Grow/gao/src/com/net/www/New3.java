package com.net.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ����Socket�Ŀͻ��˳���
 * @author grow
 *
 */
public class New3 {
	public static void main(String[] args) {
		try {
			//ͨ��������ַ172.0.0.1�Ͷ˿�4008�����ͻ���Socket����
			Socket client = new Socket("172.0.0.1", 4008);
			//��ϵͳ��׼���봴��BufferedReader����
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			//��Socket����������BufferedReader����
			BufferedReader is = new BufferedReader(new InputStreamReader(client.getInputStream()));
			//��socket���������PrintWriter����
			PrintWriter os = new PrintWriter(client.getOutputStream());
			String sMsg;
			sMsg = sin.readLine();
			while(!sMsg.equals("bye")) {
				os.println(sMsg);
				os.flush();//ˢ�������
				System.out.println("�ң�"+sMsg);
				System.out.println("��������"+is.readLine());
				sMsg = sin.readLine();//�����ӱ�׼�����豸����
				
				
			}
			System.out.println("ͨ������");
			os.close();//�ر������
			is.close();//�ر�������
			client.close();//�رն˿�
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
