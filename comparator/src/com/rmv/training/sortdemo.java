package com.rmv.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortdemo {
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
		Collections.sort(emplist,new name());
		for (Employee emp : emplist) {
		System.out.println(emp);
		}
		Collections.sort(emplist,new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return e1.getCity().compareTo(e2.getCity());
			}
		});
		System.out.println("Sorted");
			for (Employee emp : emplist) {
				System.out.println(emp);
				}
			Collections.sort(emplist, (e1, e2)->{
				return e1.getEmpId().compareTo(e2.getEmpId());
				
			});
			System.out.println("Sorted id");
			for (Employee emp : emplist) {
				System.out.println(emp);
				}
		
	}
}
