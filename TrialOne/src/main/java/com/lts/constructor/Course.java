package com.lts.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {


		String courseName;
		Integer price;
		public Integer getPrice() {
			return price;
		}

		@Value("${student.course.price}")
		public void setPrice(Integer price) {
			this.price = price;
		}
	
		public String getCourseName() {
			return courseName;
		}
		@Value("${student.course.name}")
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		@Override
		public String toString() {
			return "Course [courseName=" + courseName + ", price=" + price + "]";
		}
	
		

}
