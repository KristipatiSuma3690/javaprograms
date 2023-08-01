package com.voterapp.client;

import java.util.Scanner;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.service.ElectionBoothImpl;
import com.voterapp.service.IElectionBooth;

public class VoterMain {

	public static void main(String[] args) {
		IElectionBooth electionbooth=new ElectionBoothImpl();

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int Age=scanner.nextInt();
		System.out.println("Enter your Locality: ");
		String locality=scanner.next();
		System.out.println("Enter VoterId: ");
		int voterid=scanner.nextInt();
		
		try {
			if(electionbooth.checkEligibility(Age,locality , voterid)) {
				System.out.println("Eligible for Voting...");
			}
			else 
				throw new InValidVoterException("In Valid for Voting..");
		} catch (InValidVoterException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		finally {
			System.out.println("Closing....");
		}
	}

}
