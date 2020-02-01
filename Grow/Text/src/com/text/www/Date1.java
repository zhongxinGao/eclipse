package com.text.www;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		System.out.println(d.toString());
		System.out.println(System.currentTimeMillis());
		
		//∏Ò ΩªØ
		SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss sss");
		String s1 = s.format(d);
		System.out.println(s1);
		
		
	}
}
