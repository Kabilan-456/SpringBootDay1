package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.model.Userdetails;
import com.example.demo.repo.UserdetailsRepo;
@Service
public class UserdetailsService {
 @Autowired
 UserdetailsRepo up;
 public List<Userdetails> saveinfou(List<Userdetails> ud){
	 return (List<Userdetails>)up.saveAll(ud);
 }
 public List<Userdetails> showinfou(){
	 return up.findAll();
 }
 public List<Userdetails> sortinfou(String s){
	  return up.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
 }
 public List<Userdetails> getbyPageu(int  pgno, int pgsize){
	  Page<Userdetails> p = up.findAll(PageRequest.of(pgno, pgsize));
	  return p.getContent();
 }
 public List<Userdetails> getpageandsortu(int pgno, int pgsz, String s){
	  PageRequest pr = PageRequest.of(pgno, pgsz, Sort.by(Sort.Direction.ASC,s));
	  Page<Userdetails> pa = up.findAll(pr);
	  return pa.getContent();
 }
 public List<Userdetails> qbycity(String city){
	 return up.getbycity(city);
 }
}
