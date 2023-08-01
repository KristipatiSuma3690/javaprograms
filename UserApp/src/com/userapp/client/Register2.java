package com.userapp.client;

import java.util.Scanner;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidateService;
import com.userapp.service.ValidateServiceImpl;

public class Register2 {
	public static void main(String[] args) {
		
	

	Scanner scanner=new Scanner(System.in);
	String username=scanner.nextLine();
	
	IValidateService validate=new ValidateServiceImpl();
	
		try {
			if(validate.validateUsername(username)) {
				String password=scanner.next();
				if(validate.validatePassword(password)) {
					System.out.println("welcome User");
				}

			}
		} catch (NameExistsException e) {
			System.out.println(e.getMessage());
		} catch (TooLongException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (TooShortException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
