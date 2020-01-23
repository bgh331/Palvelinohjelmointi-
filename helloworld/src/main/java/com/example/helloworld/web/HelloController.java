package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	@RequestMapping("/hello")
	public String hei(@RequestParam(name="firstname") String firstName, @RequestParam(name="location") String Location) {
	return "Welcome to the " + Location + " " + firstName +"!";
	}
	
	@RequestMapping("*")
	public String hello() {
		return "Hello Spring!";
	}
	@RequestMapping("/index")
	public String paasivu() {
		return "This is the main page!";
	}
	@RequestMapping("/contact")
	public String kontakti() {
		return "This is the contact page!";
	}
	
}

