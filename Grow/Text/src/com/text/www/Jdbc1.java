package com.text.www;
/**
 * �������ݿ�����
 * @author grow
 *
 */
public class Jdbc1 {
	public static void main(String[] args) {
		try {
			//������com.mysql.jdbc.Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("���ݿ��������سɹ�");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
