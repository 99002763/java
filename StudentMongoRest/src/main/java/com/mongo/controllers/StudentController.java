package com.mongo.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mongo.exception.StudentNotFoundException;
import com.mongo.model.Student;
import com.mongo.service.StudentService;



@RestController
@RequestMapping("/student-api")
public class StudentController {
	@Autowired
	StudentService studentService;
	@PostMapping("/students")
	Student addStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}
	
	@DeleteMapping("/students/delete-one/{studentId}")
	boolean deleteStudent(@PathVariable("studentId")Integer studentid) throws StudentNotFoundException{
		return studentService.deleteStudent(studentid);
	}
	
	@GetMapping("/students/get-one/{studentId}")
	Student getStudentById(@PathVariable("studentid")Integer Id)throws StudentNotFoundException
	{
		return studentService.getStudentById(Id);
	}
	
	
	@GetMapping("/students")
	
	List<Student> getAllStudent(){
		return studentService.getAllStudent();
		
	}

	
}
