package com.jdbc.www;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class New2 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		
		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student?characterEncoding=UTF-8", "root", "131516");
			
			Statement s = c.createStatement();
			String sql = "insert into student values ('3', 'ÕÅ', 'Å®', '789', 'ËÄ´¨')";
			 s.executeUpdate(sql);
			 c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
