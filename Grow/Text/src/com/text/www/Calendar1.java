package com.text.www;

import java.util.Calendar;
import java.util.Date;

public class Calendar1 {
	public static void main(String[] args) {
		//���õ���ģʽ��ȡ��������
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		//ͨ����������õ�����
		Date d = c.getTime();
		System.out.println(d);
		
		Date d1 = new Date(0);
		c.setTime(d1);//��������������
		System.out.println(d1);
	}
}
