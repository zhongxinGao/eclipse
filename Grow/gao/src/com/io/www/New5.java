package com.io.www;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class New5 {
	public static void main(String[] args) {
		File f = new File("d:/b.txt");
		
		//ѡ����
		try {
			FileReader r = new FileReader(f);
			
			//����
			int i ;
			try {
				while((i=r.read())!=-1) {//�ж��Ƿ��ȡ���ļ�ĩβ
					System.out.print((char)i);
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
