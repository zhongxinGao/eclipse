package com.data;

import java.util.Arrays;

/**
 * 
 * @author grow
 *ѡ������
 */
public class New2 {
	public static void main(String[] args) {
		int [] a = {1, 33, 5, 66, 99, 22, 88};
		for (int i = 0; i < a.length-1; i++) {
			int index = i;
			for (int j = 1+i; j < a.length; j++) {
				if(a[j]<a[index]) {
					//������СԪ���±�
					index = j;
				}
			}
			//��ʱ�Ѿ��ҵ���СԪ���±�
			//����СԪ����ǰ���Ԫ�ؽ���
			int temp = a [index];
			a[index] = a[i];
			a[i] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
