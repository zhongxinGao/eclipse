package com.text.www;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �ֽ�������
 * @author grow
 *
 */
public class Io2 {
	public static void main(String[] args) {
		//����Դ
		File f = new File("d:/lol.txt");
		
		//ѡ����
		try {
			FileInputStream fi = new FileInputStream(f);
			
		//����
			byte [] b = new byte[(int) f.length()];
			fi.read(b);//���ֽ�����ʽ��ȡ�ļ�
			for(Object o:b) {
				System.out.println(o);
			}
			
			//�ͷ���Դ
			fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
