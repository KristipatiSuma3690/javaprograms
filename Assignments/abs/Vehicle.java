package com.lumen.abs;

public abstract class Vehicle {
	String model;
	String brand;
	double price;
	public Vehicle(String model, String brand, double price) {
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	void printDetails() {
		System.out.println(model);
		System.out.println(brand);
		System.out.println(price);
	}
	abstract void getMileage();
	abstract void showtype(String type);

}
