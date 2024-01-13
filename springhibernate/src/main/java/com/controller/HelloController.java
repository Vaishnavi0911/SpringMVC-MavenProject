package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Student;
import com.serviceinter.HomeServiceI;


@Controller
public class HelloController {

	@Autowired
	HomeServiceI hsi;
	
	@RequestMapping(value ="/")
	public String prelogin()
	{
		System.out.println("open login page");
		return "login";
	}
//_______________________________________________________________________
	
	@RequestMapping("/login")
	public String login() {
		return "success";
	}
	
	
	@RequestMapping("/succesful")
	public String success()
	{
		return "login";
	}
	
//______________________________________________________________________	
	
	@RequestMapping(value = "/openregisterpage")
	  public String preregister()
	  {
		  System.out.println("register login page");
		  return "register"; 
		  
	  }
	  
//_____________________________________________________________________________________	
	
	
	@RequestMapping(value = "/save")
	public String saveStudent(@ModelAttribute Student s)
	{
		hsi.saveStudent(s);
		
		return "login";
	}
	
//____________________________________________________________________________________	
	

}
