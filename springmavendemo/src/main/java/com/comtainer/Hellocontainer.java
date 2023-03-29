package com.comtainer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Hellocontainer {

	@RequestMapping(value = "/hello")
	public String hello() {
		System.out.println("in hello controller class method");
		return "Welcome";
	}

}
