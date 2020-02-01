package com.jdbc.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class New1 {
	public static void main(String[] args) {
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//连接数据库
			//										   "jdbc.mysql://localhost:3306/java"
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "131516");
			//创建一个执行SQL的对象                                                                 "jdbc:mysql://localhost:3306/java"
			Statement s = c.createStatement();
			//执行SQL excuterUpdate 用于增删查改
			ResultSet r = s.executeQuery("select * from student where st_no = 1");
			
			while(r.next()) {
				System.out.print(r.getString("st_no")+" ");
				System.out.print(r.getString("st_name")+" ");
				System.out.print(r.getString("sex")+ " ");
				System.out.print(r.getString("tel")+ " ");
				System.out.print(r.getString("address")+" ");
			}
			//关闭连接
			r.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
