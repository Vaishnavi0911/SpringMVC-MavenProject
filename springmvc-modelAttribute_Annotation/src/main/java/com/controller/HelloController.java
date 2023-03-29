package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

	@RequestMapping(value = "/login")
	public String login(@ModelAttribute User u)
	{
		System.out.println("welcome");
		System.out.println(u.getUsername());
		System.out.println(u.getPassword());
		return "success";
	}
}
