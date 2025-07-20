package com.regular.smallApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class CheckController {
	
	@GetMapping("basic")
	public String basicStringMethod() {
		return "Basic String Method";
	}
}
