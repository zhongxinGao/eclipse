package com.text.www;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流
 * @author grow
 *
 */
public class Io5 {
	public static void main(String[] args) {
		//创建源
		File f = new File("d:/lol4.txt");
		
		//选择流
		try (FileWriter fw = new FileWriter(f)) {
		
		//操作
		String s = "zhang";
		char [] c = s.toCharArray();
		fw.write(c);
		
		//释放资源
		fw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
