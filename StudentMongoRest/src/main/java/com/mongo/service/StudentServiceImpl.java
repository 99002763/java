package com.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.dao.StudentRepository;
import com.mongo.exception.StudentNotFoundException;
import com.mongo.model.Student;


@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		Student newStudent = studentRepository.save(student);
		return newStudent;
	}

	@Override
	public Student getStudentById(int studentId) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId)
				.orElseThrow(()-> new StudentNotFoundException("Id not available"));
	}

	@Override
	public boolean deleteStudent(int studentId) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		studentRepository.deleteById(studentId);
		return true;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public List<Student> getStudentsByCity(String city) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return studentRepository.findByAddressCity(city);
	}

	@Override
	public List<Student> getStudentsByDept(String dept) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		
		return studentRepository.findByDept(dept);
	}

}
