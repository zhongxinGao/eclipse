package com.api;

import java.util.Random;

public class New8 {
	public static void main(String[] args) {
		String a = "һԪ,��Ԫ,��Ԫ,ʮԪ,лл�ݹ�";
		String[] b = a.split(",");
		Random r = new Random();
		int c = r.nextInt(5);
		System.out.println("��Ʒ�ǣ�"+b[c]);
	}
}
