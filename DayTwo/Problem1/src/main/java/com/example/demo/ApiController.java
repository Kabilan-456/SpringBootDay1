package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
 
	@Value("${variable}")
	public String name;
	@GetMapping("/")
	public String getName() {
		return ("My name is "+name);
	}
}
