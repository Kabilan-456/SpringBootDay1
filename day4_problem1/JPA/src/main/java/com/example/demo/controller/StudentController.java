package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
 StudentService sc;
	@PostMapping("addstudent")
	public List<StudentEntity> add(@RequestBody List<StudentEntity> ss) {
		return sc.saveinfo(ss);
	}
	@GetMapping("showdetails")
	public List<StudentEntity> show(){
		return sc.showinfo();
		
	}
	@PutMapping("update")
	public StudentEntity modify(@RequestBody StudentEntity ss) {
		return sc.changeinfo(ss);
	}
	@DeleteMapping("deleteDetail")
	public String del(@RequestBody StudentEntity ss){
		sc.deleteinfo(ss);
		return "Deleted successfully";
	}
} 
