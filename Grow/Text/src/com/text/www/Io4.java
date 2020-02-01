package com.text.www;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 * 字符输入流
 * @author grow
 *
 */
public class Io4 {
	public static void main(String[] args) {
		//创建源
		File f = new File("d:/lol3.txt");
		
		//选择流
		try(FileReader fr = new FileReader(f)){
		
		//操作
			char[] c = new char[(int) f.length()];//以字符流形式读取
			fr.read(c);
			for(Object o:c) {
				System.out.println(o);
			}
			
			//释放资源
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
