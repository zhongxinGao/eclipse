package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Student;

@Controller
public class StudentController {
	 @RequestMapping("/student")
	   public ModelAndView student() {
	      return new ModelAndView("student", "command", new Student());
	   }

	   @RequestMapping("/addStudent")
	   public String addStudent(@ModelAttribute("SpringWeb")Student student,
	   ModelMap model) {
	      model.addAttribute("name", student.getName());
	      model.addAttribute("age", student.getAge());
	      model.addAttribute("id", student.getId());

	      return "result";
	   }
}
