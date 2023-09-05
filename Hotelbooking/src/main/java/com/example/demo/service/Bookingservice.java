package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bookingdetails;
import com.example.demo.repo.Bookingrepo;
@Service
public class Bookingservice {
     @Autowired
     Bookingrepo br;
     
     public Bookingdetails addinfo(Bookingdetails bd) {
    	 return br.save(bd);
     }
     
     public List<Bookingdetails> showinfo() {
    	  return br.findAll();
      }
     
       public Optional<Bookingdetails> showbyid(int id){
    	   return br.findById(id);
       }
     
	
     public Bookingdetails updateinfo(Bookingdetails bd) {
    	 return br.saveAndFlush(bd);
     }
     
     public void deleteinfo(int id) {
    	  br.deleteById(id);
     }
     
}
