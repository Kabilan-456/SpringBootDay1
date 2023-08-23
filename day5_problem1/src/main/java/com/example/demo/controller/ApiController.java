package com.example.demo.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Bookdetails;
import com.example.demo.service.Bookservice;

@RestController
public class ApiController {
	@Autowired
	Bookservice bs;
	@PostMapping("addbooks")
	public List<Bookdetails> add(@RequestBody List<Bookdetails> bd){
		return bs.saveinfos(bd);
	}
	@PostMapping("addbook")
	public Bookdetails add(@RequestBody Bookdetails bd){
		return bs.saveinfo(bd);
	}
	@GetMapping("showdetails")
	public List<Bookdetails> show(){
		return bs.showinfo();
	}
	@PostMapping("updatedetails")
	public Bookdetails modify(@RequestBody Bookdetails bd) {
		return bs.changeinfo(bd);
	}
	@DeleteMapping("delete")
	public String del(@RequestBody Bookdetails bd) {
		bs.deleteinfo(bd);
		return "Deleted successfully";
	}
    @DeleteMapping("delid/{cust_id}")
    public void deletebyId(@PathVariable int id) {
    	bs.deleteid(id);
    }
    @DeleteMapping("delpid")
    public void deletepbyId(@RequestParam int id) {
    	bs.deletepid(id);
    }
    @PutMapping("updatetheid/{cust_id}")
    public void updatebyId(@PathVariable int id, @RequestBody Bookdetails bd) {
    	bs.updatebyid(id,bd);
    }
    @GetMapping("showbyid/{cust_id}")
    public Optional<Bookdetails> showid(@PathVariable int id){
    	return bs.showbyid(id);
    }
}
