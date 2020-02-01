package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.User;

@Controller
public class UserController {
	@RequestMapping("/form")
	public String form() {
		return "user/form";
	}
	
	@RequestMapping("/save")
	public String save(User user) {
		System.out.println(user);
		return "success";
	}
}
