package com.api;

import java.util.Calendar;

public class New2 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//��ȡ��
		int year = c.get(Calendar.YEAR);
		//��ȡ��
		int month = c.get(Calendar.MONTH)+1;
		//��ȡ��
		int day = c.get(Calendar.DATE);
		//��ȡСʱ
		int hour = c.get(Calendar.HOUR);
		//��ȡ����
		int minute = c.get(Calendar.MINUTE);
		//��ȡ��
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
	}
}
