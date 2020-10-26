package com.mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.model.Student;

@Repository
public interface StudentRepository extends 	MongoRepository<Student, Integer>{

}
