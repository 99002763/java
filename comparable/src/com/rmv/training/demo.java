package com.rmv.training;

import java.util.ArrayList;
import java.util.Collections;

public class demo {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Ram","Bangalore",123);
		Employee employee2 = new Employee("John","Kolkata",124);
		Employee employee3 = new Employee("zeenath","Ooty",125);
		Employee employee4 = new Employee("Akshay","Pune",126);
		Employee employee5 = new Employee("Sri","Chennai",127);
		
		ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(employee1);
		emplist.add(employee2);
		emplist.add(employee3);
		emplist.add(employee4);
		emplist.add(employee5);
		
		for(Employee emp : emplist) {
			System.out.println(emp);
		}
		Collections.sort(emplist);
		for(Employee emp : emplist) {
			System.out.println(emp);
		}
	}
}
