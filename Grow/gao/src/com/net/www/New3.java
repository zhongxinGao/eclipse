package com.net.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 基于Socket的客户端程序
 * @author grow
 *
 */
public class New3 {
	public static void main(String[] args) {
		try {
			//通过本机地址172.0.0.1和端口4008建立客户端Socket对象
			Socket client = new Socket("172.0.0.1", 4008);
			//由系统标准输入创建BufferedReader对象
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			//由Socket输入流创建BufferedReader对象
			BufferedReader is = new BufferedReader(new InputStreamReader(client.getInputStream()));
			//由socket输出流创建PrintWriter对象
			PrintWriter os = new PrintWriter(client.getOutputStream());
			String sMsg;
			sMsg = sin.readLine();
			while(!sMsg.equals("bye")) {
				os.println(sMsg);
				os.flush();//刷新输出流
				System.out.println("我："+sMsg);
				System.out.println("服务器："+is.readLine());
				sMsg = sin.readLine();//继续从标准输入设备输入
				
				
			}
			System.out.println("通话结束");
			os.close();//关闭输出流
			is.close();//关闭输入流
			client.close();//关闭端口
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
