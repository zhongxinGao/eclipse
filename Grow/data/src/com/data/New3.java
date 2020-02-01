package com.data;

import java.util.Arrays;

/**
 * 
 * @author grow
 *插入排序
 */
public class New3 {
	public static void main(String[] args) {
		int [] a = {33, 1, 22, 44, 99, 3, 66, 21, 91, 36};
		for (int i = 1; i < a.length; i++) {
			//定义待插入的数
			int insertValue = a[i];
			//找到待插入数的前一个数的下标
			int insertIndex = i-1;
			while(insertIndex >= 0 && insertValue < a[insertIndex]) {
				a[insertIndex + 1] = a[insertIndex];
				insertIndex--;
			}
			a[insertIndex + 1] = insertValue;
		}
		System.out.println(Arrays.toString(a));
	}
}
