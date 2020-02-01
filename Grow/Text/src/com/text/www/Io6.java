package com.text.www;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * 中文问题
 * @author grow
 *
 */
public class Io6 {
	public static void main(String[] args) {
		
		//使用FileInputStream读取中文
		
		//创建源
		File f = new File("d:/z.txt");
		
		//选择流
		try {
			FileInputStream fi = new FileInputStream(f);
		
		//操作
		byte[] b = new byte[(int) f.length()];
		fi.read(b);
		String s = new String(b, "utf8");
		System.out.println(s);
		
		//释放资源
		fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//用FileReader字符流读取中文
		//创建源
		File f1 = new File("d:/z.txt");
		
		//选择流
		try {
			FileReader fr = new FileReader(f1);
		
		//操作
		
		System.out.println("默认编码"+Charset.defaultCharset());
		InputStreamReader isr = new InputStreamReader(new FileInputStream(f1), Charset.forName("utf8"));
		char [] c = new char[(int) f1.length()];
		isr.read(c);
		System.out.println();
		System.out.println(new String(c));
		
		//释放资源
		isr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
