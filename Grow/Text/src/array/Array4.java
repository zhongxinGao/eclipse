package array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * array常用方法
 * @author grow
 *
 */
public class Array4 {
	public static void main(String[] args) {
		int [] a = {-1, 3, 66, 99};
		
		//返回指定索引位置的值
		System.out.println(Array.get(a, 3));
		System.out.println(Arrays.toString(a));
		
		//设置指定索引位置的值
		Array.set(a, 1, -66);
		System.out.println(Arrays.toString(a));
		
		//返回长度
		System.out.println(a.length);
		
	}
}
