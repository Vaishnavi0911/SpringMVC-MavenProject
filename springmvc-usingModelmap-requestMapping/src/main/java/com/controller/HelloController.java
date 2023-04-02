package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping(value = "/login")
	public String hello(String username,String password,ModelMap m )
	{
		m.addAttribute("username", username);
		m.addAttribute("password", password);
		m.addAttribute("rollno", 10);
		return "welcome";
	}
	
}
