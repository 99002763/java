package com.mongo.service;

import java.util.List;

import com.mongo.exception.StudentNotFoundException;
import com.mongo.model.Student;


public interface StudentService {
	Student addStudent(Student student);
	boolean deleteStudent(Integer studentid)throws StudentNotFoundException;
	Student getStudentById(Integer studentid)throws StudentNotFoundException;
	
	
	List<Student> getAllStudent();
}
