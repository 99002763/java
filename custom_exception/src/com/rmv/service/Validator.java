package com.rmv.service;

import com.rmv.exceptions.NameExsitsException;
import com.rmv.exceptions.TooLongException;
import com.rmv.exceptions.TooShortException;

public class Validator {
	private String[] names = {"Ankit","Raju","Nipun","Rohan","Komal"};
	public boolean validateName(String username) throws NameExsitsException {
		
		for(String uname:names) {
			if(uname.equals(username)) {
				throw new NameExsitsException();
			}
		}
		return true;
	}
	public boolean validatePassword(String password) throws TooLongException, TooShortException {
		if(password.length()>=15) {
			throw new TooLongException("Too long");
		}
		if(password.length()<=5) {
			throw new TooShortException("too short");
		}
		return true;
	}
}
