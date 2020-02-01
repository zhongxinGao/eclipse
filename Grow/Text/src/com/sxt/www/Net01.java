package com.sxt.www;

import java.net.*;
/**
 * 
 * @author grow
 *
 */
public class Net01 {
	public static void main(String[] args) throws UnknownHostException {
		//使用getLocalHost创建InetAddress对象
		InetAddress add = InetAddress.getLocalHost();
		System.out.println(add.getHostAddress());//返回主机名
		System.out.println(add.getHostName());//返回IP地址
		
		//根据域名获得InetAddress对象
		add = InetAddress.getByName("www.baidu.com");
		System.out.println(add.getHostAddress());//返回百度服务器IP
		System.out.println(add.getHostName());
	}
}
