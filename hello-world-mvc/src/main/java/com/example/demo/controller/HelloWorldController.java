package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/")
	public String goToHome()
	{
		return "index";
	}
	@RequestMapping("/hello-world")
	public String sayHello()
	{
		return "helloworld";
	}

}
