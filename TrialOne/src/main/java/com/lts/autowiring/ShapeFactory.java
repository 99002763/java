package com.lts.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	@Autowired
	//@Qualifier("rectangle")
	@Qualifier("triangle")
	Shape shape;
	@Autowired
	@Qualifier("triangle")
	//@Qualifier("rectangle")
	Shape nshape;
	public void printArea(int x,int y) {
		shape.calArea(x,y);
		nshape.calArea(x,y);
	}
}
