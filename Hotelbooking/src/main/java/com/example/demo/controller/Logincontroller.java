package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Logindetails;
import com.example.demo.service.Loginservice;

@RestController
@CrossOrigin
public class Logincontroller {
  
	@Autowired
	Loginservice ls;
	
	@PostMapping("/addlogin")
	public Logindetails adder(@RequestBody Logindetails bd) {
		return ls.addinfol(bd);
	}
	
	@GetMapping("/getlogin")
	public List<Logindetails> getter(){
		return ls.showinfol();
	}
	
	@PutMapping("/putlogin")
	public Logindetails putter(@RequestBody Logindetails bd) {
		return ls.updateinfol(bd);
	}
	
	@DeleteMapping("/deletelogin/{id}")
	public void deleter(@PathVariable("id") int id) {
		ls.deleteinfol(id);
	}
}
