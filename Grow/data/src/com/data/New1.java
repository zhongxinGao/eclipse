package com.data;

import java.util.Arrays;

/**
 * 
 * @author grow
 *冒泡排序
 */
public class New1 {
	public static void main(String[] args) {
		int [] a  = {1, 3, 111, 101, 66, 99, 77, 5, 33, 22 }; 
		int [] g  = {1, 3, 111, 101, 66, 99, 77, 5, 33, 22 }; 
		//统计比较次数
		int b = 0;
		int d = 0;
		
		//第一种无优化冒泡
		for(int i = 0; i<a.length-1; i++) {
			for(int j = 0; j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					int c = a[j];
					a[j] = a[j+1];
					a[j+1] = c;
				}
				b++;
			}
		}
		System.out.println("一共执行了："+b+"次");
		System.out.println(Arrays.toString(a));
		
		//第二种有优化
		for(int i = 0; i<g.length-1; i++) {
			boolean flag = true;
			for(int j = 0; j<g.length-1-i; j++) {
				if(g[j]>g[j+1]) {
					int e = g[j];
					g[j] = g[j+1];
					g[j+1] = e;
					//如果有元素进行交换设置为true
					flag = false;
				}
				d++;
			}
			if(flag) {
				break;
			}
		}
		System.out.println("一共执行了："+d+"次");
		System.out.println(Arrays.toString(a));
	}
}
