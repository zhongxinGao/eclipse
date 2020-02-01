package com.aop3;

public class Service implements Service1, Service2 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void sayHello() {
		System.out.println("hi "+name);
		
	}
	
	@Override
	public void sayBye() {
		System.out.println("bye "+name);
	}

}
