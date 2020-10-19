package com.rmv.array;

import java.util.List;

public class array {

	public static void main(String[] args)
	{
		List<Employee> list = new ArrayList<Employee>();
		
		Employee john = new Employee("John",32,40000);
		Employee david = new Employee("David",42,60000);
		Employee peter = new Employee("peter",22,70000);
		
		list.add(john);
		list.add(david);
		list.add(peter);
		
		for (Employee emp : list) {
			System.out.println(emp.toString());
		}
	}

}
