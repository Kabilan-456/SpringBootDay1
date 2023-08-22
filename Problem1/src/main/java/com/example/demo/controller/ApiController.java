package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.StudentEntity;
import com.example.demo.service.StudentService;
@RestController
public class ApiController {
	@Autowired
   StudentService ser;
	@PostMapping("addstudents")
	public StudentEntity add(@RequestBody StudentEntity ss) {
		return ser.saveinfo(ss);
	}
	@GetMapping("showdetails")
	public List<StudentEntity> show(){
		return ser.showinfo();
	}
}
