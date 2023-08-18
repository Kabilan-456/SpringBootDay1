package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.College;

@RestController
public class ApiController {
	@GetMapping("/")
    public List<College> getCollege(){
    	return Arrays.asList(new College("Arun","EEE",1));
    }
}
