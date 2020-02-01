package com.text.www;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 字节输入流
 * @author grow
 *
 */
public class Io2 {
	public static void main(String[] args) {
		//创建源
		File f = new File("d:/lol.txt");
		
		//选择流
		try {
			FileInputStream fi = new FileInputStream(f);
			
		//操作
			byte [] b = new byte[(int) f.length()];
			fi.read(b);//以字节流形式读取文件
			for(Object o:b) {
				System.out.println(o);
			}
			
			//释放资源
			fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
