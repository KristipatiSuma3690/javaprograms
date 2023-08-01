package com.lumen.abs;

public class Bike extends Vehicle {

	public Bike(String model, String brand, double price) {
		super(model, brand, price);
	}

	@Override
	void getMileage() {
		System.out.println("GetMileage");
		
	}

	@Override
	void showtype(String type) {
	//System.out.println("ShowTyep");
		if(type.equals("sedan")) {
			System.out.println("suma");
		}
		else if(type.equals("svn")) {
			System.out.println("usha");
		
		}
		else {
			System.out.println("venu");
		}

	}
	void engineType() {
		System.out.println("engineType");
		
	


	}

}
