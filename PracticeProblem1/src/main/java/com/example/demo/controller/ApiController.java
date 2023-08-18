package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class ApiController {
	@GetMapping("/")
  public List<Student> Display(){
	  return Arrays.asList(new Student("Kabilan","Got good marks.."));
  }
}
