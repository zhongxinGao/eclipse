package array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * array���÷���
 * @author grow
 *
 */
public class Array4 {
	public static void main(String[] args) {
		int [] a = {-1, 3, 66, 99};
		
		//����ָ������λ�õ�ֵ
		System.out.println(Array.get(a, 3));
		System.out.println(Arrays.toString(a));
		
		//����ָ������λ�õ�ֵ
		Array.set(a, 1, -66);
		System.out.println(Arrays.toString(a));
		
		//���س���
		System.out.println(a.length);
		
	}
}
