package com.net.www;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress类常用方法
 * @author grow
 *
 */
public class New1 {
	public static void main(String[] args) {
		try {
			InetAddress i = InetAddress.getLocalHost();
			System.out.println("本地主机："+i);
			System.out.println("本机名称："+i.getHostName());
			System.out.println("本机IP："+i.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
