package com.jdbc.www;


import java.sql.*;

public class Test {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("驱动加载成功");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssmdemo", "root", "131516");
			System.out.println("连接成功");
			
			Statement s = c.createStatement();
			
			ResultSet r = s.executeQuery("select * from tb_user");
			
			while(r.next()) {
				int id = r.getInt("id");
				String name = r.getString("user_name");
				String password = r.getString("password");
				int age = r.getInt("age");
				int sex = r.getInt("sex");
				
				System.out.print("ID："+id);
				System.out.print(",name："+name);
				System.out.print(",password："+password);
				System.out.print(",age："+age);
				System.out.print(",sex："+sex);
				System.out.println("\n");
				
				
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
