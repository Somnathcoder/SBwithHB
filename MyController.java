package com.springand.hibernate.SBwithHB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springand.hibernate.SBwithHB.Model.Student;
import com.springand.hibernate.SBwithHB.Service.StudentService;

@RestController
public class MyController {
	
	@Autowired
	StudentService se ;
	
	@PostMapping("/student")
	boolean insertdata(@RequestBody Student stduent ) {
		boolean bs =se.insertdata(stduent);
		return bs;
	}
	
	
	
	@GetMapping("/all")
	public  List<Student> getalldata() {
		
		List<Student> list = se.getalldata();
		return list;
		
	}
	
	
	@GetMapping("data/{id}")
	Student getdatabyid(@PathVariable int id) {
		Student ss= 	se.getdatabyid(id);
		return ss;
		
	}
	
	
	@DeleteMapping("/delet/{id}")
	public boolean deletbyid(@PathVariable int id ) {
		boolean bb =se.deletbyid(id);
		return bb;
	}
	
	@PutMapping("/update/{id}")
	public boolean updatebyid(@RequestBody Student student,@PathVariable int id) {
		boolean bb =se.updatebyid(id,student);
		return bb;
	}

}
