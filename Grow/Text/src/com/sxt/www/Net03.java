package com.sxt.www;
import java.net.*;
public class Net03 {
	public static void main(String[] args) throws MalformedURLException {
		URL u = new URL("http://www.baidu.com:80/index.html?uname=shsxt&age=18#a");
		System.out.println(u.getProtocol());//Э��
		System.out.println(u.getHost());//����
		System.out.println(u.getPort());//�˿�
		System.out.println(u.getPath());//·��
	}
}
