package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardController {
	@RequestMapping("/forward")
	public String forward() {
		return "forward";
	}
	
	@RequestMapping("/hi")
	public String hi() {
		return "redirect:html/forward.html";
	}
}
