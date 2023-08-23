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
import com.example.demo.model.CustomerDetails;
import com.example.demo.service.CustomerDetailsService;

@RestController
public class HotelController {
	@Autowired
	CustomerDetailsService cs;
	@PostMapping("addcustomers")
	public List<CustomerDetails> add(@RequestBody List<CustomerDetails> cd){
		return cs.saveinfos(cd);
	}
	@PostMapping("addcustomer")
	public CustomerDetails add(@RequestBody CustomerDetails cd){
		return cs.saveinfo(cd);
	}
	@GetMapping("showdetails")
	public List<CustomerDetails> show(){
		return cs.showinfo();
	}
	@PostMapping("updatedetails")
	public CustomerDetails modify(@RequestBody CustomerDetails cd) {
		return cs.changeinfo(cd);
	}
	@DeleteMapping("delete")
	public String del(@RequestBody CustomerDetails cd) {
		cs.deleteinfo(cd);
		return "Deleted successfully";
	}
    @DeleteMapping("delid/{cust_id}")
    public void deletebyId(@PathVariable int cust_id) {
    	cs.deleteid(cust_id);
    }
    @DeleteMapping("delpid")
    public void deletepbyId(@RequestParam int cust_id) {
    	cs.deletepid(cust_id);
    }
    @PutMapping("updatetheid/{cust_id}")
    public void updatebyId(@PathVariable int cust_id, @RequestBody CustomerDetails cd) {
    	cs.updatebyid(cust_id,cd);
    }
    @GetMapping("showbyid/{cust_id}")
    public Optional<CustomerDetails> showid(@PathVariable int cust_id){
    	return cs.showbyid(cust_id);
    }
}
