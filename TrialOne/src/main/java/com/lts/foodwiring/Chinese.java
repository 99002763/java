package com.lts.foodwiring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class Chinese implements Menu {

	@Override
	public List<String> itemsAvailable() 
		// TODO Auto-generated method 
		{
			return Arrays.asList("BabyManchurian","Machosoup","Noodles","Chopsey");
					
	}

	
}
