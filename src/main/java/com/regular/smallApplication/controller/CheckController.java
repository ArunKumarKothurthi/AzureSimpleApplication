package com.regular.smallApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class CheckController {
	
	@GetMapping("basic")
	public String basicStringMethod() {
		return "Basic String Method";
	}
	
	@GetMapping("hello/{name}")
	public String namingMethod(@PathVariable("name")String name) {
		String msg = "";
	if(name.equalsIgnoreCase("lohit")) {
		msg = "Pora puski";
	}
	else  {
		msg= "Hello "+name+" \n Babunava.....";
	}
		return msg;
	}
}
