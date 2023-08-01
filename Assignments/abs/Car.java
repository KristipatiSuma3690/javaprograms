package com.lumen.abs;

public class Car extends Vehicle {

	public Car(String model, String brand, double price) {
		super(model, brand, price);
	}

	@Override
	void getMileage() {
		System.out.println("getMileage of car");
	}
	

	
	

	@Override
	void showtype(String type) {
		System.out.println("showType");
	}

	String[] showAccessories() {
		String[] acc= {"tool kit","cover","window sheet","freshner","cleaner"};
		return acc;
	}
		
		
	

}
