package com.net.www;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress�ೣ�÷���
 * @author grow
 *
 */
public class New1 {
	public static void main(String[] args) {
		try {
			InetAddress i = InetAddress.getLocalHost();
			System.out.println("����������"+i);
			System.out.println("�������ƣ�"+i.getHostName());
			System.out.println("����IP��"+i.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
