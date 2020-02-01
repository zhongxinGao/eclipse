package com.io.www;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/**
 * 字节输入流
 * @author grow
 *
 */
public class New3 {
	public static void main(String[] args) throws IOException{
		//创建源
		File f = new File("d:/zhang.txt");
		//选择流
		FileInputStream i = new FileInputStream(f);
		//操作
		int b = 0;
		while(b != -1) {//-1代表文件末尾
			b = i.read();//变量b记住读取的每一个字节
			System.out.println(b);
		}
		i.close();
	}
	
}
