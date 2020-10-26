package com.mongo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mongo.exception.StudentNotFoundException;
import com.mongo.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudent(Integer studentid) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getStudentById(Integer studentid) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}
}