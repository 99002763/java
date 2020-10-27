package com.mongo.service;

import java.util.List;

import com.mongo.exception.StudentNotFoundException;
import com.mongo.model.Student;


public interface StudentService {

	
	Student addStudent(Student student);
	Student getStudentById(int studentId) throws StudentNotFoundException;
	boolean deleteStudent(int studentId) throws StudentNotFoundException;
	List<Student> getAllStudents();
	 
	List<Student> getStudentsByCity(String city) throws StudentNotFoundException;
	List<Student> getStudentsByDept(String dept) throws StudentNotFoundException;
}
