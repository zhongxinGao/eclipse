package com.proxy;

public class RealMovie implements Movie{
	@Override
	public void play() {
		System.out.println("你正在观看电影");
	}
}
