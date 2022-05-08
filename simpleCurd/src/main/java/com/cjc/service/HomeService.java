package com.cjc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cjc.model.Student;
public interface HomeService {
	
	void savedata(Student stu);

	void delete(int id);

	Student saveOrUpdate(int id);

	List<Student> allstudent();

	Student singl(String uname, String pass);

}
