package com.data;

import java.util.Arrays;

/**
 * 
 * @author grow
 *ð������
 */
public class New1 {
	public static void main(String[] args) {
		int [] a  = {1, 3, 111, 101, 66, 99, 77, 5, 33, 22 }; 
		int [] g  = {1, 3, 111, 101, 66, 99, 77, 5, 33, 22 }; 
		//ͳ�ƱȽϴ���
		int b = 0;
		int d = 0;
		
		//��һ�����Ż�ð��
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
		System.out.println("һ��ִ���ˣ�"+b+"��");
		System.out.println(Arrays.toString(a));
		
		//�ڶ������Ż�
		for(int i = 0; i<g.length-1; i++) {
			boolean flag = true;
			for(int j = 0; j<g.length-1-i; j++) {
				if(g[j]>g[j+1]) {
					int e = g[j];
					g[j] = g[j+1];
					g[j+1] = e;
					//�����Ԫ�ؽ��н�������Ϊtrue
					flag = false;
				}
				d++;
			}
			if(flag) {
				break;
			}
		}
		System.out.println("һ��ִ���ˣ�"+d+"��");
		System.out.println(Arrays.toString(a));
	}
}
