package com.text.www;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输出流
 * @author grow
 *
 */
public class Io3 {
	public static void main(String[] args) {
		try {
		//创建源
		File f = new File("d:/lol2.txt");
				
				//选择流
				FileOutputStream fos = new FileOutputStream(f);
				
				//操作
				byte [] a = {66, 99};
				fos.write(a);
				
				//释放资源
				fos.close();
				} catch (FileNotFoundException e) {
				//
					e.printStackTrace();
				} catch(IOException e) {
					e.printStackTrace();
				}
	}
}
