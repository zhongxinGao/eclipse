package com.data;
/**
 * 
 * @author grow
 *�򵥵ĵݹ�
 */
public class New4 {
	public static void main(String[] args) {
		printTen(1);
	}
	public static void printTen(int n) {
		if(n>10) {
			return;
		}
		System.out.println(n);
		//�ݹ���
		printTen(n+1);
	}
}
