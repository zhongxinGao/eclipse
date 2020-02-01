package com.proxy;
/**
 * 
 * @author grow
 *��̬����
 */

public class Proxy1 implements Movie{
	public static void main(String[] args) {
		RealMovie r = new RealMovie();
		Movie movie = new Proxy1(r);
		movie.play();
	}
	
	RealMovie movie;

	public Proxy1(RealMovie movie) {
		super();
		this.movie = movie;
	}
	
	@Override
	public void play() {
		guanggao(true);
		movie.play();
		guanggao(false);
	}
	
	public void guanggao(boolean isStart) {
		if( isStart ) {
			System.out.println("��Ӱ���Ͽ�ʼ��");
		}else {
			System.out.println("��Ӱ���Ͻ�����");
		}
	}
}
