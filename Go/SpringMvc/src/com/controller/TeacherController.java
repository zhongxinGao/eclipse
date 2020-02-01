package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Teacher;

@Controller
public class TeacherController {
	
	@RequestMapping("/register")
	public String register(Model model) {
		return "register";
	}
	
	@RequestMapping("/show")
	public String show (@ModelAttribute("form") Teacher teacher, Model model) {
		 model.addAttribute("teacher", teacher);
	        return "show";
	}
}
