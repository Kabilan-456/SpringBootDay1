package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.CustomerDetails;
import com.example.demo.repo.CustomerDetailsRepo;

@Service
public class CustomerDetailsService {
  @Autowired
  CustomerDetailsRepo cr;
  public List<CustomerDetails> saveinfos(List<CustomerDetails> cd){
	  return (List<CustomerDetails>)cr.saveAll(cd);
  }
  public CustomerDetails saveinfo(CustomerDetails cd){
	  return cr.save(cd);
  }
  public List<CustomerDetails> showinfo() {
	  return cr.findAll();
  }
  public CustomerDetails changeinfo(CustomerDetails cd) {
	  return cr.saveAndFlush(cd);
  }
  public void deleteinfo(CustomerDetails cd) {
	  cr.delete(cd);
  }
  public void deleteid(int cust_id) {
	  cr.deleteById(cust_id);
  }
  public void deletepid(int cust_id) {
	  cr.deleteById(cust_id);
  }
  public Optional<CustomerDetails> showbyid(int cust_id){
	  return cr.findById(cust_id);
  }
  public String updatebyid(int cust_id, CustomerDetails cd) {
	  cr.saveAndFlush(cd);
	  if(cr.existsById(cust_id)) {
		  return "Updated";
	  }
	  else {
		  return "Enter valid id";
	  }
  }
}
