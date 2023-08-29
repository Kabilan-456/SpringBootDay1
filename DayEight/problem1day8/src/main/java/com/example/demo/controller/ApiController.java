package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bikedetails;
import com.example.demo.service.BikeService;
@RestController
public class ApiController {
    @Autowired
    BikeService bs;
    @PostMapping("/addit")
    public List<Bikedetails> adding(List<Bikedetails> bd){
    	return bs.addbikes(bd);
    }
    @GetMapping("/show")
    public List<Bikedetails> showit(){
    	return bs.showinfo();
    }
    @GetMapping("/year/{year}")
    public List<Bikedetails> getbyyear(@PathVariable int year){
    	return bs.getbyyear(year);
    }
    @GetMapping("/bikename/{bikename}/year/{year}")
    public List<Bikedetails> getby(@PathVariable String bikename,@PathVariable int year){
    	return bs.getbyyearandname(bikename, year);
    }
}
