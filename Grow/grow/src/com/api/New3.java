package com.api;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author grow
 *��ʽ������
 */
public class New3 {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(s.format(d));
	}
}
