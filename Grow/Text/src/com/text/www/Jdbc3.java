package com.text.www;

import java.sql.*;

public class Jdbc3 {
	public static void main(String[] args) {
		try {
			//1���������ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			
			//��������
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "131516");
														//"jdbc:mysql://localhost:3306/person"
			//����һ��ִ��SQL����������
			Statement statement = conn.createStatement();
			
			//ִ��SQL������
			statement.executeUpdate("insert into person_information(p_id, p_name, p_address, p_age, p_sex, p_phone) values(3, 8, 7, 6, 5, 4)");
			
					
			//�ر����ݿ�����
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
