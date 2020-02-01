package com.jdbc.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class New3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			try {
				Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student?characterEncoding=UTF-8", "root", "131516");
				String sql = "insert into teacher (id, name, address) value (?, ?, ?)";
				PreparedStatement p = c.prepareStatement(sql);
				p.setInt(1, 1);
				p.setString(2, "²Ô");
				p.setString(3, "japen");
				
				p.executeUpdate();
				
				c.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
