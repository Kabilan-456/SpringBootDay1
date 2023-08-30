package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Hoteldetails;
import com.example.demo.service.HoteldetailsService;
@RestController
public class RoomController {
@Autowired
HoteldetailsService hs;
   @PostMapping("addhotels")
   public List<Hoteldetails> addit(@RequestBody List<Hoteldetails> hd){
	   return hs.saveinfosh(hd);
   }
   
   @GetMapping("showhotels")
   public List<Hoteldetails> showit(){
	   return hs.showinfoh();
   }
   @GetMapping("hotels/sortit/{s}")
   public List<Hoteldetails> sorting(String s){
	   return hs.sortinfoh(s);
   }
   
   @GetMapping("hotels/pageit/{pn}/{ps}")
   public List<Hoteldetails> paging(@PathVariable int pn,@PathVariable int ps){
	   return hs.getbyPageh(pn, ps);
   }
   
   @GetMapping("hotels/pageandsort/{pn}/{ps}/{s}")
   public List<Hoteldetails> sortandpage(@PathVariable int pn,@PathVariable int ps,@PathVariable String s){
	   return hs.getpageandsorth(pn, ps, s);
   }
   
   @PutMapping("hotels/setrooms/{noofrooms}/{hotelid}")
   public List<Hoteldetails> setdetails(@PathVariable int noofrooms,@PathVariable int hotelid){
	   return hs.setrooms(noofrooms, hotelid);
   }
   @GetMapping("hotels/city/{city}")
   public List<Hoteldetails> cityby(@PathVariable String city){
	   return hs.getbycity(city);
   }
}
