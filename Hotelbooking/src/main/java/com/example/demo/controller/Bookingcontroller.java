package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bookingdetails;
import com.example.demo.service.Bookingservice;
@RestController
@CrossOrigin
public class Bookingcontroller {

	@Autowired
	Bookingservice bs;
	
	@PostMapping("/addbooking")
	public Bookingdetails adder(@RequestBody Bookingdetails bd) {
		return bs.addinfo(bd);
	}
	
	@GetMapping("/getbooking")
	public List<Bookingdetails> getter(){
		return bs.showinfo();
	}
	
	@GetMapping("/getbookbyid/{id}")
	public Optional<Bookingdetails> getit(@PathVariable("id") int id){
		return bs.showbyid(id);
	}
	@PutMapping("/putbooking")
	public Bookingdetails putter(@RequestBody Bookingdetails bd) {
		return bs.updateinfo(bd);
	}
	
	@DeleteMapping("/deletebooking/{id}")
	public void deleter(@PathVariable("id") int id) {
		bs.deleteinfo(id);
	}
	
}
