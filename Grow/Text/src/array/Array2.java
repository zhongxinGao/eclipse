package array;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		//��̬��ʼ����ά����
		int [][] a = {{1,23,5},{2,4,7}};
		//��̬��ʼ����ά����
		int [][] b = new int [2][];
		b[0] = new int [] {1,2};
		b[1] = new int [] {3,4};
		
		//��ά���鴢��
		int [] m = {1,2,3};
		int [] n = {4,5,6};
		int [][] j = new int [2][];
		j[0] = m;
		j[1] = n;
		System.out.println(j[1][2]);
		
		//������ά����һ
		for(int[] i:a) {
			for(int c:i) {
				System.out.println(c);
			}
		}
		//������ά�����
		for(int[] i:a) {
			System.out.println(Arrays.toString(i));
		}
	}
}
