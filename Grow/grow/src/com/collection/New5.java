package com.collection;
/**
 * map�ĳ��÷���
 */
import java.util.HashMap;
import java.util.Map;

public class New5 {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("��", 1);
		m.put("��", 2);
		m.put("��", 3);
		System.out.println(m.toString());
		
		//����ָ��ֵӳ��ļ�
		System.out.println(m.get("��"));
		
		//�Ƿ�����ü�
		System.out.println(m.containsKey("��"));
		//�Ƿ������ֵ
		System.out.println(m.containsValue(1));
		
		//����ӳ���ϵ
		System.out.println(m.entrySet());
		//���ؼ�
		System.out.println(m.keySet());
		//����ֵ
		System.out.println(m.values());
	}
}
