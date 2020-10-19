package com.rmv.service;

import java.util.Scanner;

import com.rmv.exceptions.NameExsitsException;
import com.rmv.exceptions.TooLongException;
import com.rmv.exceptions.TooShortException;

public class Registration {
	public static void main(String[] args) {
		Validator validator = new Validator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		String username = sc.next();
		boolean valid;
		try {
			valid = validator.validateName(username);
			if(valid) {
				System.out.println("Welcome"+username);
				System.out.println("Enter pass");
				String password = sc.next();
				if(validator.validatePassword(password))
					System.out.println("Registered");
				
			}
		} catch (NameExsitsException e) {
			// TODO Auto-generated catch block
			System.out.println("Already");
			e.printStackTrace();
		} catch (TooLongException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (TooShortException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
