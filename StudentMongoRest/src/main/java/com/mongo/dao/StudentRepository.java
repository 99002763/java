package com.mongo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer>{
	
	List<Student> findByAddressCity(String city);
	List<Student> findByDept(String dept);
}
