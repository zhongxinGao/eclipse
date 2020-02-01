package array;

import java.util.Arrays;

/**
 * Arrays工具类
 * @author grow
 *
 */
public class Array3 {
	public static void main(String[] args) {
		int [] a = {1, 2, 4, 8, -99, -66};
		
		//排序
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//搜索指定值，存在返回索引位置，不存在返回负数
		System.out.println(Arrays.binarySearch(a, 1));
		
		//数组拷贝
		int [] b = Arrays.copyOf(a, 9);
		System.out.println(Arrays.toString(b));
		
		//拷贝指定范围
		int [] c = Arrays.copyOfRange(a, 0, 7);
		System.out.println(Arrays.toString(c));
		
		//数组填充
		Arrays.fill(c, -1);
		System.out.println(Arrays.toString(c));
	}
}
