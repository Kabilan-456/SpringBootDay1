package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Family;

@RestController
public class ApiController {
 @GetMapping("")
 public List<Family> getFamilyDetails(){
	 return Arrays.asList(new Family("Sairam",19,"Friend"));
 }
}
