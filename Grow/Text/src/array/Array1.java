package array;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		//��̬��ʼ��
		int[] a = {1,2,5,66};
		//��̬��ʼ��
		int [] b = new int [3];
		b[0] = 5;
		b[1] = 7;
		b[2] = 9;
		
		//��������һ
		System.out.println(Arrays.toString(a));
		//���������
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.println();
		}
		//����������
		for(int c:a) {
			System.out.print(c);
		}
	}
}
