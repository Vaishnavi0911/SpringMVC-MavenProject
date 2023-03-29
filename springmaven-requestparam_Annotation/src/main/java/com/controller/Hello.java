package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {
	
	//simple Way
//	@RequestMapping(value = "/login")
//	public String login(String username, String password)
//	{
//		System.out.println("welcome");
//		System.out.println(username);
//		System.out.println(password);
//		return "welcome";
//	}
 
	@RequestMapping(value="/login")
	public String hello(@RequestParam("username")String u,@RequestParam("password")String p)
	{
		System.out.println("Welcome");
		System.out.println(u);
		System.out.println(p);
		return "welcome";
	}
}
