package com.sxt.www;

import java.net.*;
/**
 * 
 * @author grow
 *
 */
public class Net01 {
	public static void main(String[] args) throws UnknownHostException {
		//ʹ��getLocalHost����InetAddress����
		InetAddress add = InetAddress.getLocalHost();
		System.out.println(add.getHostAddress());//����������
		System.out.println(add.getHostName());//����IP��ַ
		
		//�����������InetAddress����
		add = InetAddress.getByName("www.baidu.com");
		System.out.println(add.getHostAddress());//���ذٶȷ�����IP
		System.out.println(add.getHostName());
	}
}
