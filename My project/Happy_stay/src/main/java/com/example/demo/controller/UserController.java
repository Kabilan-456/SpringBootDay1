package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Userdetails;
import com.example.demo.service.UserdetailsService;

@RestController
public class UserController {
@Autowired
UserdetailsService us;

@PostMapping("addusers")
public List<Userdetails> addit(@RequestBody List<Userdetails> ud){
	return us.saveinfou(ud);
}

@GetMapping("showuser")
public List<Userdetails> showit(){
	return us.showinfou();
}

@GetMapping("Users/page/{pn}/{ps}")
public List<Userdetails> pageit(@PathVariable int pn,@PathVariable int ps){
	return us.getbyPageu(pn, ps);
}

@GetMapping("Users/sort/{s}")
public List<Userdetails> sortit(@PathVariable String s){
	return us.sortinfou(s);
}

@GetMapping("Users/sort/page/{pn}/{pz}/{s}")
public List<Userdetails> sortandpage(@PathVariable int pn,@PathVariable int pz, @PathVariable String s){
	return us.getpageandsortu(pn, pz, s);
}

@GetMapping("users/city/{city}")
public List<Userdetails> getcity(@PathVariable String city){
	return us.qbycity(city);
}
}
