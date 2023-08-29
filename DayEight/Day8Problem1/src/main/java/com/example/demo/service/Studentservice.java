package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Studentdetails;
import com.example.demo.repo.Studentrepo;
@Service
public class Studentservice {
	@Autowired
  Studentrepo sr;
   public Studentdetails addstudent(Studentdetails ss) {
	   return sr.save(ss);
   }
   public List<Studentdetails> showinfo(){
	   return sr.findAll();
   }
}
