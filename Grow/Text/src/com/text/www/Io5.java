package com.text.www;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �ַ������
 * @author grow
 *
 */
public class Io5 {
	public static void main(String[] args) {
		//����Դ
		File f = new File("d:/lol4.txt");
		
		//ѡ����
		try (FileWriter fw = new FileWriter(f)) {
		
		//����
		String s = "zhang";
		char [] c = s.toCharArray();
		fw.write(c);
		
		//�ͷ���Դ
		fw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
