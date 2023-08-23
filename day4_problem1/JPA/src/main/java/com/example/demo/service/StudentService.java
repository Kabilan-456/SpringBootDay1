package  com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.StudentEntity;
import com.example.demo.repository.StudentRepo;
@Service
public class StudentService {
      @Autowired
	  StudentRepo ser;
      public List<StudentEntity> saveinfo(List<StudentEntity> ss) {
    	  return (List<StudentEntity>)ser.saveAll(ss);
      }
     
      public List <StudentEntity> showinfo(){
    	  return ser.findAll();
      }
      public StudentEntity changeinfo(StudentEntity ss) {
    	  return ser.saveAndFlush(ss);
      }
      public void deleteinfo(StudentEntity ss) {
    	  ser.delete(ss);
      }
}
