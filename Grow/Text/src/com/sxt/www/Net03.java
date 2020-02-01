package com.sxt.www;
import java.net.*;
public class Net03 {
	public static void main(String[] args) throws MalformedURLException {
		URL u = new URL("http://www.baidu.com:80/index.html?uname=shsxt&age=18#a");
		System.out.println(u.getProtocol());//协议
		System.out.println(u.getHost());//域名
		System.out.println(u.getPort());//端口
		System.out.println(u.getPath());//路径
	}
}
