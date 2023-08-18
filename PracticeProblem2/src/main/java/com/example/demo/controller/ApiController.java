package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
@RestController
public class ApiController {
    @GetMapping("/address")  
    public List<Address> getAddress() {
    	return Arrays.asList(new Address("Jackson",18,"Boston street",10000,"Boston research area","Atlantic area","New Jersey","USA"));
    }
}
