package com.io.www;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 文件字符输出流
 * @author grow
 *
 */
public class New4 {
	public static void main(String[] args) throws IOException {
		File f = new File("d:/b.txt");
		f.createNewFile();
		
		//选择流
		FileWriter w = new FileWriter(f);
		
		//操作
		String a= "i love java";
		w.write(a);//将字符数据写入文本
		
		//关闭资源
		w.close();
	}
}
