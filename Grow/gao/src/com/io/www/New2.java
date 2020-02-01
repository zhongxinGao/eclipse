package com.io.www;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 字节输出流
 * @author grow
 *
 */
public class New2 {
	public static void main(String[] args) throws IOException {
		//创建源
		File f = new File("d:/zhang.txt");
		
			//选择流
		FileOutputStream o = new FileOutputStream(f);
		//操作
		String s = "未来可期";
		byte[] b = s.getBytes();
		for (int i = 0; i < b.length; i++) {
			
				o.write(b[i]);
		}
		    o.close();
		
		
		
	}
}

