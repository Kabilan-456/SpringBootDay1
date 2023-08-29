package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cardetails;
import com.example.demo.repo.CarRepo;
@Service
public class Carservice {
	@Autowired
	CarRepo cr;
	public List<Cardetails> addcars(List<Cardetails> cd){
		return (List<Cardetails>)cr.saveAll(cd);
	}
	
	public List<Cardetails> showinfo(){
		return cr.findAll();
	}
	public List<Cardetails> getbyOwners(int Owners){
		return cr.getbyowners(Owners);
	}
	
	public List<Cardetails> getbyCarname(String carname){
		return cr.getbycarname(carname);
	}

	public List<Cardetails> getbyAddress(String address){
		return cr.getbyaddress(address);
	}
	 public List<Cardetails> getbyownersandcartype(int owners, String cartype){
		 return cr.getby(owners, cartype);
	 }
}
