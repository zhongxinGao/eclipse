package array;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		//静态初始化二维数组
		int [][] a = {{1,23,5},{2,4,7}};
		//动态初始化二维数组
		int [][] b = new int [2][];
		b[0] = new int [] {1,2};
		b[1] = new int [] {3,4};
		
		//二维数组储存
		int [] m = {1,2,3};
		int [] n = {4,5,6};
		int [][] j = new int [2][];
		j[0] = m;
		j[1] = n;
		System.out.println(j[1][2]);
		
		//遍历二维数组一
		for(int[] i:a) {
			for(int c:i) {
				System.out.println(c);
			}
		}
		//遍历二维数组二
		for(int[] i:a) {
			System.out.println(Arrays.toString(i));
		}
	}
}
