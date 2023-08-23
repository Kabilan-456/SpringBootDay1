package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bookdetails;
import com.example.demo.repository.Bookrepo;

@Service
public class Bookservice {
	@Autowired
	  Bookrepo br;
	  public List<Bookdetails> saveinfos(List<Bookdetails> bd){
		  return (List<Bookdetails>)br.saveAll(bd);
	  }
	  public Bookdetails saveinfo(Bookdetails bd){
		  return br.save(bd);
	  }
	  public List<Bookdetails> showinfo() {
		  return br.findAll();
	  }
	  public Bookdetails changeinfo(Bookdetails bd) {
		  return br.saveAndFlush(bd);
	  }
	  public void deleteinfo(Bookdetails bd) {
		  br.delete(bd);
	  }
	  public void deleteid(int id) {
		  br.deleteById(id);
	  }
	  public void deletepid(int id) {
		  br.deleteById(id);
	  }
	  public Optional<Bookdetails> showbyid(int id){
		  return br.findById(id);
	  }
	  public String updatebyid(int id, Bookdetails bd) {
		  br.saveAndFlush(bd);
		  if(br.existsById(id)) {
			  return "Updated";
		  }
		  else {
			  return "Enter valid id";
		  }
	  }

}
