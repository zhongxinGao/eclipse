package com.io.www;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * �ļ��ַ������
 * @author grow
 *
 */
public class New4 {
	public static void main(String[] args) throws IOException {
		File f = new File("d:/b.txt");
		f.createNewFile();
		
		//ѡ����
		FileWriter w = new FileWriter(f);
		
		//����
		String a= "i love java";
		w.write(a);//���ַ�����д���ı�
		
		//�ر���Դ
		w.close();
	}
}
