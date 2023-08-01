package com.lumen.LambdaDemo;

public class ShaperMain {

	public static void main(String[] args) {
		ShapeFactory shape=new ShapeFactory();
		shape.printArea((x,y)->((x*y)), 5, 9);
		shape.printArea((x,y)->(0.5*x*y), 7, 10);
	}
}