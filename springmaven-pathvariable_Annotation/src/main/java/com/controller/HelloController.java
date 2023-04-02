package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

	
	
	@RequestMapping(value = "/success/{username}/{password}")
	public String login(@PathVariable("username")String username,@PathVariable("password")String password)
	{
		System.out.println("welcome");
		System.out.println(username);
		System.out.println(password);
		
		return "success";
	}
}
