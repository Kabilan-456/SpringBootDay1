package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Cardetails;
import com.example.demo.service.Carservice;
@RestController
public class ApiController {
@Autowired
Carservice cs;
 @PostMapping("/addcars")
 public List<Cardetails> addit(List<Cardetails> cd){
	 return cs.addcars(cd);
 }
 
 @GetMapping("/show")
 public List<Cardetails> showit(){
	 return cs.showinfo();
 }
 
 @GetMapping("/owners/{owners}")
 public List<Cardetails> getit(@PathVariable int owners){
	 return cs.getbyOwners(owners);
 }
 @GetMapping("/address/{address}")
 public List<Cardetails> getitadd(@PathVariable String address){
	 return cs.getbyAddress(address);
 }
 @GetMapping("carname/{carname}")
 public List<Cardetails> getitcarname(@PathVariable String carname){
	 return cs.getbyCarname(carname);
 }
 @GetMapping("owners/{owners}/cartype/{cartype}")
 public List<Cardetails> getitit(@PathVariable int owners,@PathVariable String carname){
	 return cs.getbyownersandcartype(owners, carname);
 }
}
