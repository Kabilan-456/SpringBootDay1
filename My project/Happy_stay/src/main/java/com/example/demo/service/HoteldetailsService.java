package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Hoteldetails;
import com.example.demo.repo.HoteldetailsRepo;
@Service
public class HoteldetailsService {
	@Autowired
	HoteldetailsRepo hr;
	public List<Hoteldetails> saveinfosh(List<Hoteldetails> hd){
		  return (List<Hoteldetails>)hr.saveAll(hd);
	  }
	public List<Hoteldetails> showinfoh(){
		return hr.findAll();
		}
	public List<Hoteldetails> sortinfoh(String s){
		  return hr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	  }
	  public List<Hoteldetails> getbyPageh(int  pgno, int pgsize){
		  Page<Hoteldetails> p = hr.findAll(PageRequest.of(pgno, pgsize));
		  return p.getContent();
	  }
	  public List<Hoteldetails> getpageandsorth(int pgno, int pgsz, String s){
		  PageRequest pr = PageRequest.of(pgno, pgsz, Sort.by(Sort.Direction.ASC,s));
		  Page<Hoteldetails> pa = hr.findAll(pr);
		  return pa.getContent();
	  }
	  public List<Hoteldetails> setrooms(int noofrooms, int hotelid){
		  return hr.updatedet(noofrooms, hotelid);
	  }
	  public List<Hoteldetails> getbycity(String city){
		  return hr.show(city);
	  }
	  
}
