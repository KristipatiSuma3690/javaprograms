package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidateServiceImpl implements IValidateService{

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		String [] usernames= {"suma","usha","venu","lokesh"};
		for(String name:usernames) {
			if(username.equalsIgnoreCase(name)) {
				throw new NameExistsException("Name Exists");
			}
			
		}
		return true;
	}

	@Override
	public boolean validatePassword(String password) throws TooLongException, TooShortException {

		if(password.length()<6) {
			throw new TooShortException("Password length is too short");
		}
		else if(password.length()>15) {
			throw new TooLongException("Password length is too long");
		}
		return true;
	}

}
