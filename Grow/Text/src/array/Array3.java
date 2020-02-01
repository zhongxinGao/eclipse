package array;

import java.util.Arrays;

/**
 * Arrays������
 * @author grow
 *
 */
public class Array3 {
	public static void main(String[] args) {
		int [] a = {1, 2, 4, 8, -99, -66};
		
		//����
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//����ָ��ֵ�����ڷ�������λ�ã������ڷ��ظ���
		System.out.println(Arrays.binarySearch(a, 1));
		
		//���鿽��
		int [] b = Arrays.copyOf(a, 9);
		System.out.println(Arrays.toString(b));
		
		//����ָ����Χ
		int [] c = Arrays.copyOfRange(a, 0, 7);
		System.out.println(Arrays.toString(c));
		
		//�������
		Arrays.fill(c, -1);
		System.out.println(Arrays.toString(c));
	}
}
