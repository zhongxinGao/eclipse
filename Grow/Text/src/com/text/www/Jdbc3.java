package com.text.www;

import java.sql.*;

public class Jdbc3 {
	public static void main(String[] args) {
		try {
			//1、加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			//建立连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "131516");
														//"jdbc:mysql://localhost:3306/person"
			//创建一个执行SQL语句所需对象
			Statement statement = conn.createStatement();
			
			//执行SQL语句操作
			statement.executeUpdate("insert into person_information(p_id, p_name, p_address, p_age, p_sex, p_phone) values(3, 8, 7, 6, 5, 4)");
			
					
			//关闭数据库连接
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
