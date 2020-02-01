package com.collection;
/**
 * map的常用方法
 */
import java.util.HashMap;
import java.util.Map;

public class New5 {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("高", 1);
		m.put("中", 2);
		m.put("鑫", 3);
		System.out.println(m.toString());
		
		//返回指定值映射的键
		System.out.println(m.get("高"));
		
		//是否包含该键
		System.out.println(m.containsKey("张"));
		//是否包含该值
		System.out.println(m.containsValue(1));
		
		//返回映射关系
		System.out.println(m.entrySet());
		//返回键
		System.out.println(m.keySet());
		//返回值
		System.out.println(m.values());
	}
}
