package com.lumen.abs;

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle vehicle=new Bike("asd","innova",1000000.0);
		vehicle.printDetails();
		vehicle.showtype("xvn");
		vehicle=new Car("sdd","toyoto",10000000.0);
		vehicle.showtype("sedan");
		Car car=(Car)vehicle;
		String [] array=car.showAccessories();
		for(String arr:array) {
			System.out.println(arr);
		}
	}

}
