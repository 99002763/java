package com.lts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.autowiring.ShapeFactory;
import com.lts.constructor.Course;
import com.lts.constructor.Student;
import com.lts.foodwiring.FoodPanda;
import com.lts.setter.Employee;

@SpringBootApplication
public class TrialOneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TrialOneApplication.class, args);
	}
	
	@Autowired
	ApplicationContext context;
	
	//@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Employee employee = context.getBean("employee",Employee.class);
		//System.out.println(employee);
	
		System.out.println("-----------------------------------------------------------");
		//Student student = context.getBean("student",Student.class);
		//System.out.println(student);
		//ShapeFactory shapeFactory = context.getBean(ShapeFactory.class);
		//shapeFactory.printArea(100, 100);
		FoodPanda foodPanda = context.getBean(FoodPanda.class);
		List<String> a= foodPanda.showMenu("indian");
		for( String s : a) {
			System.out.println(s);
		}
		System.out.println("-----------------------------------------------------------");
		//Course course = context.getBean("course",Course.class);
		//System.out.println(course);
	}

}
