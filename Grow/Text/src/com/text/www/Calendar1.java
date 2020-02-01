package com.text.www;

import java.util.Calendar;
import java.util.Date;

public class Calendar1 {
	public static void main(String[] args) {
		//采用单列模式获取日历对象
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		//通过日历对象得到日期
		Date d = c.getTime();
		System.out.println(d);
		
		Date d1 = new Date(0);
		c.setTime(d1);//把日历调成日期
		System.out.println(d1);
	}
}
