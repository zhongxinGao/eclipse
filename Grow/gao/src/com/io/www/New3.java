package com.io.www;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/**
 * �ֽ�������
 * @author grow
 *
 */
public class New3 {
	public static void main(String[] args) throws IOException{
		//����Դ
		File f = new File("d:/zhang.txt");
		//ѡ����
		FileInputStream i = new FileInputStream(f);
		//����
		int b = 0;
		while(b != -1) {//-1�����ļ�ĩβ
			b = i.read();//����b��ס��ȡ��ÿһ���ֽ�
			System.out.println(b);
		}
		i.close();
	}
	
}
