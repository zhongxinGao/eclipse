package com.sxt.www;
import java.net.*;
public class Net02 {
	public static void main(String[] args) {
		
	InetSocketAddress sa = new InetSocketAddress("localhose", 9000);
	System.out.println(sa.getPort());
	System.out.println(sa.getHostName());
	System.out.println(sa.getAddress());
	}
}
