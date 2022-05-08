package com.cjc.controller;

import java.util.List;

import javax.persistence.PostUpdate;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.service.HomeService;


@RestController
public class HomeController {
	@Autowired
	HomeService s;
	
	@GetMapping("/all")
	public List<Student> alldata() {
		return s.allstudent();

	}
	@GetMapping("/get/{uname}/{pass}")
	public Student getdata(@PathVariable ("uname") String uname,@PathVariable ("pass") String pass)
	{
		return s.singl(uname,pass);
	}
	
	@PostMapping("/reg")
	public String registerdata(@RequestBody Student stu)
	{
		
		s.savedata(stu);
		return "Student data save";
	}
	@DeleteMapping("/ab/{id}")
	public String Deletedata(@PathVariable ("id")int id)
	{
		System.out.println(id);
		s.delete(id);
		return "Delete Data";
	}
	@GetMapping("/edit/{id}")
	public Student edit(@PathVariable("id")int id)
	{
		return s.saveOrUpdate(id);
	}
	@PutMapping("/up") 
	public String update(@RequestBody Student stu )   
	{  
	s.savedata(stu); 
	return "Update Data";  
   }
	
	
}