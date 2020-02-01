package com.io.www;

import java.io.File;
import java.io.IOException;

public class New1 {
	public static void main(String[] args) {
		File f = new File("d:/1.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
