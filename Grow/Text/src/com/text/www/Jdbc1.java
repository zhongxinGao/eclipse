package com.text.www;
/**
 * 加载数据库驱动
 * @author grow
 *
 */
public class Jdbc1 {
	public static void main(String[] args) {
		try {
			//驱动类com.mysql.jdbc.Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("数据库驱动加载成功");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
