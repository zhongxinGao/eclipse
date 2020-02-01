package array;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		//静态初始化
		int[] a = {1,2,5,66};
		//动态初始化
		int [] b = new int [3];
		b[0] = 5;
		b[1] = 7;
		b[2] = 9;
		
		//遍历数组一
		System.out.println(Arrays.toString(a));
		//遍历数组二
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.println();
		}
		//遍历数组三
		for(int c:a) {
			System.out.print(c);
		}
	}
}
