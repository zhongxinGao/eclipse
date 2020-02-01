package com.net.www;
/**
 * 基于Socket的服务端程序
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
			//创建服务器端对象erversockt,端口位4008
			ServerSocket serversocket = new ServerSocket(4008);
			System.out.println("服务器已经启动");
			//调用accept方法在服务器端监听客户端发出请求的Socket对象
			Socket server = serversocket.accept();
			String sMsg;
			//由系统标准输入创建BufferedReader(带缓冲区的字符输入流)对象
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			//由Socket输入流创建BufferReader对象
			BufferedReader is = new BufferedReader(new InputStreamReader(server.getInputStream()));
			//由Socket输出流对象创建PrintWriter对象
			PrintWriter os = new PrintWriter(server.getOutputStream());
			System.out.println("客户："+is.readLine());
			sMsg = sin.readLine();//从标准输入设备接收用户输入的信息
			//循环条件判断如果输入的不是bye，继续和客户端通信
			while(!sMsg.equals("bye")) {
				os.println(sMsg);
				os.flush();//刷新输出流
				System.out.println("我："+sMsg);
				System.out.println("客户："+is.readLine());
				sMsg = sin.readLine();//继续送标注输入设备输入
			}
			System.out.println("结束通话");
			os.close();//关闭输出流
			is.close();//关闭输入流
			server.close();//关闭端口
			serversocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
