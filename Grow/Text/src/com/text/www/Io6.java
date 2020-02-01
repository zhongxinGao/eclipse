package com.text.www;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * ��������
 * @author grow
 *
 */
public class Io6 {
	public static void main(String[] args) {
		
		//ʹ��FileInputStream��ȡ����
		
		//����Դ
		File f = new File("d:/z.txt");
		
		//ѡ����
		try {
			FileInputStream fi = new FileInputStream(f);
		
		//����
		byte[] b = new byte[(int) f.length()];
		fi.read(b);
		String s = new String(b, "utf8");
		System.out.println(s);
		
		//�ͷ���Դ
		fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//��FileReader�ַ�����ȡ����
		//����Դ
		File f1 = new File("d:/z.txt");
		
		//ѡ����
		try {
			FileReader fr = new FileReader(f1);
		
		//����
		
		System.out.println("Ĭ�ϱ���"+Charset.defaultCharset());
		InputStreamReader isr = new InputStreamReader(new FileInputStream(f1), Charset.forName("utf8"));
		char [] c = new char[(int) f1.length()];
		isr.read(c);
		System.out.println();
		System.out.println(new String(c));
		
		//�ͷ���Դ
		isr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
