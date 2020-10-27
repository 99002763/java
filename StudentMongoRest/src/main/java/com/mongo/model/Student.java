package com.mongo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

public class Student {
	@Id
	int studentId;
	String name;
	String dept;
	int age;
	
	@Autowired
	Address address;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String name, String dept, int age, Address address) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}
	
	
}
