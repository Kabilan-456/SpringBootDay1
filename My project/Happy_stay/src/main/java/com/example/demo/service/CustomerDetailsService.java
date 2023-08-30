package com.example.demo.service;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
  public List<CustomerDetails> sortinfoc(String s){
	  return cr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
  }
  public List<CustomerDetails> getbyPagec(int  pgno, int pgsize){
	  Page<CustomerDetails> p = cr.findAll(PageRequest.of(pgno, pgsize));
	  return p.getContent();
  }
  public List<CustomerDetails> getpageandsortc(int pgno, int pgsz, String s){
	  PageRequest pr = PageRequest.of(pgno, pgsz, Sort.by(Sort.Direction.ASC,s));
	  Page<CustomerDetails> pa = cr.findAll(pr);
	  return pa.getContent();
  }
  public List<CustomerDetails> getbydayin(Date day_in){
	  return cr.getbydatein(day_in);
  }
  public List<CustomerDetails> getbydayout(Date day_out){
	  return cr.getbydateout(day_out);
  }
  
  public String delettherecord(int cust_id){
	  return cr.deletebyid(cust_id)+" deleted";
  }
}
