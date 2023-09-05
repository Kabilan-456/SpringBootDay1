package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Logindetails;
import com.example.demo.repo.Userrepo;
@Service
public class Loginservice {

	 @Autowired
	 Userrepo ur;
	 
	 public Logindetails addinfol(Logindetails bd) {
    	 return ur.save(bd);
     }
     
     public List <Logindetails> showinfol() {
    	  return ur.findAll();
      }
      
     public Logindetails updateinfol(Logindetails bd) {
    	 return ur.saveAndFlush(bd);
     }
     
     public void deleteinfol(int id) {
    	  ur.deleteById(id);
     }
	 
}
