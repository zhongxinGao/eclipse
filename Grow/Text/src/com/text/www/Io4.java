package com.text.www;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 * �ַ�������
 * @author grow
 *
 */
public class Io4 {
	public static void main(String[] args) {
		//����Դ
		File f = new File("d:/lol3.txt");
		
		//ѡ����
		try(FileReader fr = new FileReader(f)){
		
		//����
			char[] c = new char[(int) f.length()];//���ַ�����ʽ��ȡ
			fr.read(c);
			for(Object o:c) {
				System.out.println(o);
			}
			
			//�ͷ���Դ
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
