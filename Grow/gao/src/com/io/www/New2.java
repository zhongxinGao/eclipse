package com.io.www;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 * �ֽ������
 * @author grow
 *
 */
public class New2 {
	public static void main(String[] args) throws IOException {
		//����Դ
		File f = new File("d:/zhang.txt");
		
			//ѡ����
		FileOutputStream o = new FileOutputStream(f);
		//����
		String s = "δ������";
		byte[] b = s.getBytes();
		for (int i = 0; i < b.length; i++) {
			
				o.write(b[i]);
		}
		    o.close();
		
		
		
	}
}

