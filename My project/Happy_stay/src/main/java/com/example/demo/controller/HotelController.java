package com.example.demo.controller;
import java.sql.Date;
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
    @GetMapping("customer/sort/{name}")
    public List<CustomerDetails> getsort(@PathVariable String name){
    	return cs.sortinfoc(name);
    }
    @GetMapping("customer/Pagination/{pn}/{pc}")
    public List<CustomerDetails> pageinfo(@PathVariable int pn,@PathVariable int pc){
    	return cs.getbyPagec(pn, pc);
    }
    @GetMapping("customer/pageandsort/{pn}/{ps}/{s}")
    public List<CustomerDetails> pageandsort(@PathVariable int pn,@PathVariable int ps,@PathVariable String s){
    	return cs.getpageandsortc(pn, ps, s);
    }
    @GetMapping("getrooms/in/{day_in}")
    public List<CustomerDetails> getdaysin(@PathVariable Date day_in){
    	return cs.getbydayin(day_in);
    }
    @GetMapping("getrooms/out/{day_out}")
    public List<CustomerDetails> getdaysout(@PathVariable Date day_out){
    	return cs.getbydayout(day_out);
    }
    @DeleteMapping("delete/{id}")
    public String deleteit(@PathVariable int id){
    	return cs.delettherecord(id);
    }
}
