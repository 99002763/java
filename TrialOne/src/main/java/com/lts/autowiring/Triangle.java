package com.lts.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

	@Override
	public void calArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Area of triangle:"+ 0.5*x*y);
		
	}

	
}
