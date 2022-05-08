package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cjc.model.Student;
import com.cjc.repository.HomeRepository;
import com.cjc.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService {
    @Autowired
	 HomeRepository hr;
	@Override
	public void savedata(Student stu) {
		// TODO Auto-generated method stub
		hr.save(stu);
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
		
	}
	@Override
	public Student saveOrUpdate(int id) {
		// TODO Auto-generated method stub
		return hr.findById(id).get();
		
		
	}
	@Override
	public List<Student> allstudent() {
		 
		// TODO Auto-generated method stub
		return (List<Student>) hr.findAll();

	}
	@Override
	public Student singl(String uname, String pass) {
		// TODO Auto-generated method stub
		
		return hr.findByUnameAndPass(uname, pass);
	}
	

}
