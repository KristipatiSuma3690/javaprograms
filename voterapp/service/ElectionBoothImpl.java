package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements IElectionBooth{
	String[] localities= {"Bangalore","Kadapa"};


	@Override
	public boolean checkEligibility(int age, String locality, int voterId) throws InValidVoterException {
		try {
			if(checkAge(age)) {
				if(checkLocality(locality)) {
					if(checkVoterId(voterId)) {
						return true;
					}
					//return false;
					
				}
				//return false;
				
			}
			
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} catch (LocalityNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} catch (NoVoterIDException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		return false;
		
				
	}

	private boolean checkVoterId(int voterId) throws NoVoterIDException {
		if(voterId<1000 || voterId>9999) {
			throw new NoVoterIDException("No Voter id matched...");
		}

		
		return true;
	}


	private boolean checkLocality(String locality) throws LocalityNotFoundException {
		for(String local:localities) {
			if(locality.equalsIgnoreCase(local)) {
				return true;
			}
		}

		throw new LocalityNotFoundException("Locality not found..");
	}

	private boolean checkAge(int age) throws UnderAgeException {
		if(age>18) 
			return true;
		else
			throw new UnderAgeException("Under Age for voting.");
		
	}

}
