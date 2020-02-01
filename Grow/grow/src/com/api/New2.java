package com.api;

import java.util.Calendar;

public class New2 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//获取年
		int year = c.get(Calendar.YEAR);
		//获取月
		int month = c.get(Calendar.MONTH)+1;
		//获取日
		int day = c.get(Calendar.DATE);
		//获取小时
		int hour = c.get(Calendar.HOUR);
		//获取分钟
		int minute = c.get(Calendar.MINUTE);
		//获取秒
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
	}
}
