package com.redis;

import redis.clients.jedis.Jedis;

public class New {
	public static void main(String[] args) {
		//连接本地redis服务
		Jedis jedis = new Jedis("localhost");
		System.out.println("连接成功");
		//设置redis字符串数据
		jedis.set("gao", "zhongxing");
		//获取存储的数据并返回
		System.out.println("redis存储的数据是："+jedis.get("gao"));
	}
}
