package com.rmv.array;

import java.util.List;

import java.lang.Iterable;

/*
 * Storing user-defined class objects.
 */
public class ArrayList
{

    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();

        Employee john = new Employee("John", 32, 40000);
        Employee david = new Employee("David", 42, 80000);
        Employee peter = new Employee("Peter", 52, 150000);

        list.add(john);
        list.add(david);
        list.add(peter);

        /*
         * Using for each loop getting each employee object from the list
         */
        for (Employee employee : list)
        {
            System.out.println(employee.toString());
        }
    }

	private void add(Employee john) {
		// TODO Auto-generated method stub
		
	}
}
