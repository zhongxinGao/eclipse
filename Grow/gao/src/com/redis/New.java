package com.redis;

import redis.clients.jedis.Jedis;

public class New {
	public static void main(String[] args) {
		//���ӱ���redis����
		Jedis jedis = new Jedis("localhost");
		System.out.println("���ӳɹ�");
		//����redis�ַ�������
		jedis.set("gao", "zhongxing");
		//��ȡ�洢�����ݲ�����
		System.out.println("redis�洢�������ǣ�"+jedis.get("gao"));
	}
}
