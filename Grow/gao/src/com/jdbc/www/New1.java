package com.jdbc.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class New1 {
	public static void main(String[] args) {
		try {
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			//�������ݿ�
			//										   "jdbc.mysql://localhost:3306/java"
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "131516");
			//����һ��ִ��SQL�Ķ���                                                                 "jdbc:mysql://localhost:3306/java"
			Statement s = c.createStatement();
			//ִ��SQL excuterUpdate ������ɾ���
			ResultSet r = s.executeQuery("select * from student where st_no = 1");
			
			while(r.next()) {
				System.out.print(r.getString("st_no")+" ");
				System.out.print(r.getString("st_name")+" ");
				System.out.print(r.getString("sex")+ " ");
				System.out.print(r.getString("tel")+ " ");
				System.out.print(r.getString("address")+" ");
			}
			//�ر�����
			r.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
