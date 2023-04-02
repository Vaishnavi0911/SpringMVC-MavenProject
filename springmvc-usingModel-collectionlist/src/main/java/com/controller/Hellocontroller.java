package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hellocontroller {

	@RequestMapping(value = "/login")
	public String hello(@RequestParam("usename") String u,@RequestParam("password")String p,Model m)
	{
		List<String>list=new ArrayList<>();
		list.add(u);
		list.add(p);
		
		m.addAttribute("Date", list);
		return "success";
	}
	 
}
