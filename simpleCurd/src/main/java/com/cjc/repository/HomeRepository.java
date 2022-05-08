package com.cjc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer> {

Student findByUnameAndPass(String uname,String pass); 



}
