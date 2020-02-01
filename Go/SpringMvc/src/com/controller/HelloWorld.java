package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorld {
	//根据配置的URL地址决定调用那个方法
	//返回值类型是String，说明返回的是一个视图名字，DispatcherServlet会根据视图解析器的配置找到视图的完整路径，解析并显示视图
	@RequestMapping("/helloworld")
	public String helloworld() {
		System.out.println("hello world");
		return "helloworld";
	}
	@RequestMapping("/loginform")
	public String loginform() {
		return "login";
	}
	@RequestMapping(value = "/login")
	public String login(String username, String password) {
		System.out.println("执行登录");
		System.out.println("名字："+username);
		System.out.println("密码："+password);
		return "redirect:helloworld";
	}
}
