package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Studentdetails;
import com.example.demo.service.Studentservice;
@RestController
public class Studentcontroller {
	@Autowired
	Studentservice ser;
    @PostMapping("/addstudent")
    public Studentdetails add(@RequestBody Studentdetails ss) {
    	return ser.addstudent(ss);
    }
    @GetMapping("/showdetails")
    public List<Studentdetails> show(){
    	return ser.showinfo();
    }
}
