package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value = "/login")
	public String hello(@ModelAttribute User u,Model m)
	{
		
		List<User>users=new ArrayList<>();
		users.add(u);
		users.add(u);
		users.add(u);
		users.add(u);
		users.add(u);
		
		
	   m.addAttribute("data", users);
	   
		return "welcome";
	}
	


}
