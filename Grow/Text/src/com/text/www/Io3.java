package com.text.www;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ֽ������
 * @author grow
 *
 */
public class Io3 {
	public static void main(String[] args) {
		try {
		//����Դ
		File f = new File("d:/lol2.txt");
				
				//ѡ����
				FileOutputStream fos = new FileOutputStream(f);
				
				//����
				byte [] a = {66, 99};
				fos.write(a);
				
				//�ͷ���Դ
				fos.close();
				} catch (FileNotFoundException e) {
				//
					e.printStackTrace();
				} catch(IOException e) {
					e.printStackTrace();
				}
	}
}
