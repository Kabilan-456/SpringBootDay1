package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bikedetails;
import com.example.demo.repo.Bikerepo;
@Service
public class BikeService {
    @Autowired
    Bikerepo br;
    
    public List<Bikedetails> addbikes(List<Bikedetails> bd){
    	return (List<Bikedetails>)br.saveAll(bd);
    }
     
    public List<Bikedetails> showinfo(){
    	return br.findAll();
    }
    public List<Bikedetails> getbyyear(int year){
    	return br.getbikedetails(year);
    }
    public List<Bikedetails> getbyyearandname(String bikename,int year){
    	return br.getdetails(bikename, year);
    }
}
